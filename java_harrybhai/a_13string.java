// *******String***********

public class a_13string {
    public static void main(String[] args){
        String name = "abhishek";
         System.out.println(name);

         /*******Determine length of the string********/
         int value = name.length();
         System.out.println(value);

         /*******it transform string into lowercase********/
         String lstring = name.toLowerCase();
         System.out.println(lstring);
         
         /*******it transform string into Uppercase********/
         String Ustring = name.toUpperCase();
         System.out.println(Ustring);

         /*****Trim string helps to reduce the free space in the string*****/
         String nonTrimstring = "      abbubhai     ";
         System.out.println(nonTrimstring);
         System.out.println(nonTrimstring.trim());

         /****Substring gives starting point of the word in the string***** */
         System.out.println(name.substring(2));
         System.out.println(name.substring(2,6));  //end index givenvalue se 1 kam chalega

         /****Replace string********/
         System.out.println(name.replace('h', 'l'));

         /** ******charAt given character of the index******/
         System.out.println(name.charAt(3));

        //  ********Indexof=> mtlb fromindex(ye index se chalu kro doondna) ye word kon se index pe he********
        System.out.println(name.indexOf("his", 1));


        // ***********Equal case and equalignore case**************
        System.out.println(name.equals("abhishek"));
        
        System.out.println(name.equalsIgnoreCase("aBHisHEk")); //it ignore wheather it is capital or small but string must be same
    }
}
