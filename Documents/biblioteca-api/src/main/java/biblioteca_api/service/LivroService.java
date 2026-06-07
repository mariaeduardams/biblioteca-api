package biblioteca_api.service;

import biblioteca_api.model.Livro;
import biblioteca_api.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro cadastrar(String titulo, String autor) {
        return repository.save(new Livro(titulo, autor));
    }

    public List<Livro> listar() {
        return repository.findAll();
    }

    public Livro buscar(UUID id) {
        return repository.findById(id)
                .orElseThrow();
    }
}