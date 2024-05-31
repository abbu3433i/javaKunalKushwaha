import java.util.Arrays;

public class d_3BS3_on2Darr {
    /****************To find target element in 2D sorted arr also mean matrix************* */
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},    //[1]---40 se check hoga agar target 40 se chota he to pura 40bala col-- kar do kyuki is col me sari value target se badi hi hen. [2] Ab uske piche 30bala col check hoga agar target 30se bada he to row++ kar do kyuki us row ki piche ki sari value choti hi hen 
            {15,25,35,45}, 
            {28,29,37,49},
            {33,34,38,50}
        };

        System.out.println(Arrays.toString(matrixSearch(arr, 50)));
    }

    static int[] matrixSearch(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length-1;

        while (r<matrix.length && c>=0) {     //'row' ko arr ki len. tak chala do or 'col' ko tab tak chalao jab tak bo 0 se bada he or equal he
            //case1
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            //case2
            if(target>matrix[r][c]){
                r++;
            }
            //case3
            else{   //target<matrix[r][c]

                c--;
            }
        }
        System.out.println("Target not found:");
        return new int[]{-1,-1};
    }
}
