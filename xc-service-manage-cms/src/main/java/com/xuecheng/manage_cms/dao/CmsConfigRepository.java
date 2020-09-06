package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
* @Description:    继承mongodb 的api方法。第一个参数 是实体POJO对象类，第二个参数是：这个表的主键数据类型
* @Author:         zzq
* @CreateDate:     2020/5/2
*/
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {


}
