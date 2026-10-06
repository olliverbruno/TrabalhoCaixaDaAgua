package br.unipar.gerenciadorcaixas.model

import br.unipar.gerenciadorcaixas.model.enums.TipoServico
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.math.BigDecimal
import java.time.LocalDate

//liga 1 cliente com 1 funcionario - nao tem relação N:N em lugar nenhum do projeto
@Entity
data class Servico(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    @ManyToOne
    val funcionario: Funcionario? = null,
    @ManyToOne
    val cliente: Cliente? = null,
    val preco: BigDecimal = BigDecimal.ZERO,
    val dataInstalacao: LocalDate = LocalDate.now(),
    @Enumerated(EnumType.STRING)
    val tipo: TipoServico = TipoServico.MONTAGEM //venda, manutenção ou montagem
)
