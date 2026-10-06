package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.CaixaDaAguaRepository
import org.springframework.stereotype.Service

@Service
class ServiceCaixaDaAgua(
    private val repository: CaixaDaAguaRepository
) {
}
