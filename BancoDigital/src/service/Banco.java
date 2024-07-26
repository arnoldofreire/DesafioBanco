package service;

import model.Conta;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }

    public boolean transferir(Long contaOrigemId, Long contaDestinoId, double valor) {
        Conta contaOrigem = contas.get(contaOrigemId.intValue());
        Conta contaDestino = contas.get(contaDestinoId.intValue());
        return contaOrigem.transferir(valor, contaDestino);
    }
}
