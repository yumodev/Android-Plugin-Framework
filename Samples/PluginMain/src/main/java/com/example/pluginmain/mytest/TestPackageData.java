package com.example.pluginmain.mytest;

import com.yumo.demo.entry.YmPackageInfo;
import com.yumo.demo.listener.IGetPackageData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuMoDev on 17/2/12.  
 */

public class TestPackageData implements IGetPackageData {

    @Override
    public List<YmPackageInfo> getPackageList() {
        List<YmPackageInfo> list = new ArrayList<YmPackageInfo>();
        list.add(new YmPackageInfo("test", "com.example.pluginmain.mytest"));
        list.add(new YmPackageInfo("all", "com.example.pluginmain"));

        return list;
    }
}
