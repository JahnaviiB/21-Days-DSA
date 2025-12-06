package Day14;

public class NumberOfIslands {
    static int m;
    static int n;
    static int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    public static void dfs(char[][] grid, int r, int c){
        //grid[r][c] = '0';
        for(int[] dir : directions){
            int nr = r + dir[0];
            int nc = c + dir[1];

            if(0 <= nr && nr < m && 0 <= nc && nc < n && grid[nr][nc] == '1'){
                grid[nr][nc] = '0';
                dfs(grid,nr,nc);
            }
        }
    }
    public static int totalislands(char[][] grid){
        if(grid == null || grid.length == 0) return 0;
        m = grid.length;;
        n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        char[][] input = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int output = totalislands(input);
        System.out.println(output);
    }
}
