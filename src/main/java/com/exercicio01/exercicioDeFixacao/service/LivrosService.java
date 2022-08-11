package com.exercicio01.exercicioDeFixacao.service;

import com.exercicio01.exercicioDeFixacao.model.LivrosModel;
import com.exercicio01.exercicioDeFixacao.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;

    public List<LivrosModel> buscarTodosLivros(){
        return livrosRepository.findAll();
    }

    public Optional<LivrosModel>buscarId(Long codigo){
        return livrosRepository.findById(codigo);
    }

    public LivrosModel cadastrar(LivrosModel livrosModel){
        livrosModel.getNome();
        livrosModel.getAutor();
        livrosModel.getDataLancamento();
        return livrosRepository.save(livrosModel);
    }

    public LivrosModel alterar(LivrosModel livrosModel){
        livrosModel.getCodigoLivro();
        livrosModel.getNome();
        livrosModel.getAutor();
        livrosModel.getDataLancamento();
        return livrosRepository.save(livrosModel);
    }

    public void deletar(Long codigoLivro){
        livrosRepository.deleteById(codigoLivro);
    }

}
