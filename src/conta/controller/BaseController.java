package conta.controller;

import conta.model.Conta;

public interface BaseController {

    public void getByNumero(int numero);
    public void getAllContas();
    public void create(Conta conta);
    public void update(Conta conta);
    public void delete(int numero);

    public void sacar(int numero, float valor);
    public void depositar(int numero, float valor);
    public void transferir(int numeroOrigem, int numeroDestino, float valor);
    
}