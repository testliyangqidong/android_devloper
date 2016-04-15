package com.example.testhmsad;

import android.app.Application;
import android.util.Log;

public class CustomApplication extends Application
{
    private static final String VALUE = "";
    
    private String value;
    
    @Override
    public void onCreate()
    {
    	Log.i("customApplication", "application test info ");
    	super.onCreate();
        //HmSDKUtils hmsdkUitls = new HmSDKUtils();
       /// HmSDKUtils.init(this);
        setValue(VALUE); // 
    }
    
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public String getValue()
    {
        return value;
    }
}
