public class Main {
    public static void main(String[] args) {
        Cliente Enzo = new Cliente();
        Enzo.setNomeDoCliente("Enzo");
        Conta ContaCorrente = new ContaCorrente(Enzo);
        Conta ContaPoupanca = new ContaPoupanca(Enzo);
        Conta ContaPj = new ContaPj(Enzo);

        ContaCorrente.emprestimoBancario(100);

        ContaCorrente.depositar(100);

        ContaPj.imprimirExtrato();
        ContaCorrente.imprimirExtrato();
        ContaPoupanca.imprimirExtrato();

        ContaCorrente.transferir(100, ContaPoupanca);

        ContaPj.imprimirExtrato();
        ContaCorrente.imprimirExtrato();
        ContaPoupanca.imprimirExtrato();
    }
}