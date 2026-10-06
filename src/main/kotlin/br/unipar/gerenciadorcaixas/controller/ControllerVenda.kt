package br.unipar.gerenciadorcaixas.controller

import br.unipar.gerenciadorcaixas.service.ServiceVenda
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vendas")
class ControllerVenda(
    private val service: ServiceVenda
) {
}
