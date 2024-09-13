package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健身场地
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-19 17:35:12
 */
@TableName("jianshenchangdi")
public class JianshenchangdiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianshenchangdiEntity() {
		
	}
	
	public JianshenchangdiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 场地名称
	 */
					
	private String changdimingcheng;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	/**
	 * 可约时间
	 */
					
	private String keyueshijian;
	
	/**
	 * 场地图片
	 */
					
	private String changditupian;
	
	/**
	 * 场地大小
	 */
					
	private String changdidaxiao;
	
	/**
	 * 场地用途
	 */
					
	private String changdiyongtu;
	
	/**
	 * 场地详情
	 */
					
	private String changdixiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：场地名称
	 */
	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng = changdimingcheng;
	}
	/**
	 * 获取：场地名称
	 */
	public String getChangdimingcheng() {
		return changdimingcheng;
	}
	/**
	 * 设置：位置
	 */
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
	/**
	 * 设置：可约时间
	 */
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
	/**
	 * 设置：场地图片
	 */
	public void setChangditupian(String changditupian) {
		this.changditupian = changditupian;
	}
	/**
	 * 获取：场地图片
	 */
	public String getChangditupian() {
		return changditupian;
	}
	/**
	 * 设置：场地大小
	 */
	public void setChangdidaxiao(String changdidaxiao) {
		this.changdidaxiao = changdidaxiao;
	}
	/**
	 * 获取：场地大小
	 */
	public String getChangdidaxiao() {
		return changdidaxiao;
	}
	/**
	 * 设置：场地用途
	 */
	public void setChangdiyongtu(String changdiyongtu) {
		this.changdiyongtu = changdiyongtu;
	}
	/**
	 * 获取：场地用途
	 */
	public String getChangdiyongtu() {
		return changdiyongtu;
	}
	/**
	 * 设置：场地详情
	 */
	public void setChangdixiangqing(String changdixiangqing) {
		this.changdixiangqing = changdixiangqing;
	}
	/**
	 * 获取：场地详情
	 */
	public String getChangdixiangqing() {
		return changdixiangqing;
	}

}
