class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

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
    }
}