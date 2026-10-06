package br.unipar.gerenciadorcaixas.controller

import br.unipar.gerenciadorcaixas.service.ServiceFornecedor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fornecedores")
class ControllerFornecedor(
    private val service: ServiceFornecedor
) {
}
