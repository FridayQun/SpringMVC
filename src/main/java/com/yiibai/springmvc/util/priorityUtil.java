package com.yiibai.springmvc.util;

/**
 * Created by chaoqun.jiang on 7/8/2016.
 */
public class priorityUtil {

    public static String getPriority(String[] priorityArray){

        String[] res = new String[]{"0", "0", "0", "0", "0"};
        for(String i : priorityArray){
            char ch = i.charAt(0);
            switch (ch){
                case '1':
                    res[1] = "1";
                    break;
                case '2':
                    res[2] = "1";
                    break;
                case '3':
                    res[3] = "1";
                    break;
                case '4':
                    res[4] = "1";
                    break;
                default:
                    break;
            }
        }

        String re = "";
        for(String str : res){
            re += str;
        }
        return re;
    }
}
