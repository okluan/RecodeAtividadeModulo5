package com.agenciagotour.minhaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenciagotour.minhaapi.entities.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository <Viagem, Long> {

}
