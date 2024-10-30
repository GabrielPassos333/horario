package piTeste.horario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piTeste.horario.repository.ProfRepository;
import piTeste.horario.entity.Prof;

@Service
public class ProfService {
  private final ProfRepository profRepository;

    @Autowired
    public ProfService(ProfRepository profRepository) {
        this.profRepository = profRepository;
    }

    public List<Prof> listarProf() {
        return profRepository.findAll();
    }

    public Prof criarProf(Prof prof) {
        return profRepository.save(prof);
    }

    public Prof obterProfPorId(Long id) {
        return profRepository.findById(id).orElseThrow(() -> new RuntimeException("Professor não encontrado"));
    }

    public Prof atualizarProf(Long id, Prof prof) {
        Prof profExistente = obterProfPorId(id);
        profExistente.setNome(prof.getNome());
        return profRepository.save(profExistente);
    }

    public void excluirProf(Long id) {
        profRepository.deleteById(id);
    } 
}
