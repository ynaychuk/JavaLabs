
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Drugs empty = new Drugs();
        Drugs Alba = new Drugs("Alba", "Hormones",
                "OmniFarma", new Date(2018, 6, 26),208 );
        Drugs Pharingosept = new Drugs("Pharingosept", "Throttle",
                "S.C. Terapia S.A.", new Date(2020, 7, 8), 15);

        System.out.println(empty.toString());
        System.out.println(Alba.toString());
        System.out.println(Pharingosept.toString());

        Pharingosept.printSum();
        Drugs.printStaticSum();

        empty.resetValues("Loratadine ", "Dermatitis", "Parmak",
                new Date(2019,11,2), 27);

        System.out.println(empty.toString());

        empty.printSum();
        Drugs.printStaticSum();
    }
}