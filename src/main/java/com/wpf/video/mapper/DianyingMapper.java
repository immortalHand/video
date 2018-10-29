package com.wpf.video.mapper;

import com.wpf.video.pojo.Dianying;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DianyingMapper {

    @Select("select * from dianying")
    List<Dianying> findDianying();

}