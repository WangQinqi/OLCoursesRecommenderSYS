package com.example.recommender.service;

import com.example.recommender.entity.Login;

public interface ILoginService {
    Login login(String name, String pwd);
}
