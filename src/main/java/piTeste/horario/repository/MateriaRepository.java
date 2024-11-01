package piTeste.horario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import piTeste.horario.entity.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer> {
    // Aqui você pode definir métodos adicionais de consulta, se necessário
}