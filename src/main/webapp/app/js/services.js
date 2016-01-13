var jsonServices = angular.module('jsonServices', ['ngResource']);

jsonServices.factory('LangList', ['$resource',
	function($resource){
		return $resource('resources/lang-list.json');
	}]);