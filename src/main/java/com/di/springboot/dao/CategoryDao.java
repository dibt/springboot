package com.di.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.di.springboot.pojo.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by bentengdi on 2018/3/20.
 */
@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {

}
