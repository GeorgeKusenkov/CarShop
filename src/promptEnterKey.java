import java.util.Scanner;

public class promptEnterKey {
    //        реализуем паузу, чтобы можно было прочитать текст
    public static void prompt(){
        System.out.println("Нажмите \"ENTER\" чтобы продолжить...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
