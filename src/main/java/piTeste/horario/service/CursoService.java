package piTeste.horario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piTeste.horario.repository.CursoRepository;
import piTeste.horario.entity.Curso;

@Service
public class CursoService {
  private final CursoRepository cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso criarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso obterCursoPorId(Long id) {
        return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }

    public Curso atualizarCurso(Long id, Curso curso) {
        Curso cursoExistente = obterCursoPorId(id);
        cursoExistente.setNome(curso.getNome());
        return cursoRepository.save(cursoExistente);
    }

    public void excluirCurso(Long id) {
        cursoRepository.deleteById(id);
    }

}
