package com.publics.utils;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class SplitIdsUtil {
    public static List<Integer> SplitIdstoList(String ids){
        List<Integer> list=new ArrayList<>();
        if (StringUtils.isNotBlank(ids)){
            for (String s:ids.split(",")) {
                list.add(Integer.parseInt(s));
            }
        }
        return  list;
    }
}
