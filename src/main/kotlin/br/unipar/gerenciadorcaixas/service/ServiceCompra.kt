package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.CompraRepository
import org.springframework.stereotype.Service

@Service
class ServiceCompra(
    private val repository: CompraRepository
) {
}
