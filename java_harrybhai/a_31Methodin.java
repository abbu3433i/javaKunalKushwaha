/************Method in java***********/

public class a_31Methodin {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y) * 5;
        }
        return z;   //most imp return type
    }

    // ************The values of main class is copy in the logic we created in upper side***************
    public static void main(String[] args){             
        int a=5;                                        
        int b=7;
        int c;
        c = logic(a,b);
    System.out.println(c);

        int a1=7;
        int b1=5;
        int c1;
        c1 = logic(a1,b1);
    System.out.println(c1);                              
    }
}
