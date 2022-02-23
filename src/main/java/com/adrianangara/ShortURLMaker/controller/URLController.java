package com.adrianangara.ShortURLMaker.controller;


import com.adrianangara.ShortURLMaker.entity.SuccessResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path=URLController.API_URL, produces="application/json")
public class URLController {

        public static final String API_URL="/api";

        @GetMapping("/ping")
        public ResponseEntity<SuccessResponse> getSuccessResponse() {

            return new ResponseEntity<SuccessResponse>(new SuccessResponse(true), HttpStatus.OK);
        }



}
