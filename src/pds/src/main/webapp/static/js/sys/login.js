var loginApp = angular.module("loginApp", []);
var loginController = loginApp.controller("loginController", function($scope, $http) {
	//用户数据模型
	$scope.user = {};
	$scope.user.username = "admin";
	$scope.user.password = "888888";
	
	/**
	 * 登录
	 */
	$scope.login = function() {
		if ($scope.user.username == "") {
			fmsg("用户名不能为空！");
			return;
		}
		if ($scope.user.password == "") {
			fmsg("密码不能为空！");
			return;
		}
		
		$http({
			method : "post",
			url : getCtx() + "/login",
			data : {}
		}).then(function(data) {
			console.log(data);
		});
	}
});
