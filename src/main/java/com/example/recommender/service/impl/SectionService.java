package com.example.recommender.service.impl;

import com.example.recommender.dao.ISectionDao;
import com.example.recommender.entity.Section;
import com.example.recommender.service.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SectionService implements ISectionService{
    @Autowired
    private ISectionDao iSectionDao;

    @Override
    public List<Section> getName(String secId) {

        return iSectionDao.getName(secId);
    }
}
