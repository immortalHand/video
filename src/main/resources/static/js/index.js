$(function () {

    $.ajax({
        url:'/dianying/dianyings',
        type:'post',
        data:'list=8&page=1',
        dataType: "json",
        success:function (data) {
            console.info(data);
            var str = "";
            var infos = data.obj.infos;
            for (var i=0;i<infos.length;i++){
                str +="<article class=\"col-lg-3 col-md-4 col-sm-4 col-xs-6\">\n" +
                    "\t\t\t\t\t  <div class=\"post\">\n" +
                    "\t\t\t\t\t\t <div class=\"thumbr\">\n" +
                    "\t\t\t\t\t\t\t<a class=\"afterglow post-thumb a_width\" href='/single-video.html?id="+infos[i].id+"&num=0' data-lity>\n" +
                    "\t\t\t\t\t\t\t   <span class=\"play-btn-border\" title=\"Play\"><i class=\"fa fa-play-circle headline-round\" aria-hidden=\"true\"></i></span>\n" +
                    "\t\t\t\t\t\t\t   <div class=\"cactus-note ct-time font-size-1\"><span>"+infos[i].time+"</span></div>\n" +
                    "\t\t\t\t\t\t\t   <img class=\"img-responsive img_width\" src='"+infos[i].image+"' alt='"+infos[i].title+"'>\n" +
                    "\t\t\t\t\t\t\t</a>\n" +
                    "\t\t\t\t\t\t </div>\n" +
                    "\t\t\t\t\t\t <div class=\"infor\">\n" +
                    "\t\t\t\t\t\t\t<h4>\n" +
                    "\t\t\t\t\t\t\t   <a class=\"title\" href='/single-video.html?id="+infos[i].id+"&num=0'>"+infos[i].title+"</a>\n" +
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