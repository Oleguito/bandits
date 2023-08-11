import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*  Он меня заставил их инициализировать, идентификаторы подсвечивались красным */
        int cntLarry = 0, cntHarry = 0;
        System.out.print("Введите количество банок, простреленных Гарри: ");
        try {
            cntHarry = s.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        System.out.print("Введите количество банок, простреленных Ларри: ");
        try {
            cntLarry = s.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        /*  Суммарное количество банок -- (cntLarry + cntHarry) - 1
            потому что одну прострелили оба */
        int totalCans = (cntLarry + cntHarry) - 1;

        System.out.println("Ларри прострелил: " + (totalCans - cntHarry) + " банок");
        System.out.println("Гарри прострелил: " + (totalCans - cntLarry) + " банок");
    }
}