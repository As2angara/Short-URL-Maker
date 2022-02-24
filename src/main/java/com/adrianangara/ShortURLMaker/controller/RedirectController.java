package com.adrianangara.ShortURLMaker.controller;

import com.adrianangara.ShortURLMaker.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/{urlID}")
public class RedirectController {

    @Autowired
    private URLService urlService;

    @GetMapping
    public RedirectView redirectToShortURL(@PathVariable(value="urlID") String id) {

        //Retrieve link from urlService
        String longURL = urlService.getLongUrlByString(id);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(longURL);

        return redirectView;
    }


}
