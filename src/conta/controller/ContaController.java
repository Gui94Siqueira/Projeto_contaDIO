package conta.controller;

import java.util.ArrayList;
import conta.model.Conta;

public class ContaController implements BaseController {

     private ArrayList<Conta> listaContas = new ArrayList<Conta>();
            int numero = 0;

     @Override
     public void getByNumero(int numero) {
          var conta = filterConta(numero);
               
          if(conta != null) {
               conta.visualizar();
          } else {
               System.out.println("Conta de numero: " + numero + "inesistente");
          }
     }

     @Override
     public void getAllContas() {
          for(Conta conta : listaContas) {
               conta.visualizar();
          }

     }

     @Override
     public void create(Conta conta) {
          listaContas.add(conta);
          System.out.println("A conta de numero: " + conta.getNumero() + "foi criada com sucesso");
     }
     
     @Override
     public void update(Conta conta) {
          Conta findConta = filterConta(conta.getNumero());

          if(findConta != null) {
               listaContas.set(listaContas.indexOf(findConta), conta);
               System.out.println("Conta numero: " + conta.getNumero() + "foi atualizada com sucesso");
          } else {
               System.out.println("Conta numero: " + conta.getNumero() + "não foi encontrada");
          }
               
     }

     @Override
     public void delete(int numero) {
          Conta findConta = filterConta(numero);

          if(findConta != null) {
               if(listaContas.remove(findConta)) {
                    System.out.println("Conta numero: " + numero + "Excluida co sucesso");
               }else
                    System.out.println("conta numero: " + numero + "não encontrada");
          }
     }

     @Override
     public void sacar(int numero, float valor) {
          Conta conta = filterConta(numero);

          if(conta != null) {
               if(conta.sacar(valor) == true) {
                    System.out.println("o saque na conta de numero: " + numero + "foi efetudo com sucesso");
               } else {
                    System.out.println("A conta de numero: " + numero + "não foi encontrada");
               }
          }
     }

     @Override
     public void depositar(int numero, float valor) {
          Conta conta = filterConta(numero);

          if(conta != null) {
               conta.depositar(valor);
               System.out.println("Odeposito na conta de numero: " + numero + "foi efetuado com sucesso!");
          } else
               System.out.println("conta de numero: " + numero + "nõ encontrada ou não é uma conta corrente");
     }

     @Override
     public void transferir(int numeroOrigem, int numeroDestino, float valor) {
          Conta contaOrigem = filterConta(numeroOrigem);
          Conta contaDestino = filterConta(numeroDestino);

          if(contaOrigem != null && contaDestino != null) {
               if(contaOrigem.sacar(valor) == true) {
                    contaDestino.depositar(valor);
                    System.out.println("A transferencia foi efetuada com sucesso");
               }
          } else
               System.out.println("A conta de origem ou destino não encontrada");
     }

     public int newNumero() {
          return numero++;
     }

     public Conta filterConta(int numero) {
          for(Conta conta : listaContas) {
               if(conta.getNumero() == numero) {
                    return conta;
               }
          }

          return null;
     }

     
}
