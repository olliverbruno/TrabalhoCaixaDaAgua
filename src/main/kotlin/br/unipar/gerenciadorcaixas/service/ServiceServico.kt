package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.ServicoRepository
import org.springframework.stereotype.Service

@Service
class ServiceServico(
    private val repository: ServicoRepository
) {
}
