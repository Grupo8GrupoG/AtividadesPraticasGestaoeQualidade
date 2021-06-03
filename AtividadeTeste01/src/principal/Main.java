package principal;

import equacao.Equacao;
import java.util.Locale;

public class Main {
	

	public static void main(String[] args) {
      Equacao equacao;
      
      equacao = new Equacao(0, 0, 0);
      System.out.println(equacao.calculo());
      
      equacao = new Equacao(0, 0, 8);
      System.out.println(equacao.calculo());
      
      equacao = new Equacao(0, 2, -8);
      System.out.println(equacao.calculo());
      
      equacao = new Equacao(10, -4, 12);
      System.out.println(equacao.calculo());
      
      equacao = new Equacao(4, -4, 1);
      System.out.println(equacao.calculo());
      
      equacao = new Equacao(1, 6, 7);
      System.out.println(equacao.calculo());

	}

}
