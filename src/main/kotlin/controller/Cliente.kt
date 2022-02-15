package controller

import model.Cliente

class Cliente {
    fun clienteFactory(
        nome: String,
        cpf: Short,
        idade: Byte,
        endereço: String,

    ): Cliente = model.Cliente(
        nome = nome,
        cpf = cpf,
        idade = idade,
        endereço = endereço,
    )

}