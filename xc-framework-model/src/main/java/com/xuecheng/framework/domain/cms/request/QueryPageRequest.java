package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

/**
 * Created By Kenson on 2019/8/17.
 */

//前端请求通用类

@Data
public class QueryPageRequest {

    //站点id
    private String siteId;
    //页面id
    private String pageId;
    //页面名称
    private String pageName;
    //页面别名
    private String pageAliace;
    //模板id
    private String templateId;


}
