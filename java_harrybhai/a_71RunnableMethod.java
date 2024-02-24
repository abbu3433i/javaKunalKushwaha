/***********Multithreading using runablemethod**********/
class runablethread extends Thread{
public void run(){
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
    System.out.println("AK47 shoting");
}
}
class runablethread2 extends Thread{
public void run(){
    System.out.println("MP40 is firing");
    System.out.println("MP40 is firing");
    System.out.println("MP40 is firing");
    System.out.println("MP40 is firing");
    System.out.println("MP40 is firing");
    System.out.println("MP40 is firing");
    System.out.println("MP40 is firing");
}
}


public class a_71RunnableMethod {
    public static void main(String[] args) {
        runablethread bullet = new runablethread();
        Thread gun = new Thread(bullet);

        runablethread2 bullet2 = new runablethread2();
        Thread gun2 = new Thread(bullet2);

        gun.start();
        gun2.start();
    }
}
