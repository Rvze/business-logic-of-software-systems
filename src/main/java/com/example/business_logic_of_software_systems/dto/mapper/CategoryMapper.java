package com.example.business_logic_of_software_systems.dto.mapper;

import com.example.business_logic_of_software_systems.data.domain.Category;
import com.example.business_logic_of_software_systems.dto.request.CategoryCreateRequest;
import com.example.business_logic_of_software_systems.dto.response.CategoryCreateResponse;
import com.example.business_logic_of_software_systems.dto.request.CategoryFindRequest;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mapping(target = "categoryId", ignore = true)
    @Mapping(target = "products", ignore = true)
    Category toEntity(CategoryCreateRequest request);

    @Mapping(target = "id", source = "categoryId")
    CategoryCreateResponse toResponse(Category category);

    CategoryFindRequest toDto(Category category);

//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Category partialUpdate(CategoryFindRequest categoryFindRequest, @MappingTarget Category category);
}
