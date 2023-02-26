import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целочисленное значение: ");
        int value = in.nextInt();
        System.out.println("Двоичная форма: " + Integer.toBinaryString(value));
        System.out.printf("Восьмеричная форма: %o\n", value);
        System.out.printf("Шестнадцатеричная форма: %X\n", value);
        System.out.printf("Обратное значение: %A\n", 1.0/value);
    }
}
