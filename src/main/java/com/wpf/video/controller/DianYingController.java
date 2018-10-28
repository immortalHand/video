package com.wpf.video.controller;

import com.github.pagehelper.PageInfo;
import com.wpf.video.pojo.Dianying;
import com.wpf.video.pojo.Result;
import com.wpf.video.service.VideoService;
import com.wpf.video.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DianYingController {

    @Autowired
    private VideoService videoService;

    @PostMapping("videos")
    public Result videos(PageUtil pageUtil){
        List<Dianying> dianyings= videoService.selectAll(pageUtil);
        pageUtil.setInfos(dianyings);
        pageUtil.setPages(new PageInfo(dianyings).getPages());
        return new Result(true,pageUtil);
    }
}