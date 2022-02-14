package br.com.alura.leilao.adapter

import br.com.alura.leilao.model.Leilao
import br.com.alura.leilao.ui.recyclerview.adapter.ListaLeilaoAdapter
import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.*

class AdapterTestKotlin {

    @Test

    private fun deve_AtualizarListaLeiloes_QuandoReceberListaLeiloes() {

        val adapter: ListaLeilaoAdapter = ListaLeilaoAdapter(null)

        adapter.atualiza(ArrayList<Leilao>(Arrays.asList(
                Leilao("console"),
                Leilao("computador")
        )))

        var quantidadeLeilaoDevolvido: Int = adapter.itemCount

        assertEquals(2, quantidadeLeilaoDevolvido)

    }

}