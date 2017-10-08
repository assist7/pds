// *** 系统设置 ***

mmsStates["sts/user/toView"] = {
	url : "/sts/user/toView",
	templateUrl : "/sts/user/toView",
	controller : function($scope, $http) {
		//用户系统设置
		$scope.setting = {};
		$scope.setting.LOGIN_SKIP = 1;
		
		
		/**
		 * 保存
		 */
		$scope.save = function() {
			$http({
				method : "post",
				url : getCtx() + "/sts/user/update",
				params : $scope.setting
			}).then(function(result) {
				if ("200" == result.status && "100" == result.data.code) {
					var data = result.data.data;
					console.log(data);
					rmsg("保存成功！");
				} else {
					fmsg("保存失败！");
				}
			});
		};
	}
}







