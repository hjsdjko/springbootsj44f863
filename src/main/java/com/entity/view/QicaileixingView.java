package com.entity.view;

import com.entity.QicaileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 器材类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-19 17:35:11
 */
@TableName("qicaileixing")
public class QicaileixingView  extends QicaileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicaileixingView(){
	}
 
 	public QicaileixingView(QicaileixingEntity qicaileixingEntity){
 	try {
			BeanUtils.copyProperties(this, qicaileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
