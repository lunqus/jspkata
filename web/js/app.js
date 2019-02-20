$(document).ready(function() {
    $('#userName').blur(function() {
        $.ajax({
            url : 'src/java/javajax',
            data : {
                userName : $('#userName').val()
            },
            success : function(responseText) {
                $('#ajaxGetUserServletResponse').text(responseText);
            }
        });
    });
});