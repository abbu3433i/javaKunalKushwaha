import java.util.ArrayList;

public class d_9Recursion8 {
    /*********************************Permutation *********************************** */
    // public static void main(String[] args) {
    //     Permutations("", "abc");
    // }

    // static void Permutations(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     for (int i = 0; i <= p.length(); i++) {
    //         String f = p.substring(0,i);
    //         String s = p.substring(i , p.length());
    //         Permutations(f + ch + s, up.substring(1));
    //     }
    // }


    //2.--------------Permutation in Arraylist---
    // public static void main(String[] args) {
    //        ArrayList<String> permu = PermutaionList("", "abc");
    //        System.out.println(permu);
    // }

    // static ArrayList<String> PermutaionList(String p, String up){    //---
    //     if (up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>();  //---
    //         list.add(p);
    //         return list;
    //     }

    //     char ch = up.charAt(0);

    //     //local to this call
    //     ArrayList<String> ans = new ArrayList<>();   //----

    //     for (int i = 0; i <= p.length(); i++) {
    //         String f = p.substring(0,i);
    //         String s = p.substring(i , p.length());

    //         ans.addAll(PermutaionList(f + ch + s, up.substring(1))); //----
    //     }

    //     return ans;  //----
    // }



    //3.---------------------------PermutaionCount---
    // public static void main(String[] args) {
    //     int c = permutationCount("", "abc");
    //     System.out.println(c);
    // }

    // static int permutationCount(String p, String up){
    //     if (up.isEmpty()) {
    //         return 1;
    //     }

    //     char ch = up.charAt(0);
    //     int count = 0;   //--------

    //     for (int i = 0; i <= p.length(); i++) {
    //         String f = p.substring(0,i);
    //         String s = p.substring(i , p.length());
    //         count = count + permutationCount(f + ch + s, up.substring(1));  //-----
    //     }

    //     return count;  //----
    // }
}
