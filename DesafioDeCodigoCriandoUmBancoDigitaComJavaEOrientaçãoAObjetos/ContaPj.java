public class ContaPj extends Conta {

    public ContaPj(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta PJ: ");
        super.imprimirInfosComunsDasContas();
    }

}