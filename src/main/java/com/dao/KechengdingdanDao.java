package com.dao;

import com.entity.KechengdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengdingdanVO;
import com.entity.view.KechengdingdanView;


/**
 * 课程订单
 * 
 * @author 
 * @email 
 * @date 2024-02-19 17:35:11
 */
public interface KechengdingdanDao extends BaseMapper<KechengdingdanEntity> {
	
	List<KechengdingdanVO> selectListVO(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	
	KechengdingdanVO selectVO(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	
	List<KechengdingdanView> selectListView(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);

	List<KechengdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<KechengdingdanEntity> wrapper);

	
	KechengdingdanView selectView(@Param("ew") Wrapper<KechengdingdanEntity> wrapper);
	

}
