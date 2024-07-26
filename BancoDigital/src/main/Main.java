package main;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import service.Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(500);
        contaPoupanca.depositar(1000);

        contaCorrente.sacar(300);
        contaPoupanca.sacar(100);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        banco.listarContas();
    }
}
