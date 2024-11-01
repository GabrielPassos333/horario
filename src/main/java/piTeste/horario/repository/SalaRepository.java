package piTeste.horario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import piTeste.horario.entity.Sala;

public interface SalaRepository extends JpaRepository<Sala, Integer> {
    // Métodos adicionais, se necessário

    // Método para buscar todas as salas com lugares > 100
    List<Sala> findByLugaresGreaterThan(int lugares);
}
