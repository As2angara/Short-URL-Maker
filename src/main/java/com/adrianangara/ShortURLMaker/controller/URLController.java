package com.adrianangara.ShortURLMaker.controller;


import com.adrianangara.ShortURLMaker.entity.MappingEntity;
import com.adrianangara.ShortURLMaker.entity.SuccessResponse;
import com.adrianangara.ShortURLMaker.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path=URLController.API_URL, produces="application/json")
public class URLController {

        public static final String API_URL="/api";

        @Autowired
        private URLService urlService;

        @GetMapping("/ping")
        public ResponseEntity<SuccessResponse> getSuccessResponse() {

            return new ResponseEntity<SuccessResponse>(new SuccessResponse(true), HttpStatus.OK);
        }

        @PostMapping("/")
        public ResponseEntity<MappingEntity> createShortURL(@RequestBody MappingEntity entity) {

            return new ResponseEntity<MappingEntity>(urlService.createShortURLMapping(entity), HttpStatus.OK);
        }

}
