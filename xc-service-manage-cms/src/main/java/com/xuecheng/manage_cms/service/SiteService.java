package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
* @Description:    站点服务层
* @Author:         zzq
* @CreateDate:     2020/9/6
*/
@Service
public class SiteService {

    @Autowired
    CmsSiteRepository cmsSiteRepository;

    /**
     * 查询所有的站点信息
     * @return
     */
    public QueryResponseResult findList(){
        //获取所有的站点信息

        List<CmsSite> all = cmsSiteRepository.findAll();
        if(CollectionUtils.isEmpty(all)){
            return new QueryResponseResult(CommonCode.FAIL,null);
        }

        //响应模板数据
        QueryResult<CmsSite> queryResult = new QueryResult<>() ;
        queryResult.setList(all);
        queryResult.setTotal(all.size());

        return new QueryResponseResult(CommonCode.SUCCESS,queryResult);

    }

}
