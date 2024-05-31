import java.util.*;

public class d_15_1Stack {   //LIFO operation perform karta he [last in first out]

//     //Node class
//    static class Node{
//         int data;
//         Node next;    //instance variable 

//         public Node(int data){
//         this.data = data;
//         this.next = null;
//         }
//     }//--node

//     //Stack class
//     static class Stackclass{
//         public static Node head;

//         //Check isempty or not  empty he to true return kro nhi to false
//         public static boolean isEmpty(){
//             return head==null;
//         }

//         //PUSH
//         public void push(int data){
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;   //agar stack empty he to jo newnode he usa add karengen use head kar do 
//                 return;
//             }
//             newNode.next = head;   //newnode ke next ko head kar do
//             head = newNode;        //head ko newnode kar do
//         }
        
//         //POP
//         public static int pop(){
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;  //head ka data store kar lo 
//             head = head.next;  //head ko head ka next kar do isse purani head bali node delete ho jayegi
            
//             return top;
//         }
        
//         //PEEK----mtlb jhankna sabse top element show karta he 
//         public static int peek(){
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }

//     }//--stack

// public static void main(String[] args) {
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     s.push(4);

//     while (!s.isEmpty()) { 
//         System.out.println(s.peek());
//         s.pop();
//     }
// }
        


//==========================Stack implementation using Arraylist========================================================
//  static class Stack{
//   static ArrayList<Integer> list = new ArrayList<>();

//   public static boolean isEmpty(){
//     return list.size()==0;
//   }

//   //PUSH
//   public static void push(int data){
//     list.add(data);
//   }

//   //POP
//   public static int pop(){
//     int top = list.get(list.size()-1);  //list.get value dega or list.size index batayega ki kon si value dena he size-1
//     list.remove(list.size()-1);  //jo value last me add hui he use remove kar do 
//     return top;
//   }

//   //PEEK
//   public static int peek(){
//     if (isEmpty()) {
//         return -1;
//     }
//     return list.get(list.size()-1);
//   }

// }//--stack arrlist
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while (!s.isEmpty()) { 
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }


        //==================stack implementation using collection framework====================

        // public static void main(String[] args) {
        //     Stack<Integer> s = new Stack();
        //     s.push(1);
        //     s.push(2);          //-----inside collection framework all fn. name are same push,pop,peek or isEmpty....all work properly
        //     s.push(3);
        //     s.push(4);
    
        //     while (!s.isEmpty()) { 
        //         System.out.println(s.peek());
        //         s.pop();
        //     }
        // }


        
        //======================push data at bottom of stack and reverse as well==============================================

        // //  -------using recursion we add data on bottom of stack-------
        //     public static void pushAtBottom(int data, Stack<Integer> s){
        //         if (s.isEmpty()) {
        //             s.push(data);
        //             return;
        //         }
        //         int top = s.pop();  //phele sare element nikaal lengen fir jese hi stack empty hua if bali condition chalegi or naya data push hoga 
        //         pushAtBottom(data, s);   
        //         s.push(top);        //jo sare element nikale the bo bapas push ho jayengen
        //     }

        //     //reverse
        //     // public static void reverseStack(Stack<Integer> s){
        //     //     if (s.isEmpty()) {
        //     //         return;
        //     //     }
        //     //     int top = s.pop();  //sare element nikal liye stack se 
        //     //     reverseStack(s);
        //     //     pushAtBottom(top, s);  //ye har element ko bottom me push kar dega
        //     // }

        // public static void main(String[] args) {
        //             Stack s = new Stack();
        //             s.push(1);
        //             s.push(2);
        //             s.push(3);
                   
        //             pushAtBottom(4, s);
        //             // reverseStack(s);
            
        //             while (!s.isEmpty()) { 
        //                 System.out.println(s.peek());
        //                 s.pop();
        //             }
        //         }



    }//main bracket of the class
