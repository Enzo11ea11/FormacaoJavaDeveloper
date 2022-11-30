public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    protected int agenciaDaConta;
    protected int numeroDaConta;
    protected double saldoDaConta;
    protected double valorEmprestimoDaConta;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agenciaDaConta = AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL;
        this.cliente = cliente;
        SEQUENCIAL++;
    }

    @Override
    public void sacar(double valorDoSaque) {
        saldoDaConta = saldoDaConta - valorDoSaque;
    }

    @Override
    public void depositar(double valorDeDeposito) {
        saldoDaConta = saldoDaConta + valorDeDeposito;

    }

    @Override
    public void transferir(double valorDaTransferencia, Conta contaDestino) {
        this.sacar(valorDaTransferencia);
        contaDestino.depositar(valorDaTransferencia);
    }

    public void emprestimoBancario(double valorEmprestimo) {
        this.depositar(valorEmprestimo);
        valorEmprestimoDaConta += valorEmprestimo;
    }

    public int getAgenciaDaConta() {
        return agenciaDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldoConta() {
        return saldoDaConta;
    }

    protected void imprimirInfosComunsDasContas() {
        System.out.println("Cliente: " + cliente.getNomeDoCliente());
        System.out.println("Agencia: " + agenciaDaConta);
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldoDaConta);
        System.out.println("Valor que se deve de emprestimos: " + valorEmprestimoDaConta);
    }

}