import java.util.ArrayList;

public class d_9Recursion3 {
    /***********************check arr is sorted  or not with the Recursion***************** */
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,7};
    //     System.out.println(sorted(arr, 0));

    //     if (sorted(arr, 0)) {   
    //         System.out.println("The arr is sorted");
    //     }
    //     else{
    //         System.out.println("The arr is not sorted");
    //     }
    // }

    // static boolean sorted(int[] arr,int index){

    //     if (index==arr.length-1) {  //----or jese hi index ki value arr ki len se match hogi mtlb true he kyuki "i" check karte karte last tak gya he....
    //         return true;
    //     }
    //     return arr[index] < arr[index+1] && sorted(arr, index+1); //----sorted call me index +1 karke badh rha he
    // }


    /***********************Find the target element********************** */
    // public static void main(String[] args) {
    //     int[] arr = {4,6,2,7,8,66};
    //     System.out.println(find(arr, 66, 0));

    //     System.out.println(findindexno(arr, 66, 0) +" index");
    // }

    // /*+++++++This will give ans in true or false++++++++*/
    // static boolean find(int[] arr, int target, int index){
    //     if (index==arr.length) {
    //         return false;
    //     }
    //     return arr[index]==target || find(arr, target, index+1);
    // }

    // /*++++++++This will give indexnumber where target lies+++++++*/
    // static int findindexno(int[] arr, int target, int index){
    //     if (index==arr.length) {
    //         return -1;
    //     }
    //     if (arr[index]==target) {        //-----3 return me se "1 return" value return karke dega or bo value upar int me jayegi mtlb findindexno me jayegi isliye Teeno return me se 1 bhi return hataya to error dega
    //         return index;
    //     }else{
    //         return findindexno(arr, target, index+1);
    //     }

    // }



    /***********************Find Alltarget element in repeated case********************** */
    // public static void main(String[] args) {
    //     int[] arr = {4,6,2,7,8,6};
    //     findAllindexno(arr, 6, 0);
    //     System.out.println(list);
    // }

    //1.-----------This arrlist is in outside the fun----------
    // static ArrayList<Integer> list = new ArrayList<>();   

    // static void findAllindexno(int[] arr, int target, int index){
    //     if (index==arr.length) {
    //          return;
    //     }
    //     if (arr[index]==target) {        
    //          list.add(index);
    //     }
    //     findAllindexno(arr, target, index+1);
    // }

   //2.----------------------------------------return type is ArrayList and pass empty arrlist in fun parameter
//    public static void main(String[] args) {
//         int[] arr = {4,6,2,7,8,6};
        
//         ArrayList<Integer> ans = storeInArrlist(arr, 6, 0, new ArrayList<>());  //ye bata rha he ki ek arrlist bana do
//         System.out.println(ans); 
//     }

//     //+++++++[return type arrlist] ----Here adding in same object with difference reffrence variable....... mtlb har recursion call pe diffrent reffrence ke sath list banegin or bo sari lists same object ko target karengin to jo bhi data har list me add hoga bo 1 hi object me store hoga 

//     static ArrayList<Integer> storeInArrlist(int[] arr, int target, int index, ArrayList<Integer> list){  //ye bata rhe he ki integer type ki list bana do with list variable ke sath
//             if (index==arr.length) {
//                  return list;   //---final list value return karega
//             }
//             if (arr[index]==target) {        
//                  list.add(index);
//             }
//             return storeInArrlist(arr, target, index+1, list); 
//         }


//3.----------------------------------------
//    public static void main(String[] args) {
//         int[] arr = {4,6,2,7,8,6};
        
//         ArrayList<Integer> list = new ArrayList<>(); //created sepreatly

//         System.out.println(storeInArrlist(arr, 6, 0, list));
//     }

//         //return type arrlist
//     static ArrayList<Integer> storeInArrlist(int[] arr, int target, int index, ArrayList<Integer> list){  //ye bata rhe he ki integer type ki list bana do with list variable ke sath
//             if (index==arr.length) {
//                  return list;   //---final list value return karega
//             }
//             if (arr[index]==target) {        
//                  list.add(index);
//             }
//             return storeInArrlist(arr, target, index+1, list); 
//         }

//4.----------------------------------------------
// public static void main(String[] args) {
//     int[] arr = {4,6,2,7,18,18,6};
//     System.out.println(findAllIndex4(arr, 18, 0));
// }
// static ArrayList<Integer> findAllIndex4(int[] arr, int target, int index) {

//     ArrayList<Integer> list = new ArrayList<>();
//     if (index == arr.length) {
//         return list;
//     }
//     // this will contain answer for that function call only
//     if (arr[index] == target) {
//         list.add(index);
//     }
//     ArrayList<Integer> ansFromBelowCalls = findAllIndex4(arr, target, index + 1);

//     list.addAll(ansFromBelowCalls); //-----sari liston ko list me add kar do

//     return list;    
// }





/*******************find target element in rotated sorted array with the help of
 *******************pivot as well as binary search complexity******/

// public static void main(String[] args) {
//     int[] arr = {5,6,7,8,9,1,2,3};
//     System.out.println(searchBSpivot(arr, 8, 0, arr.length-1));
// }

// static int searchBSpivot(int[] arr,int target,int s, int e){
//     if (s > e) {
//         return -1;
//     }
//     int mid = s + (e - s) / 2;

//     if (target==arr[mid]) {
//         return mid;
//     }

//     //condition 1
//     if (arr[s]<=target) {
//         if (target >=arr[s] && target <=arr[mid]) {
//             return searchBSpivot(arr, target, s, mid-1);
//         }
//         else{
//             return searchBSpivot(arr, target, mid+1, e);
//         }
//     }
    
//     //condition 2
//         if (target >=arr[mid] && target <=arr[e]) {
//             return searchBSpivot(arr, target, mid+1, e);
//         }
//         else{
//             return searchBSpivot(arr, target, s, mid-1);
//         }

//     }
}//class
