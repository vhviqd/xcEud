package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
* @Description:    配置数据模型
* @Author:         zzq
* @CreateDate:     2020/9/6
*/
@Api(value = "cms配置接口管理", description = "cms配置管理接口，提供数据模型的管理、查询接口")
public interface CmsConfigControllerApi {

    @ApiOperation("根据id查询CMS的配置信息")
    public CmsConfig getModel(String id);
}
