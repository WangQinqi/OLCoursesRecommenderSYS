package com.example.recommender.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.recommender.entity.recommendResult;

import java.util.List;

@Repository
public interface IResultDao {
    List<recommendResult> getResults(@Param("current") String current);
}
