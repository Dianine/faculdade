package com.dianine.apirest.service;

import com.dianine.apirest.model.Professor;
import com.dianine.apirest.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfessorService {
    private ProfessorRepository repository;


    public void create(Professor professor) {
        repository.save(professor);
    }

    public List<Professor> findAll() {
        return repository.findAll();
    }
}
