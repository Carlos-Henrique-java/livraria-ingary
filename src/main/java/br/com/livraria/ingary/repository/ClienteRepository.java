package br.com.livraria.ingary.repository;

import br.com.livraria.ingary.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findById(long id);

}
