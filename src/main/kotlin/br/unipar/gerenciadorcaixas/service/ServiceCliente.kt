package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.ClienteRepository
import org.springframework.stereotype.Service

@Service
class ServiceCliente(
    private val repository: ClienteRepository
) {
}
