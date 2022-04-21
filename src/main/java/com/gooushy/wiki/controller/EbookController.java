package com.gooushy.wiki.controller;
import com.gooushy.wiki.domain.Ebook;
import com.gooushy.wiki.resp.CommonResponse;
import com.gooushy.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/hello")
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping ("/findAllEbook")
    public CommonResponse<List<Ebook>> list(){
        CommonResponse<List<Ebook>> response = new CommonResponse<>();
        List<Ebook> list = ebookService.findAll();
        response.setContent(list);
        return response;
    }
    @RequestMapping  ("/saveEbook")
    public CommonResponse<String> saveEbook(){
        ebookService.saveEbook();
        CommonResponse<String> response = new CommonResponse<>();
        response.setMessage("保存成功！");
        return response;
    }
    @RequestMapping("/updateEbook")
    public CommonResponse<String> updateEbook(){
        return ebookService.updateEbook();
    }
    @RequestMapping("/deleteEbook")
    public CommonResponse<String> deleteEbook(){
        return ebookService.deleteEbook(11L);
    }
    @RequestMapping("/findById")
    public Ebook findById(){
        return ebookService.findById(1L);
    }
    @RequestMapping("/findByName")
    public CommonResponse<List<Ebook>> findByName(){
        CommonResponse<List<Ebook>> listCommonResponse = new CommonResponse<>();
        List<Ebook> byName = ebookService.findByName();
        listCommonResponse.setContent(byName);
        return listCommonResponse;
    }

    // 根据实体对象查询
    @RequestMapping("/findByEbookPojo")
    public List<Ebook> findFind(){
        return ebookService.findByEbookPojo();
    }
}
