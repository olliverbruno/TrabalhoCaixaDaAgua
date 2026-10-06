package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.VendaRepository
import org.springframework.stereotype.Service

@Service
class ServiceVenda(
    private val repository: VendaRepository
) {
}
