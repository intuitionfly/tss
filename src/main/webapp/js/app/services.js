var resourceServices = angular.module('resouceServices', ['ngResource']);

resourceServices.factory('LangList', ['$resource',
	function($resource){
		return $resource('resources/lang-list.json');
	}]);
resourceServices.factory('RunScriptRequest', ['$resource',
	function($resource){
		return $resource('run-script-request');
	}]);