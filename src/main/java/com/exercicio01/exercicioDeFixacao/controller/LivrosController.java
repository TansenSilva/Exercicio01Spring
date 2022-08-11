package com.exercicio01.exercicioDeFixacao.controller;


import com.exercicio01.exercicioDeFixacao.model.LivrosModel;
import com.exercicio01.exercicioDeFixacao.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivrosController {

    @Autowired
    private LivrosService livrosService;

    @GetMapping(path = "/biblioteca")
    public List<LivrosModel> buscarLivros(){
        return livrosService.buscarTodosLivros();
    }

    @GetMapping(path = "/biblioteca/{codigoLivro}")
    public Optional<LivrosModel> buscarLivroporId(@PathVariable Long codigoLivro){
        return livrosService.buscarId(codigoLivro);
    }

    @PostMapping(path = "/biblioteca")
    public LivrosModel cadastarLivro(@RequestBody LivrosModel livrosModel){
        return livrosService.cadastrar(livrosModel);
    }

    @PutMapping(path = "/biblioteca/{codigoLivro}")
    public LivrosModel aterarLivro(@RequestBody LivrosModel codigolivro){
        return livrosService.alterar(codigolivro);
    }

    @DeleteMapping(path = "/biblioteca/{codigoLivro}")
    public void  deletarLivro(@PathVariable Long codigoLivro){
        livrosService.deletar(codigoLivro);
    }


}
