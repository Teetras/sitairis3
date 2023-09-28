package diff_equip;

public class Cable implements NetworkAdapter {
    private String name;
    private int speed;
    private double price;
    private String description;
    public Cable() {
        this.name = "Кабель";
        this.speed = 100;
        this.price = 10;
        this.description = "Сетевой кабель для подключения устройств к интернету.";
    }

    public String getName() {
        return name;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public void displayDetails() {
        System.out.println("Название: " + getName());
        System.out.println("Скорость: " + getSpeed() + " Мбит/с");
        System.out.println("Цена: $" + getPrice());
        System.out.println("Описание: " + getDescription());
    }
}
