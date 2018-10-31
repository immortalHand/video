package com.wpf.video.mapper;

import com.wpf.video.pojo.Video;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoMapper {

    @Select("select * from video where id = #{id}")
    List<Video> findVideoById(String id);
}