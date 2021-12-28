package com.buraktuysuz.thirdhomework.converter;

import com.buraktuysuz.thirdhomework.dto.UserRegisterDto;
import com.buraktuysuz.thirdhomework.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User ConvertUserRegisterDtoToUser(UserRegisterDto userRegisterDto);
}
