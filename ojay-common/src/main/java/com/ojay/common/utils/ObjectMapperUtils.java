package com.ojay.common.utils;

import com.ojay.common.exception.BusinessException;
import com.ojay.common.model.enums.AppHttpCodeEnum;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtils {
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static String writeValueAsString(Object object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new BusinessException(AppHttpCodeEnum.INTERNAL_SERVER_ERROR);
        }
    }
}
