package stacks;

public class MyStack implements StackIntrfc {
    int maxSize;
    int[] stackArr;
    int top;
    public MyStack(int size){
        this.maxSize=size;
        this.stackArr = new int[size];
        top=-1;
    }
    @Override
    public void push(int element) {
        top++;
        stackArr[top] = element;
    }

    @Override
    public int pop() {
        int old_top=top;
        top--;
        return stackArr[old_top];
    }

    @Override
    public boolean isEmpty() {
        return (top==-1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize-1);
    }

    @Override
    public int peek() {
        return stackArr[top];
    }

    @Override
    public int top() {
        return top;
    }
}
