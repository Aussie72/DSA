class LinkedList{
    Node head;
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public static boolean search(Node head, int x){
        Node current = head;
        while(current.next != null){
            if(current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }
    
    public static void main(String[] args){
        LinkedList llist = new LinkesList();
        int x = 70;
        llist.push(0);
        llist.push(10);
        llist.push(20);
        llist.push(30);
        
        if(search(llist.head,x)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }