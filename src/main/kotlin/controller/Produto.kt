package controller

import model.Produto

class Produto {
    fun produtoFactory(
        cor: String,
        embalagem: String,
        tamanho: String,
        precoDoProduto: String,

        ): Produto = model.Produto(
        cor = cor,
        embalagem = embalagem,
        tamanho = tamanho,
        precoDoProduto = precoDoProduto,
    )
}