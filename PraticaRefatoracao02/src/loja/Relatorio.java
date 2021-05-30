package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Relatorio implements InterfaceRelatorio {

    double total = 0.0;
    ArrayList<Produto> produtos;

    @Override
    public double somatorioPrecos(ArrayList<Produto> produtos) {
        
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    @Override
    public double aplicaDesconto() {
        boolean clienteVIP = false;

        if (clienteVIP) {
            total *= 0.90;
        } else {
            total *= 0.95;
        }
        return total;
    }

    @Override
    public void taxaEntrega() {
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            total += 10.00;
        } else {
            total += 5.00;
        }
    }

    public void exibeTotal() {
        System.out.println(total);

    }

}
