<template>
<div class="center-preview" :style='{"width":"100%","padding":"0 10%","margin":"10px auto","position":"relative","background":"none"}'>
	<div class="title" :style='{"margin":"0 auto","color":"#fff","textAlign":"center","background":"url(http://codegen.caihongy.cn/20240120/777684ebe3104d3cb040057bea6e001c.png) center center/100% 100% no-repeat","width":"100%","fontSize":"20px","lineHeight":"54px"}'>{{ title }}</div>
	
	<div class="info" :style='{"padding":"20px 60px","boxShadow":"none","margin":"20px auto","borderRadius":"10px","alignItems":"center","flexWrap":"wrap","background":"#FFEBE0","display":"flex","width":"100%","height":"auto"}'>
		<div :style='{"borderColor":"#efefef","color":"#333","borderWidth":"0 0 1px 0","display":"none","width":"100%","lineHeight":"44px","fontSize":"15px","borderStyle":"solid","height":"44px"}'>个人信息</div>
		<div :style='{"borderColor":"#efefef","borderWidth":"0","display":"flex","width":"auto","fontSize":0,"borderStyle":"solid","justifyContent":"flex-end","height":"auto","order":"2"}' v-if="userTableName=='yonghu'">
			<el-image :style='{"margin":"0","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0 0 1px 0","display":"block","width":"80px","borderStyle":"solid","height":"80px"}' :src="sessionForm.touxiang?baseUrl + sessionForm.touxiang:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"borderColor":"#efefef","borderWidth":"0","display":"flex","width":"auto","fontSize":0,"borderStyle":"solid","justifyContent":"flex-end","height":"auto","order":"2"}' v-if="userTableName=='jianshenjiaolian'">
			<el-image :style='{"margin":"0","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0 0 1px 0","display":"block","width":"80px","borderStyle":"solid","height":"80px"}' :src="sessionForm.zhaopian?baseUrl + sessionForm.zhaopian:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0","display":"flex","width":"50%","lineHeight":"40px","borderStyle":"solid","height":"auto","order":"3"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#333","fontSize":"14px","display":"none"}'>用户名</div>
			<div :style='{"fontSize":"16px","color":"#000","textAlign":"left","fontWeight":"bold"}'>{{sessionForm.yonghuming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0","display":"flex","width":"calc(50% - 80px)","lineHeight":"30px","borderStyle":"solid","height":"auto","order":"1"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#333","fontSize":"14px","display":"none"}'>姓名</div>
			<div :style='{"padding":"0 20px","fontSize":"14px","color":"#fff","borderRadius":"5px","textAlign":"left","background":"#3554A4"}'>{{sessionForm.xingming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderRadius":"20px 0 0 20px","borderWidth":"0","background":"rgba(255, 255, 255, 0.80)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"4"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#3554A4","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px","display":"block"}'>性别</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.xingbie}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderWidth":"0","background":"rgba(255, 255, 255, 0.80)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"5"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px"}'>手机号</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.shoujihao}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderWidth":"0","background":"rgba(255,255,255,.8)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"6"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px"}'>邮箱</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.youxiang}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0","display":"flex","width":"50%","lineHeight":"40px","borderStyle":"solid","height":"auto","order":"3"}' v-if="userTableName=='jianshenjiaolian'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#333","fontSize":"14px","display":"none"}'>教练工号</div>
			<div :style='{"fontSize":"16px","color":"#000","textAlign":"left","fontWeight":"bold"}'>{{sessionForm.jiaoliangonghao}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0","display":"flex","width":"calc(50% - 80px)","lineHeight":"30px","borderStyle":"solid","height":"auto","order":"1"}' v-if="userTableName=='jianshenjiaolian'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#333","fontSize":"14px","display":"none"}'>教练姓名</div>
			<div :style='{"padding":"0 20px","fontSize":"14px","color":"#fff","borderRadius":"5px","textAlign":"left","background":"#3554A4"}'>{{sessionForm.jiaolianxingming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderRadius":"20px 0 0 20px","borderWidth":"0","background":"rgba(255, 255, 255, 0.80)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"4"}' v-if="userTableName=='jianshenjiaolian'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#3554A4","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px","display":"block"}'>健身课程</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.jianshenkecheng}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderWidth":"0","background":"rgba(255, 255, 255, 0.80)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"5"}' v-if="userTableName=='jianshenjiaolian'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px"}'>性别</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.xingbie}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderWidth":"0","background":"rgba(255,255,255,.8)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"6"}' v-if="userTableName=='jianshenjiaolian'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px"}'>年龄</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.nianling}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"50px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderRadius":"0 20px 20px 0","borderWidth":"0","background":"rgba(255,255,255,.8)","width":"25%","lineHeight":"30px","borderStyle":"solid","height":"180px","order":"7"}' v-if="userTableName=='jianshenjiaolian'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#3554A4","fontSize":"15px"}'>身高</div>
			<div :style='{"color":"#3554A4","textAlign":"center","fontSize":"15px"}'>{{sessionForm.shengao}}</div>
		</div>
		
	</div>
	
    <el-tabs tab-position="left" :style='{"width":"100%","margin":"30px auto","borderRadius":"10px","flexWrap":"wrap","background":"#fff","display":"flex"}' @tab-click="handleClick">
      <el-tab-pane label="个人中心">
        <el-form class="center-preview-pv" ref="sessionForm" :model="sessionForm" :rules="rules" label-width="80px">
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='yonghu'" label="用户名" prop="yonghuming">
            <el-input v-model="sessionForm.yonghuming" placeholder="用户名" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='yonghu'" label="姓名" prop="xingming">
            <el-input v-model="sessionForm.xingming" placeholder="姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='yonghu'" label="性别" prop="xingbie">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='yonghu'" label="手机号" prop="shoujihao">
            <el-input v-model="sessionForm.shoujihao" placeholder="手机号" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='yonghu'" label="头像" prop="touxiang">
			<file-upload
			tip="点击上传头像"
			action="file/upload"
			:limit="1"
			:multiple="true"
			:fileUrls="sessionForm.touxiang?sessionForm.touxiang:''"
			@change="yonghutouxiangHandleAvatarSuccess"
			></file-upload>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='yonghu'" label="邮箱" prop="youxiang">
            <el-input v-model="sessionForm.youxiang" placeholder="邮箱" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="教练工号" prop="jiaoliangonghao">
            <el-input v-model="sessionForm.jiaoliangonghao" placeholder="教练工号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="教练姓名" prop="jiaolianxingming">
            <el-input v-model="sessionForm.jiaolianxingming" placeholder="教练姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="健身课程" prop="jianshenkecheng">
            <el-select v-model="sessionForm.jianshenkecheng" placeholder="请选择健身课程" >
              <el-option v-for="(item, index) in dynamicProp.jianshenkecheng" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="性别" prop="xingbie">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="年龄" prop="nianling">
            <el-input v-model="sessionForm.nianling" placeholder="年龄" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="身高" prop="shengao">
            <el-input v-model="sessionForm.shengao" placeholder="身高" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="体重" prop="tizhong">
            <el-input v-model="sessionForm.tizhong" placeholder="体重" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="照片" prop="zhaopian">
			<file-upload
			tip="点击上传照片"
			action="file/upload"
			:limit="1"
			:multiple="true"
			:fileUrls="sessionForm.zhaopian?sessionForm.zhaopian:''"
			@change="jianshenjiaolianzhaopianHandleAvatarSuccess"
			></file-upload>
          </el-form-item>
		  <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' v-if="userTableName=='jianshenjiaolian'" label="职业履历">
		    <editor
		        :style='{"border":"1px solid #E2E3E5","boxShadow":"none","outline":"none","color":"#333","borderRadius":"4px","width":"100%","lineHeight":"32px","fontSize":"14px"}'
		        v-model="sessionForm.zhiyelvli" 
		        class="editor" 
		        action="file/upload">
		    </editor>
		  </el-form-item>
          <el-form-item :style='{"padding":"0","margin":"0","justifyContent":"center","display":"flex"}'>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"5px","background":"#FE6917","width":"auto","lineHeight":"30px","fontSize":"14px","height":"30px"}' type="primary" @click="onSubmit('sessionForm')">更新信息</el-button>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0","outline":"none","color":"#fff","borderRadius":"5px","background":"#9E9E9E","width":"auto","lineHeight":"30px","fontSize":"14px","height":"30px"}' type="danger" @click="logout">退出登录</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
	  <el-tab-pane label="修改密码">
		<el-form class="center-preview-pv" ref="passwordForm" :model="passwordForm" :rules="passwordRules" label-width="80px">
			<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' label="原密码" prop="password">
			  <el-input type="password" v-model="passwordForm.password" placeholder="原密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' label="新密码" prop="newpassword">
			  <el-input type="password" v-model="passwordForm.newpassword" placeholder="新密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"10px","margin":"0 auto 10px","background":"none","display":"block"}' label="确认密码" prop="repassword">
			  <el-input type="password" v-model="passwordForm.repassword" placeholder="确认密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"0","margin":"0","justifyContent":"center","display":"flex"}'>
			  <el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"5px","background":"#FE6917","width":"auto","lineHeight":"30px","fontSize":"14px","height":"30px"}' type="primary" @click="updatePassword">修改密码</el-button>
			</el-form-item>
		</el-form>
	  </el-tab-pane>
      <el-tab-pane label="我的收藏"></el-tab-pane>
    </el-tabs>

