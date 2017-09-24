/*
 * Copyright (c) 2017. <a href="http://www.lufengc.com">lufengc</a> All rights reserved.
 */
package com.bdfint.backend.modules.sys.service;


import com.bdfint.backend.framework.common.BaseService;
import com.bdfint.backend.modules.sys.bean.TArea;

/**
 * 区域Service
 *
 * @author fengcheng
 * @version 2016/7/28
 */
public interface TAreaService extends BaseService<TArea> {

    void updateData() throws Exception;
}
