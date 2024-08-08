import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arithmeticOperations();
        stringComparison();
        arrayOfnumbers();
    }


    /**
     * 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
     * - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
     * - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
     **/

    public static void arithmeticOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a ");
        int a = scanner.nextInt();
        System.out.println("Введите число b ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
        if (a == b) {
            System.out.println("a = b");
        }
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
    }


    /**
     * 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения
     * в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
     **/

    public static void stringComparison() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите строку а");
        String text1 = scanner1.nextLine();

        System.out.println("Введите строку b");

        String text2 = scanner1.nextLine();

        if (text1.equals(text2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");

        }

    }

    //3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо
    // написать программу, которая выведет в консоль все чётные числа.


    public static int[] arrayOfnumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : array)
            if (number % 2 == 0)
                System.out.println(number);
        return array;
    }
}
