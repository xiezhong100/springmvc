package com.xiezhong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xiezhong.entity.User;

/**
 * @Title: TODO  
 * @Description: TODO  
 * @author: 谢忠
 * @date: 2014-8-20 下午9:42:01  
 *  
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
