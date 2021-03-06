package com.finance.homework.converters;


import com.finance.homework.domain.requests.ExtentionRequest;
import com.finance.homework.domain.responses.ExtentionResponse;
import com.finance.homework.model.ExtentionEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ExtentionConverter {

    private static final ModelMapper mapper = new ModelMapper();

    public ExtentionConverter() {
        mapper.getConfiguration().setFieldMatchingEnabled(true);
    }

    public static ExtentionResponse toResponse(ExtentionEntity extentionEntity) {
        return mapper.map(extentionEntity, ExtentionResponse.class);
    }

    public static List<ExtentionResponse> toResponse(List<ExtentionEntity> extentionEntities) {
        return extentionEntities.stream().map(ExtentionConverter::toResponse).collect(Collectors.toList());
    }

    public static ExtentionEntity toEntity(ExtentionRequest extentionRequest) {
        return mapper.map(extentionRequest, ExtentionEntity.class);
    }
}
