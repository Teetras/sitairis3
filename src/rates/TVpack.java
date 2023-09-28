package rates;

import diff_equip.NetworkAdapter;

public class TVpack implements TariffPack, NetworkAdapter {
    private String channels;
    private double basePrice;

    public TVpack(String channels, double basePrice) {
        this.channels = channels;
        this.basePrice = basePrice;
    }

    public TVpack() {
        this.channels = "Ромашка";
        this.basePrice = 30.56;
    }
    public double getPrice() {
        return basePrice;
    }
    public String getName() {
        return channels;
    }

    @Override
    public void print() {
        System.out.println("\nТВ-пакет от провайдера: " + getName());
        System.out.println("Скорость: " + getSpeed() + " Мбит/с");
        System.out.println("Стоимость в месяц: $" + getPrice());

    }
        @Override
    public int getSpeed() {
        return 240;
    }




    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void displayDetails() {

    }


}
