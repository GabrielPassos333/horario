package piTeste.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import piTeste.horario.entity.Sala;
import piTeste.horario.service.SalaService;

import java.util.List;

@RestController
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    // Listar todas as salas
    @GetMapping
    public List<Sala> listarSalas() {
        return salaService.listarSalas();
    }

    // Obter uma sala específica por ID
    @GetMapping("/{id}")
    public Sala obterSalaPorId(@PathVariable Integer id) {
        return salaService.obterSalaPorId(id);
    }

    // Adicionar uma nova sala
    @PostMapping
    public Sala adicionarSala(@RequestBody Sala sala) {
        return salaService.adicionarSala(sala);
    }

    // Atualizar uma sala existente
    @PutMapping("/{id}")
    public Sala atualizarSala(@PathVariable Integer id, @RequestBody Sala salaAtualizada) {
        return salaService.atualizarSala(id, salaAtualizada);
    }

    // Deletar uma sala
    @DeleteMapping("/{id}")
    public void deletarSala(@PathVariable Integer id) {
        salaService.deletarSala(id);
    }
}
