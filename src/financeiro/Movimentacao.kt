package financeiro

import java.math.BigDecimal
import java.time.LocalDateTime

class Movimentacao (
    val valor: BigDecimal,
    val contaMovimentacao : LocalDateTime, //LocalDateTime pra pegar a hora tb
    val descricao: String,
    val pagador: String,
    val recebedor: String,
    val responsavel: String
)
