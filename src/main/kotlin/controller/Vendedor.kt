package controller

import model.Vendedor

class Vendedor {
    fun vendedorFactory(
        nome: String,
        cpf: Short,
        endereco: String,
        telefone: Short,

        ): Vendedor = model.Vendedor(
        nome = nome,
        cpf = cpf,
        endereco = endereco,
        telefone = telefone,
    )
}







