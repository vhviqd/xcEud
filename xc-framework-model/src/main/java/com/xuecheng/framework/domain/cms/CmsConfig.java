package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by admin on 2018/2/6.
 * 提供页面静态化的表： 对应mongoDB
 */
@Data
@ToString
@Document(collection = "cms_config")
public class CmsConfig {

    @Id
    private String id; //主键
    /**
     * 数据模型名称
     */
    private String name;
    /**
     * 数据模型项目
     */
    private List<CmsConfigModel> model;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(List<CmsConfigModel> model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CmsConfigModel> getModel() {
        return model;
    }
}
