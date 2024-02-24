/************[VarArgs]-> mtlb niche bale sum me jitne bhi arguments mil rahe hen....
unhe upar bale sum fn. ke array me daal rahe he******/

public class a_33VarArgs {
    //created a sum function 
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println("The all sum of the values is: "+sum(5,6));
        System.out.println("The all sum of the values is: "+sum(5,6,7));
        System.out.println("The all sum of the values is: "+sum(5,6,7,8));
    } 
}
