package com.adrianangara.ShortURLMaker.service;

import com.adrianangara.ShortURLMaker.entity.MappingEntity;
import com.adrianangara.ShortURLMaker.repository.URLRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class URLService {

    @Value("${service.url}") //Value set in src/main/resources/application.properties
    private String url;

    @Autowired
    private URLRepository urlRepository;

    public MappingEntity createShortURLMapping(MappingEntity entity) {

        //Create unique URL
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        //Save entity to DB
        entity.setShortURL(generatedString);

        return urlRepository.save(entity);
    }

    public String getLongUrlByString(String pathVar) {

        String longURL = urlRepository.findByShortURL(pathVar).getLongURL();

        return longURL;
    }
}
