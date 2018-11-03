$(function () {

    DiangYingF(1,24)
})

function DiangYingF(page,list) {

    var pageUtil = PublicF(page,list);
    var infos = pageUtil.infos;
    var pages = pageUtil.pages;
    var str = "";
    for (var i=0;i<infos.length;i++){
        str +="<article class=\"col-lg-2 col-md-3 col-sm-4 col-xs-6\">\n" +
            "\t\t\t\t\t  <div class=\"post\">\n" +
            "\t\t\t\t\t\t <div class=\"thumbr\">\n" +
            "\t\t\t\t\t\t\t<a class=\"afterglow post-thumb a_width\" href='/single-video.html?id="+infos[i].id+"&num=0' data-lity>\n" +
            "\t\t\t\t\t\t\t   <span class=\"play-btn-border\" title=\"Play\"><i class=\"fa fa-play-circle headline-round\" aria-hidden=\"true\"></i></span>\n" +
            "\t\t\t\t\t\t\t   <div class=\"cactus-note ct-time font-size-1\"><span>"+infos[i].time+"</span></div>\n" +
            "\t\t\t\t\t\t\t   <img class=\"img-responsive img_width\" src='"+infos[i].image+"' alt='"+infos[i].title+"'>\n" +
            "\t\t\t\t\t\t\t</a>\n" +
            "\t\t\t\t\t\t </div>\n" +
            "\t\t\t\t\t\t <div class=\"infor\" style='height: 80px'>\n" +
            "\t\t\t\t\t\t\t<div>\n" +
            "\t\t\t\t\t\t\t   <a class=\"title\" href='/single-video.html?id="+infos[i].id+"&num=0'>"+infos[i].title+"</a>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t <span>"+infos[i].area+"</span>\n" +
            "\t\t\t\t\t\t\t<div class=\"ratings\">\n" +
            "\t\t\t\t\t\t\t\t评分：<span>"+infos[i].grade+"</span>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t </div>\n" +
            "\t\t\t\t\t  </div>\n" +
            "\t\t\t\t   </article>";
    }

    $(".v_videos").empty();
    $(".v_videos").append(str);
    $(".v_page").val(page);
    $(".v_pages").html(pages);

}

function nextDYF() {
    var page = parseInt($(".v_page").val());
    var pages = parseInt($(".v_pages").html());
    if(page+1<=pages){
        DiangYingF(page+1,24);
    }
}

function upDYF() {
    var page = parseInt($(".v_page").val());
    if(page-1>=1){
        DiangYingF(page-1,24);
    }
}

function jumpDYF() {
    var page = parseInt($(".v_page").val());
    var pages = parseInt($(".v_pages").html());
    if(page<=pages){
        DiangYingF(page,24);
    }
}
