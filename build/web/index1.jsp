<%-- 
    Document   : index1
    Created on : Jul 6, 2019, 10:20:09 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="java.sql.*" %>

<html>
    
    
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            table tr:nth-child(odd) {
  background-color: red;
}
table tr:nth-child(even) {
  background-color: blue;
}
        </style>
       
        <script src="script/angularjs.js" type="text/javascript"></script>
        <script type="text/javascript">
            var myApp=angular.module("myModule",[]);
            myApp.controller("myController",function($scope){
                
                $scope.message="Hello by angular JS";
            });
            myApp.controller("myController1",function($scope){
                
                var result=[
                    {name:"amar",fees:1200},
                    {name:"samar",fees:3200},
                    {name:"umar",fees:2200}
                    
                ];
                $scope.data=result;
            });
            myApp.controller("myController2",function($scope){
                $scope.today=new Date();
                
            });
            myApp.controller("myctrl",function($scope){
                <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from emp");
                %>
                    var tab=[
                <%
                while(rs.next())
                { %>
                {id:"<%=rs.getInt(1)%>",name:"<%=rs.getString(2)%>",salary:"<%=rs.getInt(3)%>"},
        <%}%>            
        ];
        
        $scope.data=tab;
            });
        </script>
    </head>
    <body ng-app="myModule" ng-init="name" ng-init="q=1" ng-init="p=1">
    <center>
        <h1>5+7={{5+7}}</h1>
        <div ng-controller="myController">
            <h1>Message :{{message}}</h1>
        </div>
        Number :<input type="text" ng-model="name"/>
            <br>
            wrote: <div style="font-family: chiller">{{name}}</div>
            Quantity:<input type="text" ng-model="q"/>
            <br>
            Price:<input type="text" ng-model="p"/>
            <br>
            Total Price={{p*q}}
            
            <table border="1" ng-controller="myController1">
                <tr><td>Sno</td><td>Name</td><td>Fees</td></tr>
                
                <tr ng-repeat="x in data|orderBy:'fees':'reverse' | limitTo : 2" >{{x}}<td>{{$index+1}}</td><td>{{x.name| uppercase}}</td><td>{{x.fees| currency}}</td></tr>0
            </table>
            <br><br>
            Number:<input type="number" ng-model="n1"/>
            <div ng-if="n1%2==0">
                no is even
            </div>
            <div ng-if="n1%2!==0">
                no is odd
            </div>
            Enter character :<input type="text" ng-model="c"/>
            <div ng-switch="c">
                <div ng-switch-when="a">Vowel</div>
                <div ng-switch-when="e">Vowel</div>
                <div ng-switch-when="i">Vowel</div>
                <div ng-switch-when="o">Vowel</div>
                <div ng-switch-when="u">Vowel</div>
                <div ng-switch-default="a">Consonant</div>
            </div>
            <h1 ng-controller="myController2">date:{{today| date:'dd/MM/yy'}}</h1>
            
            <input type="button" value="1" ng-model="i"/>
            <input type="button" value="2" ng-model="5"/>
            <table border="1" ng-controller="myctrl">
                <tr><td>id</td><td>name</td><td>salary</td></tr>
                
                <tr ng-repeat="x in data| limitTo:5:i">{{x}}<td>{{x.id}}</td><td>{{x.name|uppercase}}</td><td>{{x.salary}}</td></tr>
                
            </table>
                <div ng-controller="myController1">
                <select ng-model="s">
                    <option ng-repeat="x in data" value="{{x.name}}">{{x.name}}</option>
                   
                </select>   
                     
                    <br>
                    selected name :{{s}} 
                    
                </div>
            <input type="number" ng-model="p"/>
            <input type="number" ng-model="q"/>
            <select ng-model="s1" >
                <option >+</option>
                <option >-</option>
                <option >*</option>
                <option >/</option>
            </select>
            <br>
            <div ng-switch="s1">
                <div ng-switch-when="+">{{p+q}}</div>
                <div ng-switch-when="-">{{p-q}}</div>
                <div ng-switch-when="*">{{p*q}}</div>
                <div ng-switch-when="/">{{p/q}}</div>
            </div>
            
            
    </center>
    </body>
</html>
