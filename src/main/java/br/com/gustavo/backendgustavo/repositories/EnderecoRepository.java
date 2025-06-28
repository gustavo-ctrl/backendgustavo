package br.com.gustavo.backendgustavo.repositories;

import br.com.gustavo.backendgustavo.entities.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {

}
