package br.unipar.gerenciadorcaixas.service

import br.unipar.gerenciadorcaixas.repository.FuncionarioRepository
import org.springframework.stereotype.Service

@Service
class ServiceFuncionario(
    private val repository: FuncionarioRepository
) {
}
