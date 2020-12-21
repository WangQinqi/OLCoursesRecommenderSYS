package com.example.recommender.dao;

import com.example.recommender.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {
    Login login(@Param("username") String name, @Param("password") String pwd);
}
