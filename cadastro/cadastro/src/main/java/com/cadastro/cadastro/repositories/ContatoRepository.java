package com.cadastro.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.cadastro.domain.Contato;


@Repository
public interface ContatoRepository extends JpaRepository <Contato, Long> {

}
