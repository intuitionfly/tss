angular.module('ptiweb.welcome', ['ngRoute'])
	.config(['$routeProvider', function ($routeProvider) {
		$routeProvider.when('/welcome', {
			templateUrl: 'welcome/welcome.html',
			controller: 'WelcomeCtrl'
		});
	}])
	.controller('WelcomeCtrl', ['$scope', '$filter',
		function ($scope, $filter) {
			$scope.num1 = $filter('currency')(123534);
			$scope.date1 = $filter('date')(new Date().valueOf());
			$scope.num2 = 123534;
			$scope.date2 = new Date().valueOf();
		}]);