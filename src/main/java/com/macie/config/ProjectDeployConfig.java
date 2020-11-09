package com.macie.config;

import com.macie.common.CommonConstants;

import java.io.File;

/**
 * @author Macie
 * @date 2020/11/9 -1:08
 */
public class ProjectDeployConfig {
    public static Boolean IS_REMOTE_DEPLOY = null;


    /** 工程部署路径,如 本地为 web\WebContent\, 服务器为/web  **/
    public static File WEB_DEPLOY_PATH;

    /** 工程根目录路径 ,web的同级目录 **/
    public static String WEB_ROOT_PATH;

    /** 图片上传路径 **/
    public static String IMAGE_PATH;

    /**
     * 设置全局变量
     *
     * @param deployPath
     */
    public static void setGlobalVariable(String deployPath) {


        WEB_DEPLOY_PATH = new File(deployPath);
        WEB_ROOT_PATH = WEB_DEPLOY_PATH.getParent();

        IMAGE_PATH = WEB_ROOT_PATH + CommonConstants.IMAGE_UPLOAD_PATH;
    }
}
