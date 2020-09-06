package com.xuecheng.api.cms;

import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;

@Api(value="CMS页面模板",description = "CMS页面模板，提供CMS页面模板的CRUD")
public interface CmsTemplateControllerApi {

    public QueryResponseResult findList();
}
