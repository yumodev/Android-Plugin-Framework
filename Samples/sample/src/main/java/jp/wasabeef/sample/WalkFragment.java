package jp.wasabeef.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkView;

/**
 * Created by yumodev on 17/6/19.
 */

public class WalkFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return initWalkView();
    }

    public View initWalkView(){
        XWalkView walkView = new XWalkView(getContext());
        walkView.load("http://www.baidu.com", null);
        walkView.setResourceClient(new XWalkResourceClient(walkView){
            @Override
            public boolean shouldOverrideUrlLoading(XWalkView view, String url) {
                //return super.shouldOverrideUrlLoading(view, url);
                return false;
            }
        });
        return walkView;
    }
}
