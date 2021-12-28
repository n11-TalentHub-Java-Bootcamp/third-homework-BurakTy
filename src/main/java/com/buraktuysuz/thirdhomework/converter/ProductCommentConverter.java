package com.buraktuysuz.thirdhomework.converter;

import com.buraktuysuz.thirdhomework.dto.ProductCommentDto;
import com.buraktuysuz.thirdhomework.dto.UserRegisterDto;
import com.buraktuysuz.thirdhomework.entity.ProductComment;
import com.buraktuysuz.thirdhomework.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductCommentConverter {


    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    ProductComment ConvertProductCommentDtoToProductComment(ProductCommentDto productCommentDto);
}
