package br.com.livraria.ingary.repository;

import br.com.livraria.ingary.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findByGenero (String genero);

}
