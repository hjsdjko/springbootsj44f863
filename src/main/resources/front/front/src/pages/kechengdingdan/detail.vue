<template>
<div>
	<div :style='{"padding":"20px 20px 20px 15%","margin":"10px auto 0","borderRadius":"27px","background":"url(http://codegen.caihongy.cn/20240120/d40775f482fb4eaa8a715212bf1ab10f.png)","width":"80%","backgroundSize":"100% 100%","backgroundRepeat":"no-repeat"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'Ξ'" :style='{"fontSize":"14px","lineHeight":"1"}'>
			<el-breadcrumb-item class="item1" to="/"><a>首页</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item2" v-for="(item, index) in breadcrumbItem" :key="index" to="/index/kechengdingdan"><a>{{item.name}}</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item3"><a href="javascript:void(0);">详情</a></el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	<div :style='{"padding":"20px 20px 20px 15%","margin":"10px auto 0","borderRadius":"27px","background":"url(http://codegen.caihongy.cn/20240120/d40775f482fb4eaa8a715212bf1ab10f.png)","width":"80%","backgroundSize":"100% 100%","backgroundRepeat":"no-repeat"}'>
		<el-button size="mini" @click="backClick">返回</el-button>
	</div>
	<div class="detail-preview" :style='{"padding":"30px 22px","margin":"10px auto","flexWrap":"wrap","background":"#fff","display":"flex","width":"60%","position":"relative"}'>
		<div class="attr" :style='{"minHeight":"75px","padding":"0","background":"none","display":"flex","width":"55%","position":"relative","order":"2"}'>

			<div class="info" :style='{"padding":"10px","margin":"0 0 0 0","background":"#fff","flex":"1"}'>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","alignItems":"center","background":"none","justifyContent":"space-between","display":"flex"}'>
					<div :style='{"color":"#000","fontSize":"18px","fontWeight":"bold"}'>
                    {{detail.jianshenkecheng}}
                    </div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>课程编号</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.kechengbianhao}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>教练工号</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.jiaoliangonghao}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>教练姓名</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.jiaolianxingming}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>上课地点</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.shangkedidian}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>课时</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.keshi}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>课程费用</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.kechengfeiyong}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>用户名</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.yonghuming}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>姓名</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.xingming}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>手机号</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.shoujihao}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>购买时间</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.goumaishijian}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}' v-if="centerType">
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#9e9e9e","textAlign":"right"}'>是否支付</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#3B2626","flex":"1"}'>{{detail.ispay=='已支付'?'已支付':'未支付'}}</div>
				</div>
				<div class="btn" :style='{"padding":"10px 0","flexWrap":"wrap","display":"flex"}'>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 auto 10px","outline":"none","color":"#fff","borderRadius":"10px","background":"#3554A4","width":"40%","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="btnAuth('kechengdingdan','修改')" @click="editClick">修改</el-button>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 auto 10px","outline":"none","color":"#000","borderRadius":"10px","background":"#FFC174","width":"40%","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="btnAuth('kechengdingdan','删除')" @click="delClick">删除</el-button>
					<!-- hasChat 无 -->
					<el-button v-if="centerType&&(detail.ispay=='未支付'||!detail.ispay)&&btnAuth('kechengdingdan','支付')" :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 auto 10px","outline":"none","color":"#fff","borderRadius":"10px","background":"#3554A4","width":"40%","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="warning" size="small" @click="payClick">支付</el-button>
				</div>
			</div>
		</div>
		
			<el-carousel v-if="detailBanner.length" :style='{"width":"45%","padding":"0 0 55px","margin":"0","height":"755px","order":"1"}' trigger="click" indicator-position="inside" arrow="always" type="default" direction="horizontal" height="700px" :autoplay="false" :interval="3000" :loop="true">
				<el-carousel-item :style='{"borderRadius":"10px","width":"100%","height":"100%"}' v-for="item in detailBanner" :key="item.id">
					<img :style='{"objectFit":"cover","width":"100%","height":"100%"}' :preview-src-list="[item]" v-if="item.substr(0,4)=='http'" :src="item" class="image">
					<img :style='{"objectFit":"cover","width":"100%","height":"100%"}' :preview-src-list="[baseUrl + item]" v-else :src="baseUrl + item" class="image">
				</el-carousel-item>
			</el-carousel>

			<div class="zancai" :style='{"padding":"0","margin":"0","top":"735px","left":"18px","background":"#fff","display":"flex","width":"44%","position":"absolute","zIndex":"9"}'>
				<div :style='{"padding":"0","margin":"0 2px","alignItems":"center","background":"#FE6917","display":"flex","width":"100%","justifyContent":"center","height":"50px"}' v-if="!isThumbsupnum && !isCrazilynum" class="zan" @click="thumbsupOrCrazily(21)">
					<i :style='{"color":"#fff","margin":"0 5px 0 0","fontSize":"16px"}' class="iconfont icon-dianzan"></i>
					<span :style='{"color":"#fff","margin":"0 3px","fontSize":"16px"}'>赞一下({{detail.thumbsupnum}})</span>
				</div>
				<div :style='{"padding":"0","margin":"0 2px","alignItems":"center","background":"#FE6917","display":"flex","width":"100%","justifyContent":"center","height":"50px"}' v-if="!isThumbsupnum && !isCrazilynum" class="cai" @click="thumbsupOrCrazily(22)">
					<i :style='{"color":"#fff","margin":"0 5px 0 0","fontSize":"16px"}' class="iconfont icon-iconfontzan"></i>
					<span :style='{"color":"#fff","margin":"0 3px","fontSize":"16px"}'>踩一下({{detail.crazilynum}})</span>
				</div>
				<div :style='{"padding":"0","margin":"0 2px","alignItems":"center","background":"#FE6917","display":"flex","width":"100%","justifyContent":"center","height":"50px"}' v-if="isThumbsupnum" class="zan" @click="cancelThumbsupOrCrazily(21)">
					<i :style='{"color":"#fff","margin":"0 5px 0 0","fontSize":"16px"}' class="iconfont icon-dianzan"></i>
					<span :style='{"color":"#fff","margin":"0 3px","fontSize":"16px"}'>取消赞({{detail.thumbsupnum}})</span>
				</div>
				<div :style='{"padding":"0","margin":"0 2px","alignItems":"center","background":"#FE6917","display":"flex","width":"100%","justifyContent":"center","height":"50px"}' v-if="isCrazilynum" class="cai" @click="cancelThumbsupOrCrazily(22)">
					<i :style='{"color":"#fff","margin":"0 5px 0 0","fontSize":"16px"}' class="iconfont icon-iconfontzan"></i>
					<span :style='{"color":"#fff","margin":"0 3px","fontSize":"16px"}'>取消踩({{detail.crazilynum}})</span>
				</div>
			</div>

		

		
		<el-tabs class="detail" :style='{"border":"0","width":"100%","boxShadow":"none","background":"#F7F5F7","order":"4"}' v-model="activeName" type="border-card">
																	</el-tabs>
	</div>
	<div class="share_view" :style='{"boxShadow":"0 1px 6px rgba(53, 84, 164, .3)","borderRadius":"0 10px 10px 0","left":"0","bottom":"20%","background":"#fff","position":"fixed","zIndex":"11"}'>
	</div>
	<el-dialog title="支付" :visible.sync="payVisible" width="30%" :before-close="offerClose">
		<img src="@/assets/QRcode.png" style="width: 100%"></img>
		<div>
			<el-button type="primary" style="margin-left: 10px;" @click="paySave">确认支付</el-button>
			<el-button type="danger" style="margin-left: 10px;" @click="payVisible=false">取消</el-button>
		</div>
	</el-dialog>
