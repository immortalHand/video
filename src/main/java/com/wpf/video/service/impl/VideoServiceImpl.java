package com.wpf.video.service.impl;

import com.wpf.video.mapper.VideoMapper;
import com.wpf.video.pojo.Video;
import com.wpf.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findVideoById(String id) {
        return videoMapper.findVideoById(id);
    }
}
