package com.ly.easy.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.ly.easy.user.dto.User;

@Component
@Mapper
public interface StudentMapper {

	int save(User user);

	User selectById(Integer id);

	int updateById(User user);

	int deleteById(Integer id);

	List<User> queryAll();
}
