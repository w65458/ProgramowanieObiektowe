package Lab4.LAB_10.Zadanie2;

public class Main {

    public static void main(String[] args) {
        CommandQueue commandQueue = new CommandQueue();
        for (Command command : commandQueue.getQueue()) {
            command.operation();
        }
    }
}
