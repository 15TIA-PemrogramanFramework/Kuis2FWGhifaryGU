/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Kuis1029.service;


import com.example.Kuis1029.entity.IPKEntity;
import com.example.Kuis1029.repo.IPKRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("ipkService")
@Transactional
public class IPKService {

    @Autowired
    private IPKRepo repo;

   public IPKEntity insert(IPKEntity category) {
        return repo.save(category);
    }
    
    public IPKEntity update(IPKEntity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public IPKEntity getById(Long id){
        return repo.findOne(id);
    }
    
    public List<IPKEntity> getAll(){
        return repo.findAllCategory();
    }
}
