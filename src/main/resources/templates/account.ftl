<head>
<#include "head.ftl">
    <link href="/public/css/account.css" rel="stylesheet">
    <script type="text/javascript" src="/public/js/account.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<style type="text/css">
    body {
        background: ;
    }
    /* Adding !important forces the browser to overwrite the default style applied by Bootstrap */
</style>
<#include "nav.ftl">
<div class="container-fluid">
    <div class="row">
        <div class="profile-head">
            <div class="profiles col-xs-8 col-xs-push-2  col-sm-10 col-sm-push-1 thumbnail">
                <div class="col-md-3 col-sm-3 col-xs-12">
                    <div class="row" style="width: 290px; height: 300px;" >
                        <img src=${user.img}>
                    </div>
                </div>
                <div class="col-md-9 visible-lg">
                    <div class="row">
                        <span class="col-sm-12"><h5>${userInf.fio}</h5></span>
                        <div class="col-md-4 col-sm-6 col-xs-12">

                            <p>Web Designer / Develpor </p>
                            <ul>
                                <li><span>Зарплата:</span></li>
                                <li><span>Общее время работы</span></li>
                                <#--<li><button class="btn btn-outline-primary" value="heider" onclick="hideImg()"> Новая фотография </button></li>-->

                            </ul>
                        </div><!--col-md-8 col-sm-8 col-xs-12 close-->
                        <div class="col-md-4 col-sm-6 col-xs-12">

                            <p> &nbsp;</p>
                            <ul>
                                <li><span>${salary} рублей</span></li>
                                <li><span>${user.workedHours} часов</span></li>

                            </ul>
                        </div><!--col-md-8 col-sm-8 col-xs-12 close-->
                        <div class="col-md-4 col-sm-6 col-xs-12">
                            <ul>
                                <li><button class="btn btn-outline-primary" value="heider" onclick="hidePass()"> Изменить</button>
                                <div id="hide">
                                    <form action="/account" id="passChanger" method="post" style="display: none">
                                        <label for="change-pass">Введите пароль</label>
                                        <input type="password" name="password" placeholder="password" id="change-pass">
                                        <label for="change-pass-check">Повторите пароль</label>
                                        <input type="password" name="password2" placeholder="check password"
                                               id="change-pass-check">
                                        <label for="change-pass-photo">Ссылка на фотографию</label>
                                        <input type="text" id="change-photo" name="img" placeholder="photo">
                                        <input type="submit"  style="margin-top: 2%">
                                    </form>
                                </div>

                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--profile-head close-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
                integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
                crossorigin="anonymous"></script>
    </div>
</div>

<#include "footer.ftl">
</body>