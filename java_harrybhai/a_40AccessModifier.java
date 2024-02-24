
class Myemployee{
    private int id;
    private String name;

    /****Help to acces->Private member**** */
    public int getid(){
     return id;
    }

    public void setid(int i){
      id = i;
    }

    public String getname(){
     return name;
    }

    public void setname(String n){
      name = n;
    }
}


public class a_40AccessModifier {
    public static void main(String[] args){
        Myemployee saanbu = new Myemployee();

        /*****Directly not accessable**** */
        // saanbu.id = 55;
        // saanbu.name = "string";
     
        // **********with the help of this we can access private member of the class*********
        saanbu.setid(55);
        System.out.println(saanbu.getid());

        saanbu.setname("Saanvi");
        System.out.println(saanbu.getname());
    }
}
