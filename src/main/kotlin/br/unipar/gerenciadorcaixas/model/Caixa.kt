package br.unipar.gerenciadorcaixas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
data class Caixa(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    val saldo: BigDecimal = BigDecimal.ZERO
)

fun receita(valor: BigDecimal): BigDecimal {
    return valor
}

fun despesa(valor: BigDecimal): BigDecimal {
    return valor.multiply("-1".toBigDecimal())
}
