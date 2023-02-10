package Lab4.LAB_10.Zadanie3;

import java.util.LinkedList;

public class Stos<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
