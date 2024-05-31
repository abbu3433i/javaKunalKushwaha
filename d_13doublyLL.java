public class d_13doublyLL {
    
    public class Node{
        int data;
        Node next;  //instance variable 
        Node prev;

        public Node(int data){   //constructor for giving data
        this.data = data;
        this.next = null;
        this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;    //initilizing head and tail node
    public static int size;

    //addfirst node
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;  //newnode he uske next ko head se jod do
        head.prev = newNode;  //head ke prev ko newnode se jod do 
        head = newNode;       //head node ko newnode kar do update
    }
    
    //remove node
    public int removeFirst(){
        if (head==null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size==1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;   //jo value delete kar rhe use val me store kar do
        head = head.next;   //head ko head ka next kar do jisse head change ho jayega
        head.prev = null;   //fir us change head ke prev value ko null kar do...isse sab connection tut jayegen or node delete ho jayegi garbage collection le jayega usko 

        size--;
        return val;
    }

    //print 
    public void print(){
        Node temp = head;  //temp ek ek karke sari node pe iterate karega or unhe print bhi karega
        while (temp != null) { 
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    //Reverse
    public void ReverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;  //----only this line change rest all reverse code same as to single LL

            //update
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        d_13doublyLL dll = new d_13doublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();

        dll.removeFirst();
        dll.print();

        dll.ReverseDLL();
        dll.print();;

        System.out.println(dll.size);
    }
}
