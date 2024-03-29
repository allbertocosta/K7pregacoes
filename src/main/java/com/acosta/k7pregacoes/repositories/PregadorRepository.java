package com.acosta.k7pregacoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acosta.k7pregacoes.domain.Pregador;

@Repository
public interface PregadorRepository extends JpaRepository<Pregador, Integer> {

}
