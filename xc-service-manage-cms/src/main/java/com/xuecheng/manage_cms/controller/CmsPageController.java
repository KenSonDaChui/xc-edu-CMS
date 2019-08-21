package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * Created By Kenson on 2019/8/17.
 */

@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {



    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findlist(@PathVariable("page") int page,@PathVariable("size") int size, QueryPageRequest queryPageRequest) {

        QueryResult queryResult = new QueryResult();
        queryResult.setTotal(10L);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("wangdachu");
        queryResult.setList(objects);
        QueryResponseResult result = new QueryResponseResult(CommonCode.SUCCESS,queryResult);
        System.out.println("---------------------------");
        return result;
    }
}
