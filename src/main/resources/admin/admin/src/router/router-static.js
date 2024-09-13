import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import kechengdingdan from '@/views/modules/kechengdingdan/list'
    import aboutus from '@/views/modules/aboutus/list'
    import jianshenkecheng from '@/views/modules/jianshenkecheng/list'
    import yuyuejiaolian from '@/views/modules/yuyuejiaolian/list'
    import discussjianshenshipin from '@/views/modules/discussjianshenshipin/list'
    import kechengmingcheng from '@/views/modules/kechengmingcheng/list'
    import qicaileixing from '@/views/modules/qicaileixing/list'
    import discussjianshenqicai from '@/views/modules/discussjianshenqicai/list'
    import changdiyuding from '@/views/modules/changdiyuding/list'
    import jianshenqicai from '@/views/modules/jianshenqicai/list'
    import discussjianshenjiaolian from '@/views/modules/discussjianshenjiaolian/list'
    import jianshenjiaolian from '@/views/modules/jianshenjiaolian/list'
    import systemintro from '@/views/modules/systemintro/list'
    import jianshenshipin from '@/views/modules/jianshenshipin/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jianshenchangdi from '@/views/modules/jianshenchangdi/list'
    import config from '@/views/modules/config/list'
    import discussjianshenkecheng from '@/views/modules/discussjianshenkecheng/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/kechengdingdan',
        name: '课程订单',
        component: kechengdingdan
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/jianshenkecheng',
        name: '健身课程',
        component: jianshenkecheng
      }
      ,{
	path: '/yuyuejiaolian',
        name: '预约教练',
        component: yuyuejiaolian
      }
      ,{
	path: '/discussjianshenshipin',
        name: '健身视频评论',
        component: discussjianshenshipin
      }
      ,{
	path: '/kechengmingcheng',
        name: '课程名称',
        component: kechengmingcheng
      }
      ,{
	path: '/qicaileixing',
        name: '器材类型',
        component: qicaileixing
      }
      ,{
	path: '/discussjianshenqicai',
        name: '健身器材评论',
        component: discussjianshenqicai
      }
      ,{
	path: '/changdiyuding',
        name: '场地预订',
        component: changdiyuding
      }
      ,{
	path: '/jianshenqicai',
        name: '健身器材',
        component: jianshenqicai
      }
      ,{
	path: '/discussjianshenjiaolian',
        name: '健身教练评论',
        component: discussjianshenjiaolian
      }
      ,{
	path: '/jianshenjiaolian',
        name: '健身教练',
        component: jianshenjiaolian
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/jianshenshipin',
        name: '健身视频',
        component: jianshenshipin
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jianshenchangdi',
        name: '健身场地',
        component: jianshenchangdi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discussjianshenkecheng',
        name: '健身课程评论',
        component: discussjianshenkecheng
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
