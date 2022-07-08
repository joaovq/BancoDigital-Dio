package Challenge.bank;

public class ContaCorrente extends Conta{
//Implementação de um singleton
    private static ContaCorrente conta =  new ContaCorrente();
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente() {
        super();
    }

    public static ContaCorrente getConta(){
        return conta;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=====Extrato Conta da Corrente======");
        super.imprimir();
    }


}
