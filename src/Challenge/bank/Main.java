package Challenge.bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Ciração de clientes
       Cliente cliente = new Cliente("João Vítor");
       Cliente cliente1 = new Cliente("Rebeca");


//       Funcionamento de um singleton (Design Patterns)
        /*ContaCorrente clienteC = ContaCorrente.getConta();
        System.out.println(clienteC);
        clienteC = ContaCorrente.getConta();
        System.out.println(clienteC);
        Conta cliente2 = ContaCorrente.getConta();
        System.out.println(cliente2);
        ContaCorrente cliente5 = ContaCorrente.getConta();
        System.out.println(cliente5);
        System.out.println(cliente5.getNumero());
*/
//       Operações da Conta
                Conta cc = new ContaCorrente(cliente);
        Conta cc1 = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.depositar(500d);
        cc.transferir(200d, poupanca);
        cc.transferir(400d,cc1);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc1.imprimirExtrato();

//        Criar uma lista que recebe as contas
        List<Conta> contasBanco =new  ArrayList<>(){{
            add(cc1);
            add(new ContaCorrente(new Cliente("Gabriel")));
            add(poupanca);
        }};

//        Imprimir os Bancos  de Dados (Em memória)
        Banco banco1= new Banco("Nome do Banco", contasBanco);
        banco1.imprimirBancosEContas();

    }

}
