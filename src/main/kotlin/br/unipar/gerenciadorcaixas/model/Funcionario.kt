package br.unipar.gerenciadorcaixas.model

import br.unipar.gerenciadorcaixas.model.enums.Setor
import br.unipar.gerenciadorcaixas.model.enums.Turno
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
data class Funcionario(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    override val nome: String = "",
    override val cpf: String = "",
    override val idade: Int = 0,
    val salario: BigDecimal = BigDecimal.ZERO,
    @Enumerated(EnumType.STRING)
    val turno: Turno = Turno.MATUTINO,
    @Enumerated(EnumType.STRING)
    val setor: Setor = Setor.INSTALACAO
) : Pessoa() {
    override fun receberConta(dinheiro: BigDecimal): BigDecimal {
        return -dinheiro //cliente paga empresa = entra dinheiro (+), empresa paga funcionario = sai (-)
    }
}
