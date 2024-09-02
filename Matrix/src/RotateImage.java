class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int top = 0;
        int bottom = n - 1;
        int left = 0 ;
        int rigth = n - 1;

        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }

        while(left < rigth) {
            for(int i = top ; i <= bottom ; i++) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][rigth];
                matrix[i][rigth] = temp ;
            }
            left++;
            rigth--;
        }



    }
}
