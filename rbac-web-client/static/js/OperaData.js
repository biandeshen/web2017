/**
 *
 * @accountURL list,add,update
 *
 */
var accountURL = "http://localhost:8080/rbac-rest-service/rbac/account";
/**
 *
 * @accountURL_R delete,detail(get)
 */
var accountURL_R = "http://localhost:8080/rbac-rest-service/rbac/account/";
/**
 *
 * @accountLoginURL get,post 登录验证
 */
var accountLoginURL = "http://localhost:8080/rbac-rest-service/rbac/account/login";
/**
 *
 * @accountUnauthorizedURL  delete,get,patch,post,put,head,options
 */
var accountUnauthorizedURL = "http://localhost:8080/rbac-rest-service/rbac/account/unauthorized";
/**
 *
 * @menuURL  get,post,put
 */
var menuURL = "http://localhost:8080/rbac-rest-service/rbac/menu";
/**
 *
 * @menuURL_R delete,detail(get)
 */
var menuURL_R = "http://localhost:8080/rbac-rest-service/rbac/menu/";
/**
 *
 * @menuProURL_R  list(get) 获取pid
 */
var menuProURL_R = "http://localhost:8080/rbac-rest-service/rbac/menu/p/";
/**
 *
 * @userProfileURL get,post,put,delete 用户操作路径,无需id
 */
var userProfileURL = "http://localhost:8080/rbac-rest-service/rbac/user/profile";
/**
 *
 * @userProfileURL_R get,delete 用户操作路径，通过id
 */
var userProfileURL_R = "http://localhost:8080/rbac-rest-service/rbac/user/profile/";

/**
 *
 * @GET_METHOD  get
 */
var GET_METHOD = "get";
/**
 *
 * @POST_METHOD post:add
 */
var POST_METHOD = "post";
/**
 *
 * @PUT_METHOD put:update
 */
var PUT_METHOD = "put";
/**
 *
 * @DELETE_METHOD  delete
 */
var DELETE_METHOD = "delete";

/**
 * 操作数据
 * @param data 传入数据
 * @param url   传入路径
 * @param type  传入method类型
 * @constructor
 */
function OperaData(data, url, type) {
//        layer.close(index);
//        obj.update(); //更新对应行（tr）的DOM结构
    //向服务器发送编辑命令
    //转换性别
    // if (obj.data.gender == "男") {
    //     obj.data.gender = true;
    // } else {
    //     obj.data.gender = false;
    // }
    var info = $.extend(data, {_method: type});
    $.ajax({
        url: url,
        type: type,
        async: false,
        data: info,
        // data: $('#loginform').serialize(),    // 你的formid
        timeout: 20000,
        success: function (result) {
            alert(result.code + result.message);
        },
        error: function (result) {
            alert(result.code + result.message);
        }
    });
}

/**
 * @ResultInfo myData方法的返回值
 */
var ResultInfo;
/**
 * 根据空data，url以及get/post方法，可以获得JSON类型的数据 ResultInfo
 * 直接在前台显示
 * @param data  空参数 “”即可
 * @param url    URL路径
 * @param type   方法类型
 */
function myData(data, url, type) {
    var info = $.extend(data, {_method: type});
    $.ajax({
        url: url,
        type: type,
        async: false,
        data: info,
        timeout: 20000,
        success: function (resultInfo) {
            //先将JSON中的data转换为字符串
            ResultInfo = JSON.stringify(resultInfo.data);
        },
        error: function (resultInfo) {
            alert(resultInfo.code + resultInfo.message);
        }
    });
}
