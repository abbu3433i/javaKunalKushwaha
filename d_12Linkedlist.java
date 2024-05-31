//============================================Linkedlist==========================================================

import java.util.LinkedList;  

public class d_12Linkedlist {
    
    // Node head;
    // private int size;  //for checking size of list

    // d_12Linkedlist(){
    //      this.size = 0;
    // }


    // class Node{ 
    //     String data;
    //     Node next;

    //     Node(String data){
    //         this.data = data;
    //         this.next = null;
    //         size++;
    //     }
    // }

    // //Add data ---first side
    // public void addFirst(String data){
    //     Node newnNode = new Node(data);
    //     if (head==null) {
    //         head = newnNode;
    //         return;
    //     }

    //     newnNode.next = head;   //newnode ke next ko head ka reffrence de do 
    //     head = newnNode;       //head ko newnode de do 
    // }

    // //Add data---Last side
    // public void addLast(String data){
    //     Node newnNode = new Node(data);
    //     if (head==null) {
    //         head = newnNode;
    //         return;
    //     }

    //     Node currNode = head;    //head ko iterate nhi kara skte to currnode ko head maan lo or usko iterate karao taki original head pe koi effect na pade

    //     while (currNode.next != null) {     //currnode ka next jese hi null aaye loop stop kar do or smj jao currnode last me pahuch gya 
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newnNode;       //loop stop hote hi currnode ke next me newnode add kar do 
    
    // }

    // //Print data
    // public void printList(){
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     Node currNode = head;
    //     while (currNode != null) {   //agar currnode.next!=null  karte to us currnode ka data sout nhi ho pata..... isliye currnode!=null aaye tabhi loop stop kro isse last currnode ka data sout ho rha he
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("Null");
    // }


    // //Delete data---first side
    // public void deleteFirst(){
    //     if (head==null) {
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     size--;
    //     head = head.next;      //head ke next ko head kar do to jo purana head he usko garbage collection le jayega bo automatically delete ho jayega
    // }


    // //Delete data---last side
    // public void deleteLast(){
    //     if (head==null) {
    //         System.out.println("list is empty");
    //         return;  
    //     }
    //     if (head.next==null) {
    //         head=null;
    //         return; 
    //     }

    //     size--;

    //     Node secondLast = head;  //starting head node ko secondlast node maan lo or lastnode ko head ka next node maan lo fir iterate kro jab tak ki lastnode ka next null nhi aa jata 
    //     Node lastNode = head.next;
    //     while (lastNode.next != null) {
    //         lastNode = lastNode.next;      //or lastnode or secondlast node ko update bhi karte chalo loop ke sath
    //         secondLast = secondLast.next;   
    //     }
    //     secondLast.next = null;
    // }

    // public int getsize(){
    //     return size;
    // }

    // public static void main(String[] args) {
    //      d_12Linkedlist list = new d_12Linkedlist();
    //      list.addFirst("a");
    //      list.addFirst("is");
    //      list.addFirst("This");
    //      list.printList();

    //      list.addLast("List");
    //      list.printList();

    //      list.deleteFirst();
    //      list.printList();

    //      list.deleteLast();
    //      list.printList();

    //      System.out.println(list.getsize());
    // }




    //==============================In the form of collection framework[import from javautil class]=================================================
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");   // -->   list.add("list")   both are same
        System.out.println(list);


        System.out.println(list.size());   //------give size of the list


        for (int i = 0; i < list.size(); i++) {       //----arr se bahar list ko print karega
            System.out.print(list.get(i)+"-->");     
        }
        System.out.println("NULL");


        list.removeFirst();          //-----list ke node ko delete kar dega
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
