import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 целое число: ");
        int a = in.nextInt();

        System.out.print("Введите 2 целое число: ");
        int b = in.nextInt();

        System.out.print("Введите 3 целое число: ");
        int c = in.nextInt();

        //1 способ (условие)
        int max1 = a;
        if (b > max1) {
            max1 = b;
        }
        if (c > max1){
            max1 = c;
        }
        System.out.println("Результат 1 способа: " + max1);

        //2 способ (Math.max())
        int max2 = Math.max(a,Math.max(b,c));
        System.out.println("Результат 2 способа: " + max2);
    }
}
