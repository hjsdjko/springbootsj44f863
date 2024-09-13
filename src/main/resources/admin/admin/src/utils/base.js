const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootsj44f863/",
            name: "springbootsj44f863",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootsj44f863/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于springboot的健身房管理系统 "
        } 
    }
}
export default base
