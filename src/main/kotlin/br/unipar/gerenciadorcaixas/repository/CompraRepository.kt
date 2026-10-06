package br.unipar.gerenciadorcaixas.repository

import br.unipar.gerenciadorcaixas.model.Compra
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompraRepository : JpaRepository<Compra, Long>
