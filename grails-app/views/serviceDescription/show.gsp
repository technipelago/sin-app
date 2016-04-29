<!DOCTYPE html>
<html>
<head>
    <title>Service</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="${resource(dir: 'css', file:'bootstrap.css')}">
</head>
<body>

<h2>${service.description}</h2>

    <table class="table">
        <tr>
            <td>Name: </td>
            <td>${service.serviceName}</td>
        </tr>
        <tr>
            <td>Description: </td>
            <td>${service.description}</td>
        </tr>
        <tr>
            <td>Depository: </td>
            <td>${service.sourceDepository}</td>
        </tr>
        <tr>
            <td>Status: </td>
            <td>${service.status}</td>
        </tr>
    </table>
</body>
