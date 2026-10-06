package br.unipar.gerenciadorcaixas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDate

//compra de caixas d'agua de um fornecedor - aumenta o estoque
@Entity
data class Compra(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    val fornecedorCpf: String = "",
    val caixaDaAguaId: Long = 0,
    val quantidade: Int = 0,
    val preco: BigDecimal = BigDecimal.ZERO,
    val dataCompra: LocalDate = LocalDate.now()
)
