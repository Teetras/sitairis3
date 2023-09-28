package diff_equip;

import interfacee.Telecommunications;

public abstract class Equipmant  implements Telecommunications {
    String provider="Beltelecom";

    @Override
    public void print() {
        System.out.print("\n    Провайдер: "+provider);
    }
}
