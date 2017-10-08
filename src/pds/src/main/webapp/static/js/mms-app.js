// *** mms的app ***

/**
 * 整个mms的app
 */
var mmsApp = angular.module("mmsApp", ["ui.router"]);

/**
 * 用于集中处理路由而定义出来，各功能点定义单独的js文件，在每个js中往此对象注入该js所对应的路由信息
 * ，最终这会由app统一注入到ui-router
 * 例子：
 * mmsStates["setting/sys/toView"] = {
 * 		url : "/setting/sys/toView",
 * 		templateUrl : "/setting/sys/toView",
 * 		controller : function($scope) {
 * 			
 * 		}
 * }
 */
var mmsStates = {};	