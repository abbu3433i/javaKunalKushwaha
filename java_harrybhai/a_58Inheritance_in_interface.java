/*********inheritance in interfaces***********/

interface jonny{
    void method1();
    void method2();
}
interface jonybhai extends jonny{
    void method3();
    void method4();
}

class abbubhai implements jonybhai{
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }
    public void method3(){
        System.out.println("method 3");
    }
    public void method4(){
        System.out.println("method 4");
    }
}


public class a_58Inheritance_in_interface {
   public static void main(String[] args) {
    abbubhai obj = new abbubhai();
    obj.method1();
    obj.method2();
    obj.method3();
    obj.method4();
   }
}
