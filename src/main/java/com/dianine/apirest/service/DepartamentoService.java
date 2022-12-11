package com.dianine.apirest.service;

import com.dianine.apirest.exception.NotFoundException;
import com.dianine.apirest.model.Departamento;
import com.dianine.apirest.repository.DepartamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartamentoService {
    private DepartamentoRepository departamentoRepository;
    public void create(Departamento departamento) {
        departamentoRepository.save(departamento);
    }
    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }
    public Departamento findById(Integer id) {
        return departamentoRepository.findById(id).
                orElseThrow(()-> new NotFoundException("Departamento não encontrado"));
    }

    public Departamento upDateId(Integer id, Departamento departamento) {
        return departamentoRepository.findById(id).map(d ->{
            d.setNome_departamento(departamento.getNome_departamento());
            return departamentoRepository.save(d);
        }).orElseThrow(()-> new NotFoundException("Departamento não encontrado"));
    }

    public void deleteId(Integer id) {
        departamentoRepository.deleteById(id);
    }
}
