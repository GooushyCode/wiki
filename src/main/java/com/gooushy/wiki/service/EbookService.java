package com.gooushy.wiki.service;
import com.gooushy.wiki.domain.Ebook;
import com.gooushy.wiki.domain.EbookPojo;
import com.gooushy.wiki.mapper.EbookMapper;
import com.gooushy.wiki.resp.CommonResponse;
import com.gooushy.wiki.util.SnowFlake;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    @Resource
    private SnowFlake snowFlake;

    // 查找所有
    public List<Ebook> findAll(){
        return ebookMapper.findAll();
    }
    // 保存
    public void saveEbook(){
        Ebook saveEbook = new Ebook();
        saveEbook.setName("测试教程");
        saveEbook.setCategory1Id(23L);
        saveEbook.setCategory2Id(32L);
        saveEbook.setDescription("测试测试");
        saveEbook.setCover("16");
        saveEbook.setDocCount(2);
        saveEbook.setViewCount(5);
        saveEbook.setVoteCount(8);
        ebookMapper.insert(saveEbook);
    }
    // 修改
    public CommonResponse<String> updateEbook(){
        Ebook ebook1 = new Ebook();
        ebook1.setId(11L);
        ebook1.setName("更新后");
        ebook1.setCategory1Id(23L);
        ebook1.setCategory2Id(32L);
        ebook1.setDescription("更新后");
        ebook1.setCover("16");
        ebook1.setDocCount(2);
        ebook1.setViewCount(5);
        ebook1.setVoteCount(8);
        ebookMapper.updateEbook(ebook1);
        CommonResponse<String> response = new CommonResponse<>();
        response.setMessage("更新成功");
        return response;
    }
    //  删除
    public CommonResponse<String> deleteEbook(Long id){
        ebookMapper.deleteEbook(id);
        CommonResponse<String> response = new CommonResponse<>();
        response.setMessage("删除成功");
        return response;
    }

    //根据id查找
    public Ebook findById(Long id){
        return ebookMapper.findById(id);
    }
    // 根据名称模糊查询
    public List<Ebook> findByName(){
        return ebookMapper.findByName("%教程%");
    }

    // 使用实体对象作为查询条件
    public List<Ebook> findByEbookPojo(){
        EbookPojo ebookPojo = new EbookPojo();
        Ebook ebook = new Ebook();
        ebook.setName("%测试%");
        ebookPojo.setEbook(ebook);
        return ebookMapper.findByEbookPojo(ebookPojo);
    }



}
