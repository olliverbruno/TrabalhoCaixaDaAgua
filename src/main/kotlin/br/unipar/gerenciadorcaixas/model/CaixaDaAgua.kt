package br.unipar.gerenciadorcaixas.model

import br.unipar.gerenciadorcaixas.model.enums.Cor
import br.unipar.gerenciadorcaixas.model.enums.Material
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes
import java.math.BigDecimal

@Entity
data class CaixaDaAgua(
    /**
     * Marca, Modelo, Dimensão(altura, largura, profundidade), Cor, Material, Formato, Preço, Quantidade
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    val marca: String = "",
    val modelo: String = "",
    @JdbcTypeCode(SqlTypes.ARRAY)
    val dimensao: MutableList<Double> = mutableListOf(),
    @Enumerated(EnumType.STRING)
    val cor: Cor = Cor.AZUL_FORTE,
    @Enumerated(EnumType.STRING)
    val material: Material = Material.POLIETILENO,
    val formato: String = "",
    val preco: BigDecimal = BigDecimal.ZERO,
    val quantidade: Int = 1 //estoque
)
