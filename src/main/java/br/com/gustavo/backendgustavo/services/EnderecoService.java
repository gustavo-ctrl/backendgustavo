package br.com.gustavo.backendgustavo.services;

import br.com.gustavo.backendgustavo.entities.Endereco;
import br.com.gustavo.backendgustavo.models.EnderecoView;
import br.com.gustavo.backendgustavo.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private static EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository=enderecoRepository;
    }

    public Endereco cadastrarEndereco(EnderecoView enderecoView) {
        Endereco enderecoviwer=new Endereco(enderecoView);
        Endereco endereco = enderecoRepository.save(enderecoviwer);
        return endereco;
    }

    public List<Endereco> listarEnderecos() {
        List<Endereco> enderecos= (List<Endereco>) enderecoRepository.findAll();
        return enderecos;
    }

    public Endereco consultaEndereco(Integer id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        return endereco.get();

    }

    public void deletaEndereco(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
