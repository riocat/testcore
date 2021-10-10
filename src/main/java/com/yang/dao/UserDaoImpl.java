package com.yang.dao;

import com.yang.entry.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ykm on 2021/10/4.
 */
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDaoMapper {

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<User> selectUsers(User user) {
        return getSqlSession().getMapper(UserDaoMapper.class).selectUsers(user);
    }

    @Transactional
    public int updateUser(User user) {
        return getSqlSession().update("com.yang.dao.UserDaoMapper.updateUser", user);
    }

    public int deleteUser(User user) {
        return getSqlSession().delete("com.yang.dao.UserDaoMapper.deleteUser", user);
    }
}
