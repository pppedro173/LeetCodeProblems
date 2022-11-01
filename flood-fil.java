class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        List<int[]> list = new ArrayList<>();
        int [] p = {sr,sc};
        int sLines = image.length;
        int sCools = image[0].length;
        int bColor = image[sr][sc];
        int i = 0;

        if(image[sr][sc] != color) list.add(new int[]{sr, sc});

        while(!list.isEmpty()){
            int[] point = list.remove(i);
            i--;
            image[point[0]][point[1]] = color;

            if (point[0] + 1 < sLines) {
                if (image[point[0] + 1][point[1]] == bColor) list.add(new int[]{point[0] + 1, point[1]});
            }
            if (point[0] - 1 >= 0) {
                if (image[point[0] - 1][point[1]] == bColor) list.add(new int[]{point[0] - 1, point[1]});
            }
            if (point[1] + 1 < sCools) {
                if (image[point[0]][point[1] + 1] == bColor) list.add(new int[]{point[0], point[1] + 1});
            }
            if (point[1] - 1 >= 0) {
                if (image[point[0]][point[1] - 1] == bColor) list.add(new int[]{point[0], point[1] - 1});
            }
            i++;
        }

        return image;
    }
}
