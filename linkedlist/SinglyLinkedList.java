package linkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createSinglyLinkedList(int value){
        Node node=new Node(value);
        if(head==null){
            head=tail=node;
            return ;
        }
       tail.next=node;
       tail=node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
            }
            System.out.println();
            }
            //Add a new node at the beginning of the Linked List

    }

