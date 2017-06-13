package com.example.pluginmain.mytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pluginmain.R;
import com.limpoxe.fairy.core.annotation.PluginContainer;

@PluginContainer
public class MyTestActivity extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.richeditor_plugin);
    }


}
