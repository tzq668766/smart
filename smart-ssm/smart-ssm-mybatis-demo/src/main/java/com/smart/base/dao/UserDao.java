package com.smart.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smart.base.model.User;
import com.smart.ssm.dao.Dao;
import com.smart.ssm.model.Pagination;

/**
 * 管理员持久化接口
 * 
 * @author Joe
 */
public interface UserDao extends Dao<User, Integer> {
	
	public List<User> findByAccount(@Param("account") String account, Pagination<User> p);
}
