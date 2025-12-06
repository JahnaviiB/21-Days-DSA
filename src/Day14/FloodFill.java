package Day14;

import java.util.Arrays;

public class FloodFill {
    public static int[][] fillcolors(int[][] image, int sr, int sc,int color){
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;
        dfs(image,sr,sc,originalColor,color);
        return image;
    }
    public static void dfs(int[][] image, int r,int c, int orginalc, int color){
        int m = image.length;
        int n = image[0].length;

        if(r < 0 || r >= m || c < 0 || c >= n) return;
        if(image[r][c] != orginalc) return;

        image[r][c] = color;
        dfs(image,r-1,c,orginalc,color);
        dfs(image,r+1,c,orginalc,color);
        dfs(image,r,c+1,orginalc,color);
        dfs(image,r,c-1,orginalc,color);
    }
    public static void main(String[] args){
        int[][] inputgrid = {{1,1,1},{1,1,0},{1,0,1}};
        int samer = 1, samec = 1;
        int c = 2;
        int[][] output = fillcolors(inputgrid,samer,samec,c);
        System.out.println(Arrays.deepToString(output));
    }
}
