package com.example.recommender.controller;

import com.example.recommender.entity.Section;
import com.example.recommender.service.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/name")
public class SectionController {
    @Autowired
    private ISectionService iSectionService;

    @RequestMapping(value = "/getName", method = RequestMethod.POST)
    private Section getResults(@RequestParam String secId) { // 入参为视频id
        return iSectionService.getName(secId);
    }
}