package com.example.recommender.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.recommender.entity.Section;
import java.util.List;


@Repository
public interface ISectionDao {
    List<Section> getName(@Param("secId") String secId);

}
