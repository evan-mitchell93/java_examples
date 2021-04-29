public class MyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) { 
            data = d;
            next = null;
        }
    }

    public static MyLinkedList insert(MyLinkedList list, int data){
        //create new node with the data

        Node new_node = new Node(data);
        new_node.next = null;

        //if list is empty make the new node the head
        if(list.head == null){
            list.head = new_node;
        }

        //else traverse until the end and add the new node
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        //return the list
        return list;
    }

    public static void printList(MyLinkedList list){

        //list traversal forwards
        Node currentNode = list.head;

        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args){
        MyLinkedList testList = new MyLinkedList();

        testList = insert(testList, 12);

        printList(testList);

        testList = insert(testList, 1);
        testList = insert(testList, 2);
        testList = insert(testList, 55);
        testList = insert(testList, -12);

        printList(testList);

    }
}