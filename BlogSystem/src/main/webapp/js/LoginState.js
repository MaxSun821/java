function loginState() {
    $.ajax({
        type: 'get',
        url: 'login',
        success: function (body) {
            let img = document.getElementById('imgId');
            if(body.image != null) {
                img.src = body.image;
            }
            let h3 = document.querySelector('.card h3');
            h3.innerHTML = body.username;

            let a = document.querySelector('.card a');
            a.href = body.github;
        },
        error: function (body) {
            location.assign('login.html');
        }
    });
}