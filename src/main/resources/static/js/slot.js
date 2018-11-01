/*让html支持模块开发  slot标签引入template ID*/
function moduleLoad(url) {
    $.get(url, function (result) {
        var html = $(result);
        var __templates = html;
        $("[slot]").each(function () {
            var id = $(this).attr('slot');
            var body = $(__templates).find('#' + id).html();
            $(this).html(body);
        });
    });
}
$(document).ready(function () {
    moduleLoad("/model/public-model.html");
});

/*系统js*/
$(".nav .dropdown").hover(function() {
    $(this).find(".dropdown-toggle").dropdown("toggle");
});