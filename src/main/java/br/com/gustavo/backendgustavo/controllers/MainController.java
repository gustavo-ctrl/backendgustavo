package br.com.gustavo.backendgustavo.controllers;

import br.com.gustavo.backendgustavo.entities.Endereco;
import br.com.gustavo.backendgustavo.models.EnderecoView;
import br.com.gustavo.backendgustavo.services.EnderecoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    private static EnderecoService enderecoService;

    public MainController(EnderecoService enderecoService) {
        this.enderecoService= enderecoService;
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Nildaoaula";
    }

    @PostMapping("/cadastrarendereco")
    public Endereco cadastrarEndereco(@RequestBody EnderecoView endereco){
        System.out.println("Iniciando cadastro");
        Endereco enderecoCadastrado=enderecoService.cadastrarEndereco(endereco);
        System.out.println("Cadastro efetuado");
        System.out.println(enderecoCadastrado);
        return enderecoCadastrado;
    }
    @GetMapping("/listaendereco")
    public List<Endereco> listarEnderecos(){
        List<Endereco> enderecos=enderecoService.listarEnderecos();
        return enderecos;
    }

    @GetMapping("/consultaendereco")
    public Endereco consultaEnderecos(@RequestParam(value="id")Integer id){
        Endereco enderecos=enderecoService.consultaEndereco(id);
        return enderecos;
    }

    @DeleteMapping("/deletendereco")
    public void deletEnderecos(@RequestParam(value="id")Integer id) {
        enderecoService.deletaEndereco(id);
    }
}
