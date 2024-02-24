import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class d_1ArrayListExample {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(120);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(106);
        list.add(160);

        System.out.println(list);

        System.out.println(list.contains(104)); // list contain 104 then it return true otherwise false

        list.set(0, 99);      //it set '0' index pe '99' value place krr dega

        list.remove(2);    //index 2 will remove

        System.out.println(list);


    //     //'input' from user
    // /*  Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a arralist");
    //     for(int i = 0; i<5; i++){
    //         list.add(sc.nextInt());
    //     }
    //     //'output'
    //     System.out.println(list);      
    //     */
    // }




    


        
}
}