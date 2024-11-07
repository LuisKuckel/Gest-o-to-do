package br.com.api.calender.notas_atividades;

import br.com.api.calender.notas.Notas;
import org.springframework.data.repository.CrudRepository;

public interface INotas_Atividades extends CrudRepository<Notas_Atividades, Integer> {
}
