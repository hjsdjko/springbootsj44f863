package com.entity.vo;

import com.entity.JianshenshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健身视频
 * @author 
 * @email 
 * @date 2024-02-19 17:35:12
 */
public class JianshenshipinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
