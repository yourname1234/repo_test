/**
 * Created by Kay on 2016/3/8.
 */

var app =new Vue({
    el:"#login_frame",
    data:{
        username:"",
        password:""
    },
    methods:{
      login:function () {
          var that=this
          var username = document.getElementById("username");
          var pass = document.getElementById("password");

          if (username.value == "") {

              alert("请输入用户名");

          } else if (pass.value  == "") {

              alert("请输入密码");

          } else {

              axios.post("http://localhost:9088/daoshizhi_ssmTest2_war_exploded/account/findByusername",{"username":that.username,"password": that.password},{headers:{"Content-Type" : "application/json;charset=UTF-8"}}).then(function(response){
                  console.log("接收到响应"+response.data)
                  if(response.data){
                      window.location.href="/daoshizhi_ssmTest2_war_exploded/html/main.html";
                  }
                  else{
                      alert("密码或用户名错误！")
                  }
              },function(error){
                  console.log(error);
              })
              // window.location.href="account/saveAccount";
          }
      }
    }
})
