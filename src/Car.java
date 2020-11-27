


public abstract class Car {
    int yearOfManufacture;
    int price;
    int horsePower;
    Color color;
    int weight;
    int mileage;
//    static int count;    как сдлать, чтобы счётчик добавлял нумрацию к новой созданой машине? Машина1Б Машина 2 и т.д.


    public Car(int yearOfManufacture, int price, int horsePower, Color color, int weight, int mileage) {
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.horsePower = horsePower;
        this.color = color;
        this.weight = weight;
        this.mileage = mileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Машина" +
                "\nГод выпуска = " + yearOfManufacture +
                "\nЦена = " + price +
                "\nМощность = " + horsePower + "л/с" +
                "\nЦвет = " + color +
                "\nМасса = " + weight +
                "\nПробег = " + mileage;
    }
}
