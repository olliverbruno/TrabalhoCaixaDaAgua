package br.unipar.gerenciadorcaixas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDate

//venda de uma caixa d'agua pra um cliente - diminui o estoque
@Entity
data class Venda(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    val clienteCpf: String = "",
    val caixaDaAguaId: Long = 0,
    val quantidade: Int = 0,
    val preco: BigDecimal = BigDecimal.ZERO,
    val dataVenda: LocalDate = LocalDate.now()
)
