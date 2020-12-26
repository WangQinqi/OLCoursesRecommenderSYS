package com.example.recommender.service;

import com.example.recommender.entity.recommendResult;

import java.util.List;

public interface IResultService {
    List<recommendResult> getResults(String current); // 入参为正在观看的课程id，返回推荐的课程id
}
