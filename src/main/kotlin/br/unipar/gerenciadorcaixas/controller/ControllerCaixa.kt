package br.unipar.gerenciadorcaixas.controller

import br.unipar.gerenciadorcaixas.service.ServiceCaixa
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/caixa")
class ControllerCaixa(
    private val service: ServiceCaixa
) {
}
