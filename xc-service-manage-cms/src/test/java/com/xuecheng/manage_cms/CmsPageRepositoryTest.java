package com.xuecheng.manage_cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
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


}
