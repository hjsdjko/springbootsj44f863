package com.dao;

import com.entity.JianshenchangdiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenchangdiVO;
import com.entity.view.JianshenchangdiView;


/**
 * 健身场地
 * 
 * @author 
 * @email 
 * @date 2024-02-19 17:35:12
 */
public interface JianshenchangdiDao extends BaseMapper<JianshenchangdiEntity> {
	
	List<JianshenchangdiVO> selectListVO(@Param("ew") Wrapper<JianshenchangdiEntity> wrapper);
	
	JianshenchangdiVO selectVO(@Param("ew") Wrapper<JianshenchangdiEntity> wrapper);
	
	List<JianshenchangdiView> selectListView(@Param("ew") Wrapper<JianshenchangdiEntity> wrapper);

	List<JianshenchangdiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenchangdiEntity> wrapper);

	
	JianshenchangdiView selectView(@Param("ew") Wrapper<JianshenchangdiEntity> wrapper);
	

}
