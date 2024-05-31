import java.util.ArrayList;
//------------------------------------Work on subset substring---------------------------
public class d_9Recursion7 {

    //****************************Remove or skip charater from string**************************** */
    // public static void main(String[] args) {
    //     String s = "bacacdha";
    //     System.out.println(skip(s));
    // }

    // static String skip(String up){
    //     if (up.isEmpty()) {   //string recursively call hote hote last me empty ho jayega to " " return kar do
    //         return "";
    //     }

    //     char ch = up.charAt(0);    //har baar string ka first charater uthayega

    //     if (ch=='a') {
    //         return skip(up.substring(1));    //agar ch ==a he to recursively bahi string ko index 1 se recall kardo
    //     }
    //     else{
    //         return ch + skip(up.substring(1));   //agar ch=a nhi he to ch+ karke substring index 1 se recall kardo
    //     }
    // }



    // **********************Remove apple****************************
    //1.-------------------------
    // public static void main(String[] args) {
    //     String s = "bacapplecdha";
    //     System.out.println(skipApple(s));
    // }

    // static String skipApple(String up){
    //     if (up.isEmpty()) {  
    //         return "";
    //     }   

    //     if (up.startsWith("apple")) {
    //         return skipApple(up.substring(5));    
    //     }
    //     else{
    //         return up.charAt(0) + skipApple(up.substring(1));   //---string ka 0 index character add kro and string ko index 1 se recursively recall kar do 
    //     }
    // }

    //2.-------------------------------------skipAppNotapple-------
    // public static void main(String[] args) {
    //     String s = "bacappapplecdha";
    //     System.out.println(skipAppNotapple(s));
    // }

    // static String skipAppNotapple(String up){
    //     if (up.isEmpty()) {  
    //         return "";
    //     }   

    //     if (up.startsWith("app") && !up.startsWith("apple")) {  //app se start ho lekin apple se start na ho tabhi chalega
    //         return skipAppNotapple(up.substring(3));    
    //     }
    //     else{
    //         return up.charAt(0) + skipAppNotapple(up.substring(1));   //---string ka 0 index character add kro and string ko index 1 se recursively recall kar do 
    //     }
    // }



    /***************************Subset or subsequence of a given string************************* */
    public static void main(String[] args) {
        subseq(" ", "abc");
    }

    static void subseq(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch =  up.charAt(0);
        // add it, ignore it --game is done
        subseq(p + ch, up.substring(1));  //---------this will add it 
        subseq(p, up.substring(1));       //---------this will ignore it 
    }

    //-------------------Store subset inside arraylist--------------------------
    // public static void main(String[] args) {
    //     System.out.println(subseqRet("", "abc"));
    // }

    // static ArrayList<String> subseqRet(String p , String up){
    //     if (up.isEmpty()) {

    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     char ch =  up.charAt(0);

    //     ArrayList<String> left = subseqRet(p + ch, up.substring(1)); //  add it 
    //     ArrayList<String> right = subseqRet(p, up.substring(1));     //  ignore it

    //     left.addAll(right);
    //     return left;
    // }


    /***************************ASCII value*************************** */
    // public static void main(String[] args) {
    //     char ch = 'a';
    //     // System.out.println(ch + 0); //---it give 97 kyuki ch character me 0 integer add kar diya to datatype int ho gay jo bhi ans aayega integer me hi dega which means ASCII value of 'a'

    //     System.out.println((char)(ch + 1)); //-----isme datatype char kar diya mtlb ans character me aayega +1 kar diya to ans 'b'
    // }

}
