package projeto_solos;

import projeto_solos.model.TeoresSolo;
import projeto_solos.model.SoloIdeal;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) {

        TeoresSolo solo = new TeoresSolo();
        SoloIdeal soloIdeal = new SoloIdeal();
        String texturaSolo;

        System.out.println("Informe a textura do solo");
        System.out.println("1 - Argiloso");
        System.out.println("2 - Textura Média");
        texturaSolo = sc.nextLine();
        soloIdeal.verificaSolo(texturaSolo);

        System.out.println("Quantidade de Fósforo no solo: ");
        solo.setFosforo(Double.parseDouble(sc.nextLine()));

        System.out.println("Quantidade de Potássio no solo: ");
        solo.setPotassio(Double.parseDouble(sc.nextLine()));

        System.out.println("Quantidade de Cálcio no solo: ");
        solo.setCalcio(Double.parseDouble(sc.nextLine()));

        System.out.println("Quantidade de Magnésio no solo: ");
        solo.setMagnesio(Double.parseDouble(sc.nextLine()));

        System.out.println("Quantidade de Enxofre no solo: ");
        solo.setEnxofre(Double.parseDouble(sc.nextLine()));

        System.out.println("Quantidade de Alumínio no solo: ");
        solo.setAluminio(Double.parseDouble(sc.nextLine()));

        System.out.println("Quantidade de H + Al no solo: ");
        solo.setHAl(Double.parseDouble(sc.nextLine())); 

        System.out.print("\n\n");
        System.out.print("SOLO INFORMADO          SOLO IDEAL\n\n");
        System.out.println("Fósforo: " + solo.getFosforo() + "         Fósforo Ideal: " + soloIdeal.fosforoIdeal(texturaSolo) + "\n");
        System.out.println("Potássio: " + solo.getPotassio() + "        Potássio Ideal: " + soloIdeal.potassioIdeal(texturaSolo) + "\n");
        System.out.println("Cálcio: " + solo.getCalcio() + "          Cálcio Ideal: " + soloIdeal.calcioIdeal(texturaSolo) + "\n");
        System.out.println("Magnésio: " + solo.getMagnesio() + "        Magnésio Ideal: " + soloIdeal.magnesioIdeal(texturaSolo) + "\n");
        System.out.println("Enxofre: " + solo.getEnxofre() + "         Enxofre Ideal: " + soloIdeal.enxofreIdeal(texturaSolo) + "\n");
        System.out.println("Alumínio: " + solo.getAluminio() + "        Alumínio Ideal: " + soloIdeal.aluminioIdeal(texturaSolo) + "\n");
        System.out.println("H + Al: " + solo.getHAl() + "          H + Al Ideal: " + soloIdeal.hAlIdeal(texturaSolo) + "\n");
    }
}