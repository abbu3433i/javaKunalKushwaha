//===================================Reverse linkedlist======================================================
//----------for better understanding first read diagram which is drawn in copy notes

import org.w3c.dom.Node;

public class d_12LL_1 {

    // Node head;

    // class Node{ 
    //     String data;
    //     Node next;

    //     Node(String data){
    //         this.data = data;
    //         this.next = null;
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

    //     Node currNode = head;   

    //     while (currNode.next != null) {     
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newnNode;       
    
    // }

    // //Print data
    // public void printList(){
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     Node currNode = head;
    //     while (currNode != null) {    
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("Null");
    // }




    // //#######ReverseList---------------------[with the help of iterative technique]----------------------------

    // public void ReverseList(){
    //     if (head==null || head.next==null) {
    //         return;
    //     }
    //     Node prevNode = head;      // jo hamara st node[head] he usko hum prevnode le lengen
    //     Node currNode = head.next;      //or head ke next ko currNode le lengen

    //     while (currNode != null) {         //jab tak currnode null nhi aa jata tab tak iterate karte rho
    //         Node nextNode = currNode.next;
    //         currNode.next = prevNode;

    //         //updata
    //         prevNode = currNode;     //prevnode=currnode kar do... or currnode=nextnode kar do to hamari newnode add ho jayegi
    //         currNode = nextNode;
    //     }

    //     head.next = null;   //aage jo connection ban rha tha ki [head.next=currnode] ko target kar rha tha...usko todh do null kar do
    //     head = prevNode;   //iterate karte karte last me currNode [null] pe pahuch jayega to usse phele bale prevNode ko head bana do 
    // }





    // //######ReverseLise -----------------------[recursive way]----------------------------------------

    // public Node ReversRecursive(Node head){       //-------return type node he to node hi return hoga
    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     //Head.next karengen tabhi har value pe head iterate hoge or stack me store karega 

    //   Node newHead = ReversRecursive(head.next);  //---phele sari head values stack me assign ho jayegin phir har ek head value ke liye niche bale do operation perform honge reverse karane ke liye
    //   head.next.next = head;    // 1----
    //   head.next = null;         //-2-operations

    //   return newHead;  
    // }


    // public static void main(String[] args) {
    //     d_12LL_1 ct = new d_12LL_1();
    //     ct.addFirst("a");
    //     ct.addFirst("is");
    //     ct.addFirst("This");
    //     ct.addLast("list");
    //     ct.printList();

    //     // ct.ReverseList();
    //     // ct.printList();
 
    //    ct.head = ct.ReversRecursive(ct.head);   //sari recursive reverse value ct.head me jayegin fir printfn. sari values ko print kardega....... agar recursive fn ki value=ct.head nhi ki to original singlehead node print kar dega
    //     ct.printList();
    // }






    //Q. ====================To find nth node from linkedlist and delete that node==========================================

    Node head;

    class Node{ 
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Add data ---first side
    public void addFirst(int data){
        Node newnNode = new Node(data);
        if (head==null) {
            head = newnNode;
            return;
        }

        newnNode.next = head;   //newnode ke next ko head ka reffrence de do 
        head = newnNode;       //head ko newnode de do 
    }

    //Add data---Last side
    public void addLast(int data){
        Node newnNode = new Node(data);
        if (head==null) {
            head = newnNode;
            return;
        }

        Node currNode = head;   

        while (currNode.next != null) {     
            currNode = currNode.next;
        }
        currNode.next = newnNode;       
    
    }

    //Print data
    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {    
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }



    public Node FindnthNode(Node head,int n){
        if (head.next==null) {
            return null;
        }

        //size
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        //agar n ki value size ke equal ho to 
        if (n==size) {
            return head.next;
        }

        //find nth term prev node
        int indexToSearch = size-n;
        Node prev =  head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        Node nthNode = prev.next;   //jo prev he uske next ka data jo target kar rha hoga aage bali node ko bo store ho jayega nthNode me
        prev.next = prev.next.next;  //this will break the connection and join another connection to next ke next ka connection bana degi
        return nthNode;
    }

    public static void main(String[] args) {
        d_12LL_1 list = new d_12LL_1();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        list.printList();


        Node nthNode = list.FindnthNode(list.head, 2);  //ye nth node return kar rha he
        if (nthNode != null) {
            System.out.println("Nth node data: " + nthNode.data);  //nth ka data return kar rha he
        } else {
            System.out.println("Nth node not found.");
        }
        list.printList();
    }
}
