
class Length{
    Node head;
    
    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    public int length(){
        int count = 0;
        Node current = head;
        while(current != null){
            ++count;
            current = current.next;
        }
    
        return count;
    }
    
    public static void main(String[] args){
        Length head = new Length();
        head.push(16);
        head.push(16);
        head.push(16);
        head.push(16);
        head.push(16);
        head.push(16);
        System.out.println(head.length());
        
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