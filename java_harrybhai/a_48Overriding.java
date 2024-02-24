/*********
 * Different class me ek hi name ka function ho use Method overriding khehte hen
 **********/

class A {
    int a;

    public int showup() {
        return 4;
    }

    public void meth2() {
        System.out.println("The method 2 of class A");
    }
}

class B extends A {

    @Override // this will just show that the fn. will override

    public void meth2() {
        System.out.println("The method 2 of class B");
    }

    public void meth3() {
        System.out.println("The method 3 of class B");
    }
}

public class a_48Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
