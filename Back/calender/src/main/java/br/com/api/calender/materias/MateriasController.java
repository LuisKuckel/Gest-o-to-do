package br.com.api.calender.materias;

import br.com.api.calender.atividade.Atividades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materias")
public class MateriasController {
    @Autowired
    private IMaterias dao;

    @GetMapping
    public List<Materias> listaMaterias () {
        return (List<Materias>) dao.findAll();
    }
    @PostMapping
    public Materias criarMaterias (@RequestBody Materias materias) {
        Materias materiasNovo = dao.save(materias);
        return materiasNovo;
    }
    @PutMapping
    public Materias editarMaterias (@RequestBody Materias materias) {
        Materias materiasNovo = dao.save(materias);
        return materiasNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<Materias> excluirMaterias (@PathVariable Integer id) {
        Optional<Materias> materias = dao.findById(id);
        dao.deleteById(id);
        return materias;
}}
