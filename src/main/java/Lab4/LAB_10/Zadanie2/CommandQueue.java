package Lab4.LAB_10.Zadanie2;

import java.util.ArrayDeque;
import java.util.Queue;

public class CommandQueue {

    private final Queue<Command> queue;

    public CommandQueue() {
        this.queue = new ArrayDeque<>();
    }

    public Queue<Command> getQueue() {
        queue.add(new Command("Polecenie 1"));
        queue.add(new Command("Polecenie 2"));
        queue.add(new Command("Polecenie 3"));
        return queue;
    }
}
