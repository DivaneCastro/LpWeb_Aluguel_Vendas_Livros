package br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.repository;


import br.edu.ifma.dcomp.lpweb.aluguelvendaslivros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
}


