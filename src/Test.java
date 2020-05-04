import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = null;
        String lastInput;

        System.out.println("Start: ");
        do {
            lastInput = userInput;
            userInput = sc.nextLine();
        } while (!userInput.equals(lastInput));

        sc.close();
        System.out.println("Koniec");
    }
}