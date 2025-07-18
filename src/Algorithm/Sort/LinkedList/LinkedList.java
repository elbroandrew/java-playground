package Algorithm.Sort.LinkedList;



public class LinkedList {

    Node head;
    public LinkedList(){

    }

    public void add(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }
        Node curentNode = head;
        while (curentNode.next != null){
            curentNode = curentNode.next;
        }
        curentNode.next = newNode;
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.value + " -> ");
            current = current.next;
        }

    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
}
