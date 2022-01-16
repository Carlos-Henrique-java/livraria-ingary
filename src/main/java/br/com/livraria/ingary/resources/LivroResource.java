package br.com.livraria.ingary.resources;

import br.com.livraria.ingary.models.Livro;
import br.com.livraria.ingary.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/apilivro")
public class LivroResource {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping("/livros")
    public List<Livro> listaLivros(){
        return livroRepository.findAll();
    }

    @GetMapping("/livro/{id}")
    public Livro listaLivroUnico(@PathVariable(value = "id")long id){
        return livroRepository.findById(id);
    }

    @PostMapping("/livro")
    public Livro salvaLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    @DeleteMapping("/livro")
    public void deletaLivro(@RequestBody Livro livro){
        livroRepository.delete(livro);
    }

    @PutMapping("/livro")
    public Livro atualizaLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

}