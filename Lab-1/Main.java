package ua.lviv.iot;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Drugs empty = new Drugs();
        Drugs harryPotter = new Drugs("Alba", "Hormones",
                "OmniFarma", new Date(2018, 6, 26),208 );
        Drugs inception = new Drugs("Pharingosept", "Throttle",
                "S.C. Terapia S.A.", new Date(2020, 7, 8), 15);

        System.out.println(empty.toString());
        System.out.println(harryPotter.toString());
        System.out.println(inception.toString());

        inception.printSum();
        Drugs.printStaticSum();

        empty.resetValues("Loratadine ", "Dermatitis", "Parmak",
                new Date(2019,11,2), 27);

        System.out.println(empty.toString());

        empty.printSum();
        Drugs.printStaticSum();
    }
}