public class a_28Multi_dim_array {
    public static void main(String[] args) {
        // int [] marks; -----> 1-D Array

        // ***************2-D Array**********
        int [][] flats; 
        flats = new int [2][3];    //-> [2]row [3]column 
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        /********Nested loop 1 ke andar 1**********/
        for(int i=0; i<flats.length; i++){   // i=0 pe j teen baar chalega than i=1 pe j teen baar chalega

            for(int j=0; j<flats[i].length; j++){
               System.out.print(flats[i][j]);
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}
