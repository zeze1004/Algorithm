class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double minCost = Double.MAX_VALUE;
        double qualityTillNow = 0;
        
        List<Worker> workers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Worker worker = new Worker(wage[i] / (double) quality[i], quality[i]);
            workers.add(worker);
        }

        // List의 자료형이 Worker여서 정렬할 기준이 필요함
        // ratio = 임금 / 품질 -> ratio가 작을수록 품질대비 임금이 작다는 뜻
        Collections.sort(workers);

        // 성과 대비 임금이 적은 노동자 순으로 저장
        PriorityQueue<Integer> highQualityWorkers = new PriorityQueue<>(Comparator.reverseOrder());

        for (Worker worker : workers) {
            double ratio = worker.ratio;
            int qua = worker.quality;

            qualityTillNow += qua; // 노동자들의 성과의 합
            highQualityWorkers.add(qua);

            if (highQualityWorkers.size() > k) {
                qualityTillNow -= highQualityWorkers.poll();
            }

            // 현재 worker의 성과 대비 임금의 비율과 노동자들의 성과를 곱하면 모두 같은 비율로 임금이 측정됨
            // 비율이 적은 노동자 순으로 정렬되어 뒤에 있는 노동자들의 비율에 따라 임금을 계산하면, 
            // 자기 자신의 임금 비율보다 커지기 때문에 기전 임금 이상의 값을 받을 수 있음

            // ex. A - 임금: 50, 성과: 20, 비율: 2.5 / B - 임금: 30, 성과: 5, 비율: 6.0 일시
            // B worker가 기준이라면, A worker의 임금은 120(20 * 6.0)이 되어 최저임금 조건을 고려하지 않아도 됨
            if (highQualityWorkers.size() == k) {
                minCost = Math.min(minCost, qualityTillNow * ratio); // Greedy로 제일 작은 임금을 저장
            }
        }

        return minCost;
    }

    private class Worker implements Comparable<Worker> {
        double ratio;
        int quality;

        Worker(double ratio, int quality) {
            this.ratio = ratio;
            this.quality = quality;
        }

        @Override
        public int compareTo(Worker other) {
            return Double.compare(this.ratio, other.ratio);
        }

        @Override
        public String toString() {
            return "Worker [ratio=" + ratio + ", quality=" + quality + "]";
        }
    }
}