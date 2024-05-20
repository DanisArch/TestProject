package ChislaFibonachi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет числовой последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число последовательности");
        int a = scanner.nextInt();
        System.out.println("Введите второе число последовательности");
        int b = scanner.nextInt();
        System.out.println("Введите количество чисел в последовательности");
        int c = scanner.nextInt();
        System.out.println(" Ваш ответ :");
        chislaFibonachi1.fibonachi(c,a,b);

    }


}
