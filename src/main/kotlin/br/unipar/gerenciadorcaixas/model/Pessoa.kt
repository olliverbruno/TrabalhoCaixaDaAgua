package br.unipar.gerenciadorcaixas.model

import java.math.BigDecimal

//classe mae - cliente e instalador herdam daqui, por isso é open (sem open ninguem herda)
abstract class Pessoa {
    abstract val nome: String
    abstract val cpf: String
    abstract val idade: Int

    open fun receberConta(dinheiro: BigDecimal): BigDecimal {
        return dinheiro //aqui é o polimorfismo - instalador sobrescreve isso embaixo
    }
}
