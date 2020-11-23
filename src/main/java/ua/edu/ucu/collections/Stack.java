package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList list;
    public Stack(){
        list = new ImmutableLinkedList();
    }
    public Object peek(){
        return list.getFirst();
    }
    public Object pop(){
        Object first = list.getFirst();
        list = list.removeFirst();
        return first;
    }
    public void push(Object e){
        list = list.addFirst(e);
    }
}
