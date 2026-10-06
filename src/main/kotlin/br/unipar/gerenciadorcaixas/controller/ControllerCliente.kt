package br.unipar.gerenciadorcaixas.controller

import br.unipar.gerenciadorcaixas.service.ServiceCliente
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clientes")
class ControllerCliente(
    private val service: ServiceCliente
) {
}
