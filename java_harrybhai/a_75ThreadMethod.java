class mythr extends Thread{
    public void run(){

            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
            System.out.println("hellow bacchon");
    }
}
class mythr2 extends Thread{
    public void run(){
        int i = 0;
        while (i<20) {
            System.out.println("Dhanyavaad");

            // ***********this will stop b2 for 455milli times and b1 will print continuously **********
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}


public class a_75ThreadMethod {
    public static void main(String[] args) {
        mythr b = new mythr();
        mythr2 b2 = new mythr2();
        b.start();
        b2.start();
    }
}
