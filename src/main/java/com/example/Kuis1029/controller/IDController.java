/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Kuis1029.controller;

import com.example.Kuis1029.entity.IDEntity;
import com.example.Kuis1029.service.IDService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/identitas")
public class IDController {

    @Autowired
    private IDService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public IDEntity insert(@RequestBody IDEntity category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public IDEntity update(@RequestBody IDEntity category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return categoryService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public IDEntity getById(@PathVariable("id") Long id){
        return categoryService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<IDEntity> getAll(){
        return categoryService.getAll();
    }
}
