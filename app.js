// Declare the app module with ngRoute as dependency
var app = angular.module("app1", ['ngRoute']);

// Configure routing
app.config(function($routeProvider) {
    $routeProvider
        .when("/home", {
            templateUrl: "home.html",
            controller: "c1"
        })
        .when("/about", {
            templateUrl: "about.html",
            controller: "c2"
        })
        .when("/User", {
            templateUrl: "User.html",
            controller: "c3"
        })
        .otherwise({
            redirectTo: "/home"
        });
});

// Controllers for each route
app.controller("c1", function($scope) {
    $scope.display = "Welcome To Home Page";
});

app.controller("c2", function($scope) {
    $scope.display = "Welcome To About Page";
});

app.controller("c3", function($scope) {
    $scope.display = "Welcome To User Page";
});