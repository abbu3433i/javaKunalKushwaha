/***we use implements keyword in place of extends***/

/*****Interface it is also like abstract class******/
interface Bicycle{
    int a = 45;
    void breakup(int decrement);
    void speedup(int increment);
}
interface motorcycle{
    void blowhorn();
    void blowindicator();
}



class cycle implements Bicycle, motorcycle{
    
    public void breakup(int decrement){
        System.out.println("Apply break");
    }
    public void speedup(int increment){
        System.out.println("Apply speed");
    }

   public void blowhorn(){
     System.out.println("horn chalu karo bhai");
    }
   public void blowindicator(){
     System.out.println("indicator on karo bhai");
    }
}

public class a_55Interface {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.speedup(5);
        // System.out.println(c.a);
    }
}
