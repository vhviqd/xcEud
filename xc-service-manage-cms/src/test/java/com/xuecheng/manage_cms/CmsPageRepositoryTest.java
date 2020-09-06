package com.xuecheng.manage_cms;

import com.alibaba.fastjson.JSON;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import com.xuecheng.manage_cms.service.CmsPageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description: 测试mongodb的 repository方法
 * @Author: zzq
 * @CreateDate: 2020/5/2
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;
    @Autowired
    CmsPageService cmsPageService;

    /**
     * 分页查询
     */
    @Test
    public void testFindPage() {
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        //查询
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);

        System.out.println(all);
    }

    @Test
    public void testFindAll(){

        List<CmsPage> all = cmsPageRepository.findAll();
        all.stream().forEach((a)->System.out.println(all.get(0).getPageAliase()));
    }

    @Test
    public void testFindAllByExample(){

        Pageable pageable = PageRequest.of(0,10);

        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageAliase("轮播");

        //创建一个匹配器，包含别名
        ExampleMatcher exampleMatcher =ExampleMatcher.matching()
                .withMatcher("pageAliase",ExampleMatcher.GenericPropertyMatchers.contains());


        Example<CmsPage> example =Example.of(cmsPage, exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);

        all.stream().forEach(
                (a)-> System.out.println(a.getPageAliase())
        );

    }

    /**
     * 测试自定义方法
     */
    @Test
    public void testFindByName(){

        CmsPage cmsPage = cmsPageRepository.findByPageName("index.html");

        System.out.println(cmsPage);
    }

    /**
     * 自定义条件查询
     * 指定站点id、模板id、 别名模糊查询
     */
    @Test
    public void testDiyFindAll(){
        //精确匹配条件值
        CmsPage cmsPage = new CmsPage();
        cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");
        cmsPage.setTemplateId("5a925be7b00ffc4b3c1578b5");

        //模糊匹配条件： 页面别名
        cmsPage.setPageAliase("预览");

        //条件匹配器,用于模糊匹配   使用contains进行模糊匹配
        ExampleMatcher matching = ExampleMatcher.matching().withMatcher("pageAliase",ExampleMatcher.GenericPropertyMatchers.contains());


        //条件查询实例
        Example<CmsPage> example = Example.of(cmsPage, matching);

        //分页参数
        int page = 0;
        int size = 20;
        Pageable pageable = PageRequest.of(page,size);

        //调用dao
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        List<CmsPage> content = all.getContent();
        System.out.println(JSON.toJSONString(content));
    }


    @Test
    public void testAdd(){
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("index.html");
        cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");
        cmsPage.setPageWebPath("/index.html");
        cmsPageService.add(cmsPage);
    }

}
