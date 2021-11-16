package stacks;

public interface StackIntrfc {
     void push(int element);
     int pop();
     boolean isEmpty();
     boolean isFull();
     int peek();
     int top();
}
