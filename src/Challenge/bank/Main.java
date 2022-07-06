package Challenge.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente("João Vítor");
       Cliente cliente1 = new Cliente("Rebeca");

        Conta cc = new ContaCorrente(cliente);
        Conta cc1 = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.depositar(500d);
        cc.transferir(200d, poupanca);
        cc.transferir(400d,cc1);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc1.imprimirExtrato();

        List<Conta> contasBanco =new  ArrayList<>(){{
            add(cc1);
            add(new ContaCorrente(new Cliente("Gabriel")));
            add(poupanca);
        }};

        Banco banco1= new Banco("Nome do Banco", contasBanco);
        banco1.imprimirContas();
    }

}
