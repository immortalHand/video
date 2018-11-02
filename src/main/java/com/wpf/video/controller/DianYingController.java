package com.wpf.video.controller;

import com.github.pagehelper.PageInfo;
import com.wpf.video.pojo.Dianying;
import com.wpf.video.pojo.ResultVo;
import com.wpf.video.service.DianYingService;
import com.wpf.video.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dianying")
public class DianYingController {

    @Autowired
    private DianYingService dianYingService;

    @PostMapping("/dianyings")
    public ResultVo dianyings(PageUtil pageUtil){
        List<Dianying> dianyings= dianYingService.selectAll(pageUtil);
        pageUtil.setInfos(dianyings);
        pageUtil.setPages(new PageInfo(dianyings).getPages());
        return ResultVo.ok("查询视频",pageUtil);
    }

    @PostMapping("/getDianyingAreas")
    public ResultVo getDianyingAreas(){
        return ResultVo.ok("");
    }

    @PostMapping("/findDianyingByTitle")
    public ResultVo findDianYingByTitle(String title){
        List<Dianying> list = dianYingService.findDianYingByTitle(title);
        return ResultVo.ok("模糊查询电影",list);
    }
}
