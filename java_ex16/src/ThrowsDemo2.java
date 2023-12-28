import java.util.Scanner;

public class ThrowsDemo2 { //тест3
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        while(key.equals("")) {
            System.out.println("Введите ключ:");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Обнаружено исключение в методе printDetails..");
                key = "";  // Reset key to give the user another attempt
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Ключ установлен на пустую строку");
        }
        return "Данные для " + key;
    }
}