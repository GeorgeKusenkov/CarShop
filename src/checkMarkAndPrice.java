import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkMarkAndPrice {
    public static void check() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            вводим наименование модели
            CarManagerTalks.buyCarName = reader.readLine();

//            использую счётчик для для выявления неверного ввода информации
//            0 - по умолчанию - неверный ввод, 1 - если хватает денег и вверно введено название, 2 - если не хватает денег
            int count = 0;

//            считываем массив, досстём марку и цену. Если марка в массиве совпадает с введенной,
//            но стоит она денег больше чем у нас с собой - ставим счётчик 2, отправляем на предупреждение о нехватке денег.
//            Так сдделано специально, чтобы показать ошибку о нехватке денег на счету.
            for (carACalss car : carACalss.carMas) {
                if (car.mark.equals(CarManagerTalks.buyCarName) && CarManagerTalks.userMoney < car.price) {
                    count = 2;
                } else

//              если наименование совпадает, то покупка совершена.
                    if (CarManagerTalks.buyCarName.equals(car.mark)) {
                        count++;
                        System.out.println("МЕНЕДЖЕР: Отлчичный выбор!");
                        break;
                    }
            }

            if (count == 2) {
                System.out.print("CИСТЕМА: Не хватает на эту модель. \nПовторите ввод: ");
                continue;
            } else

            if (count == 0) {
                System.out.print("CИСТЕМА: У нас нет такой модели, либо вы допустили ошибку. \nПовторите ввод: ");
                continue;
            }
            break;
        }
    }
}
