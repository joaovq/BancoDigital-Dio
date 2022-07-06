package Challenge.bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor @Getter @Setter
public class Banco {
    public String nome;
    public List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }


    public void imprimirContas() {
        System.out.println("");
        System.out.println("====Banco de dados de Bancos (Na memória)====");
        for (Conta lista:contas) {
            System.out.println("");
            System.out.println("Banco: "+this.getNome());
            System.out.println("Tipo: "+ lista.getClass().getSimpleName());
            /*System.out.println("Agencia "+ lista.getAgencia());
            System.out.println("Cliente: "+ lista.cliente.getNome());
            System.out.println("Número da Conta: "+ lista.getNumero());
            System.out.println("Total na conta: "+ lista.getSaldo());*/
            lista.imprimir();
        }


    }
}
