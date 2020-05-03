import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Input userInput = new Input();
        Input lastInput = new Input();

        System.out.println("Start: ");
        do {
            lastInput.setString(userInput.getString());
            userInput.setString(sc.nextLine());
        } while (!userInput.equals(lastInput));

        sc.close();
        System.out.println("Koniec");
    }
}