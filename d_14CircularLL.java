public class d_14CircularLL {
    // Implementing Insertion, Deletion and Printing in Circular Linked List

    static class Node {
        int data;
        Node next;
    }

    /**
     * Adds a node with the given data to an empty circular linked list.
     * If the list is not empty, it returns the existing last node.
     */
    static Node addToEmpty(Node last, int data) {
        if (last != null) {
            return last;
        }
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last; // Point to itself to form a circular structure

        return last;
    }

    /**
     * Adds a node with the given data to the front of the circular linked list.
     * If the list is empty, it calls addToEmpty to add the node.
     */
    static Node addFront(Node last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next; // New node points to the first node
        last.next = newNode; // Last node points to the new node, making it the first node

        return last;
    }

    /**
     * Adds a node with the given data to the end of the circular linked list.
     * If the list is empty, it calls addToEmpty to add the node.
     */
    static Node addEnd(Node last, int data) {
        if (last == null) {
            return addToEmpty(last, data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next; // New node points to the first node
        last.next = newNode; // Last node points to the new node
        last = newNode; // New node becomes the last node
        return last;
    }

    /**
     * Adds a node with the given data after the node with the specified item.
     * If the item is not found, it prints a message and returns the unchanged list.
     */
    static Node addAfter(Node last, int data, int item) {
        if (last == null) {
            return null;
        }

        Node newNode, p;
        p = last.next; // Start from the first node
        do {
            if (p.data == item) {
                newNode = new Node();
                newNode.data = data;
                newNode.next = p.next; // New node points to the next node of p
                p.next = newNode; // Node p points to the new node
                if (p == last) {
                    last = newNode; // If p was the last node, new node becomes the last node
                }
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " is not present in the list");
        return last;
    }

    /**
     * Deletes the node with the given key from the circular linked list.
     * If the list becomes empty after deletion, it returns null.
     */
    static Node deleteNode(Node last, int key) {
        if (last == null) {
            return null;
        }
        if (last.data == key && last.next == last) { // Only one node in the list
            return null;
        }

        Node temp = last;
        if (last.data == key) { // If the node to be deleted is the last node
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next; // Point the next of the previous node to the first node
            last = temp.next; // Update last to the new first node
            return last;
        }

        while (temp.next != last && temp.next.data != key) { // Traverse the list
            temp = temp.next;
        }

        if (temp.next.data == key) {
            temp.next = temp.next.next; // Remove the node from the list
        }

        return last;
    }

    /**
     * Traverses and prints the circular linked list.
     * If the list is empty, it prints a message.
     */
    static void traverse(Node last) {
        Node p;
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        p = last.next; // Start from the first node
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println(); // New line after printing the list
    }

    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(last, 6); // Create list with one node
        last = addEnd(last, 8); // Add node to the end
        last = addFront(last, 2); // Add node to the front
        last = addAfter(last, 10, 2); // Add node after a given node
        traverse(last); // Print the list
        last = deleteNode(last, 8); // Delete a node
        traverse(last); // Print the list again
    }
}
