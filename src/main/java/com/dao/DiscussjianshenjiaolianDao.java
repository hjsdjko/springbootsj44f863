package com.dao;

import com.entity.DiscussjianshenjiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenjiaolianVO;
import com.entity.view.DiscussjianshenjiaolianView;


/**
 * 健身教练评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-19 17:35:13
 */
public interface DiscussjianshenjiaolianDao extends BaseMapper<DiscussjianshenjiaolianEntity> {
	
	List<DiscussjianshenjiaolianVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenjiaolianEntity> wrapper);
	
	DiscussjianshenjiaolianVO selectVO(@Param("ew") Wrapper<DiscussjianshenjiaolianEntity> wrapper);
	
	List<DiscussjianshenjiaolianView> selectListView(@Param("ew") Wrapper<DiscussjianshenjiaolianEntity> wrapper);

	List<DiscussjianshenjiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenjiaolianEntity> wrapper);

	
	DiscussjianshenjiaolianView selectView(@Param("ew") Wrapper<DiscussjianshenjiaolianEntity> wrapper);
	

}
