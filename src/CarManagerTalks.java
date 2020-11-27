import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CarManagerTalks {
    public static int userMoney;
    public static String buyCarName;
    public static String userName = "Посетитель";

    // ПРИВЕТСТВИЕ

    public static void getAllInfo() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("МЕНЕДЖЕР: Добро пожаловать в магазин машин \"ТАЧКИ\"!");
        System.out.println("МЕНЕДЖЕР: Здесь вы можете выбрать авто на любой вкус. Как к вам обращаться?");
        System.out.print("\nВведите ваше имя: ");

        //  Проверка условий на 1. Пустую строку 2. Условия по минимальному количеству символов 3. Наличие цифр в имени
        while (true) {
            // Вводим имя посетителя
            userName = reader.readLine();

            // Проверяем пустая ли строка
            if (userName.isEmpty()) {
                System.out.println("ПРЕДУПРЕЖДЕНИЕ: Вы ничего не ввели, пожалуйста введите коректное имя.");
                System.out.print("\nВведите ваше имя: ");

                // Проверяем наличие пробелов
            } else if (userName.matches("[\\ ]+")) {
                System.out.println("ПРЕДУПРЕЖДЕНИЕ: Вы ввели пробелы. Давайте ещё разок.");
                System.out.print("\nВведите ваше имя: ");

            }
            // Проверяем наличие цифр в имени
            else if (!userName.matches("[\\p{L}| ]+")) {  //надо бы понять что это значит
                System.out.println("ПРЕДУПРЕЖДЕНИЕ: В имени не должны содержаться цифры. Пожалуйста, введите корректное имя.");
                System.out.print("\nВведите ваше имя: ");

            } else break;
        }

        System.out.println("\nМЕНЕДЖЕР: Очень приятно, " + userName + ".");
        System.out.println("МЕНЕДЖЕР: Скажите, а сколько у вас с собой денег?");
        System.out.print("\nВведите количество денег на счету: ");

//           создаем список с ценами для поиска минимальной
        ArrayList<Integer> list = new ArrayList<>();
        for (carACalss cars : carACalss.carMas) {
            list.add(cars.price);
        }

        while (true) {
            try {
                // Вводим колчество денег на счету
                userMoney = Integer.parseInt(reader.readLine());
                if (userMoney < 0) {
                    System.out.println("ПРЕДУПРЕЖДЕНИЕ: Сумма не может быть отрицательной. Повторите попытку");
                    System.out.print("\nВведите количество денег на счету: ");
                } else if (userMoney < Collections.min(list)) {
                    System.out.println("МЕНЕДЖЕР: " + userName + ", извините, но вам не хватит денег даже на самую дешевую машину.");
                    System.out.println("МЕНЕДЖЕР: Минимальная стоимость составляет " + Collections.min(list));
                    System.out.print("МЕНЕДЖЕР: Введите сумму ещё раз: ");

                    // если то, что мы ввели - цифры и больше 0, то ок
                } else if (Integer.toString(userMoney).matches("\\d+") && userMoney > 0) {
                    break;

                    // Отрицательная ли сумма?
                }

            } catch (NumberFormatException e) {
                System.out.println("ПРЕДУПРЕЖДЕНИЕ: Вы ввели некорректные данные");
                System.out.print("\nВведите количество денег на счету: ");
            }

        }

        System.out.println("\nМЕНЕДЖЕР: " + userName + ", мы специализируемся на машинах А-класса. Готовы взглянуть?\n");
        promptEnterKey.prompt();

    }

    //  реализуем метод покупки машины
    public static void buyTheCar() throws IOException {
        System.out.println("\nМЕНЕДЖЕР: У вас на счету " + userMoney + ". Какую машину вы желаете приобрести?");
        System.out.print("Введите наименование машины: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Считываем наименование модели. Если счётчик больше 0, то такое наименование существует. Выходим из цикла.
        // Не приумал как ещё реализовать. Это костыли? )

        HashMap<String, Integer> carMarkAndPrice = new HashMap<>();
        for (carACalss cars : carACalss.carMas) {
            carMarkAndPrice.put(cars.mark, cars.price);
        }

        checkMarkAndPrice.check();

        System.out.println("МЕНЕДЖЕР: " + userName + ", поздравляю с приобретением " + buyCarName + "!");
    }

}
