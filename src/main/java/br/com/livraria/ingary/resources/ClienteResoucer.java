package br.com.livraria.ingary.resources;

import br.com.livraria.ingary.models.Cliente;
import br.com.livraria.ingary.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apicliente")
public class ClienteResoucer {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/livro/{id}")
    public Cliente listaClienteUnico(@PathVariable(value = "id")long id){
        return clienteRepository.findById(id);
    }

    @PostMapping("/Cliente")
    public Cliente salvaCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/cliente")
    public void deleteCliente(@RequestBody Cliente cliente){
        clienteRepository.delete(cliente);
    }

    @PutMapping("/cliente")
    public Cliente atualizarCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
