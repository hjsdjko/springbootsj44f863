package com.entity.vo;

import com.entity.KechengdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程订单
 * @author 
 * @email 
 * @date 2024-02-19 17:35:11
 */
public class KechengdingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 健身课程
	 */
	
	private String jianshenkecheng;
		
	/**
	 * 教练工号
	 */
	
	private String jiaoliangonghao;
		
	/**
	 * 教练姓名
	 */
	
	private String jiaolianxingming;
		
	/**
	 * 上课地点
	 */
	
	private String shangkedidian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 课时
	 */
	
	private String keshi;
		
	/**
	 * 课程费用
	 */
	
	private Double kechengfeiyong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 购买时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumaishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：上课地点
	 */
	 
	public void setShangkedidian(String shangkedidian) {
		this.shangkedidian = shangkedidian;
	}
	
	/**
	 * 获取：上课地点
	 */
	public String getShangkedidian() {
		return shangkedidian;
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
	 * 设置：课时
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：课时
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：课程费用
	 */
	 
	public void setKechengfeiyong(Double kechengfeiyong) {
		this.kechengfeiyong = kechengfeiyong;
	}
	
	/**
	 * 获取：课程费用
	 */
	public Double getKechengfeiyong() {
		return kechengfeiyong;
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
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：购买时间
	 */
	 
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
