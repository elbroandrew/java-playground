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

    public void sort(){
        //insertion sort will help
        Node currentNode = head;  //не currentNode = head.next ; sortedHead = head; т.к. это объекты, и в, случае [10(A), 5, 10(B), 3]
        Node sortedHead = null;   // у меня получилось бы [3, 5, 10(B), 10(A)] - т.е. если есть два объекта с разными значениями, второй не будет проверяться


        while (currentNode != null){
            Node nextNode = currentNode.next;
            if (sortedHead == null || currentNode.value < sortedHead.value) { // вставка в начало
                currentNode.next = sortedHead;
                sortedHead = currentNode;
            }else{
                Node sortedCurrentNode = sortedHead;
                Node prevSortedNode = null;
                //двигаемся по сортированной части
                while (sortedCurrentNode != null && sortedCurrentNode.value < currentNode.value){
                    prevSortedNode = sortedCurrentNode;
                    sortedCurrentNode = sortedCurrentNode.next;
                }
                //вставка между prev и currentNode
                prevSortedNode.next = currentNode;
                currentNode.next = sortedCurrentNode;

            }

            currentNode = nextNode;

        }
        head = sortedHead;
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
