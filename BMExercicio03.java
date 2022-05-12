public class BMExercicio03 {
    public static void main(String[] args) {
        // a
        // utilizamos double para termos mais precisão visto ser algo relacionado a
        // negócios
        double valorItem1 = 2.95;
        double valorItem2 = 3.50;

        // b
        System.out.println("O Item 1 custa " + valorItem1 + " e o Item 2 custa " + valorItem2 + ".");

        // c
        double custoTotal = valorItem1 + valorItem2;

        System.out.println("O custo total dos itens foi: " + custoTotal + ".");

        // d
        final double TAXA = 0.0825;
        double taxaCalculada = custoTotal * TAXA;

        System.out.println("A taxa calculada foi: " + taxaCalculada + ".");

        // e
        valorItem1 += taxaCalculada;
        valorItem2 += taxaCalculada;
        double novoCusto = valorItem1 + valorItem2;

        // f
        boolean muitoCaro;
        muitoCaro = novoCusto > 10;

        System.out.println("Muito caro: " + muitoCaro + ".");
    }
}
