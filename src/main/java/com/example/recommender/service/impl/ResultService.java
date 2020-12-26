package com.example.recommender.service.impl;

import com.example.recommender.dao.ILoginDao;
import com.example.recommender.dao.IResultDao;
import com.example.recommender.entity.recommendResult;
import com.example.recommender.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultService implements IResultService {
    @Autowired
    private IResultDao iResultDao;

    @Override
    public List<recommendResult> getResults(String current) {
        return iResultDao.getResults(current);
    }
}
