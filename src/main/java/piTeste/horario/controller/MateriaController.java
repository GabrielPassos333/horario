package piTeste.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import piTeste.horario.entity.Materia;
import piTeste.horario.service.MateriaService;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    // Listar todas as matérias
    @GetMapping
    public List<Materia> listarMaterias() {
        return materiaService.listarMaterias();
    }

    // Obter uma matéria específica por ID
    @GetMapping("/{id}")
    public Materia obterMateriaPorId(@PathVariable Integer id) {
        return materiaService.obterMateriaPorId(id);
    }

    // Adicionar uma nova matéria
    @PostMapping
    public Materia adicionarMateria(@RequestBody Materia materia) {
        return materiaService.adicionarMateria(materia);
    }

    // Atualizar uma matéria existente
    @PutMapping("/{id}")
    public Materia atualizarMateria(@PathVariable Integer id, @RequestBody Materia materiaAtualizada) {
        return materiaService.atualizarMateria(id, materiaAtualizada);
    }

    // Deletar uma matéria
    @DeleteMapping("/{id}")
    public void deletarMateria(@PathVariable Integer id) {
        materiaService.deletarMateria(id);
    }
}
