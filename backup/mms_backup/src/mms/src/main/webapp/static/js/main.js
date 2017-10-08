//*** 主页 ***

/**
 * 注入已定义的路由
 */
mmsApp.config(function($stateProvider) {
	for (var key in mmsStates) {
		$stateProvider.state(key, mmsStates[key]);
	}
});


/**
 * 主页controller
 */
mmsApp.controller("mainController", function($scope, $state) {
	//默认打开首页
	$state.go("index");
	
	//用户系统设置
	$scope.stsUserSetting = {};
	
	//往全局作用域里添加全局变量
	$.extend($scope, defineGlobalVariable());
	
	
});

/**
 * 定义整个MMS的全局的变量
 * @return
 */
function defineGlobalVariable () {
	//===================== 全局变量的临时容器 ======================
	
	var gvArr = {
		/** 可使用的所有年份 */
		globalAllYearArr : new Array(),
		/** 所有的月份 */
		globalAllMonthArr : new Array(),
	};
	
	//===================== 全局变量的临时容器 End ======================
	
	
	//===================== 初始化一些全局变量的值 ======================
	
	//初始化可使用的所有年份
	for (var i = 0; i < 30; i++)
		gvArr.globalAllYearArr.push(i + 2016);
	
	//初始化所有的月份
	for (var i = 1; i <= 12; i++) 
		gvArr.globalAllMonthArr.push(i);
	//===================== 初始化一些全局变量的值 End ======================
	
	
	return gvArr;
	
}
