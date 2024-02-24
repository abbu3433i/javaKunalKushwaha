class worker{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

public class a_39Practice {
    public static void main(String[] args) {
        worker man = new worker();
        man.salary = 55;
        man.setName("Abhishek Gour");
        
       System.out.println(man.getsalary());  //put this inside the sout
       System.out.println(man.getName()); 
    }
}
