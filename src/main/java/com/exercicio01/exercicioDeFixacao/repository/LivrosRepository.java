package com.exercicio01.exercicioDeFixacao.repository;

import com.exercicio01.exercicioDeFixacao.model.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivrosModel,Long> {
}
