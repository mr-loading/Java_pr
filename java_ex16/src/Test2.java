import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ключ:");
        String key = scanner.nextLine();

        try {
            demo.printDetails(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}