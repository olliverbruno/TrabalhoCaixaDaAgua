package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.MovimentacaoRepository
import org.springframework.stereotype.Service

@Service
class ServiceMovimentacao(
    private val repository: MovimentacaoRepository
) {
}
