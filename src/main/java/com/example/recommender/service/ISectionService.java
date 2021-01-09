package com.example.recommender.service;

import com.example.recommender.entity.Section;
import java.util.List;


public interface ISectionService {
    List<Section> getName(String secId); // 入参为课程id，返回课程名称
}
