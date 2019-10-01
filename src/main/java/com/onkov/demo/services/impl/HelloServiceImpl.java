package com.onkov.demo.services.impl;

import com.onkov.demo.dtos.HomeModelDTO;
import com.onkov.demo.models.HomeModel;
import com.onkov.demo.repository.HomeRepository;
import com.onkov.demo.services.HelloService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    private HomeRepository homeRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public HelloServiceImpl(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Override
    public String hello() {
        return null;
    }

    @Override
    public HomeModelDTO helloObj() {
        HomeModel model = homeRepository.getHomeObject();

        HomeModelDTO dto = modelMapper.map(model, HomeModelDTO.class);

        return dto;

    }
}
