package com.gooushy.wiki.controller;
import com.gooushy.wiki.domain.Ebook;
import com.gooushy.wiki.service.EbookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class EbookController {

    @Resource
    private EbookService ebookService;


    @RequestMapping("findAll")
    public List<Ebook> findAll(){
        List<Ebook> all = ebookService.findAll();
        return all;
    }
}
