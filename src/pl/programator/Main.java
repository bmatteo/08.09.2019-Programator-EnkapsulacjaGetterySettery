package pl.programator;

public class Main {
    public static void main(String[] args) {
        Square tenJedenJedenMojKonkretnyKwadrat = new Square(5);

        System.out.println(tenJedenJedenMojKonkretnyKwadrat.getA());
        System.out.println(tenJedenJedenMojKonkretnyKwadrat.getField());
        System.out.println(tenJedenJedenMojKonkretnyKwadrat.getObw());

        tenJedenJedenMojKonkretnyKwadrat.setA(7);

        System.out.println(tenJedenJedenMojKonkretnyKwadrat.getA());
        System.out.println(tenJedenJedenMojKonkretnyKwadrat.getField());
        System.out.println(tenJedenJedenMojKonkretnyKwadrat.getObw());
    }
}
