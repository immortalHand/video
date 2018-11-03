/*查询视频*/
function PublicF(page,list) {
    var pageUtil = null;
    $.ajax({
        url:'/dianying/dianyings',
        type:'post',
        data:'list='+list+'&page='+page,
        dataType: "json",
        async: false,
        success:function (data) {
            pageUtil = data.obj;
        }
    })
    return pageUtil;
}

/*返回顶部*/
$(function(){
    $("#toTop").click(function(){
        var odiv=document.getElementById('head');
        $("html").animate({"scrollTop": odiv.offsetTop},500); //IE,FF
        $("body").animate({"scrollTop": odiv.offsetTop},500); //Webkit
    });
})

/*模糊搜索*/
function solr() {
    $("")
}
