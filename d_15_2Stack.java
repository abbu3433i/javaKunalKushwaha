import java.util.Stack;

public class d_15_2Stack {
    
    =======reverese string using stack============

    public static String reverseString(String str){
        Stack<Character> s = new Stack();   //ek stack liya usme string ke character ko ek ek karke stack me fill kar diya 

        int indx = 0;
        while (indx < str.length()) {       //string ki len tak chala do
            s.push(str.charAt(indx));       //str ka har char ko stack me push kar do
            indx++;
        }

        StringBuilder SB = new StringBuilder("");  
        while (!s.isEmpty()) {
            char curr = s.pop();     //har char ko stack se nikal ke curr me store kar do or fir SB me append kar do
            SB.append(curr);
        }

        return SB.toString();      //fir SB ke char ko string ke form me return karwa do
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }



    //Q.===================next Greater element in arr of stack==================

    // public static void main(String[] args) {

    // int[] arr = {6,8,0,1,3};
    // Stack<Integer> s = new Stack<>();//-------empty stack
    // int[] nextGreater = new int[arr.length];//----empty arr

    // for (int i = nextGreater.length-1; i>=0; i--) {
    //     //while
    //     while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {   //agar stack empty nhi he and arr ka top element chota ho arr[i] se to stack me se elem nikaal dena 
    //         s.pop();
    //     }

    //     //if-else
    //     if (s.isEmpty()) {             //agar stack empty he to -1 return kar do
    //         nextGreater[i] = -1;
    //     }else{
    //         nextGreater[i] = arr[s.peek()];      //upar ka while loop nhi chala mtlb arr ka top bada he arr ke i se.....to arr ke peek(top) elem ko nextgreater[i] me store kar do
    //     }

    //     s.push(i);    //stack me i daalte jao for loop wala fir hi stack se value check hongi
    // }
    
    // //for printing values
    // for (int j = 0; j<nextGreater.length; j++) {
    //     System.out.print(nextGreater[j]+" ");
    // }
    // System.out.println();
    // }

    // //next Grater Right-------This one we solved
    // //next Greater Left ------upar ka for loop increment me chala do reverse kr do
    // //next Smaller Right -----arr[s.peek()]>=arr[i] ab is condition ko badal do kyuki phele hum chote elm ko stack se hata rhe the ab bade elem ko hatana he
    // //next Smaller Left-------isme loop ko bhi reverse karna he or condition ko bhi



    //Q.================================valid parentheses====================================================

//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();  //stack banaya character type ka 

//         for (int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch=='(' || ch=='[' || ch=='{') {
//                 s.push(ch);
//             }
//             else{
//                 if (s.isEmpty()) {
//                     return false;
//                 }
//                 //stack ka peek elem and jo naya ch me bracket aya he bo inse match ho to pop kar do
//                 if (s.peek()=='(' && ch==')' || s.peek()=='[' && ch==']' ||s.peek()=='{' && ch=='}') {
//                     s.pop();
//                 }
//                 else{
//                     return false;
//                 }
//         }
//     }//---for

//     //agar string hi empty ho to stack empty hi rahega to true || or me agar koi st me open bracket ho or uska koi close bracket na ho to stack empty nhi rahega to false return karna 
//     if (s.isEmpty()) {
//         return true;
//     }else{
//         return false;
//     }

// }
//     public static void main(String[] args) {
//         String str = "[{()}]";
        
//         if (isValid(str)) {
//             System.out.println("it is valid parentheses: "+isValid(str));
//         }else{
//             System.out.println("not valid");
//         }
//     }



//Q.============================check for Duplicate parentheses or not====================================================
// ((a+b)) ----> 'a+b' ke upar to bracket he hi lekin uske bhi upar unnecessary bracket aa gya mtlb duplicate he

// public static boolean isDuplicate(String str){
//     Stack<Character> s = new Stack<>();

//     for (int i=0; i<str.length(); i++) {
//         char ch = str.charAt(i);

//         if (ch==')') {      //jese hi closing bracket aaye 
//             int count = 0;
//             while (s.peek() !='(') {   //jab tak stack ka peek elem...[open bracket] na aa jaye tab tak chalate rho loop
//                 s.pop();     //elem ko pop karte rho or count++ karo jab tak ki '(' bracket na aa jaye stack me 
//                 count++;
//             }
//             //mtlb '(' and ')' ke andar koi data na ho to count 0 hi rahega isse pata chal jayega ki duplicate he ya nhi
//             if (count<1) {  
//                 return true; //duplicate found
//             }else{
//                 s.pop();
//             }
//         }
//         else{
//             s.push(ch);  //ye str ko stack me push karte jayega
//          }
//     }

//     return false;
// }

// public static void main(String[] args) {
//     String str = "((a+b))";
//     if (isDuplicate(str)) {
//         System.out.println("Duplicate parentheses: "+isDuplicate(str));
//     }else{
//         System.out.println("Not duplicate");
//     }
// }




}//class