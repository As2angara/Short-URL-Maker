package com.adrianangara.ShortURLMaker.service;

import com.adrianangara.ShortURLMaker.entity.MappingEntity;
import com.adrianangara.ShortURLMaker.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLService {

    @Autowired
    private URLRepository urlRepository;

    public MappingEntity createShortURLMapping(MappingEntity entity) {
        return urlRepository.save(entity);
    }
}
