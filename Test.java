import java.util.Scanner;

public class Test {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Gebe die erste Zahl ein: ");
    int x = scanner.nextInt();
    System.out.println("Wähle einen Operator aus: ");
    String operator = scanner.next();
    System.out.println("Gebe eine zweite Zahl ein: ");
    int y = scanner.nextInt();

    System.out.println("Dein Ergebnis ist: ");

    switch(operator){
        case "+":
            System.out.println(x + y);
            break;
        case "-":
            System.out.println(x - y);
            break;
        case "/":
            System.out.println(x / y);
            break;
        case "*":
            System.out.println(x * y);
            break;
        default:
            System.out.println("Ungültige Angaben");
        }
    scanner.close();
    }
}
