class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;

        // 뒤집기
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int tmp1 = image[i][j]; // image[i][j] 가 1이면 0을 리턴, 0이면 1을 리턴
                int tmp2 = image[i][len - 1 - j];
                image[i][j] = tmp2;
                image[i][len - 1 - j] = tmp1;
            }
        }
        
        // 반전
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int tmp = image[i][j] ^ 1;
                image[i][j] = tmp;
            }
        }

        return image;
        /*
        List<List<Integer>> listImage = new ArrayList<>();

        for (int[] list : image) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < list.length; i++) {
                tmp.add(list[i]);
            }
            listImage.add(tmp);
        }

        for (List<Integer> arrayList : listImage) {
            Collections.reverse(arrayList);
        }

        for (int i = 0; i < listImage.size(); i++) {
            for (int j = 0; j < listImage.get(i).size(); j++) {
                if (listImage.get(i).get(j) == 1) {
                    image[i][j] = 0;
                } else image[i][j] = 1;
            }
        }

        return image;
        */
    }
}