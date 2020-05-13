import java.util.Scanner;

public class EnteringNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wpisz dowolną liczbę dodatnią i wciśnij enter:");
        Number[] numbers = new Number[10];
        for (int i = 0; i < numbers.length; i++) {
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("Liczba ta NIE powinna być dodana do listry");
                sc.close();
            }
        }
    }
}



