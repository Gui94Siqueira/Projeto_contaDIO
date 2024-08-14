package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

    public static Scanner leia = new Scanner(System.in);
    
   public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    ContaController contas = new ContaController();

    ContaCorrente cc1 = new ContaCorrente(contas.newNumero(), 123 , 1, "João da Silva", 1000f, 100.0f);
		contas.create(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.newNumero(), 124 , 1, "Maria da Silva", 2000f, 100.0f);
		contas.create(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.newNumero(), 125 , 2, "Mariana dos Santos", 4000f, 12);
		contas.create(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.newNumero(), 125 , 2, "Juliana Ramos", 8000f, 15);
		contas.create(cp2);
		
		contas.getAllContas();

        int opcao , numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

        while (true) {
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Listar todas as Contas");
            System.out.println("3 - Buscar Conta por Numero");
            System.out.println("4 - Atualizar Dados da Conta");
            System.out.println("5 - Apagar Conta");
            System.out.println("6 - Sacar");
            System.out.println("7 - Depositar");
            System.out.println("8 - Transferir valores entre Contas");
            System.out.println("9 - Sair");
            System.out.println("Selecione a opção desejada");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }

   }

    public static void keyPress() {
        try {
            System.out.println("Pressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }
    
}
