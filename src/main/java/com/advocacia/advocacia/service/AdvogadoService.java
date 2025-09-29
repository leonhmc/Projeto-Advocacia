package com.advocacia.advocacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advocacia.advocacia.entity.Advogado;
import com.advocacia.advocacia.repository.AdvogadoRepository;

@Service
public class AdvogadoService {
    
    // Injeção de dependênica do repositório de advogados
    @Autowired
    private AdvogadoRepository advogadoRepository;

    // Método para salvar um advogado
    public Advogado save(Advogado advogado){
        return advogadoRepository.save(advogado);
    }

    // Método para listar todos os advogados
    public List<Advogado> findAll(){
        return advogadoRepository.findAll();
    }

    // Método para excluir um advogado pelo ID
    public void deleteById(Integer id){
        advogadoRepository.deleteById(id);
    }

    // Método para buscar o advogado pelo ID
    public Advogado findById(Integer id){
        return advogadoRepository.findById(id).orElse(null);
    }

}
