package diff_equip;

public abstract class Modems extends Equipmant {
    private String modemType;
    private int cost;

    public Modems(String modemType, int cost) {
        this.modemType = modemType;
        this.cost=cost;
    }
    @Override
    public void print() {
        System.out.print("\n Вид модема: "+modemType );
        System.out.print("\n    Стоимость: "+ cost+"$");

        super.print();
    }
}
