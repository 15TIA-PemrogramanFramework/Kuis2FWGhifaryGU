/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Kuis1029.repo;

import com.example.Kuis1029.entity.IDEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface IDRepo extends CrudRepository<IDEntity, Long> {

    @Query("select c from IDEntity c")
    public List<IDEntity> findAllCategory();
}
