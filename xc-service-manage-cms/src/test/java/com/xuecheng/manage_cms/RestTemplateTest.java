package com.xuecheng.manage_cms;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Description: 测试restTemplate
 * @Author: zzq
 * @CreateDate: 2020/9/6
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RestTemplateTest {

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void testRestTemplate() {
        ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://localhost:31001/cms/config/getmodel/5a795d82dd573c3574ee3360", Map.class);

        System.out.println(JSON.toJSONString(forEntity));
        /*{"body":{"id":"5a795d82dd573c3574ee3360","name":"精品推荐","model":[{"key":"course1","name":"精品课程1","url":"http://localhost:8084/category/list","mapValue":{"children":[{"isshow":"1","children":[{"isshow":"1","children":[{"isshow":"1","name":"HTML/CSS","orderby":"1-1-1","id":"1-1-1","label":"HTML/CSS","isleaf":"1"},{"isshow":"1","name":"JavaScript","orderby":"1-1-2","id":"1-1-2","label":"JavaScript","isleaf":"1"},{"isshow":"1","name":"jQuery","orderby":"1-1-3","id":"1-1-3","label":"jQuery","isleaf":"1"}],"name":"前端开发","orderby":"1-1","id":"1-1","label":"前端开发","isleaf":"0"},{"isshow":"1","children":[{"isshow":"1","name":"微信开发","orderby":"1-2-1","id":"1-2-1","label":"微信开发","isleaf":"1"},{"isshow":"1","name":"iOS","orderby":"1-2-2","id":"1-2-2","label":"iOS","isleaf":"1"}],"name":"移动开发","orderby":"1-2","id":"1-2","label":"移动开发","isleaf":"0"},{"isshow":"1","children":[],"name":"编程开发","orderby":"1-3","id":"1-3","label":"编程开发","isleaf":"0"}],"name":"根结点","orderby":"1","id":"1","label":"根结点","isleaf":"0"}]},"value":"{\"isshow\":null,\"children\":[{\"id\":\"1\",\"name\":\"根结点\",\"label\":\"根结点\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1\",\"isleaf\":\"0\",\"children\":[{\"id\":\"1-1\",\"name\":\"前端开发\",\"label\":\"前端开发\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-1\",\"isleaf\":\"0\",\"children\":[{\"id\":\"1-1-1\",\"name\":\"HTML/CSS\",\"label\":\"HTML/CSS\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-1-1\",\"isleaf\":\"1\",\"children\":null},{\"id\":\"1-1-2\",\"name\":\"JavaScript\",\"label\":\"JavaScript\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-1-2\",\"isleaf\":\"1\",\"children\":null},{\"id\":\"1-1-3\",\"name\":\"jQuery\",\"label\":\"jQuery\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-1-3\",\"isleaf\":\"1\",\"children\":null}]},{\"id\":\"1-2\",\"name\":\"移动开发\",\"label\":\"移动开发\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-2\",\"isleaf\":\"0\",\"children\":[{\"id\":\"1-2-1\",\"name\":\"微信开发\",\"label\":\"微信开发\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-2-1\",\"isleaf\":\"1\",\"children\":null},{\"id\":\"1-2-2\",\"name\":\"iOS\",\"label\":\"iOS\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-2-2\",\"isleaf\":\"1\",\"children\":null}]},{\"id\":\"1-3\",\"name\":\"编程开发\",\"label\":\"编程开发\",\"parentid\":null,\"isshow\":\"1\",\"orderby\":\"1-3\",\"isleaf\":\"0\",\"children\":[]}]}],\"name\":null,\"orderby\":null,\"id\":null,\"label\":null,\"isleaf\":null,\"parentid\":null}"},{"key":"course2","name":"精品课程2","value":"10101"},{"key":"course3","name":"精品课程3d","value":"10101"},{"key":"course4","name":"精品课程4","value":"10101"},{"key":"course5","name":"精品课程5","value":"10101"},{"key":"course6","name":"精品课程6","value":"10101"}]},"headers":{"Content-Type":["application/json;charset=UTF-8"],"Date":["Sun, 06 Sep 2020 12:53:54 GMT"],"Transfer-Encoding":["chunked"]},"statusCode":"OK","statusCodeValue":200}*/

    }
}
