import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent347 {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>(); // 등장 횟수 Count
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		// System.out.println(map.entrySet());
		PriorityQueue<Map.Entry<Integer, Integer>> queue =
			new PriorityQueue<>((a, b) -> b.getValue() - a.getValue()); // 내림차순
		queue.addAll(map.entrySet());

		// System.out.println(queue);

		int[] rst = new int[k];
		for (int i = 0; i < k; i++) {
			// System.out.println(queue.poll().getKey());
			rst[i] = queue.poll().getKey();
		}

		return rst;
	}
}
