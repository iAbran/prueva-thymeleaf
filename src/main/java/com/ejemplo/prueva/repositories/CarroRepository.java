package com.ejemplo.prueva.repositories;

import com.ejemplo.prueva.model.Carros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carros, Long> {
//
//    @Override
//    Optional<Carros> findById(Long id);
}
