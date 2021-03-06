package org.openea.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.openea.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
