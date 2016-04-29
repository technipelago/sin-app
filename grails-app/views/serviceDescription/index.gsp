<!DOCTYPE html>
<html>
<head>
    <title>Service Library</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="${resource(dir: 'css', file:'bootstrap.css')}">
</head>
<body>

<div>
    <h2>Service Bibliotek</h2>
</div>

<table class="table">
    <thead>
    <tr>
        <th>
            Running applications
        </th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allServices}" var="serviceDescription">
        <tr>
            <td>
                <li><g:link controller="serviceDescription" action="show" params="${[description: serviceDescription.description]}">
                    ${serviceDescription.description}</g:link>
                </li>
            <td>
                ${serviceDescription.status}
            </td>
        </tr>
    </g:each>
    </tbody>
</table>

<div class="pagination">
    <g:paginate controller="serviceDescription" action="index" total="${serviceCount}" />
</div>

</body>
</html>