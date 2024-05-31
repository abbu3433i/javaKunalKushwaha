import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//****** An ArrayList class is a resizable array, which is present in the java. util package. While built-in arrays have a fixed size, ArrayLists can change their size dynamically. Elements can be added and removed from an ArrayList whenever there is a need, helping the user with memory management.

//------ArrayList:- if you dont know how much size you need than we say to java!...hey java handle the size for me and let me input any number of element that i want thats why we using arraylist

public class d_1ArrayListExample {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(10); //--this 10 capacity is for showing.. we can add many values as we want 
        list.add(10);
        list.add(120);
        list.add(103);
        list.add(104);  //----arraylist will double the size when we adding values continuously means increase the size internally double,triple so on...
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



//*******************************MultiDiamation arraylist***************************************** */

//         ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 

//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < 3; i++) {
//             list.add(new ArrayList<>());  //----adding 3 arrlist inside the ArrayList
//         }

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {     //---giving the value in each arrlist inside the ArrayList
//                 list.get(i).add(sc.nextInt());
//             }
//         }
         
//  System.out.println("Enter arrlist values"+list);
        
}
}