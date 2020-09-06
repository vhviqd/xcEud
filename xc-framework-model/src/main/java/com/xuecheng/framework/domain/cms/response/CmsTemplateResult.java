package com.xuecheng.framework.domain.cms.response;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;

/**
* @Description:    模板响应接口
* @Author:         zzq
* @CreateDate:     2020/9/6
*/
public class CmsTemplateResult extends ResponseResult {

    CmsTemplate cmsTemplate;

    public CmsTemplateResult(ResultCode resultCode,CmsTemplate cmsTemplate){
        super(resultCode);
        this.cmsTemplate = cmsTemplate;
    }
}
