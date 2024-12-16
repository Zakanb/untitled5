package untitled5;

import java.util.Scanner;

public class Main {
    public static void  main (String[] args) {
        int reset;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя");
        String name = scanner.nextLine();
        do {
            scanner = new Scanner(System.in);
            System.out.println("ведите число 1");
            int a = scanner.nextInt();
            System.out.println("ведите число  2");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(name + " сумма " + sum );
            System.out.println("Напишите 1 для рестарта или 0 для завершения.");
            reset = scanner.nextInt();
        } while (reset == 1);                           
        System.out.println("Программа завершена.");
        scanner.close(); // Закрываем Scanner
    }
  }