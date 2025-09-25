package com.advocacia.advocacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advocacia.advocacia.entity.Advogado;

public interface AdvogadoRepository extends JpaRepository<Advogado, Integer> {
    
}
