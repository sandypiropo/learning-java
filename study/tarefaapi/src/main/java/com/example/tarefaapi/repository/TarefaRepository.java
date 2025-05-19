package com.example.tarefaapi.repository;

import com.example.tarefaapi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    Optional<Tarefa> findByNome(String nome);
    List<Tarefa> findByResponsavel(String responsavel);

}