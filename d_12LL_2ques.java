//To check linkedList is palindrom or not

public class d_12LL_2ques {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add data ---first side
    public void addFirst(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        newnNode.next = head;
        head = newnNode;
    }

    // Add data---Last side
    public void addLast(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnNode;
    }

    // Print data
    public void printList() {
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

    //Q.========================To check linkedList is palindrom or not============================================================

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);   //reverse kar dega mtlb last pointer pe head chala jayega
        middle.next = null; // Split the list into two halves

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {  //firstHalf ka head or SecondHalf ka head jo last me chala gya reverse karne pe.....ab ye dono head compare hote hote closer aate jaayegen jese hi value not equal to dikhi false return kar dega
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // Reverse function
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;   // prev as a new head of linkedlist after reverse
    }

    // Find middle node
    public Node findMiddle(Node head) {
        Node hare = head;   //hare move two steps towards
        Node turtle = head;  //turtle move one steps towards
        
        while (hare != null && hare.next != null) {
            hare = hare.next.next;  //do kadam
            turtle = turtle.next;   //ek kadam
        }
        return turtle;
    }

    public static void main(String[] args) {
        d_12LL_2ques list = new d_12LL_2ques();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(2);
        list.addLast(1);
        list.printList();

        if (list.isPalindrome()) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }
    }
}




//Q. for interview=================To detect in linkedlist cycle is formed or not==========================

// public boolean hasCycle(Node head){
//     if (head==null) {
//         return false;
//     }
//     Node hare = head;  //fast
//     Node turtle = head;  //slow

//     while (hare !=null && hare.next != null) {
//         hare = hare.next.next;
//         turtle = turtle.next;

//         if (hare==turtle) {
//             return true;
//         }
//     }

//     return false;

// }
