package view

fun main() {
    val clienteController = controller.Cliente()
    val cliente = clienteController.clienteFactory(
        nome = "Paulo",
        cpf = 86243578020.toShort(),
        idade = 30,
        endereço = "Assis Brasil - n°1845",
    )
    println(cliente)

    val fornecedorController = controller.Fornecedor()
    val fornecedor = fornecedorController.fornecedorFactory(
        cnpj = 123456789.toShort(),
        nomeFantasia = "Paulo Atacado",
        endereco = "Av. do Forte - nº584",
        telefoneComercial = 51987524625.toShort(),
        razaoSocial = "Paulo Albuquerque ME",
    )
    println(fornecedor)

    val produtoController = controller.Produto()
    val produto = produtoController.produtoFactory(
        cor = "Verde",
        embalagem = "Papelão",
        tamanho = "Médio",
        precoDoProduto = "15 reais",
    )
    println(produto)

    val transportadoraController = controller.Transportadora()
    val transportadora = transportadoraController.transportadoraFactory(
        cnpj = 987654321.toShort(),
        telefoneComercial = 5198524568.toShort(),
        valorDoFrete = "100 reais",
    )
    println(transportadora)

    val vendedorController = controller.Vendedor()
    val vendedor = vendedorController.vendedorFactory(
        nome = "José",
        cpf = 54815874585.toShort(),
        endereco = "Av. Protásio Alves - nº7256",
        telefone = 519786215.toShort(),
    )
    println(vendedor)











}