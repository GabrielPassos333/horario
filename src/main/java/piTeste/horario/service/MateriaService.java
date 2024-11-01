package piTeste.horario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piTeste.horario.entity.Materia;
import piTeste.horario.repository.MateriaRepository;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    // Listar todas as matérias
    public List<Materia> listarMaterias() {
        return materiaRepository.findAll();
    }

    // Obter uma matéria por ID
    public Materia obterMateriaPorId(Integer id) {
        return materiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Matéria não encontrada com ID: " + id));
    }

    // Adicionar uma nova matéria
    public Materia adicionarMateria(Materia materia) {
        return materiaRepository.save(materia);
    }

    // Atualizar uma matéria existente
    public Materia atualizarMateria(Integer id, Materia materiaAtualizada) {
        Materia materiaExistente = obterMateriaPorId(id);

        materiaExistente.setNome(materiaAtualizada.getNome());
        materiaExistente.setCurso(materiaAtualizada.getCurso());
        materiaExistente.setProf(materiaAtualizada.getProf());

        return materiaRepository.save(materiaExistente);
    }

    // Deletar uma matéria
    public void deletarMateria(Integer id) {
        Materia materiaExistente = obterMateriaPorId(id);
        materiaRepository.delete(materiaExistente);
    }
}
