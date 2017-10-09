// *** july工具函数库 ***

/**
 * july工具函数库
 */
var july = {
	/**
	 * 是否为空
	 */
	isEmpty : function(val) {
		if (val == undefined || val == null)
			return true;
		if (typeof val == "string" && val == "")
			return true;
		return false;
	},
	
	/**
	 * 是否不为空
	 */
	isNotEmpty : function(val) {
		return !this.isEmpty(val);
	},
	
	/**
	 * 取得当前年份
	 */
	getCurYear : function() {
		return new Date().getFullYear();
	},
	
	/**
	 * 取得当前月份
	 */
	getCurMonth : function() {
		return new Date().getMonth() + 1;
	},
	
	/**
	 * 取得当前几号
	 */
	getCurDay : function() {
		return new Date().getDate();
	},
	
	/**
	 * 返回默认字符串，值不存在时返回""
	 */
	defaultStr : function(val) {
		return val != undefined && val != null ? "" + val : "";
	}
}




