
/***********OOPs me class sabse upar banegi..***********/
class Employee{
   int id;
   String name;

   public void getdetails(){
    System.out.println("The value of id: "+id);
    System.out.println("And the name is: "+name);
   }
  
}

/*******phir is class me upar bali class ka object bana ke usse access kar sakte hen...*******/
public class a_38OOPs {
    public static void main(String[] args) {

        Employee std = new Employee();  //Institiating a new Employee object
        std.id = 15;
        std.name = "Abbubhai";
        std.getdetails();
        
        Employee abbu = new Employee();  //Institiating a new Employee object
        abbu.id = 225;
        abbu.name = "Ramgopal";
        abbu.getdetails();
    }
    
}
