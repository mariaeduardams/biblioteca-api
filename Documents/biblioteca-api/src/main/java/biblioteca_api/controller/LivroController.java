package biblioteca_api.controller;

import biblioteca_api.model.Livro;
import biblioteca_api.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @PostMapping
    public Livro cadastrar(@RequestBody LivroRequest request) {
        return service.cadastrar(request.titulo(), request.autor());
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable UUID id) {
        return service.buscar(id);
    }
}

record LivroRequest(String titulo, String autor) {
}