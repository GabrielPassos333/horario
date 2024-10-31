package piTeste.horario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piTeste.horario.entity.Sala;
import piTeste.horario.repository.SalaRepository;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    // Listar todas as salas
    public List<Sala> listarSalas() {
        return salaRepository.findAll();
    }

    // Obter uma sala por ID
    public Sala obterSalaPorId(Integer id) {
        return salaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sala não encontrada com ID: " + id));
    }

    // Adicionar uma nova sala
    public Sala adicionarSala(Sala sala) {
        return salaRepository.save(sala);
    }

    // Atualizar uma sala existente
    public Sala atualizarSala(Integer id, Sala salaAtualizada) {
        Sala salaExistente = obterSalaPorId(id);

        salaExistente.setNome(salaAtualizada.getNome());
        salaExistente.setLugares(salaAtualizada.getLugares());

        return salaRepository.save(salaExistente);
    }

    // Deletar uma sala
    public void deletarSala(Integer id) {
        Sala salaExistente = obterSalaPorId(id);
        salaRepository.delete(salaExistente);
    }
}