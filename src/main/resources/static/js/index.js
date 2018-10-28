$(function () {

    $.ajax({
        url:'/videos',
        type:'post',
        data:'list=8&page=1',
        dataType: "json",
        success:function (data) {
            var str = "";
            var infos = data.object.infos;
            for (var i=0;i<infos.length;i++){
                str +="<article class=\"col-lg-3 col-md-4 col-sm-6 col-xs-6\">\n" +
                    "\t\t\t\t\t  <div class=\"post post-medium\">\n" +
                    "\t\t\t\t\t\t <div class=\"thumbr\">\n" +
                    "\t\t\t\t\t\t\t<a class=\"afterglow post-thumb\" href=\"\" data-lity>\n" +
                    "\t\t\t\t\t\t\t   <span class=\"play-btn-border\" title=\"Play\"><i class=\"fa fa-play-circle headline-round\" aria-hidden=\"true\"></i></span>\n" +
                    "\t\t\t\t\t\t\t   <div class=\"cactus-note ct-time font-size-1\"><span>"+infos[i].time+"</span></div>\n" +
                    "\t\t\t\t\t\t\t   <img class=\"img-responsive\" src='"+infos[i].image+"' alt=\"#\">\n" +
                    "\t\t\t\t\t\t\t</a>\n" +
                    "\t\t\t\t\t\t </div>\n" +
                    "\t\t\t\t\t\t <div class=\"infor\">\n" +
                    "\t\t\t\t\t\t\t<h4>\n" +
                    "\t\t\t\t\t\t\t   <a class=\"title\" href=\"#\">"+infos[i].title+"</a>\n" +
                    "\t\t\t\t\t\t\t</h4>\n" +
                    "\t\t\t\t\t\t\t <span>"+infos[i].area+"</span>\n" +
                    "\t\t\t\t\t\t\t<div class=\"ratings\">\n" +
                    "\t\t\t\t\t\t\t\t评分：<span>"+infos[i].grade+"</span>\n" +
                    "\t\t\t\t\t\t\t</div>\n" +
                    "\t\t\t\t\t\t </div>\n" +
                    "\t\t\t\t\t  </div>\n" +
                    "\t\t\t\t   </article>";
            }

            $("#hotheader").empty()
            $("#hotheader").append(str)
        }
    })

})