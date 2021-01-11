package com.example.recommender.controller;

import com.example.recommender.entity.Section;
import com.example.recommender.service.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/name")
public class SectionController {
    @Autowired
    private ISectionService iSectionService;

    @CrossOrigin(origins = "*")
    //@RequestMapping(value = "/getName", method = RequestMethod.POST)
    @RequestMapping(value = "/getName")
    @ResponseBody
    private List<Section> getResults(@RequestParam String secId) { // 入参为正在观看的视频id，返回10*推荐的课程名称
        return iSectionService.getName(secId);
    }

}