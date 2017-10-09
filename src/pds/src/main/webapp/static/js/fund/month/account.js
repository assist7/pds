// *** 月账 ***

mmsStates["fund/month/account/toView"] = {
	url : "/fund/month/account/toView",
	templateUrl : "/fund/month/account/toView",
	controller : function($scope, $http) {
		
		//数据列表
		$scope.dataList = {};
		//编辑的数据
		$scope.editData = {};
		//编辑类型，0：新增，1：修改
		$scope.editType = "0";
		//查询条件
		$scope.searchCo = {};
		
		/**
		 * 初始化
		 */
		$scope.init = function() {
			$scope.searchCo.year = july.defaultStr(july.getCurYear());
		}
		$scope.init();
		
		/**
		 * 查询
		 */
		$scope.search = function() {
			$http({
				url : getCtx() + "/fund/month/account/queryList",
				method : "post",
				params : $scope.searchCo
			}).then(function(result) {
				$scope.dataList = result.data.data;
			});
		}
		//默认查询一次
		$scope.search();
		
		/**
		 * 打开新增界面
		 */
		$scope.toAdd = function() {
			$scope.editType = "0";
			//重置
			$scope.editData = {
				earning : 0,
				expense : 0,
				unnormalEarning : 0,
				unnormalExpense : 0
			};
			
			//====== 赋初始值 =======
			$http({
				url : getCtx() + "/fund/month/account/queryLast",
			}).then(function(result) {
				var year;
				var month;
				var nextSurplus = 0;
				if (httpSuccess(result) && july.isNotEmpty(result.data.data)) {
					var data = result.data.data;
					if (data.month == 12) {
						year = data.year + 1;
						month = 1;
					} else {
						year = data.year;
						month = data.month + 1;
					}
					
					nextSurplus = data.surplus;
				} else {
					year = july.defaultStr(july.getCurYear());
					var curMonth = july.getCurMonth();
					//如果是第二个月上旬，则月份往后推一个月
					if (july.getCurDay() <= 10) {
						if (curMonth == 1) {
							year--;
							curMonth = 12;
						} else {
							curMonth--;
						}
					}
					month = july.defaultStr(curMonth);
				}
				
				$scope.editData.year = july.defaultStr(year);
				$scope.editData.month = july.defaultStr(month);
				$scope.editData.nextSurplus = july.defaultStr(nextSurplus);
			});
			
			
			$('#editPanel').modal("show");
		}
		
		/**
		 * 编辑
		 */
		$scope.edit = function(type) {
			if (!$scope.editValidate())
				return;
			
			var urlSuffix = type == "0" ? "add" : "update";
			var msgPrefix = type == "0" ? "新增" : "修改";
			
			$http({
				url : getCtx() + "/fund/month/account/" + urlSuffix,
				method : "post",
				params : $scope.editData
			}).then(function(result) {
				if (httpSuccess(result)) {
					rmsg(msgPrefix + "成功！");
					$scope.search();
					$('#editPanel').modal('hide');
				} else {
					fmsg(msgPrefix + "失败！");
				}
			});
		}
		
		/**
		 * 编辑验证
		 */
		$scope.editValidate = function() {
			var data = $scope.editData;
			if (july.isEmpty(data.nextSurplus)) {
				fmsg("上月结余不能为空！");
				return false;
			}
			if (july.isEmpty(data.earning)) {
				fmsg("本月收入不能为空！");
				return false;
			}
			if (july.isEmpty(data.expense)) {
				fmsg("本月支出不能为空！");
				return false;
			}
			return true;
		}
		
		/**
		 * 删除
		 */
		$scope.del = function(index) {
			cfMsg("删除后账单无法还原，是否确定删除？", function() {
				$http({
					url : getCtx() + "/fund/month/account/delete",
					method : "post",
					params : {id : $scope.dataList[index].id}
				}).then(function(result) {
					if (httpSuccess(result)) {
						rmsg("删除成功！");
						$scope.dataList.splice(index, 1);
					} else {
						fmsg("删除失败！");
					}
				});
			});
		}
		
		/**
		 * 打开修改界面
		 */
		$scope.toUpdate = function(index) {
			$scope.editType = "1";
			$scope.editData = $scope.dataList[index];
			$scope.editData.year = july.defaultStr($scope.editData.year);
			$scope.editData.month = july.defaultStr($scope.editData.month);
			
			$('#editPanel').modal("show");
		}
		
	}
}








