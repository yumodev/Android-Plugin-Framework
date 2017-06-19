package jp.wasabeef.sample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkView;

/**
 * Created by yumodev on 17/6/15.
 */

public class TestWalkEditor extends XWalkView {
    private final String LOG_TAG = "TestWalkEditor";
    public TestWalkEditor(Context context) {
        this(context, null);
    }

    @SuppressLint("SetJavaScriptEnabled")
    public TestWalkEditor(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView(){
        Log.i(LOG_TAG, "mEditHtmlPath：");
        load("http;//www.baidu.com", null);
        setResourceClient(new XWalkResourceClient(this){
            @Override
            public boolean shouldOverrideUrlLoading(XWalkView view, String url) {
                return false;
            }
        });
    }
}
