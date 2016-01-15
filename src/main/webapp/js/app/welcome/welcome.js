angular.module('ptiweb.welcome', ['ngRoute', 'resouceServices'])
	.config(['$routeProvider', function ($routeProvider) {
		$routeProvider.when('/welcome', {
			templateUrl: 'views/welcome/welcome.html',
			controller: 'WelcomeCtrl'
		});
	}])
	.controller('WelcomeCtrl', ['$scope', 'RunScriptRequest',
		function ($scope, RunScriptRequest) {
			$scope.runScript = function(){
				RunScriptRequest.save({
					name: "StopServer"
				}, function(response){
					//success
					$scope.resp = "success";
				},
				function(response){
					//fail
					$scope.resp = "fail";
				});
			}
		}]);