package com.wangxin;

import org.apache.commons.lang3.RandomStringUtils;

import com.wangxin.common.crypto.AESUtil;

public class Test {

    public static void main(String[] args) {
        String key = RandomStringUtils.randomNumeric(16);// 生成KEY
        String paramString = "张三";// 业务参数
        String enc = AESUtil.encryptToString(paramString, key);// 加密
        String dec = AESUtil.decryptToString(enc, key);// 解密
        System.out.println(key);
        System.out.println(enc);
        System.out.println(dec);
    }
}
