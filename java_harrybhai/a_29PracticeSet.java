public class a_29PracticeSet {
    public static void main(String[] args) {

        // /************practice problem 1 =>Sum all the arr values************/
        float [] marks ={92.0f, 25.0f, 78.3f, 75.6f, 87.2f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("Sum of the given array is "+sum);




        /**********Practice problem 2 =>Find out the value is present in the arr or not**************/
        // float [] marks ={92.0f, 25.0f, 78.3f, 75.6f, 87.2f};
        // float nam = 75.6f;

        // boolean isInArray = false;  //Declaration kiya he 

        // for (float element : marks) {
        //     if(nam==element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        //     if(isInArray){
        //         System.out.println("The element is present in the array");
        //     }
        //     else{
        //         System.out.println("The element is not present in the array");
        //     }


        /************Practice problem 4 =>Add two matrices and put in result matrix*************/
        int [][] mat1 = {{1,2,3},
                          {4,5,6}};

        int [][] mat2 = {{4,10,13},
                          {24,5,36}};
                          
        int [][] result = {{0,0,0},{0,0,0}};
        
        for(int i=0; i<mat1.length; i++){ 

            for(int j=0; j<mat1[i].length; j++)
            {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }


        /***********Practice problem 6 =>which one is maximum arr value************/
        int [] arr = {1,2,73,14,5,6};
        int max = 0; 

        for (int e : arr) {
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum value of the arr is "+max);


        /***********practice problem 8 =>sorted array or not************/
        // int [] arr = {1,2,73,14,5,6};
        // boolean isInsorted = true;

        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i]>arr[i+1])
        //     {
        //         isInsorted = false;
        //         break;
        //     }
        // }
        // if(isInsorted){
        //     System.out.println("This is the sorted array");
        // }else{
        //     System.out.println("This is not the sorted array");
        // }
    }
}