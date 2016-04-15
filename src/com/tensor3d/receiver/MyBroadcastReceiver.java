package com.tensor3d.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

//import com.tensor3d.pushbean.pushNotClear;
//import com.tensor3d.service.MyService;
//import com.tensor3d.settings.AndroidGlobal;
//import com.tensor3d.settings.MyUtils;
//import com.tensor3d.settings.Notifier;

public class MyBroadcastReceiver extends BroadcastReceiver
{

	private static final String tag = MyBroadcastReceiver.class.getSimpleName();
	//public static pushNotClear push_noClear = null;


	/**
	 * 传送Bundle对象
	 */
	public static final String KEY_BUNDLE = "KEY_BUNDLE";

	@Override
	public void onReceive(Context context, Intent intent)
	{	
		Log.i(tag, "MyBroadcastReceiveronReceive2");
//		if(null == push_noClear){
//			push_noClear = new pushNotClear(context);
//		}
//		String action = intent.getAction();
//		MyUtils.logInfo(tag, "action:" + action);
//		if(action.equals(AndroidGlobal.NOTIFICATION_RECEIVE)){
//			int id = intent.getIntExtra(AndroidGlobal.NOTIFICATION_ID,0);
//		  	Notifier notifier = new Notifier(context);
//			notifier.clearNotification(id); 
//			push_noClear.operation(id);
//		}
//		else{		
//		startService(context);
//		}
	}

//	private void startService(Context context)
//	{
//
//		boolean run = MyUtils.isServiceRunning(context,
//				MyService.class.getName());
//
//		 MyUtils.logInfo(tag, "run:" + run);
//		if (context != null && !run)
//		{
//			 MyUtils.logInfo(tag, "ok...");
//			Intent intent = new Intent(context, MyService.class);
//			context.startService(intent);
//		}
//
//	}

}
