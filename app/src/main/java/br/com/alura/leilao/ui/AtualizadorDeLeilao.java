package br.com.alura.leilao.ui;

import android.content.Context;
import android.widget.Toast;

import java.util.List;

import br.com.alura.leilao.api.retrofit.client.LeilaoWebClient;
import br.com.alura.leilao.api.retrofit.client.RespostaListener;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.ui.recyclerview.adapter.ListaLeilaoAdapter;

public class AtualizadorDeLeilao {

    public void buscaLeiloes(final ListaLeilaoAdapter adapter,
                             LeilaoWebClient client,
                             final ErroCarregarLeilaoListener erroListener) {
        client.todos(new RespostaListener<List<Leilao>>() {
            @Override
            public void sucesso(List<Leilao> leiloes) {
                adapter.atualiza(leiloes);
            }

            @Override
            public void falha(String mensagem) {
                erroListener.erroAoCarregar(mensagem);
            }
        });
    }

    public interface ErroCarregarLeilaoListener {
        void erroAoCarregar(String mensagem);
    }
}
