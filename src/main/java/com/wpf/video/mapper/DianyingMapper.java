package com.wpf.video.mapper;

import com.wpf.video.pojo.Dianying;
import com.wpf.video.pojo.DianyingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface DianyingMapper {
    int countByExample(DianyingExample example);

    int deleteByExample(DianyingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dianying record);

    int insertSelective(Dianying record);

    List<Dianying> selectByExampleWithBLOBs(DianyingExample example);

    List<Dianying> selectByExample(DianyingExample example);

    Dianying selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dianying record, @Param("example") DianyingExample example);

    int updateByExampleWithBLOBs(@Param("record") Dianying record, @Param("example") DianyingExample example);

    int updateByExample(@Param("record") Dianying record, @Param("example") DianyingExample example);

    int updateByPrimaryKeySelective(Dianying record);

    int updateByPrimaryKeyWithBLOBs(Dianying record);

    @Select("select * from dianying")
    List<Dianying> findDianying();
}