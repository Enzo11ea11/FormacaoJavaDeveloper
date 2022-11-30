public interface InterfaceConta {
    void sacar(double valorDoSaque);

    void depositar(double valorDeDeposito);

    void transferir(double valorDaTransferencia, Conta contaDestino);

    void imprimirExtrato();
}
