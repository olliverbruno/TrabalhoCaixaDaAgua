package br.unipar.gerenciadorcaixas.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
data class Movimentacao(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    val valor: BigDecimal = BigDecimal.ZERO,
    @Column(name = "data_movimentacao")
    val contaMovimentacao: LocalDateTime = LocalDateTime.now(), //LocalDateTime pra pegar a hora tb
    val descricao: String = "",
    val pagador: String = "",
    val recebedor: String = "",
    val responsavel: String = ""
)
