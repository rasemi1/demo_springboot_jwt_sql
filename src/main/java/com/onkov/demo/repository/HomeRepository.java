package com.onkov.demo.repository;

import com.onkov.demo.models.HomeModel;
import org.springframework.stereotype.Component;

@Component
public class HomeRepository {

    public HomeModel getHomeObject(){
        HomeModel model = new HomeModel();
        model.setValue1("Yes");
        return model;
    }
}
