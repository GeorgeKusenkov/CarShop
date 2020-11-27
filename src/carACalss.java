import java.util.ArrayList;
import java.util.HashMap;

public class carACalss extends Car {
    String mark;

    public carACalss(String mark, int yearOfManufacture, int price, int horsePower, Color color, int weight, int mileage) {
        super(yearOfManufacture, price, horsePower, color, weight, mileage);
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "=================\n" +
                "Машина А класса" +
                "\nМарка: " + mark +
                "\nГод выпуска: " + yearOfManufacture +
                "\nЦена: " + price +
                "\nМощность: " + horsePower + " л/с" +
                "\nЦвет: " + color +
                "\nМасса: " + weight +
                "\nПробег: " + mileage +
                "\n=================\n";
    }

    //ВОПРОС: почему должны быть статиками? Как правильно реализовать метод распечатки?
    public static carACalss[] carMas = {
     new carACalss("FIAT 500", 2020, 6500, 70,Color.ЧЕРНЫЙ, 1200, 0),
     new carACalss("Daewoo-Matiz",2019, 5000, 85, Color.КРАСНЫЙ, 1400, 0),
     new carACalss("Kia Picanto",2017, 4700, 67, Color.БЕЛЫЙ, 1150, 0),
     new carACalss("Chevrolet Spark",2015, 4500, 68, Color.ЧЕРНЫЙ, 1100, 0),
     new carACalss("Ravon R2",2016, 5200, 85, Color.ЖЕЛТЫЙ, 1300, 0),
     new carACalss("Zotye E200 EV",2015, 2400, 41, Color.БЕЛЫЙ, 1100, 6000)
    };

    public static void AClassPrint() {
        for (Car car : carMas) {
            System.out.println(car);
        }
    }
}
