/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Kuis1029.repo;

import com.example.Kuis1029.entity.IPKEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface IPKRepo extends CrudRepository<IPKEntity, Long>{
    
      @Query("select i from IPKEntity i")
    public List<IPKEntity> findAllCategory();

}
