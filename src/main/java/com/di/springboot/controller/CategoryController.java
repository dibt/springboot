package com.di.springboot.controller;

import com.di.springboot.dao.CategoryDao;
import com.di.springboot.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.di.springboot.pojo.Category;

import java.util.List;

/**
 * Created by bentengdi on 2018/3/20.
 */
@RestController
public class CategoryController {
    @Autowired
    CategoryDao categoryDao;
//    @Autowired
//    CategoryMapper categoryMapper;

    @GetMapping("/category")
    public List<Category> listCategory(@RequestParam(value = "start", defaultValue = "0") int start,
                               @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;

        Sort sort = new Sort(Sort.Direction.DESC, "id");
       Pageable pageable = new PageRequest(start, size, sort);
        Page<Category> page =categoryDao.findAll(pageable);

        System.out.println(page.getNumber());
        System.out.println(page.getNumberOfElements());
        System.out.println(page.getSize());
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());

        return page.getContent();
    }

    @PutMapping("/category")
    public void addCategory(@RequestBody Category c) throws Exception {
        System.out.println("springboot接受到浏览器以JSON格式提交的数据："+c);
    }
//    @DeleteMapping("/category/{id}")
//    public String deleteCategory(Category c) throws Exception {
//        categoryDao.delete(c);
//        return "redirect:/category";
//    }
//    @PostMapping("/category/{id}")
//    public String updateCategory(Category c) throws Exception {
//        categoryDao.save(c);
//        return "redirect:/category";
//    }
    @GetMapping("/category/{id}")
    public Category ediitCategory(@PathVariable(name = "id") int id) throws Exception {
        Category c= categoryDao.getOne(id);
        return c;
    }

}
