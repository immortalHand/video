package com.wpf.video.service;

import com.wpf.video.pojo.Dianying;
import com.wpf.video.util.PageUtil;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VideoService {


    /**
     * 查询所有电影
     * @return
     */
    List<Dianying> selectAll(PageUtil pageUtil);
}
