package com.zxl.mapper;

import com.zxl.pojo.TPdFinanceProductContract;
import com.zxl.pojo.TPdFinanceProductContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPdFinanceProductContractMapper {
    int countByExample(TPdFinanceProductContractExample example);

    int deleteByExample(TPdFinanceProductContractExample example);

    int deleteByPrimaryKey(Long pkIId);

    int insert(TPdFinanceProductContract record);

    int insertSelective(TPdFinanceProductContract record);

    List<TPdFinanceProductContract> selectByExample(TPdFinanceProductContractExample example);

    TPdFinanceProductContract selectByPrimaryKey(Long pkIId);

    int updateByExampleSelective(@Param("record") TPdFinanceProductContract record, @Param("example") TPdFinanceProductContractExample example);

    int updateByExample(@Param("record") TPdFinanceProductContract record, @Param("example") TPdFinanceProductContractExample example);

    int updateByPrimaryKeySelective(TPdFinanceProductContract record);

    int updateByPrimaryKey(TPdFinanceProductContract record);
}