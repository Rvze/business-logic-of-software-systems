package com.example.business_logic_of_software_systems.controller;

import com.example.business_logic_of_software_systems.dto.request.CategoryCreateRequest;
import com.example.business_logic_of_software_systems.dto.response.CategoryCreateResponse;
import com.example.business_logic_of_software_systems.dto.response.CategoryDeleteResponse;
import com.example.business_logic_of_software_systems.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/create-category")
    public ResponseEntity<CategoryCreateResponse> createCategory(
            @RequestBody(required = false)
            CategoryCreateRequest request
    ) {
        CategoryCreateResponse response = categoryService.createCategory(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/delete-category/{id}")
    public ResponseEntity<CategoryDeleteResponse> deleteCategory(
            @RequestParam Long id
    ) {
        categoryService.deleteCategory(id);
        return ResponseEntity.status(HttpStatus.OK).body(new CategoryDeleteResponse(id));
    }
}
