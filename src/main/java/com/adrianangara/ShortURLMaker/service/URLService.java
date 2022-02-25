package com.adrianangara.ShortURLMaker.service;

import com.adrianangara.ShortURLMaker.entity.LongURLEntity;
import com.adrianangara.ShortURLMaker.entity.MappingEntity;
import com.adrianangara.ShortURLMaker.entity.ShortURLEntity;
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

    public ShortURLEntity createShortURL(LongURLEntity longURLEntity) {

        //Create unique URL
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        //Save entity to DB
        MappingEntity mappingEntity = new MappingEntity();
        mappingEntity.setLongURL(longURLEntity.getLongURL());
        mappingEntity.setShortURL(generatedString);
        urlRepository.save(mappingEntity);

        return new ShortURLEntity(this.url + generatedString);
    }

    public LongURLEntity getLongUrlByString(String shortURLString) {

        return new LongURLEntity(urlRepository.findByShortURL(shortURLString).getLongURL());
    }
}
