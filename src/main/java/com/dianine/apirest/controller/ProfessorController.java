package com.dianine.apirest.controller;

import com.dianine.apirest.model.Professor;
import com.dianine.apirest.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
@AllArgsConstructor
public class ProfessorController {

    private ProfessorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void Create(@RequestBody Professor professor){
        service.create(professor);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> findAll(){
        return service.findAll();
    }
}
