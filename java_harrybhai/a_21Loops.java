public class a_21Loops{
    public static void main(String[] args) {
        // ******While loop*******
        int i = 1;
        while (i<=5) {      //isme boolean aata he "true" ya "False"
            System.out.println(i);
            i++;
        }
        System.out.println("It is finished now");

        // *******Infinite loop*******
        // while (true) {
        //     System.out.println(i);
        // }

        
        /*********For loop**********/
        for(int a=1; a<=10; a++){
            System.out.println(a);
        }
        System.out.println("Its also finished");


        // ********Loop for odd number*******
        // 2n = Even number = 0 2 4 6 8 10
        // 2n+1 = Odd number = 1 3 5 7 9 11
        for(i = 0; i<5; i++){
            System.out.println(2*i+1);
        }
        System.out.println("Odd number is printed");



        /**********It is also same for even number**********/
        // for(i = 0; i<5; i++){
        //     System.out.println(2*i);
        // }


        // ******Decrement way*******
        for(i = 5; i>0; i--){
            System.out.println(i);
        }
    }
}
