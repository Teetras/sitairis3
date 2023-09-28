package diff_equip;

public class TVModem extends Modems implements NetworkAdapter {

    private int speed;

    private String description;

    public TVModem() {
        super("TV Modem", 50);
        this.speed = 1000; // 1000 Мбит/с
        this.description = "Модем для телевизионных сигналов с высокой скоростью.";

    }

//    @Override
//    public String getName() {
//        try {
//            throw new ExecutionControl.NotImplementedException("no implementation");
//        } catch (ExecutionControl.NotImplementedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nСкорость: " + getSpeed() + " Мбит/с");
        System.out.println("Описание: " + getDescription());
    }
}
