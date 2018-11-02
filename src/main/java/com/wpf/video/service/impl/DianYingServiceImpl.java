package com.wpf.video.service.impl;

import com.github.pagehelper.PageHelper;
import com.wpf.video.mapper.DianYingMapper;
import com.wpf.video.pojo.Dianying;
import com.wpf.video.service.DianYingService;
import com.wpf.video.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DianYingServiceImpl implements DianYingService {

    @Autowired
    private DianYingMapper dianyingMapper;

    @Override
    public List<Dianying> selectAll(PageUtil pageUtil) {
        //DianyingExample dianyingExample = new DianyingExample();
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getList());
        //return dianyingMapper.selectByExample(dianyingExample);
        return dianyingMapper.findDianYings();
    }

    @Override
    public Dianying findDianYingById(String id) {
        return dianyingMapper.findDianYingById(id);
    }

    @Override
    public List<Dianying> findDianYingByTitle(String title) {
        return dianyingMapper.findDianYingByTitle(title);
    }
}
