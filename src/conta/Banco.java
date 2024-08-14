package conta;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {

        ContaController contas = new ContaController();

        ContaCorrente cc1 = new ContaCorrente(contas.newNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
        contas.create(cc1);

        ContaCorrente cc2 = new ContaCorrente(contas.newNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
        contas.create(cc2);

        ContaPoupanca cp1 = new ContaPoupanca(contas.newNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
        contas.create(cp1);

        ContaPoupanca cp2 = new ContaPoupanca(contas.newNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
        contas.create(cp2);

        contas.getAllContas();

        contas.filterConta(123);

        contas.depositar(1, 500);

        contas.transferir(2, 1, 1000);

        contas.delete(124);

        contas.sacar(1, 150);

    }
}