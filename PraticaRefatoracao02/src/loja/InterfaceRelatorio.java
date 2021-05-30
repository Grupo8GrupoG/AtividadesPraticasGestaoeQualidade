
package loja;

import java.util.ArrayList;


public interface InterfaceRelatorio {
    public double somatorioPrecos(ArrayList<Produto> produtos);
    public double aplicaDesconto();
    public void taxaEntrega();
}
