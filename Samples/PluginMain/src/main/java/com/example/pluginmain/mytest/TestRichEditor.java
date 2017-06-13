package com.example.pluginmain.mytest;

import android.view.View;

import com.example.pluginmain.R;
import com.yumo.demo.view.YmTestFragment;

/**
 * Created by yumodev on 17/6/13.
 */

public class TestRichEditor extends YmTestFragment {
    public void testHelloWorld(){
        showToastMessage("hello world");
    }

    public void testRichEditorPluginView(){
        View view = View.inflate(getContext(), R.layout.richeditor_plugin, null);
        showTestView(view);
    }
}
