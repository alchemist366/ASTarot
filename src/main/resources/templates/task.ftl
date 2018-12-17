<head>
<#include "head.ftl">
    <link rel="stylesheet" href="/public/css/task.css">
</head>
<body>
<#include "nav.ftl">
<div id="center-panel-grid">
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8" id="text-part">

            <h2>
            ${task.taskName}<br>
            </h2>
            <h4>
                Срок сдачи: ${task.deadline}<br>
            </h4>
            <span><br>
        Описание задачи: ${task.description}<br>
    </span>

        </div>
    </div>

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<#include "footer.ftl">
</body>