package com.bdfint.backend.modules.sys.mapper;

import com.bdfint.backend.framework.common.CommonMapper;
import com.bdfint.backend.modules.sys.bean.Office;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Repository
public interface OfficeMapper extends CommonMapper<Office> {

    void deleteRoleOfficeByOfficeIds(@Param("array") String [] ids);

    List<Office> getOfficeByUserId(String userId);
}
