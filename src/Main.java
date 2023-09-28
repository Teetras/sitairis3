import diff_equip.*;
import rates.InternetPack;
import rates.TVpack;
import rates.TariffPack;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_BLUE + "This text is blue!" + ANSI_RESET);

        Modems n1 = new TVModem();
        NetworkAdapter c1 = new Cable();
        TariffPack t1 = new TVpack();

        Modems m2 = new WIFIModem();
        NetworkAdapter n2 = new TVModem();
        TariffPack i2 = new InternetPack("Интеренет ком", 360.9, 43);

        System.out.print("\n 1. Просмотров оборудования;\n " +
                "2. Просмотр тарифов для подключения;\n " +
                "Любое другое число чтобы выйти.\n");

        int number = 0;

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println("Вы ввели : " + number);
        } else {
            System.out.println("Вы ввели не целое число или текст.");
        }

        if (number == 1) {
            System.out.println("\nВиды модемов :");
            m2.print();
            n1.print();
            n2.displayDetails();
            c1.displayDetails();
        }
        if (number == 2) {
            System.out.println("\nВиды тарифов :");
            t1.print();
            i2.print();
        }
        scanner.close();
    }

}