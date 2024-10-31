package piTeste.horario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import piTeste.horario.entity.Sala;

public interface SalaRepository extends JpaRepository<Sala, Integer> {
    // Métodos adicionais, se necessário
}
