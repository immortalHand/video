package com.wpf.video.service;

import com.wpf.video.pojo.Dianying;
import com.wpf.video.util.PageUtil;

import java.util.List;

public interface DianYingService {


    /**
     * 查询所有电影
     * @return
     */
    List<Dianying> selectAll(PageUtil pageUtil);

    /**
     * 通过ID查询电影
     * @param id
     * @return
     */
    Dianying findDianYingById(String id);
}
