
class Raju{
     int id;
     String name;

    /******Constructor with same name****** */
     public Raju(){
        id=500;
        name = "CodeWithHarry";
     }
     public Raju(String Mynum,int Myid){
        id = Myid;
        name = Mynum;
     }

     public int getid(){
        return id;
     }
     public String getname(){
        return name;
     }
}

public class a_41Constructor {
    public static void main(String[] args){
        System.out.println("namstey duniya me aapka swagat he");

        // Raju durga = new Raju("Durga", 45);  *****Overload constructor***

        Raju durga = new Raju();
        System.out.println(durga.getid());         /***Default***/
        System.out.println(durga.getname());
    }
}
