package untitled5;
import java.util.Scanner;
public class sdsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите возраст до 100 лет");
        int old = scanner.nextInt();
        if (old < 30){
            System.out.println("вы достаточно молоды " + old );
        }else{
            System.out.println("у вас достаточно большой возвраст " + old );
        }
        System.out.println("Введите имя:");
        String name = scanner.next();
        int a;
        int reset;
        do {
            System.out.println("ходите перезагружать програму 1 да 0 нет");
            reset = scanner.nextInt();
            System.out.println("ведите число 1 для складывания ");
            a = scanner.nextInt();
            System.out.println("ведите число 2 для складывания ");
            int b = scanner.nextInt();
            int sum = a + b;
            if (sum > 100000){
                System.out.println("вау вы любите большие цифры " + sum);
            }else{
                System.out.println(sum + " сума чисел ");
            }
            System.out.println(a + " ваше первое число " + b + " ваше второе число " + "ваш возраст " + old);
        } while (reset == 1);
        scanner.close();
    }
}
