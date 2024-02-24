/*********this keyword & super keyword in java************ */

class Ekclass{
    int a;

    Ekclass(int a){
         this.a = a;     /***this-> is used to when we will give same variable in constructor***/
    }
        public int getdata(){
            return a;
        }
}

class Doclass extends Ekclass{
    Doclass(int c){
        super(c);    /***isse direct "int" bala constructor call ho jayega or agar isko na diya to defalut constructor call hoga jo apan ne "Ekclass" me nhi diya->usko dena padega***/
        System.out.println("i am a Constructor");
    }
}
public class a_47thisSuper {
    public static void main(String[] args){

    Ekclass henry = new Ekclass(56);
    System.out.println(henry.getdata());

    Doclass porter = new Doclass(26);
    System.out.println(porter);
    }
}
