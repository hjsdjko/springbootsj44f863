package com.entity.vo;

import com.entity.YuyuejiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 预约教练
 * @author 
 * @email 
 * @date 2024-02-19 17:35:11
 */
public class YuyuejiaolianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教练工号
	 */
	
	private String jiaoliangonghao;
		
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 健身课程
	 */
	
	private String jianshenkecheng;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
			
}
