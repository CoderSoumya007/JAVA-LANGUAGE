class LL {

    
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    
    Node head;
    int size=0;
    // Node tail;

    public void addFirst(int value) {
        Node newNode = new Node(value); 
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        //newNode.value = value;
        head = newNode;
        size++;
    }


    public void addanywhere(int location,int element){
        if(location>size+1){
            return;
        }

        if(location==(size+1)){
            addlast(element);
            return;
        }
        
        if(location==0){
        addFirst(element);
        return;
        }

        Node curr=null;
        Node newnode=new Node(element);
        //Node temp=head;
        for(int i=0;i<size;i++){
            
            if(i==location-1){
                newnode.next=curr.next;
                curr.next=newnode;
            // temp=curr.next;
            // curr.next=newnode;
            // newnode.value=element;
            // newnode.next=temp;
            size++;
            }
            if(curr==null){curr=head;}
            else{
                curr=curr.next;
            }
        }
    }

    public void addlast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
       
        Node currNode=head; 
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        //newNode.value=value;
        size++;
    }

    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.value);
            currNode=currNode.next;
        }
        //System.out.println("Null");

    }
    
    public boolean ispresent(int element){
if(head==null){
    return false;
}
Node curr=head;
while(curr!=null){
    if(curr.value==element){
        return true;
    }
    curr=curr.next;
}return false;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(2);
        list.addFirst(1);
        list.addlast(3);
        list.addanywhere(4, 5);
        list.printList();
       System.out.println( list.ispresent(5));
        // System.out.println(list.head.value);
        System.out.println(list.size);

    }
}
