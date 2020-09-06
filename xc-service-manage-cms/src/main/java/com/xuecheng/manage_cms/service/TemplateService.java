package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
* @Description:
* @Author:         zzq
* @CreateDate:     2020/9/6
*/
@Service
public class TemplateService {

    @Autowired
    CmsTemplateRepository cmsTemplateRepository;

    //查询所有的模板信息
    public QueryResponseResult findList(){

        List<CmsTemplate> all = cmsTemplateRepository.findAll();

        if (findNull(all)) return new QueryResponseResult(CommonCode.FAIL, null);

        //响应信息
        QueryResult<CmsTemplate> queryResult = new QueryResult<CmsTemplate>();
        queryResult.setTotal(all.size());
        queryResult.setList(all);

        return new QueryResponseResult(CommonCode.SUCCESS,queryResult);

    }

    private boolean findNull(List<CmsTemplate> all) {
        if(CollectionUtils.isEmpty(all)){
            return true;
        }
        return false;
    }
}
