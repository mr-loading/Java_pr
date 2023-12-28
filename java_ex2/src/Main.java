import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void mySum(int[] mas){
        int mySum = 0;

        for(int i: mas){
            mySum += i;
        }
        System.out.println("For: " + mySum);
        mySum = 0;

        int count = 0;
        while (count < mas.length){
            mySum += mas[count];
            count++;
        }
        System.out.println("While: " + mySum);
        count = 0;
        mySum = 0;

        do {
            mySum += mas[count];
            count++;
        }while (count < mas.length);
        System.out.println("Do while: " + mySum);
    }

    public static void getMass(Scanner scanner){
        System.out.println("Введите элементы массива: ");
        String[] str = scanner.nextLine().split(" ");

        for(String s: str){
            System.out.println(s);
        }
    }

    public static void garm(){
        for(int i = 1; i < 11; i++){
            System.out.println("[" + i + "] " + (float)1/i);
        }
    }

    public static void randMass(){
        int[] mas = new int[5];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 10);
        }

        for (int i: mas) {
            System.out.print(i + " ");
        }

        Arrays.sort(mas);

        System.out.println();
        for(int i: mas){
            System.out.print(i + " ");
        }
    }

    public static void factorial(Scanner scanner){
        System.out.println("Введите число: ");
        int fac = 1;
        int num = scanner.nextInt();

        for (int i = 2; i < num+1; i++) {
            fac *= i;
        }

        System.out.println("Факториал = " + fac);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mas = {1, 2, 3, 4, 5};

        System.out.println("№ 1 ##########");
        mySum(mas);
        System.out.println("№ 2 ##########");
        getMass(scanner);
        System.out.println("№ 3 ##########");
        garm();
        System.out.println("№ 4 ##########");
        randMass();
        System.out.println("№ 5 ##########");
        factorial(scanner);
    }
}