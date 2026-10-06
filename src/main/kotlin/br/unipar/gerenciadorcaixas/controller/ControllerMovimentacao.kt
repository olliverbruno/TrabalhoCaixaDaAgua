package br.unipar.gerenciadorcaixas.controller

import br.unipar.gerenciadorcaixas.service.ServiceMovimentacao
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movimentacoes")
class ControllerMovimentacao(
    private val service: ServiceMovimentacao
) {
}
