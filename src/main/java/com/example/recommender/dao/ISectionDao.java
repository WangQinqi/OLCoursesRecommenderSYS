package com.example.recommender.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.recommender.entity.Section;


@Repository
public interface ISectionDao {
    Section getName(@Param("secId") String secId);
}
