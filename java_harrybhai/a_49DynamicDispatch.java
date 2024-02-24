/****isko run time pe pata chalta he ki kon sa run karna he called Dynamic method dispatch****/

class phone{
public void num(){
    System.out.println("This is the num of phone");
}
public void on(){
    System.out.println("switch on the phone......");
}
}


class smartphone extends phone{
public void music(){
    System.out.println("This is the num1 of smartphone");
}
public void on(){
    System.out.println("switch on the smartphone......");
}
}
public class a_49DynamicDispatch {
    public static void main(String[] args) {
        
        /**Refrence phone ka he or obj smartphone ka-->only override method run hoga***/
        phone obj = new smartphone();   //allow to create obj
        obj.num();
        obj.on();
        // obj.music();   only override method run hoga
    }
}
