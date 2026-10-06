package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.FornecedorRepository
import org.springframework.stereotype.Service

@Service
class ServiceFornecedor(
    private val repository: FornecedorRepository
) {
}
