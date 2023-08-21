package com.zlht.pbr.algorithm.developer.api.remote.service;


import com.zlht.pbr.algorithm.developer.model.Review;
import com.zlht.pbr.algorithm.developer.utils.PageInfo;
import com.zlht.pbr.algorithm.developer.utils.Result;
import org.springframework.util.MultiValueMap;

import java.util.Map;

public interface ReviewServicesI {



    /**
     * 开发者提交审核
     *
     * @param userId
     * @param review
     * @return
     */
    Map<String, Object> commitReview(int userId, Review review, MultiValueMap<String, String> values);



    /**
     * 开发者获取提交的审核
     *
     * @param loginUser
     * @return
     */

    Result<PageInfo> queryReviewList(int userId, int currentPage, int pageSize, String keyword);



}