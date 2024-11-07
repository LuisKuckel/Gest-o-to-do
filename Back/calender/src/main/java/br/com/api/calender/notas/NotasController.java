package br.com.api.calender.notas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notas")
public class NotasController {
    @Autowired
    private INotas dao;

    @GetMapping
    public List<Notas> listaNotas () {
        return (List<Notas>) dao.findAll();
    }
    @PostMapping
    public Notas criarNotas (@RequestBody Notas notas) {
        Notas notasNovo = dao.save(notas);
        return notasNovo;
    }
    @PutMapping
    public Notas editarNotas (@RequestBody Notas notas) {
        Notas notasNovo = dao.save(notas);
        return notasNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<Notas> excluirNotas (@PathVariable Integer id) {
        Optional<Notas> notas = dao.findById(id);
        dao.deleteById(id);
        return notas;
    }
}
