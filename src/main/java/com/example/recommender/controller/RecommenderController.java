package com.example.recommender.controller;

import com.example.recommender.entity.recommendResult;
import com.example.recommender.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/main")
public class RecommenderController {
    @Autowired
    private IResultService iResultService;

    @RequestMapping(value = "/getResults", method = RequestMethod.POST)
    private List<recommendResult> getResults(@RequestParam String current) { // 入参为正在观看的视频id
        return iResultService.getResults(current);
    }
}
