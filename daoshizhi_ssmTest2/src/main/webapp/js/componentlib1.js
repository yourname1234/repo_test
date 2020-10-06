var css2=new Vue({
    el:"#app",
    data:{
        name:"",
        total_amount:"",
        lend_amount:"",
        remain_amount:"",
        lender:""
    },
    methods:{
        search:function () {
            var that=this
            if(that.name==""){
                alert("请输入器件名称")
            }else {
                axios.get("http://localhost:9088/daoshizhi_ssmTest2_war_exploded/Component/ComponentController?name="+that.name).then(function (response) {
                    console.log("success")
                    console.log(response.data)
                    that.total_amount=response.data.total_amount
                    that.lend_amount=response.data.lend_amount
                    that.remain_amount=response.data.remain_amount
                },function (err) {
                    console.log(err)
                })
            }

        }
    }
})