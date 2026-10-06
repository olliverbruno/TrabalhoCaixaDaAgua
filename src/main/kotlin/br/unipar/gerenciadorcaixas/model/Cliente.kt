package br.unipar.gerenciadorcaixas.model

import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
data class Cliente(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    override val nome: String = "",
    override val cpf: String = "",
    override val idade: Int = 0,
    val dividasAbertas: Boolean = false,
    @ElementCollection
    val parcelasAPagar: MutableList<BigDecimal> = mutableListOf()
) : Pessoa()
