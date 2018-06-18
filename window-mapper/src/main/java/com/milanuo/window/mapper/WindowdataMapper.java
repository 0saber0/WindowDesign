package com.milanuo.window.mapper;

import com.milanuo.window.pojo.Windowdata;
import com.milanuo.window.pojo.WindowdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WindowdataMapper {
    int countByExample(WindowdataExample example);

    int deleteByExample(WindowdataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Windowdata record);

    int insertSelective(Windowdata record);

    List<Windowdata> selectByExample(WindowdataExample example);

    Windowdata selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Windowdata record, @Param("example") WindowdataExample example);

    int updateByExample(@Param("record") Windowdata record, @Param("example") WindowdataExample example);

    int updateByPrimaryKeySelective(Windowdata record);

    int updateByPrimaryKey(Windowdata record);
}