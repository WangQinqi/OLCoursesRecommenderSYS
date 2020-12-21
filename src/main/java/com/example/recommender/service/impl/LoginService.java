package com.example.recommender.service.impl;

import com.example.recommender.dao.ILoginDao;
import com.example.recommender.entity.Login;
import com.example.recommender.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public Login login(String name, String pwd) {
        return iLoginDao.login(name, pwd);
    }
}
