public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,4,7,11,15,16},
                {2,5,8,12,19,22},
                {3,6,9,16,22,24},
                {10,13,14,17,24,27},
                {18,21,23,26,30,36}};
        int k = 14;
        System.out.println(searchMatrix(matrix,k));
    }
    public static boolean searchMatrix(int[][] matrix, int k){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while(i < m && j >= 0){
            if(matrix[i][j] == k){
                return true;
            }
            if(matrix[i][j] > k){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

}