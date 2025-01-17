package org.ylzl.eden.demo.infrastructure.user.database.convertor;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.ylzl.eden.demo.domain.user.entity.User;
import org.ylzl.eden.demo.infrastructure.user.database.dataobject.UserDO;
import org.ylzl.eden.spring.framework.cola.domain.EntityConvertor;

/**
 * 用户领域实体转换器
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.13
 */
@Mapper(componentModel = "spring",
	nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
	nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserConvertor extends EntityConvertor<User, UserDO> {
}
