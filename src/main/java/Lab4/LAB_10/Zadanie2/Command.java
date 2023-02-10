package Lab4.LAB_10.Zadanie2;

public class Command {

    private final String command;

    public Command(String command) {
        this.command = command;
    }

    public void operation() {
        System.out.println(command);
    }

}
