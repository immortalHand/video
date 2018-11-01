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

                    var videoObject = {
                        container: '#video',//“#”代表容器的ID，“.”或“”代表容器的class
                        variable: 'player',//该属性必需设置，值等于下面的new chplayer()的对象
                        //autoplay:true,//自动播放
                        video:  videos[i].url//视频地址
                    };
                    var player=new ckplayer(videoObject);
                }
                str += "<li><a href='/single-video.html?id="+videos[i].id+"&num="+i+"'>"+videos[i].num+"</a></li>";
            }
            $(".v_num").empty();
            $(".v_num").append(str);
        }
    })
})

