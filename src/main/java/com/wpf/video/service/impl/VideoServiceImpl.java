package com.wpf.video.service.impl;

import com.github.pagehelper.PageHelper;
import com.wpf.video.mapper.DianyingMapper;
import com.wpf.video.pojo.Dianying;
import com.wpf.video.pojo.DianyingExample;
import com.wpf.video.service.VideoService;
import com.wpf.video.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private DianyingMapper dianyingMapper;

    @Override
    public List<Dianying> selectAll(PageUtil pageUtil) {
        //DianyingExample dianyingExample = new DianyingExample();
        PageHelper.startPage(pageUtil.getPage()-1,pageUtil.getList());
        //return dianyingMapper.selectByExample(dianyingExample);
        return dianyingMapper.findDianying();
    }
}
