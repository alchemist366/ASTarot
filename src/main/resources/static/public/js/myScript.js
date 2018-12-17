function showPassword() {

    var key_attr = document.getElementById('password').getAttribute('type');


    if(key_attr != 'text') {
        document.getElementsByClassName('checkbox')[0].classList.add('show');
        document.getElementById('password').setAttribute('type','text');

    } else {
        document.getElementsByClassName('checkbox')[0].classList.remove('show');
        document.getElementById('password').setAttribute('type','password');
    }

}