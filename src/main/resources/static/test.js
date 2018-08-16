$(function () {
    $.ajax({
        type: "GET",
        url: "/getAllUser",
        dataType: "json",
        success: function(data){
         $.each(data,function (i,v) {
             var html="";
             html+="<p>"+v.name+"</p>"
             $("#aaa").html(html);
         })

        }

    })

})