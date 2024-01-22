public void insertNode(Node prev_node, int new_data){
    if (prev_node == null)
        return;
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
    
}