var videos = [];
$(function () {
    $.ajax({
        url:'/video/findVideoById',
        data:'id='+id,
        type:'post',
        dataType:'json',
        success: function (data) {
            console.info(data)
            dianying = data.obj.dianying;
            videos = data.obj.videos;
            $(".video-info>h2").html(dianying.title);
            $(".v_direct").html("导演："+dianying.direct);
            $(".v_time").html("时间："+dianying.time+"年");
            $(".v_grade").html("评分："+dianying.grade);
            $(".v_content").html(dianying.content);
            $(".v_actor").html("演员："+dianying.actor);
            $(".v_area").html("地区："+dianying.area);

            var str = "";
            for (var i=0;i<videos.length;i++){
                if(i == num){
                    source = "<video id=\"myVideo\" class=\"video-js vjs-default-skin vjs-big-play-centered\" controls preload=\"auto\" data-setup='{}' style=\"margin: auto auto\">\n" +
                                "<source src='"+videos[i].url+"'  type=\"application/x-mpegURL\" class=\"v_url\">\n" +
                            "</video>\n";
                    $(".video-embed-box").empty();
                    $(".video-embed-box").append(source);
                }
                str += "<li><a href='/single-video.html?id="+videos[i].id+"&num="+i+"'>"+videos[i].num+"</a></li>";
            }
            $(".v_num").empty();
            $(".v_num").append(str);
        }
    })
})