package com.wpf.video.service;

import com.wpf.video.pojo.Video;

import java.util.List;

public interface VideoService {

    /**
     * 通过ID查询播放视频
     * @param id
     * @return
     */
    List<Video> findVideoById(String id);
}
