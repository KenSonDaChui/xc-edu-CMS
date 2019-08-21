package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * Created By Kenson on 2019/8/17.
 */
public interface CmsPageControllerApi {

    //查询通用接口
    public QueryResponseResult findlist(int site ,int page ,QueryPageRequest queryPageRequest);
}
