public class a_27Aarraylength {
    public static void main(String args[]){

        /*********Length of the array of the string************/ 
     String [] student = {"atul","gopal","shubham","abhishek","harshit"}; 
   //System.out.println(student[2]);
     System.out.println(student.length);


     /*******Array using loop********/
     int [] marks = {98,52,63,41,79,20};
     System.out.println("loop is done in forward wise");
     for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]);  // ->here marks is arr and i is index
}

     System.out.println("loop is done in reverse wise");
     for(int i= marks.length -1; i>=0; i--){
        System.out.println(marks[i]);  // ->here marks is arr and i is index
     }

     /**********for each loop************/
     System.out.println("This will give only element of the array not i index");
     for (int element : marks) {
        System.out.println(element);
     }
    }
}
