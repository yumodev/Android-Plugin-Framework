package com.example.pluginmain.mytest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.pluginmain.R;
import com.limpoxe.fairy.core.annotation.PluginContainer;

@PluginContainer
public class MyTestActivity extends AppCompatActivity{
    private final String LOG_TAG = "PluginView";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.richeditor_plugin);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                View pluginView = findViewById(R.id.plugin_view);
                Log.i(LOG_TAG, pluginView.getClass().getName());
                Context context = pluginView.getContext();
                String appName = context.getString(R.string.app_name);
                Log.i(LOG_TAG, "appName:"+appName);
            }
        });
    }




}
