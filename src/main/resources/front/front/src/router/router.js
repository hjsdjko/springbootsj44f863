import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import jianshenjiaolianList from '../pages/jianshenjiaolian/list'
import jianshenjiaolianDetail from '../pages/jianshenjiaolian/detail'
import jianshenjiaolianAdd from '../pages/jianshenjiaolian/add'
import kechengmingchengList from '../pages/kechengmingcheng/list'
import kechengmingchengDetail from '../pages/kechengmingcheng/detail'
import kechengmingchengAdd from '../pages/kechengmingcheng/add'
import qicaileixingList from '../pages/qicaileixing/list'
import qicaileixingDetail from '../pages/qicaileixing/detail'
import qicaileixingAdd from '../pages/qicaileixing/add'
import yuyuejiaolianList from '../pages/yuyuejiaolian/list'
import yuyuejiaolianDetail from '../pages/yuyuejiaolian/detail'
import yuyuejiaolianAdd from '../pages/yuyuejiaolian/add'
import jianshenqicaiList from '../pages/jianshenqicai/list'
import jianshenqicaiDetail from '../pages/jianshenqicai/detail'
import jianshenqicaiAdd from '../pages/jianshenqicai/add'
import jianshenkechengList from '../pages/jianshenkecheng/list'
import jianshenkechengDetail from '../pages/jianshenkecheng/detail'
import jianshenkechengAdd from '../pages/jianshenkecheng/add'
import kechengdingdanList from '../pages/kechengdingdan/list'
import kechengdingdanDetail from '../pages/kechengdingdan/detail'
import kechengdingdanAdd from '../pages/kechengdingdan/add'
import jianshenshipinList from '../pages/jianshenshipin/list'
import jianshenshipinDetail from '../pages/jianshenshipin/detail'
import jianshenshipinAdd from '../pages/jianshenshipin/add'
import jianshenchangdiList from '../pages/jianshenchangdi/list'
import jianshenchangdiDetail from '../pages/jianshenchangdi/detail'
import jianshenchangdiAdd from '../pages/jianshenchangdi/add'
import changdiyudingList from '../pages/changdiyuding/list'
import changdiyudingDetail from '../pages/changdiyuding/detail'
import changdiyudingAdd from '../pages/changdiyuding/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussjianshenjiaolianList from '../pages/discussjianshenjiaolian/list'
import discussjianshenjiaolianDetail from '../pages/discussjianshenjiaolian/detail'
import discussjianshenjiaolianAdd from '../pages/discussjianshenjiaolian/add'
import discussjianshenqicaiList from '../pages/discussjianshenqicai/list'
import discussjianshenqicaiDetail from '../pages/discussjianshenqicai/detail'
import discussjianshenqicaiAdd from '../pages/discussjianshenqicai/add'
import discussjianshenkechengList from '../pages/discussjianshenkecheng/list'
import discussjianshenkechengDetail from '../pages/discussjianshenkecheng/detail'
import discussjianshenkechengAdd from '../pages/discussjianshenkecheng/add'
import discussjianshenshipinList from '../pages/discussjianshenshipin/list'
import discussjianshenshipinDetail from '../pages/discussjianshenshipin/detail'
import discussjianshenshipinAdd from '../pages/discussjianshenshipin/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'jianshenjiaolian',
					component: jianshenjiaolianList
				},
				{
					path: 'jianshenjiaolianDetail',
					component: jianshenjiaolianDetail
				},
				{
					path: 'jianshenjiaolianAdd',
					component: jianshenjiaolianAdd
				},
				{
					path: 'kechengmingcheng',
					component: kechengmingchengList
				},
				{
					path: 'kechengmingchengDetail',
					component: kechengmingchengDetail
				},
				{
					path: 'kechengmingchengAdd',
					component: kechengmingchengAdd
				},
				{
					path: 'qicaileixing',
					component: qicaileixingList
				},
				{
					path: 'qicaileixingDetail',
					component: qicaileixingDetail
				},
				{
					path: 'qicaileixingAdd',
					component: qicaileixingAdd
				},
				{
					path: 'yuyuejiaolian',
					component: yuyuejiaolianList
				},
				{
					path: 'yuyuejiaolianDetail',
					component: yuyuejiaolianDetail
				},
				{
					path: 'yuyuejiaolianAdd',
					component: yuyuejiaolianAdd
				},
				{
					path: 'jianshenqicai',
					component: jianshenqicaiList
				},
				{
					path: 'jianshenqicaiDetail',
					component: jianshenqicaiDetail
				},
				{
					path: 'jianshenqicaiAdd',
					component: jianshenqicaiAdd
				},
				{
					path: 'jianshenkecheng',
					component: jianshenkechengList
				},
				{
					path: 'jianshenkechengDetail',
					component: jianshenkechengDetail
				},
				{
					path: 'jianshenkechengAdd',
					component: jianshenkechengAdd
				},
				{
					path: 'kechengdingdan',
					component: kechengdingdanList
				},
				{
					path: 'kechengdingdanDetail',
					component: kechengdingdanDetail
				},
				{
					path: 'kechengdingdanAdd',
					component: kechengdingdanAdd
				},
				{
					path: 'jianshenshipin',
					component: jianshenshipinList
				},
				{
					path: 'jianshenshipinDetail',
					component: jianshenshipinDetail
				},
				{
					path: 'jianshenshipinAdd',
					component: jianshenshipinAdd
				},
				{
					path: 'jianshenchangdi',
					component: jianshenchangdiList
				},
				{
					path: 'jianshenchangdiDetail',
					component: jianshenchangdiDetail
				},
				{
					path: 'jianshenchangdiAdd',
					component: jianshenchangdiAdd
				},
				{
					path: 'changdiyuding',
					component: changdiyudingList
				},
				{
					path: 'changdiyudingDetail',
					component: changdiyudingDetail
				},
				{
					path: 'changdiyudingAdd',
					component: changdiyudingAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussjianshenjiaolian',
					component: discussjianshenjiaolianList
				},
				{
					path: 'discussjianshenjiaolianDetail',
					component: discussjianshenjiaolianDetail
				},
				{
					path: 'discussjianshenjiaolianAdd',
					component: discussjianshenjiaolianAdd
				},
				{
					path: 'discussjianshenqicai',
					component: discussjianshenqicaiList
				},
				{
					path: 'discussjianshenqicaiDetail',
					component: discussjianshenqicaiDetail
				},
				{
					path: 'discussjianshenqicaiAdd',
					component: discussjianshenqicaiAdd
				},
				{
					path: 'discussjianshenkecheng',
					component: discussjianshenkechengList
				},
				{
					path: 'discussjianshenkechengDetail',
					component: discussjianshenkechengDetail
				},
				{
					path: 'discussjianshenkechengAdd',
					component: discussjianshenkechengAdd
				},
				{
					path: 'discussjianshenshipin',
					component: discussjianshenshipinList
				},
				{
					path: 'discussjianshenshipinDetail',
					component: discussjianshenshipinDetail
				},
				{
					path: 'discussjianshenshipinAdd',
					component: discussjianshenshipinAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
