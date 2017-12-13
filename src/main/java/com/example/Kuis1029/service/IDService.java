/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Kuis1029.service;

import com.example.Kuis1029.entity.IDEntity;
import com.example.Kuis1029.repo.IDRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("IDService")
@Transactional
public class IDService {

    @Autowired
    private IDRepo repo;

    public IDEntity insert(IDEntity category) {
        return repo.save(category);
    }
    
    public IDEntity update(IDEntity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public IDEntity getById(Long id){
        return repo.findOne(id);
    }
    
    public List<IDEntity> getAll(){
        return repo.findAllCategory();
    }
}
