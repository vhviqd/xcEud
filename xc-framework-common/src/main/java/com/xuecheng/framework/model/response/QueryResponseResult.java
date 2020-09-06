package com.xuecheng.framework.model.response;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 公共的响应
 * @Author: zzq
 * @CreateDate: 2020/9/6
 */
@Data
@ToString
public class QueryResponseResult<T> extends ResponseResult {

    QueryResult<T> queryResult;

    public QueryResponseResult(ResultCode resultCode, QueryResult queryResult) {
        super(resultCode);
        this.queryResult = queryResult;
    }

}
