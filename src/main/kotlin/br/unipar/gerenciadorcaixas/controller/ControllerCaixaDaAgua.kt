package br.unipar.gerenciadorcaixas.controller

import br.unipar.gerenciadorcaixas.service.ServiceCaixaDaAgua
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/caixas-dagua")
class ControllerCaixaDaAgua(
    private val service: ServiceCaixaDaAgua
) {
}
