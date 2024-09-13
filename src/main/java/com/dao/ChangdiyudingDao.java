package com.dao;

import com.entity.ChangdiyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangdiyudingVO;
import com.entity.view.ChangdiyudingView;


/**
 * 场地预订
 * 
 * @author 
 * @email 
 * @date 2024-02-19 17:35:12
 */
public interface ChangdiyudingDao extends BaseMapper<ChangdiyudingEntity> {
	
	List<ChangdiyudingVO> selectListVO(@Param("ew") Wrapper<ChangdiyudingEntity> wrapper);
	
	ChangdiyudingVO selectVO(@Param("ew") Wrapper<ChangdiyudingEntity> wrapper);
	
	List<ChangdiyudingView> selectListView(@Param("ew") Wrapper<ChangdiyudingEntity> wrapper);

	List<ChangdiyudingView> selectListView(Pagination page,@Param("ew") Wrapper<ChangdiyudingEntity> wrapper);

	
	ChangdiyudingView selectView(@Param("ew") Wrapper<ChangdiyudingEntity> wrapper);
	

}
