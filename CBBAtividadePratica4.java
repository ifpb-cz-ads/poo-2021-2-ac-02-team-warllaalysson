import java.math.BigDecimal;
import java.util.Scanner;

import models.OrcamentoPiscina;

class CBBAtividadePratica4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a cubagem da piscina:");

    BigDecimal cubagem = scanner.nextBigDecimal();

    BigDecimal valorTotal = OrcamentoPiscina.calculaValorTotal(cubagem);

    System.out.println("Valor total da piscina é " + valorTotal);

    scanner.close();
  }
}