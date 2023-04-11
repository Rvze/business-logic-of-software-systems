package com.example.business_logic_of_software_systems.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoryFindResponse {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("categoryName")
    private String categoryName;
}
