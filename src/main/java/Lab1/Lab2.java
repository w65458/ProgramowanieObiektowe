package Lab1;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Lab2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        squareEquation();

        calculateFunctions();

        sortNumbers(2.4, 3.1, 1.5);

        weatherForecast();

        carBuyer();

        calculator();
    }

    static void squareEquation() {
        System.out.println("Równanie kwadratowe");
        System.out.println("-------------------");
        System.out.println("Podaj współczynnik a: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj współczynnik b:");
        double b = scanner.nextDouble();
        System.out.println("Podaj współczynnik c:");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta))/(2 * a);
            double x2 = (-b + Math.sqrt(delta))/(2 * a);
            System.out.println("Równanie ma dwa rozwiązania:");
            System.out.println("x1 = " + x1 + " v " + "x2 = " + x2);
        } else if (delta == 0) {
            double x = -b/2 * a;
            System.out.println("Równanie ma jedno rozwiązanie:");
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("Brak rozwiązań!");
        }
    }

    static void calculateFunctions() {
        System.out.println("\nFunkcje a(x), b(x), c(x)");
        System.out.println("-------------------");
        System.out.println("Podaj współczynnik x: ");
        double x = scanner.nextDouble();
        double aFunction = calculateAFunction(x);
        double bFunction = calculateBFunction(x);
        double cFunction = calculateCFunction(x);
        System.out.println("a(" + x + ") = " + aFunction);
        System.out.println("b(" + x + ") = " + bFunction);
        System.out.println("c(" + x + ") = " + cFunction);
    }

    static double calculateAFunction(double x) {
        if (x > 0)
            return 2 * x;
        else if (x == 0)
            return 0;
        return -3 * x;
    }

    static double calculateBFunction(double x) {
        if (x >= 1)
            return Math.pow(x, 2);
        return x;
    }

    static double calculateCFunction(double x) {
        if (x > 2)
            return 2 + x;
        else if (x == 2)
            return 8;
        return x - 4;
    }

    static void sortNumbers(double x, double y, double z) {
        System.out.println("\nPosortowane liczby:");
        DoubleStream.of(x,y,z)
                .sorted()
                .forEach(val -> System.out.print(val + "\t"));
        System.out.println();
    }

    static void weatherForecast() {
        System.out.println("\nCzy pada deszcz? Podaj [true/false]:");
        boolean isRaining = scanner.nextBoolean();
        System.out.println("Czy autobus jest na przystanku? Podaj [true/false]:");
        boolean isBusAvailable =  scanner.nextBoolean();

        if (isRaining && isBusAvailable) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        } else if (isRaining && !isBusAvailable) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else if (!isRaining && isBusAvailable) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    static void carBuyer() {
        System.out.println("\nCzy posiadasz zniżkę na samochód? Podaj [true/false]:");
        boolean isCarDiscounted = scanner.nextBoolean();
        System.out.println("Czy otrzymałeś podwyżkę? Podaj [true/false]:");
        boolean isSalaryIncreased =  scanner.nextBoolean();
        scanner.nextLine();

        if (isCarDiscounted || isSalaryIncreased) {
            System.out.println("Możesz kupić samochód!");
        } else if (!isCarDiscounted || !isSalaryIncreased) {
            System.out.println("Zakup samochodu trzeba odłożyc na później...");
            System.out.println("Zniżki na samochód nie ma");
        } else if (!isCarDiscounted || isSalaryIncreased) {
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochód nie ma");
        }
    }

    static void calculator() {
        System.out.println("\nKalkulator");
        System.out.println("-------------------");
        while (true) {
            System.out.println("Podaj operator działania jakie chcesz wykonać [+, -, *, /, %]: ");
            String operator = scanner.nextLine();
            boolean operatorValid = false;
            do {
                if (operator.matches("[\\+\\-\\*\\/\\%]")) {
                    operatorValid = true;
                } else {
                    System.out.println("Nieprawidłowy operator!");
                    operator = scanner.nextLine();
                }
            } while (!operatorValid);

            System.out.println("Podaj dwie liczby: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Wynik: ");
            switch (operator) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "*" -> System.out.println(a * b);
                case "/" -> System.out.println(a / b);
                default -> System.out.println(a % b);
            }
            scanner.nextLine();
        }
    }
}