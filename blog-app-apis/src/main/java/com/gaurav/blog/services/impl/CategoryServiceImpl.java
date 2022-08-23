package com.gaurav.blog.services.impl;

import com.gaurav.blog.entities.Category;
import com.gaurav.blog.exceptions.ResourceNotFoundException;
import com.gaurav.blog.payloads.CategoryDto;
import com.gaurav.blog.repositories.CategoryRepository;
import com.gaurav.blog.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

        Category cat = this.modelMapper.map(categoryDto, Category.class); //
        Category savedData = this.categoryRepository.save(cat); //        save category object

        return this.modelMapper.map(savedData, CategoryDto.class); //and return dto object
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {

        Category cat = this.categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        "Category","categoryId",categoryId
                ));
        cat.setCategoryTitle(categoryDto.getCategoryTitle());
        cat.setCategoryDescription(categoryDto.getCategoryDescription());

        Category updatedCategory = this.categoryRepository.save(cat);


        return this.modelMapper.map(updatedCategory,CategoryDto.class);
    }

    @Override
    public void deleteCategory(Integer categoryId) {

        Category cat =this.categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        "Category","categoryId",categoryId
                ));
        this.categoryRepository.delete(cat);

    }

    @Override
    public CategoryDto getCategory(Integer categoryId) {

        Category  cat =this.categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException(
                        "category","categoryId",categoryId
                ));
        return this.modelMapper.map(cat,CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getCategories() {

        List<Category> listOfCategories = this.categoryRepository.findAll();
        List<CategoryDto> categoryDtoList = listOfCategories.stream()
                .map((category) -> this.modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());

        return categoryDtoList;
    }
}
