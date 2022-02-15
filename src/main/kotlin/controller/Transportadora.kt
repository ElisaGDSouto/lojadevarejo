package controller

import model.Transportadora

class Transportadora {
    fun transportadoraFactory(
        cnpj: Short,
        telefoneComercial: Short,
        valorDoFrete: String,

        ): Transportadora = model.Transportadora(
        cnpj = cnpj,
        telefoneComercial = telefoneComercial,
        valorDoFrete = valorDoFrete,
    )


}


