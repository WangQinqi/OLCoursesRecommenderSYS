package com.example.recommender.service;

import com.example.recommender.entity.Section;



public interface ISectionService {
    Section getName(String secId); // 入参为课程id，返回课程名称
}
