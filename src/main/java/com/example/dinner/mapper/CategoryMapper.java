package com.example.dinner.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dinner.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
