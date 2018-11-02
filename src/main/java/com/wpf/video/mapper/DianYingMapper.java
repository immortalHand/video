package com.wpf.video.mapper;

import com.wpf.video.pojo.Dianying;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DianYingMapper {

    @Select("SELECT * FROM dianying WHERE TIME != 'null' ORDER BY TIME DESC")
    List<Dianying> findDianYings();

    @Select("select * from dianying where id = #{id}")
    Dianying findDianYingById(String id);

    @Select("SELECT * FROM dianying WHERE title LIKE '%#{title}%'")
    List<Dianying> findDianYingByTitle(String title);
}