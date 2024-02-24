class base{
   
    /*****Constructor overloading*****/
     base(){
        System.out.println("Iam a base class constructor");
    }
     base(int x){
        System.out.println("Iam a overloaded base class constructor: "+x);
    }
}

class derived extends base{
    
     derived(){
        // super(0); /**it help to run super class argument constructor and when we not give this defalult costructor runs**/
        System.out.println("I am a derived class constructor");
    }
     derived(int x, int y){
        super(x);
        System.out.println("I am a overloaded derived class constructor :"+y);
    }
}

class childofderived extends derived{

    childofderived(){
     System.out.println("I am childofderived class constructor");
    }

    childofderived(int x,int y,int z){
     super(x, y);
     System.out.println("I am overloaded childofderived class constructor: "+z);
    }
}



public class a_46ConstructorInheritence {
    public static void main(String[] args) {
        
        // base harry = new base();    Isme base ka constructor hi run hoga.

        /*****Phele base class ka constructor run hoga then derived ka.[EveryTime]*****/
        // derived abbu = new derived(45,14);   

        childofderived aniket = new childofderived(13,14,15);
        System.out.println(aniket);
    }   
}
