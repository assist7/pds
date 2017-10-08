// *** MMS通用函数 ***

/**
 * 打印提示消息
 */
function imsg(msg) {
	alert(msg);
}

/**
 * 打印正确消息
 */
function rmsg(msg) {
	alert(msg);
}

/**
 * 打印失败消息
 */
function fmsg(msg) {
	alert(msg);
}

/**
 * 打印错误消息
 */
function emsg(msg) {
	alert(msg);
}

/**
 * 是否提示框
 * @param msg
 * @param fn
 */
function cfMsg(msg, fn) {
	if (confirm(msg)) {
		fn();
	}
}

/**
 * 取得ctx，即项目路径
 */
function getCtx() {
	var allPath = window.document.location.href; // 全路径
    var pathName = window.document.location.pathname; // 路径名
    var hostPath = allPath.substring(0, allPath.indexOf(pathName)); // 服务器地址
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1); // 带/项目名
    
    return hostPath + projectName;
}

/**
 * 验证$http请求是否成功
 * @param result
 */
function httpSuccess(result) {
	return result.status == "200" && result.data.code == "100";
}







