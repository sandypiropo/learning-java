package com.example.tarefaapi.controller;


import com.example.tarefaapi.model.Tarefa;
import com.example.tarefaapi.repository.TarefaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    private final TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefa(@PathVariable Long id) {
        return tarefaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa novaTarefa) {
        return tarefaRepository.findById(id)
                .map(tarefa -> {
                    tarefa.setNome(novaTarefa.getNome());
                    tarefa.setDataEntrega(novaTarefa.getDataEntrega());
                    tarefa.setResponsavel(novaTarefa.getResponsavel());
                    tarefaRepository.save(tarefa);
                    return ResponseEntity.ok(tarefa);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        return tarefaRepository.findById(id)
                .map(tarefa -> {
                    tarefaRepository.delete(tarefa);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().<Void>build());
    }

    @DeleteMapping("/nome/{nome}")
    public ResponseEntity<Void> deletarPorNome(@PathVariable String nome) {
        Optional<Tarefa> tarefaOptional = tarefaRepository.findByNome(nome);

        if (tarefaOptional.isPresent()) {
            tarefaRepository.delete(tarefaOptional.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/responsavel/{responsavel}")
    public ResponseEntity<Void> deletarPorResponsavel(@PathVariable String responsavel) {
        List<Tarefa> tarefas = tarefaRepository.findByResponsavel(responsavel);
        if (tarefas.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        tarefaRepository.deleteAll(tarefas);
        return ResponseEntity.noContent().build();
    }

}
