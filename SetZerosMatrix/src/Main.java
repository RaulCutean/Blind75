public class Main {
    public void setZeroes(int[][] matrix) {

        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix.length; j++) {
                if(matrix[i][j] == 0) {

                }
            }
        }


    }


    public static void main(String[] args) {

        int[][] matrix = {{1 , 0 , 1} , {0 , 0 , 0} , {1 , 1 , 1}};

        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }



    }
}