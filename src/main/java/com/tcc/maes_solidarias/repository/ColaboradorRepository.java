package com.tcc.maes_solidarias.repository;

import com.tcc.maes_solidarias.entity.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("colaboradorRepository")
public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {

}

