package com.entity.view;

import com.entity.DiscussjianshenjiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 健身教练评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-19 17:35:13
 */
@TableName("discussjianshenjiaolian")
public class DiscussjianshenjiaolianView  extends DiscussjianshenjiaolianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenjiaolianView(){
	}
 
 	public DiscussjianshenjiaolianView(DiscussjianshenjiaolianEntity discussjianshenjiaolianEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenjiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}