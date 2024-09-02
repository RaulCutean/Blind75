

public class Solution {

    public int maxArea(int[] heigth) {

        int max = 0;
        int min = 999999;
        int i = 0 ;
        int j = heigth.length - 1;

        while(i != j) {
            if(heigth[i] < heigth[j]) {
                min = heigth[i];
            }
            else {
                min = heigth[j];
            }
            max = Math.max(max , min * (j - i));


            if(heigth[i] < heigth[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return max ;
    }

}
