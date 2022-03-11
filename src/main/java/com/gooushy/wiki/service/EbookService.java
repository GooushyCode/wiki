package com.gooushy.wiki.service;

import com.gooushy.wiki.domain.Ebook;
import com.gooushy.wiki.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> findAll(){
        List<Ebook> all = ebookMapper.findAll();
        return all;
    }

}
