package com.mldy.miaosha.core.common;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 * @param <T>
 */
public interface MyMapper<T> extends BaseMapper<T>, ConditionMapper<T>, MySqlMapper<T> {

}
