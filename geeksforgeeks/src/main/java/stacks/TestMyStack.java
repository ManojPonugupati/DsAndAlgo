package stacks;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        for(int i=0;i<10;i++)
        myStack.push(10 + i);
        for(int i=0;i<3;i++){
            System.out.println("peek" + myStack.peek());
        }
        for(int i=0;i<5;i++){
            System.out.println("pop : " + myStack.pop());
        }
        System.out.println("top is  " + myStack.top());
        System.out.println("is empty ? :" + myStack.isEmpty());
        System.out.println("is full ? : " + myStack.isFull());
    }
}
