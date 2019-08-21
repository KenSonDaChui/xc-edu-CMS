package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

/**
 * Created By Kenson on 2019/8/17.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testfindAll() {
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println("==================执行了==============");
        System.out.println(all);
    }

    @Test
    public void testfindAll2() {
        //自定义条件查询测试@Test
        //条件匹配器
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        exampleMatcher = exampleMatcher.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        //页面别名模糊查询，需要自定义字符串的匹配器实现模糊查询
        //ExampleMatcher.GenericPropertyMatchers.contains() 包 含
        //ExampleMatcher.GenericPropertyMatchers.startsWith()//开头匹配条件值
        CmsPage cmsPage = new CmsPage();
        // 站 点 ID cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");
        //模板ID
//        cmsPage.setTemplateId(null);
        //	cmsPage.setPageAliase("分类导航");
        //创建条件实例
        Example<CmsPage> example = Example.of(cmsPage, exampleMatcher);
        Pageable pageable = new PageRequest(0, 10);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        System.out.println("---------------输出数据----------------");
        System.out.println(all.getContent());
    }

}