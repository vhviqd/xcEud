package com.xuecheng.manage_cms;

import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.manage_cms.service.TemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsTemplateRespositoryTest {
    @Autowired
    TemplateService templateService;
 
    /**
     * 测试查询所有模板数据
     */
    @Test
    public void testFindAll(){
        QueryResponseResult list = templateService.findList();
        System.out.println(list);
    }
}