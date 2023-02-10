package Lab4.LAB_10.Zadanie3;

public class Main {

    public static void main(String[] args) {
        Stos<String> stos = new Stos<>();
        String text = "+B+a+l---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        String[] split = text.split("");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("+")) {
                stos.push(split[i + 1]);
            } else if (split[i].equals("-")) {
                System.out.println(stos.pop());
            }
        }
    }
}
