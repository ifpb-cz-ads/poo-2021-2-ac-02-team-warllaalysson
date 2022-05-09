package models;

import java.math.BigDecimal;

public class OrcamentoPiscina {

  public static final BigDecimal PrecoMetroCubico = new BigDecimal(100);

  public static BigDecimal calculaValorTotal(BigDecimal cubagem){

    return cubagem.multiply(PrecoMetroCubico);
  }
}
