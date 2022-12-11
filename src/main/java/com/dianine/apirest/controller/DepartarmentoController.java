package com.dianine.apirest.controller;

import com.dianine.apirest.model.Departamento;
import com.dianine.apirest.service.DepartamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departamento")
@AllArgsConstructor
public class DepartarmentoController {
    private DepartamentoService departamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Departamento departamento){
        departamentoService.create(departamento);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Departamento> findAll(){
        return departamentoService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Departamento findById (@PathVariable ("id") Integer id, @RequestBody Departamento departamento){
        return departamentoService.findById(id);
    }
    @PutMapping ("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Departamento upDateId(@PathVariable ("id") Integer id, @RequestBody Departamento departamento){
        return departamentoService.upDateId(id, departamento);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        departamentoService.deleteId(id);
    }
}
