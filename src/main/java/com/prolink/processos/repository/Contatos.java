package com.prolink.processos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prolink.processos.model.Contato;

@Repository
public interface Contatos extends JpaRepository<Contato, Long>{
}