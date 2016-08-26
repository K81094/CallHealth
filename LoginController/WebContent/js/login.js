angular.module('logInApp',['ngRoute'])
	
.config(function($routeProvider){
		$routeProvider
		.when('/',{
		templateUrl:'templates/login.html',
		controller:'logInController'
		})
	})
	
	

.controller('logInController',function($scope,$http){
	//var self=this;
	$scope.message="Message";
	$scope.logIn=function(username,password)
	{
		var urlIs="http://localhost:8080/LoginController/demo/login/validate/"+$scope.username+"/"+$scope.password;
		$http.get(urlIs)
			.success(function(data){
				if(data===1)
					$scope.message="Welcome "+username;
				else
					$scope.message="Error";
			})
			.error(function(status){
				$scope.message="Error 400";
			});
	}
});