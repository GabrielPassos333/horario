package piTeste.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import piTeste.horario.entity.Prof;
import piTeste.horario.service.ProfService;

import java.util.List;

@RestController
@RequestMapping("/api/prof")
public class ProfController {

    private final ProfService profService;

    @Autowired
    public ProfController(ProfService profService) {
        this.profService = profService;
    }

    @GetMapping
    public List<Prof> listarProf() {
        return profService.listarProf();
    }

    @GetMapping("/{id}")
    public Prof buscarProfPorId(@PathVariable Long id) {
        return profService.obterProfPorId(id);
    }

    @PostMapping
    public Prof salvarProf(@RequestBody Prof prof) {
        return profService.criarProf(prof);
    }

    @DeleteMapping("/{id}")
    public void deletarProf(@PathVariable Long id) {
        profService.excluirProf(id);
    }

    @PutMapping("/{id}")
    public Prof atualizarProf(@PathVariable Long id, @RequestBody Prof prof) {
        return profService.atualizarProf(id, prof);
    }
}
