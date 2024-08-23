import java.util.Scanner;

public class BevarageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to extras with your tea (YES/NO)");
        boolean teaExtras = scanner.nextLine().trim().equalsIgnoreCase("YES");


        System.out.println("Do you want to extras with your Coffee (YES/NO)");
        boolean coffeeExtras = scanner.nextLine().trim().equalsIgnoreCase("YES");

        Bevarage tea = new Tea();
        tea.setWantsExtras(teaExtras);
        Bevarage coffee = new Coffee();
        coffee.setWantsExtras(teaExtras);

        System.out.println("Making Tea");
        tea.TemplateMethod();
        System.out.println("                                ");
        System.out.println("Making Coffee");
        coffee.TemplateMethod();

        scanner.close();

    }
}