
/*
       Program od korisnika traži unos nasumično odabranih cijelih brojeva. Unosom broja -1 program završava
       i ispisuje sljedeće značajke: sumu svih brojeva, broj brojeva koje je korisnik unio, broj parnih i broj
       neparnih brojeva. Također, program ispisuje prosjek zbroja svih unešenih brojeva, zaokružen na 2 decimale.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi cijele brojeve ili za prekid unesi -1: ");

        int suma = 0;
        int brojac = 0;
        int brojacParnih = 0;
        int brojacNeparnih = 0;

        DecimalFormat f = new DecimalFormat("##.00");
        while (true){
            int brojevi = Integer.valueOf(scanner.nextLine());
            if (brojevi == -1){
                break;
            } else {
                suma += brojevi;
                brojac += 1;
                if(brojevi % 2 == 0){
                    brojacParnih += 1;
                } else {
                    brojacNeparnih += 1;
                }
            }
        }
        System.out.println("Hvala, pozdrav!");
        System.out.println("Suma unešenih brojeva: " + suma);
        System.out.println("Broj unešenih brojeva: " + brojac);
        System.out.println("Prosjek unešenih brojeva (zaokružen na dvije decimale): " + (f.format((double)suma/brojac)));
        System.out.println("Broj neparnih brojeva: " + brojacNeparnih);
        System.out.println("Broj parnih brojeva: " + brojacParnih);
    }
}