</div>
</template>

<script>
  import CountDown from '@/components/CountDown';
  import axios from 'axios'
  import Swiper from "swiper";
  
  export default {
    //数据集合
    data() {
      return {
        tablename: 'kechengdingdan',
        baseUrl: '',
        breadcrumbItem: [
          {
            name: '课程订单'
          }
        ],
        title: '',
        detailBanner: [],
		id: 0,
        detail: {},
        activeName: 'first',
        total: 1,
        pageSize: 5,
		pageSizes: [10,20,30,50],
        totalPage: 1,
        storeupParams: {
          name: '',
          picture: '',
          refid: 0,
          tablename: 'kechengdingdan',
          userid: localStorage.getItem('frontUserid')
        },
        isCrazilynum: false,
        isThumbsupnum: false,
        thumbsupOrCrazilyInfo: {},
        buynumber: 1,
		centerType: false,
		shareUrl: location.href,
		payVisible: false,
      }
    },
    created() {
		if(this.$route.query.centerType) {
			this.centerType = true
		}
		
        this.init();
    },
	mounted() {
	},
    //方法集合
    methods: {
        init() {
		  this.id = this.$route.query.id
          this.baseUrl = this.$config.baseUrl;
          this.$http.get(this.tablename + '/detail/'  + this.id, {}).then(res => {
            if (res.data.code == 0) {
              this.detail = res.data.data;
              this.title = this.detail.jianshenkecheng;
              this.detailBanner = this.detail.fengmian ? this.detail.fengmian.split(",") : [];
              this.$forceUpdate();

				if(localStorage.getItem('frontToken')){
					this.getThumbsupOrCrazilyStatus();
				}

            }
          });
        },
      thumbsupOrCrazily(type) {
        this.storeupParams.name = this.title;
        this.storeupParams.picture = this.detailBanner[0];
        this.storeupParams.refid = this.detail.id;
        this.storeupParams.type = type;
        this.$http.post('storeup/add', this.storeupParams).then(res => {
          if (res.data.code == 0) {
            this.getThumbsupOrCrazilyStatus();
            this.$message({
              type: 'success',
              message: '操作成功!',
              duration: 1500,
            });
          }
        });

        if (type == 21) this.detail.thumbsupnum = Number(this.detail.thumbsupnum) + 1;
        if (type == 22) this.detail.crazilynum = Number(this.detail.crazilynum) + 1;
        this.$http.post('kechengdingdan/update', this.detail).then(res => {});
      },
      cancelThumbsupOrCrazily(type) {
        let delIds = new Array();
        delIds.push(this.thumbsupOrCrazilyInfo.id);
        this.$http.post('storeup/delete', delIds).then(res => {
          if (res.data.code == 0) {
            this.isThumbsupnum = false;
            this.isCrazilynum = false;
            this.$message({
              type: 'success',
              message: '取消成功!',
              duration: 1500,
            });
          }
        });

        if (type == 21) this.detail.thumbsupnum -= 1;
        if (type == 22) this.detail.crazilynum -= 1;
        this.$http.post('kechengdingdan/update', this.detail).then(res => {});
      },
    getThumbsupOrCrazilyStatus() {
        if(localStorage.getItem("frontToken")) {
            this.$http.get('storeup/list', {params: {page: 1, limit: 1, type: 21, refid: this.detail.id, tablename: 'kechengdingdan', userid: localStorage.getItem('frontUserid')}}).then(res => {
              if (res.data.code == 0 && res.data.data.list.length > 0) {
                this.isThumbsupnum = true;
                this.thumbsupOrCrazilyInfo = res.data.data.list[0];
              }
            });

            this.$http.get('storeup/list', {params: {page: 1, limit: 1, type: 22, refid: this.detail.id, tablename: 'kechengdingdan', userid: localStorage.getItem('frontUserid')}}).then(res => {
              if (res.data.code == 0 && res.data.data.list.length > 0) {
                this.isCrazilynum = true;
                this.thumbsupOrCrazilyInfo = res.data.data.list[0];
              }
            });
        }
    },
		payClick(){
			this.payVisible = true
		},
		paySave(){
			this.detail.ispay='已支付'
			this.$http.post('kechengdingdan/update',this.detail).then(res=>{})
			this.$message.success('支付成功')
			this.payVisible = false
		},
      curChange(page) {
        this.getDiscussList(page);
      },
      prevClick(page) {
        this.getDiscussList(page);
      },
      nextClick(page) {
        this.getDiscussList(page);
      },
		// 返回按钮
		backClick(){
			history.back()
		},
		// 下载
		download(file){
			if(!file) {
				this.$message({
				  type: 'error',
				  message: '文件不存在',
				  duration: 1500,
				});
				return;
			}
		  let arr = file.replace(new RegExp('upload/', "g"), "")
		  axios.get(this.baseUrl + '/file/download?fileName=' + arr, {
		  	headers: {
		  		token: localStorage.getItem("frontToken")
		  	},
		  	responseType: "blob"
		  }).then(({
		  	data
		  }) => {
		  	const binaryData = [];
		  	binaryData.push(data);
		  	const objectUrl = window.URL.createObjectURL(new Blob(binaryData, {
		  		type: 'application/pdf;chartset=UTF-8'
		  	}))
		  	const a = document.createElement('a')
		  	a.href = objectUrl
		  	a.download = arr
		  	// a.click()
		  	// 下面这个写法兼容火狐
		  	a.dispatchEvent(new MouseEvent('click', {
		  		bubbles: true,
		  		cancelable: true,
		  		view: window
		  	}))
		  	window.URL.revokeObjectURL(data)
		  },err=>{
			  axios.get((location.href.split(this.$config.name).length>1 ? location.href.split(this.$config.name)[0] :'') + this.$config.name + '/file/download?fileName=' + arr, {
			  	headers: {
			  		token: localStorage.getItem("frontToken")
			  	},
			  	responseType: "blob"
			  }).then(({
			  	data
			  }) => {
			  	const binaryData = [];
			  	binaryData.push(data);
			  	const objectUrl = window.URL.createObjectURL(new Blob(binaryData, {
			  		type: 'application/pdf;chartset=UTF-8'
			  	}))
			  	const a = document.createElement('a')
			  	a.href = objectUrl
			  	a.download = arr
			  	// a.click()
			  	// 下面这个写法兼容火狐
			  	a.dispatchEvent(new MouseEvent('click', {
			  		bubbles: true,
			  		cancelable: true,
			  		view: window
			  	}))
			  	window.URL.revokeObjectURL(data)
			  })
		  })
      },


		// 权限判断
		btnAuth(tableName,key){
			if(this.centerType){
				return this.isBackAuth(tableName,key)
			}else{
				return this.isAuth(tableName,key)
			}
		},
		// 修改
		editClick(){
			this.$router.push(`/index/kechengdingdanAdd?type=edit&&id=${this.detail.id}`);
		},
		// 删除
		delClick(){
			this.$confirm('是否删除此课程订单？')
			  .then(_ => {
			    this.$http.post('kechengdingdan/delete', [this.detail.id]).then(res => {
			      if (res.data.code == 0) {
			        this.$message({
			          type: 'success',
			          message: '删除成功!',
			          duration: 1500,
					  onClose: () => {
						  history.back()
					  }
			        });
			      }
			    });
			  }).catch(_ => {});
		},
    },
    components: {
      CountDown
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.editor /deep/ .avatar-uploader {
		height: 0;
		line-height: 0;
	}
	
	.detail-preview {
	
	  .attr {
	    .el-carousel /deep/ .el-carousel__indicator button {
	      width: 0;
	      height: 0;
	      display: none;
	    }
	
	    .el-input-number__decrease:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled), .el-input-number__increase:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled) {
	      border-color: none;
	    }
	  }
	
	  .detail {
	    & /deep/ .el-tabs__header .el-tabs__nav-wrap {
	      margin-bottom: 0;
	    }
	
	    & .add .el-textarea {
	      width: auto;
	    }
	  }
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: #FE6917;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: #FE6917;
	}

	.attr .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li:hover {
		padding: 0;
		margin: 0 4px;
		background: #FE6917;
		display: inline-block;
		width: 24px;
		opacity: 0.7;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li.is-active {
		padding: 0;
		margin: 0 4px;
		background: #FE6917;
		display: inline-block;
		width: 24px;
		opacity: 1;
		height: 12px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		border-radius: 4px 0 0 4px;
		top: 1px;
		left: 1px;
		background: #000;
		width: 40px;
		justify-content: center;
		border-width: 0 1px 0 0;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease i {
		color: #fff;
		font-size: 14px;
	}

	.attr .el-input-number /deep/ .el-input-number__increase {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		right: 1px;
		border-radius: 0 4px 4px 0;
		top: 1px;
		background: #000;
		width: 40px;
		justify-content: center;
		border-width: 0 0 0 1px;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__increase i {
		color: #fff;
		font-size: 14px;
	}
	
	.attr .el-input-number /deep/ .el-input .el-input__inner {
		border: 1px solid #000;
		border-radius: 4px;
		padding: 0 40px;
		outline: none;
		color: #000;
		background: #FFF;
		display: inline-block;
		width: 100%;
		font-size: 15px;
		line-height: 40px;
		text-align: center;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header {
		margin: 0;
		background: none;
		border-color: #FE6917;
		border-width: 20px 0 0;
		border-style: solid;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item {
		border: 0;
		padding: 0 20px;
		margin: 0 10px;
		color: #fff;
		font-weight: 500;
		display: inline-block;
		font-size: 14px;
		line-height: 40px;
		border-radius: 0 0 20px 20px;
		background: #9E9E9E;
		position: relative;
		list-style: none;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
		border: 0;
		border-radius: 0 0 20px 20px;
		margin: 0 10px;
		color: #fff;
		background: #3554A4;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
		border: 0;
		border-radius: 0 0 20px 20px;
		margin: 0 10px;
		color: #fff;
		background: #3554A4;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__content {
		padding: 15px;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #666;
		width: 80px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-textarea__inner {
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 9px;
		color: #ccc;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb .item1 /deep/ .el-breadcrumb__inner a {
		color: #000;
		display: inline-block;
	}
	
	.breadcrumb-preview .el-breadcrumb .item2 /deep/ .el-breadcrumb__inner a {
		color: #000;
		display: inline-block;
	}
		
	.breadcrumb-preview .el-breadcrumb .item3 /deep/ .el-breadcrumb__inner a {
		color: #000;
		display: inline-block;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__total {
		margin: 0 10px 0 0;
		color: #666;
		font-weight: 400;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-prev {
		border: none;
		border-radius: 30px;
		padding: 0;
		margin: 0 5px;
		color: #fff;
		background: #3554A4;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-next {
		border: none;
		border-radius: 30px;
		padding: 0;
		margin: 0 5px;
		color: #fff;
		background: #3554A4;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-prev:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 30px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #666;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-next:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 30px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #666;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pager {
		padding: 0;
		margin: 0;
		display: inline-block;
		vertical-align: top;
	}
	
	#pagination.el-pagination /deep/ .el-pager .number {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #000;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 30px;
		background: #CBCBCB;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pager .number:hover {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #fff;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 30px;
		background: #FE6917;
		text-align: center;
		min-width: 30px;
		height: 28px;
}

#pagination.el-pagination /deep/ .el-pager .number.active {
		cursor: default;
		padding: 0 4px;
		margin: 0 5px;
		color: #FFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 30px;
		background: #FE6917;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes {
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input {
		margin: 0 5px;
		width: 100px;
		position: relative;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 25px 0 8px;
		color: #606266;
		display: inline-block;
		font-size: 13px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
		top: 0;
		position: absolute;
		right: 0;
		height: 100%;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
		cursor: pointer;
		color: #C0C4CC;
		width: 25px;
		font-size: 14px;
		line-height: 28px;
		text-align: center;
	}

	#pagination.el-pagination /deep/ .el-pagination__jump {
		margin: 0 0 0 24px;
		color: #606266;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input {
		border-radius: 3px;
		padding: 0 2px;
		margin: 0 2px;
		display: inline-block;
		width: 50px;
		font-size: 14px;
		line-height: 18px;
		position: relative;
		text-align: center;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 3px;
		color: #606266;
		display: inline-block;
		font-size: 14px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	.share_view{
		position: fixed;
		right:0;
		bottom: 20%;
		background: #fff;
		box-shadow: 0 4px 6px rgba(0,0,0,.1);
		.share{
			width: 40px;
			height: 40px;
			display: flex;
			align-items: center;
			justify-content: center;
			border-bottom: 1px solid #eee;
			cursor: pointer;
		}
		.share:last-of-type{
			border:none;
		}
	}


	.detail-preview .el-rate /deep/ .el-rate__item {
				cursor: pointer;
				display: inline-block;
				vertical-align: middle;
				font-size: 0;
				position: relative;
			}
	
	.detail-preview .el-rate /deep/ .el-rate__item .el-rate__icon {
				margin: 0 3px;
				display: block;
				font-size: 18px;
				position: relative;
				transition: .3s;
			}
</style>