</div>
</template>

<script>
  import config from '@/config/config'
  import Vue from 'vue'
  export default {
    //数据集合
    data() {
      return {
        title: '个人中心',
        baseUrl: config.baseUrl,
        sessionForm: {},
		passwordForm: {},
		passwordRules: {
			password: [
				{
					required: true,
					message: "密码不能为空",
					trigger: "blur"
				}
			],
			newpassword: [
				{
					required: true,
					message: "新密码不能为空",
					trigger: "blur"
				}
			],
			repassword: [
				{
					required: true,
					message: "确认密码不能为空",
					trigger: "blur"
				}
			]
		},
        rules: {},
        disabled: false,
        uploadUrl: config.baseUrl + 'file/upload',
        imageUrl: '',
        headers: {Token: localStorage.getItem('frontToken')},
        userTableName: localStorage.getItem('UserTableName'),
        dynamicProp: {},
      }
    },
    created() {
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'yonghuming', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'xingming', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'mima', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'xingbie', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'shoujihao', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'touxiang', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'youxiang', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'jiaoliangonghao', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'jiaolianxingming', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'mima', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'jianshenkecheng', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'xingbie', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'nianling', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'shengao', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'tizhong', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'zhaopian', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'zhiyelvli', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'discussnum', null);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.sessionForm, 'storeupnum', null);
		}

		if ('yonghu' == this.userTableName&&this.rules['yonghuming']){
			this.rules['yonghuming'].push({ required: true, message: '请输入用户名', trigger: 'blur' })
		}else if('yonghu' == this.userTableName&&!this.rules['yonghuming']) {
			this.$set(this.rules, 'yonghuming', [{ required: true, message: '请输入用户名', trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName&&this.rules['xingming']){
			this.rules['xingming'].push({ required: true, message: '请输入姓名', trigger: 'blur' })
		}else if('yonghu' == this.userTableName&&!this.rules['xingming']) {
			this.$set(this.rules, 'xingming', [{ required: true, message: '请输入姓名', trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName&&this.rules['mima']){
			this.rules['mima'].push({ required: true, message: '请输入密码', trigger: 'blur' })
		}else if('yonghu' == this.userTableName&&!this.rules['mima']) {
			this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.rules, 'shoujihao', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.rules, 'youxiang', [{ required: false, validator: this.$validate.isEmail, trigger: 'blur' }]);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.rules, 'discussnum', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
		}
		if ('jianshenjiaolian' == this.userTableName) {
			this.$set(this.rules, 'storeupnum', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
		}

      this.init();
      this.sessionForm = JSON.parse(localStorage.getItem('sessionForm'))
    },
    //方法集合
    methods: {
      init() {
        if ('yonghu' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
        if ('jianshenjiaolian' == this.userTableName) {
          this.$http.get('option/kechengmingcheng/jianshenkecheng', {emulateJSON: true}).then(res => {
            if (res.data.code == 0) {
              this.dynamicProp.jianshenkecheng = res.data.data;
			  this.$forceUpdate()
            }
          });
        }
        if ('jianshenjiaolian' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
      },
	  setSession(){
		  localStorage.setItem('sessionForm',JSON.stringify(this.sessionForm))
	  },
      onSubmit(formName) {
		if(`yonghu` == this.userTableName && this.sessionForm.touxiang!=null){
			this.sessionForm.touxiang = this.sessionForm.touxiang.replace(new RegExp(this.$config.baseUrl,"g"),"");
		}
		if(`jianshenjiaolian` == this.userTableName && this.sessionForm.zhaopian!=null){
			this.sessionForm.zhaopian = this.sessionForm.zhaopian.replace(new RegExp(this.$config.baseUrl,"g"),"");
		}
        this.$refs[formName].validate((valid) => {
			if (valid) {
				this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
					if (res.data.code == 0) {
						this.setSession()
						this.$message({
							message: '更新成功',
							type: 'success',
							duration: 1500
						});
					}
				});
			} else {
				return false;
			}
        });
      },
      yonghutouxiangHandleAvatarSuccess(fileUrls) {
        this.sessionForm.touxiang = fileUrls;
      },
      jianshenjiaolianzhaopianHandleAvatarSuccess(fileUrls) {
        this.sessionForm.zhaopian = fileUrls;
      },
      handleClick(tab, event) {
        switch(event.target.outerText) {
          case '个人中心':
            tab.$router.push('/index/center');
            break;
          case '修改密码':
            this.passwordForm = {
				password: '',
				newpassword: '',
				repassword: '',
			}
			this.$forceUpdate()
            break;
          case '我的收藏':
            localStorage.setItem('storeupType', 1);
            tab.$router.push('/index/storeup');
            break;
		  default:
		  	tab.$router.push(`/index/${tab.name}?centerType=1`);
        }

        this.title = event.target.outerText;
      },
	  async updatePassword(){
			this.$refs["passwordForm"].validate(async valid => {
				if (valid) {
					var password = "";
					if (this.sessionForm.mima) {
						password = this.sessionForm.mima;
					} else if (this.sessionForm.password) {
						password = this.sessionForm.password;
					}
					if (this.passwordForm.password != password) {
						this.$message.error("原密码错误");
						return;
					}
					if (this.passwordForm.newpassword != this.passwordForm.repassword) {
						this.$message.error("两次密码输入不一致");
						return;
					}
					if (this.userTableName == 'yonghu') {
					}
					this.sessionForm.password = this.passwordForm.newpassword;
					this.sessionForm.mima = this.passwordForm.newpassword;
					this.$http.post(`${this.userTableName}/update`,this.sessionForm).then(({data})=>{
						if (data && data.code === 0) {
							this.$message({
								message: "修改密码成功,下次登录系统生效",
								type: "success",
								duration: 1500,
								onClose: () => {
								}
							});
							this.setSession()
						} else {
							this.$message.error(data.msg);
						}
					});
				}
			})
	  },
      logout() {
        localStorage.clear();
        Vue.http.headers.common['Token'] = "";
        this.$router.push('/index/home');
        this.activeIndex = '0'
        localStorage.setItem('keyPath', this.activeIndex)
        this.$forceUpdate()
        this.$message({
            message: '登出成功',
            type: 'success',
            duration: 1500,
        });
      },
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .center-preview {
  
    .el-tabs {
      & /deep/ .el-tabs__header {
		.el-tabs__nav{
			overflow: auto;
		}
		::-webkit-scrollbar {
		  -webkit-appearance: none;
		  width: 6px;
		  height: 6px;
		}
		::-webkit-scrollbar-track {
		  background: rgba(0, 0, 0, 0.1);
		  border-radius: 0;
		}
		::-webkit-scrollbar-thumb {
		  cursor: pointer;
		  border-radius: 5px;
		  background: rgba(0, 0, 0, 0.15);
		  transition: color 0.2s ease;
		}
		::-webkit-scrollbar-thumb:hover {
		  background: rgba(0, 0, 0, 0.3);
		}
        .el-tabs__nav-wrap {
          margin: 0;
  
          &::after {
            content: none;
          }
        }
  
        .el-tabs__active-bar {
          display: none !important;
        }
      }
  
      .center-preview-pv {
        .el-date-editor.el-input {
          width: auto;
        }
  
        .balance {
          .el-input {
            width: auto;
          }
        }
      }
    }
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header {
	padding: 20px 0;
	margin: 0;
	background: #fff;
	width: 100%;
	border-color: #eee;
	border-width: 0 1px 0 0;
	position: relative;
	float: left;
	border-style: solid;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item {
  	border: 1px solid #fff;
  	padding: 0 10px;
  	margin: 0 30px;
  	color: #000;
  	font-weight: 500;
  	display: inline-block;
  	font-size: 15px;
  	line-height: 60px;
  	background: none;
  	border-width: 0 0 5px;
  	position: relative;
  	text-align: center;
  	height: 60px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
  	border: 1px solid #3554A4;
  	padding: 0 10px;
  	margin: 0 30px;
  	color: #3554A4;
  	font-weight: bold;
  	display: inline-block;
  	font-size: 15px;
  	line-height: 60px;
  	border-radius: 0 0 5px 5px;
  	background: none;
  	border-width: 0 0 5px;
  	position: relative;
  	text-align: center;
  	height: 60px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
  	border: 1px solid #3554A4;
  	padding: 0 10px;
  	margin: 0 30px;
  	color: #3554A4;
  	font-weight: bold;
  	display: inline-block;
  	font-size: 15px;
  	line-height: 60px;
  	border-radius: 0 0 5px 5px;
  	background: none;
  	border-width: 0 0 5px;
  	position: relative;
  	text-align: center;
  	height: 60px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__content {
  	padding: 10px;
  	background: #fff;
  	width: 100%;
  }
  .center-preview .el-tabs /deep/ .el-tabs__content .el-tab-pane {
  	width: 100%;
  }
  
  .center-preview-pv .el-form-item /deep/ .el-form-item__label {
  	padding: 0 10px 0 0;
  	color: #000;
  	font-weight: 500;
  	width: 80px;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: right;
  }
  
  .center-preview-pv .el-form-item .el-form-item__content {
    margin-left: 80px;
  }
  
  .center-preview-pv .el-input /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	width: 600px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-select /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	width: 600px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-date-editor /deep/ .el-input__inner {
  	border: 1px  solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 10px 0 30px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	width: 600px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv /deep/ .avatar-uploader-icon {
  	border: 1px solid #E2E3E5;
  	cursor: pointer;
  	border-radius: 6px;
  	color: #000;
  	width: 200px;
  	font-size: 32px;
  	line-height: 60px;
  	text-align: center;
  	height: 60px;
  }
  
  .center-preview-pv .el-form-item.balance /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: none;
  	outline: none;
  	margin: 0 10px 0 0;
  	color: #000;
  	display: inline-block;
  	width: 490px;
  	font-size: 14px;
  	height: 40px;
  }
</style>
