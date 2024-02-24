import java.util.ArrayList;

public class d_8StringBuilder {
    public static void main(String[] args) {
        /*******Ye heap memory ke pool ke Andar hi banegen [name1,name2]--reffrence address same hi hoga**********/
        String a = "abhishek";
        String b = "abhishek";
        System.out.println(a==b);

        /*******Ye heap memory ke pool ke outside banegen [name1,name2]--reffrence address alag alag hoga**********/
        String name1 = new String("abhishekgour");
        String name2 = new String("abhishekgour");
        System.out.println(name1==name2);

        /********.equals-->value check karega same he ya nhi.....na ki obj ka reffrence address**********/
        System.out.println(name1.equals(name2));  //space bhi same hona chahiye ek bhi jyada nhi hona chahiye

        /******in arr we can access any value with the help of index value*****/
        // In string we can acces any value with the help of charAt of index given
        System.out.println(name1.charAt(1));


        /***********Wrapper class rarely we can use it************** */
        // Integer num = new Integer(56);
        // System.out.println(num.toString());
        // System.out.println(num);




        /************************[Pretty printing with the help of---pintf]******************************* */
        // %c = Character
        // %d - Decimal number (base 10)
        // %e = Exponential floating-point number
        // %f = floating point number
        // %i - Integer (base 10)
        // %o - Octal number (base 8)
        // %s = strig
        // %u - Unsigned decimal (integer) number
        // %x - Hexadecimal number (base 16)
        // %t - Date/time
        // %n = Newline


        //******it will automatically round up with its next****
        //in this % is a placeholder which holds the value
        float abbu  = 534.129f;
        System.out.printf("float value is %.2f",abbu);


        System.out.println();

        //****math is a library which pritn pi value*****
        System.out.println(Math.PI);
        System.out.printf("%.3f",Math.PI); //it print only 3 value after decimal


        System.out.println();

        //%s will place holds the string 
        System.out.printf("Hello my name is %s and i am a %s","abhishek","web developer");


        System.out.println();


        System.out.println('a' + 'b'); //only character will conver in ASCII value then add
        System.out.println("a" + "b"); //concatinate the string


        System.out.println('a'+3); 
        System.out.println((char)('a'+3)); //This will shown d because we add 3 and convert it into in char





        //complex data ko concatenate karne ke liye ek string ko add karna hi padega
        System.out.println(new Integer(56) +""+ new ArrayList<>());
    }
}
