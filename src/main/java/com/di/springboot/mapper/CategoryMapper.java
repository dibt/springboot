package com.di.springboot.mapper;

import com.di.springboot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bentengdi on 2018/3/20.
 */
@Mapper
@Repository
public interface CategoryMapper {
    @Select("select * from category")
    List<Category>  findAll();
}
