/********base class******* */
class base{
    public int x;

    public void setdata(int z){
        x = z;
        System.out.println("This is abbubhai typing here");
    }
    public int getdata(){
        return x;
    }
}

/*******Derived class******** */
class derived extends base{
    int y;

    public int gety(){      /***int type***/
        return y;
    }
    public void sety(int z){
        y = z;
        System.out.println("This is the derived class");
    }
}

public class a_45Inheritance {
    public static void main(String[] args) {
       // ******Base class object*****
        base abbu = new base();
        abbu.setdata(55);
        System.out.println(abbu.getdata());    /****[type-int] hoga to getdata Sout me aayega*****/
        
        // *******Derived class object*******
        derived d = new derived();
        d.setdata(55);
        System.out.println(d.getdata());
    }
}
