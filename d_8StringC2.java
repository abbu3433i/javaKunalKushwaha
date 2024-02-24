import java.util.Arrays;

public class d_8StringC2 {
    // public static void main(String[] args) {
    //     //1.humne ek empty string li he or for loop chalaye he char 'a' se i ko increase kiye he jo ASCII value ko increse kar dega
    //     //2.Then we convert it into character... ahead we add each char into empty string 
    //     //3.But ye time and storage complexity bahut lega which is O(N^2)---ab+c,abc+d,abcd+e,abcde+f
    //     //4.Isse bachne ke liye hum string builder ka use karenge

    //     String series = "";
    //     for(int i = 0; i<26; i++){
    //         char ch = (char)('a'+ i);
    //         series+=ch;
    //     }
    //     System.out.println(series);
        
    // }


    /*****************************[String Builder]*********************************** */
    // public static void main(String[] args) {
    //     //String builder direct 'ch' ko add karte jayega...ye purani value ko vapas na leke usi value me append karte jayega/
    //     StringBuilder builder  = new StringBuilder();
    //     for(int i = 0; i<26; i++){
    //         char ch = (char)('a'+ i);
    //         builder.append(ch); //iske paas bahut feature he to builder. lagane ke baad tum sare explore kar skte ho
    //     }
    //     System.out.println(builder.toString());  //ch ko string me convert kar diya 




    //     // //LIKE (example)
    //     // builder.deleteCharAt(0);
    //     // System.out.println(builder.toString());

    // }//main
    


    // public static void main(String[] args) {
    //     String name = "abhishek gour";
    //     System.out.println(Arrays.toString(name.toCharArray()));  //convert string into char and store in array form...

    //     System.out.println(name.indexOf('s'));
    //     System.out.println("    world     ".strip()); //it remove white spaces from left and right side
        
    //     System.out.println(Arrays.toString(name.split(" "))); //split the value on the basis of space writtened inside the paranthesis
    // }




/***********************To check wheather a string is palindrome or not******************************** */


    // public static void main(String[] args) {
    //     String str = "abcba";

    //     if (palindrome(str)) {
    //         System.out.println("palindrome");
    //     }else{
    //         System.out.println("Not palindrome");
    //     }
    // }
 
    // static boolean palindrome(String str){
    //     for (int i = 0; i < str.length(); i++) {
    //         char st = str.charAt(i); //-----------------string ka character i ki baat ho rhi he jo series me chal rha he 
    //         char end = str.charAt(str.length()-1-i);
    //         if (st != end) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

}//class
