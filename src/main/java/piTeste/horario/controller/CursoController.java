package piTeste.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import piTeste.horario.entity.Curso;
import piTeste.horario.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public Curso buscarCursoPorId(@PathVariable Long id) {
        return cursoService.obterCursoPorId(id);
    }

    @PostMapping
    public Curso salvarCurso(@RequestBody Curso curso) {
        return cursoService.criarCurso(curso);
    }

    @DeleteMapping("/{id}")
    public void deletarCurso(@PathVariable Long id) {
        cursoService.excluirCurso(id);
    }

    @PutMapping("/{id}")
    public Curso atualizarCurso(@PathVariable Long id, @RequestBody Curso curso) {
        return cursoService.atualizarCurso(id, curso);
    }
}
