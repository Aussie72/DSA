class Stack{
    static final int Max =1000;
    int top;
    int[] a = new int[Max];
    
    boolean isEmpty(){
        return (top<0);
    }
    
    Stack(){
        int top = -1;
    }
    
    boolean push(int x){
        if (top >= Max-1){
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }
    
    int pop(){
        if (top < 0){
            return 0;
        } else {
            int x = top--;
            return x;
        }
    }
    
    int peek(){
        if(top<0){
            return -1;
        } else {
            return a[top];
        }
        
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(" "+a[i]);
        }
    }
}
class Main{
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.print();
    }
}