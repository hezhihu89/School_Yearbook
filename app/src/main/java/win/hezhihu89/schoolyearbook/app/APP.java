package win.hezhihu89.schoolyearbook.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by hezhihu89 on 16/3/6.
 */
public class APP extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();
    }

    /**
     * 获取app 中的Context 对象
     *
     * @return mContext
     */
    public static Context getContext() {
        return mContext;
    }
}
