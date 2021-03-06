package com.powermanager.android.powermanager.Tasks;
import android.content.Context;

import com.powermanager.android.powermanager.DataHelper;
import com.powermanager.android.powermanager.Tasks.API.QuirkyCalls;

import java.util.Map;

import co.touchlab.android.threading.tasks.TaskQueue;
/**
 * @author zafrani (david@touchlab.co).
 */
public class WinkTask extends TaskQueue.Task{
    @Override
    protected void run(Context context) throws Exception{
       Map res = DataHelper.makeRequestAdapter(context).create(QuirkyCalls.class).wink();
    }

    @Override
    protected boolean handleError(Throwable throwable){
        return false;
    }
}
