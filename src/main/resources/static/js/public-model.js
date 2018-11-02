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
