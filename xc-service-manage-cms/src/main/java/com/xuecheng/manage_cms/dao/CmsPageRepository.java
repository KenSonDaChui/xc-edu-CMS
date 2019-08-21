package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created By Kenson on 2019/8/17.
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
