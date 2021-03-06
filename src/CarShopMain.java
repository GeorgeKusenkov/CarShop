import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Программа "Магазин машин". Версия 0.1

О программе
Программа описывает взаимодействие посетителя магазина и менеджера. Клиент указывает количество денег на счету для дальнейшей покупки автомобиля.
Менеджер показывает какие машины есть в наличии и предлагает их для покупки. Взаимодействие завершается в случае, когда клиент покупает машину.

Что реализовано
1. Проверки на правильность ввода полей
- Корректно ли введено имя посетителя
- Корректно ли введена сумма посетителя
- Хватит ли денег на самую дешевую машину
2. Диалог с менеджером
3. Предоставление списка автомобилей

Что планируется
1. Грамотное распределение кода по классам.
2. Реализация проверки на переполнение суммы.
3. Добавление новой категории автомобилей (класс B, C, D)
4. Переписать метод для взятия массива машин А класса на универсальный.
5. Добавить дополнительную информацию при условии когда не хватает денег. Указать стоимость машины, которую пытаемся купить, указать
количество на данный момент, указать сколько ещё не хватает.
6. Добавить функцию похода в банк в случае если не хватает денег. Идём в банк, снимаем денег, добавляем к нашей сумме.
7. Реализовать в графическом интерфейсе.
8. Реализовать как приложение для android.
9. Принцип инкапусляции нарушен?
"Если поле экземпляра открыто для изменения напрямую присваиванием через точку, то на
такое нарушение инкапсуляции должны быть веские основания. Для доступа к данным обычно
используются методы, определенные в классе этого объекта: геттеры и сеттеры."

Интересный пример - надо разобраться с геттерами и сеттерамию
        public class Cat {
            private String name;
            private int age;
            public void setAge(int age) {
                if (age >= 0) {
                    this.age = age;
                } else {
                    System.out.println("Введен некорректный возраст");
                }
            }
            public int getAge() {
                return age;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }
10. В условиях попробовать использовать RETURN чтобы выходить из метода, т.к. появляются дополнительные условия, которые выполняются.
11. ПОхоже проверки надо делать в самом классе. ????
12. Дбавить внятное описание
 */


public class CarShopMain {

    public static void main (String[] args) throws IOException {

       CarManagerTalks.getAllInfo();

       carACalss.AClassPrint();

       CarManagerTalks.buyTheCar();

    }

}
