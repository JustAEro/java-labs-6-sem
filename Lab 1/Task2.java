import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целочисленное значение угла: ");
        int angle = in.nextInt();

        //Первый способ (%)
        int result1 = (360 + angle%360) % 360;
        System.out.println("Результат 1 способа (%): " + result1);

        //Второй способ (floorMod())
        int result2 = Math.floorMod(angle,360);
        System.out.println("Результат 2 способа (floorMod()): " + result2);
    }
}
