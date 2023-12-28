import java.util.Scanner;
public class ExceptionDemo { //тест1
    public void exceptionDemo() {
        try{
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите челое число ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Вы не можете разделить на 0!");
        } catch (NumberFormatException e) {
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Это не целое число!");
        } finally {
            System.out.println("Это последний блок, он выполняется всегда, независимо от того, случаются исключения или нет.");
        }
    }
}