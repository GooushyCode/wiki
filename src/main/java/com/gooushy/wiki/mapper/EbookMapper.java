package com.gooushy.wiki.mapper;

import com.gooushy.wiki.domain.Ebook;
import com.gooushy.wiki.domain.EbookPojo;

import java.util.List;

public interface EbookMapper {
    List<Ebook> findAll();
    int insert(Ebook recor);
    void updateEbook(Ebook ebook);
    void deleteEbook(Long ebookId);
    Ebook findById(Long id);
    List<Ebook> findByName(String name);
    List<Ebook> findByEbookPojo(EbookPojo ebookPojo);
}
