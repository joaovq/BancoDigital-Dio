package Challenge.bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor @Getter @Setter
public class Banco {
    //Classe Banco feita para armazenar as contas de um determinado banco, através de uma lista.
    public String nome;
    public List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

//      TODO: Aplicação de cadastro de contas por Banco ja existente
//      TODO: Não adicionar se o banco ja existe na memória.
//
    public void imprimirBancosEContas() {
        System.out.println("");
        System.out.println("====Banco de dados de Bancos (Na memória)====");
        imprimirContas();


    }

    private void imprimirContas() {
        for (Conta lista:contas) {
            System.out.println("");
            System.out.println("Banco: "+this.getNome());
            System.out.println("Tipo: "+ lista.getClass().getSimpleName());
            lista.imprimir();
//            Outra opção de impressão
            /*System.out.println("Agencia "+ lista.getAgencia());
            System.out.println("Cliente: "+ lista.cliente.getNome());
            System.out.println("Número da Conta: "+ lista.getNumero());
            System.out.println("Total na conta: "+ lista.getSaldo());*/
        }
    }
}
