package rates;

public class InternetPack implements TariffPack {
    private String providerName;
    private double speed;
    private double monthlyCost;

    public InternetPack(String providerName, double speed, double monthlyCost) {
        this.providerName = providerName;
        this.speed = speed;
        this.monthlyCost = monthlyCost;
    }

    @Override
    public void print() {
        System.out.println("\nИнтернет-пакет от провайдера: " + providerName);
        System.out.println("Скорость: " + speed + " Мбит/с");
        System.out.print("Стоимость тарифа в месяц: "+monthlyCost+"$");
    }


}
