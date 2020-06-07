package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.domain.cms.response.CmsPostPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.manage_cms.service.CmsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* @Description:
* @Author:         zzq
* @CreateDate:     2020/5/2
*/
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    CmsPageService cmsPageService;



    /**
     * 分页查询CmsPage集合下面的数据，根据站点id，模板id、页面别名查询页面信息
     * @param page
     * @param size
     * @param queryPageRequest
     * @return
     */
    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page,@PathVariable("size") int size, QueryPageRequest queryPageRequest) {

        QueryResponseResult queryResponseResult = cmsPageService.findList(page,size,queryPageRequest);

        return queryResponseResult;

    }

    /**
     * 新增页面
     * @param cmsPage
     * @return
     */
    @PostMapping("/add")
    @Override
    public CmsPageResult add(@RequestBody CmsPage cmsPage) {

        CmsPageResult result = cmsPageService.add(cmsPage);
        return result;
    }

    @Override
    public CmsPage findById(String id) {
        return null;
    }

    @Override
    public CmsPageResult edit(String id, CmsPage cmsPage) {
        return null;
    }

    @Override
    public ResponseResult delete(String id) {
        return null;
    }

    @Override
    public ResponseResult post(String pageId) {
        return null;
    }

    @Override
    public CmsPageResult save(CmsPage cmsPage) {
        return null;
    }

    @Override
    public CmsPostPageResult postPageQuick(CmsPage cmsPage) {
        return null;
    }

    @Override
    @GetMapping("/findSites")
    public QueryResult findSites() {
        return cmsPageService.findSites();
    }
}
