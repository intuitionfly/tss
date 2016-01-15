angular.module('ptiweb', [
	'ngRoute',
	'ngMessages',
	'pascalprecht.translate',
	'ptiweb.welcome',
	'resouceServices']).
	config(['$routeProvider', function ($routeProvider) {
		$routeProvider.otherwise({ redirectTo: '/welcome' });
	}]).
	config(function ($translateProvider) {
		$translateProvider.preferredLanguage('en_US');
		$translateProvider.useSanitizeValueStrategy('escape');
		$translateProvider.useStaticFilesLoader({
			prefix: 'resources/i18n/',
			suffix: '.json'
		});
	}).
	controller('AppCtrl', ['$scope', '$translate', 'LangList',
		function ($scope, $translate, LangList) {
			$scope.cur_lang = window.localStorage.lang || 'en_US';
			$translate.use($scope.cur_lang);
			$scope.langlist = LangList.query();

			$scope.switching = function (lang) {
				$translate.use(lang);
				window.localStorage.lang = lang;
			};
		}]);
