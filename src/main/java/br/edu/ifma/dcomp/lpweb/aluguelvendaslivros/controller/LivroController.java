package br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.controller;

import br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.model.Livro;
import br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.repository.LivroRepository;
import br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.service.LivroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> todosOsLivros() {
        return livroService.todosOsLivros();
    }

    @PostMapping
    @ResponseStatus (HttpStatus.CREATED)
    public Livro salva(@RequestBody Livro livro) {
        return livroService.salva(livro);

    }

    @GetMapping ("/{id}")
    public Livro buscaPor(@PathVariable Integer id) {
        return livroService.buscaPor(id);
    }

    @DeleteMapping ("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
      public void excluiPor(@PathVariable Integer id) {
        livroService.excluiPor(id);
    }

    @PutMapping ("/{id}")
    public Livro atualiza(@PathVariable Integer id, @RequestBody Livro livro) {

        Livro livroSalva = this.buscaPor(id);
        BeanUtils.copyProperties(livro, livroSalva, "id");
        return  livroSalva;
    }

   }


