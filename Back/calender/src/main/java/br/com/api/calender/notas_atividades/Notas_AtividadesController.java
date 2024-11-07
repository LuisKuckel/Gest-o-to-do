package br.com.api.calender.notas_atividades;

import br.com.api.calender.notas.Notas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notas_atividades")
public class Notas_AtividadesController {
    @Autowired
    private INotas_Atividades dao;

    @GetMapping
    public List<Notas_Atividades> listaNotas_Atividades () {
        return (List<Notas_Atividades>) dao.findAll();
    }
    @PostMapping
    public Notas_Atividades criarNotas_Atividades (@RequestBody Notas_Atividades notas_atividades) {
        Notas_Atividades notasAtividadesNovo = dao.save(notas_atividades);
        return notasAtividadesNovo;
    }
    @PutMapping
    public Notas_Atividades editarNotas_Atividades (@RequestBody Notas_Atividades notas_atividades) {
        Notas_Atividades notasAtividadesNovo = dao.save(notas_atividades);
        return notasAtividadesNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<Notas_Atividades> excluirNotas_Atividades (@PathVariable Integer id) {
        Optional<Notas_Atividades> notas_atividades = dao.findById(id);
        dao.deleteById(id);
        return notas_atividades;
    }
}
