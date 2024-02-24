/****Abstract class-->jo kaam child class me same hone bala ho to usse hum abstract parent me declare kar denge taki unhe hum child class me use kar saken******/

abstract class parent2{
    parent2(){
        System.out.println("hello good morning");
    }
    public void bolo(){
        System.out.println("good evning");
    }
    abstract public void greed();    /***Abstract class bata degi ki jo mujhse inherit karega usko ye given-->absract method banani padegi***/
    abstract public void greed2();
}

class child extends parent2{
    public void greed(){   //Abstract methods
        System.out.println("Hello bacchon");
    }
    public void greed2(){  //Abstract methods
        System.out.println("Good night");
    }
}


abstract class minali extends child{
    public void omg(){
        System.out.println("Tony stark");
    }
}

public class a_53AbstractClass {
    public static void main(String[] args) {

        // parent2 p = new parent2();   ****Abstract ka object nhi banega****

        child c = new child();
        System.out.println(c);

        // minali m = new minali();

    }
}
