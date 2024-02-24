public class a_24Break {
    public static void main(String[] args) {

        /********* Break statement---for ***********/
        
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            System.out.println("abbu bhai is back");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }

        /************ it is also same for While loop **********/
        // int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     System.out.println("Java starting");
        //     if (i == 2) {
        //         System.out.println("Ending the class");
        //         break; /*it helps to stop the loop*/
        //     }
        //     i++;
        // }


       /*********Continue statement********/
       for(int i=0; i<5; i++){

        if(i==2){
            System.out.println("The End");
            continue; /*2 iteration ko chod ke continue ho jayega*/
        }

        System.out.println(i);
        System.out.println("Developer of java");
       }

    }
}
