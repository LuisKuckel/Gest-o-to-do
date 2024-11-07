package br.com.api.calender.atividade;

import br.com.api.calender.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {
    @Autowired
    private IAtividades dao;

    @GetMapping
    public List<Atividades> listaAtividades () {
        return (List<Atividades>) dao.findAll();
    }

    @PostMapping
    public Atividades criarAtividades (@RequestBody Atividades atividades) {
        Atividades atividadeNovo = dao.save(atividades);
        return atividadeNovo;
    }
    @PutMapping
    public Atividades editarAtividades (@RequestBody Atividades atividades) {
        Atividades atividadeNovo = dao.save(atividades);
        return atividadeNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<Atividades> excluirAtividades (@PathVariable Integer id) {
        Optional<Atividades> atividades = dao.findById(id);
        dao.deleteById(id);
        return atividades;
}
}