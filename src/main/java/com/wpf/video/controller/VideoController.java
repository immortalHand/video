package com.wpf.video.controller;

import com.wpf.video.pojo.Dianying;
import com.wpf.video.pojo.ResultVo;
import com.wpf.video.pojo.Video;
import com.wpf.video.service.DianYingService;
import com.wpf.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @Autowired
    private DianYingService dianYingService;

    @PostMapping("/findVideoById")
    public ResultVo findVideoById(String id, Model model){
        List<Video> videos = videoService.findVideoById(id);
        Dianying dianying = dianYingService.findDianYingById(id);

        model.addAttribute("videos",videos);
        model.addAttribute("dianying",dianying);

        if(videos != null){
            return ResultVo.ok("通过id查询视频成功",model);
        }else{
            return ResultVo.error("通过id查询视频失败");
        }
    }
}
