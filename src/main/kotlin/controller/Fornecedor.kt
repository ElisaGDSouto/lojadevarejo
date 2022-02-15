package controller

import model.Fornecedor

class Fornecedor {
   fun fornecedorFactory(
        cnpj: Short,
        nomeFantasia: String,
        endereco: String,
        telefoneComercial: Short,
        razaoSocial: String,

        ): Fornecedor = model.Fornecedor(
        cnpj = cnpj,
        nomeFantasia = nomeFantasia,
        endereco = endereco,
        telefoneComercial = telefoneComercial,
        razaoSocial = razaoSocial,
        )




}

