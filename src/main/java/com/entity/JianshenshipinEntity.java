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
 * 健身视频
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-19 17:35:12
 */
@TableName("jianshenshipin")
public class JianshenshipinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianshenshipinEntity() {
		
	}
	
	public JianshenshipinEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 健身课程
	 */
					
	private String jianshenkecheng;
	
	/**
	 * 健身目标
	 */
					
	private String jianshenmubiao;
	
	/**
	 * 难度
	 */
					
	private String nandu;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 教练工号
	 */
					
	private String jiaoliangonghao;
	
	/**
	 * 教练姓名
	 */
					
	private String jiaolianxingming;
	
	/**
	 * 教学视频
	 */
					
	private String jiaoxueshipin;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 基本介绍
	 */
					
	private String jibenjieshao;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：健身课程
	 */
	public void setJianshenkecheng(String jianshenkecheng) {
		this.jianshenkecheng = jianshenkecheng;
	}
	/**
	 * 获取：健身课程
	 */
	public String getJianshenkecheng() {
		return jianshenkecheng;
	}
	/**
	 * 设置：健身目标
	 */
	public void setJianshenmubiao(String jianshenmubiao) {
		this.jianshenmubiao = jianshenmubiao;
	}
	/**
	 * 获取：健身目标
	 */
	public String getJianshenmubiao() {
		return jianshenmubiao;
	}
	/**
	 * 设置：难度
	 */
	public void setNandu(String nandu) {
		this.nandu = nandu;
	}
	/**
	 * 获取：难度
	 */
	public String getNandu() {
		return nandu;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：教练工号
	 */
	public void setJiaoliangonghao(String jiaoliangonghao) {
		this.jiaoliangonghao = jiaoliangonghao;
	}
	/**
	 * 获取：教练工号
	 */
	public String getJiaoliangonghao() {
		return jiaoliangonghao;
	}
	/**
	 * 设置：教练姓名
	 */
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
	/**
	 * 设置：教学视频
	 */
	public void setJiaoxueshipin(String jiaoxueshipin) {
		this.jiaoxueshipin = jiaoxueshipin;
	}
	/**
	 * 获取：教学视频
	 */
	public String getJiaoxueshipin() {
		return jiaoxueshipin;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：基本介绍
	 */
	public void setJibenjieshao(String jibenjieshao) {
		this.jibenjieshao = jibenjieshao;
	}
	/**
	 * 获取：基本介绍
	 */
	public String getJibenjieshao() {
		return jibenjieshao;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
