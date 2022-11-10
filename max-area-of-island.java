class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int l = grid.length -1;
        int c = grid[0].length - 1;
        int maxVal = 0;
        int currVal = 0;
        Map<Map.Entry<Integer,Integer>, Integer> map = new HashMap<>();

        for(int i = 0; i <= l; i++) {
            for(int j = 0; j <= c; j++) {
                if(grid[i][j] != 0) {
                    if(!map.containsKey(Map.entry(i, j))){
                        currVal = depthFirstSearch(grid, i, j, 0, l, c, map);
                    }
                }
                if(currVal > maxVal) maxVal = currVal;
            }
        }

        return maxVal;
    }

        public int depthFirstSearch(int[][] grid, int rootX, int rootY, int n, int l, int c, Map<Map.Entry<Integer,Integer>, Integer> map){
        n++;
        map.put(Map.entry(rootX, rootY), 0);
        if(rootX + 1 <= l && !map.containsKey(Map.entry(rootX + 1, rootY))){
            if(grid[rootX + 1][rootY] != 0){
                n = depthFirstSearch(grid, rootX + 1, rootY, n, l, c, map);
            }

        }
        if(rootX - 1 >= 0 && !map.containsKey(Map.entry(rootX - 1, rootY))){
            if(grid[rootX - 1][rootY] != 0){
                n = depthFirstSearch(grid, rootX - 1, rootY, n, l, c, map);
            }
        }

        if(rootY + 1 <= c && !map.containsKey(Map.entry(rootX, rootY + 1))){
            if(grid[rootX][rootY + 1] != 0){
                n = depthFirstSearch(grid, rootX, rootY  + 1, n, l, c, map);
            }
        }
        if(rootY - 1 >= 0 && !map.containsKey(Map.entry(rootX, rootY - 1))){
            if(grid[rootX][rootY - 1] != 0){
                n = depthFirstSearch(grid, rootX, rootY - 1, n, l, c, map);
            }
        }

        return n;
    }
}
