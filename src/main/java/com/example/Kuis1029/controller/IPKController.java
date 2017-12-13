/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Kuis1029.controller;


import com.example.Kuis1029.entity.IPKEntity;
import com.example.Kuis1029.service.IPKService;
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
@RequestMapping("/ipk")
public class IPKController {
    
    @Autowired
    private IPKService IPKService;
    
    @RequestMapping(method = RequestMethod.POST)
   public IPKEntity insert(@RequestBody IPKEntity category) {
        return IPKService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public IPKEntity update(@RequestBody IPKEntity category) {
        return IPKService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return IPKService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public IPKEntity getById(@PathVariable("id") Long id){
        return IPKService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<IPKEntity> getAll(){
        return IPKService.getAll();
    }
  
}
