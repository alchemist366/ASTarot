<#import "nav.ftl" as nav>
<html lang="en">
<head>
<#include "head.ftl">
    <link rel="stylesheet" type="text/css" href="/public/css/index.css">
</head>
<body>

<#include "nav.ftl">
<div id="pagewrap">

    <div id="content">
    <#--<#list companies as company>-->
         <#--${company.comName}-->
        <#--</#list>-->
    <#--</div>-->

    <div id="accordion" role="tablist" aria-multiselectable="true" style="width: 50%; margin-left: auto; margin-right: auto">
    <#list projects_tasks as key, value>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordion"
                       href="#collapse${key.projectId}" aria-expanded="true"
                       aria-controls="collapse${key.projectId}">
                        ${key.projectName}
                    </a>
                </h4>
            </div>
            <div id="collapse${key.projectId}" class="panel-collapse collapse"
                 role="tabpanel" aria-labelledby="heading${key.projectId}">
                <div class="panel-body" style="background-color: #cccccc">
                    <div class="list-group">
                        <#list value as dyspTask>
                        <#--<div class="row" style="margin-top: 0.5%">-->
                            <a href="/task?taskId=${dyspTask.taskId}"
                               class="list-group-item list-group-item-action">
                            ${dyspTask.taskName}</a>
                        <#--</div>-->
                        </#list>
                    </div>
                </div>
            </div>
        </div>
    </#list>
    </div>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

</div>
</div>
<#include "footer.ftl">
</body>
</html>