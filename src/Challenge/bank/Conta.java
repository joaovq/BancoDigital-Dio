package Challenge.bank;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Conta implements Interface{
// visivel dentro da classe, mesmo pacote e subclasses
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
//    Em private, só dá acesso na classe.
//    O default( ), só dá acesso no pacote
    @Getter  protected int agencia;
    @Getter protected int numero;
    @Getter protected double saldo;
     protected Cliente cliente;

    public Conta(Cliente cliente) {
//        super é usado para refereciar objetos da classe pai, numa classe filha
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }




    @Override
    public void sacar(double quantiaDeSaque) {
            saldo-=quantiaDeSaque;
    }

    @Override
    public void transferir(double valorTransferido, Conta contaDestino) {
            this.sacar(valorTransferido);
            contaDestino.depositar(valorTransferido);
    }

    @Override
    public void depositar(double valor) {
            saldo+=valor;
    }

    protected void imprimir() {
        System.out.println(String.format("Cliente: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Número da Conta %d",this.numero));
        System.out.println(String.format("R$ %.2f", this.saldo));
    }
}
