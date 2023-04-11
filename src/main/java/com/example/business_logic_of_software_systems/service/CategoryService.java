package com.example.business_logic_of_software_systems.service;

import com.example.business_logic_of_software_systems.data.domain.Category;
import com.example.business_logic_of_software_systems.data.repository.CategoryRepository;
import com.example.business_logic_of_software_systems.dto.mapper.CategoryMapper;
import com.example.business_logic_of_software_systems.dto.request.CategoryCreateRequest;
import com.example.business_logic_of_software_systems.dto.request.CategoryFindRequest;
import com.example.business_logic_of_software_systems.dto.response.CategoryCreateResponse;
import com.example.business_logic_of_software_systems.dto.response.CategoryFindResponse;
import com.querydsl.core.BooleanBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    public CategoryCreateResponse createCategory(CategoryCreateRequest request) {
        Category categoryEntity = mapper.toEntity(request);
        return mapper.toResponse(repository.save(categoryEntity));
    }

    public Page<CategoryFindResponse> findResponses(CategoryFindRequest predicate, Pageable pageable) {
        BooleanBuilder bb = new BooleanBuilder();

        return null;
    }

    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
