import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int top =  0;
        int left = 0;
        int rigth = colLength - 1;
        int bottom = rowLength - 1;
        int dir = 0 ;

        while(top <= bottom && left <= rigth) {
            switch(dir){
                case 0:
                    for(int i = left ; i <= rigth ; i++) {
                        list.add(matrix[top][i]);
                    }
                    dir++;
                    top++;
                    break;
                case 1:
                    for(int i = top ; i <= bottom; i++) {
                        list.add(matrix[i][rigth]);
                    }
                    dir++;
                    rigth--;
                    break ;
                case 2:
                    for(int i = rigth; i >= left ; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    dir++;
                    bottom--;
                    break;
                case 3:
                    for(int i = bottom ; i >= top ; i--) {
                        list.add(matrix[i][left]);
                    }
                    dir = 0;
                    left++;
                    break;
            }

        }



        return list ;

    }
}