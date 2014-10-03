package net.matricom.tvremote.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by bmc on 10/3/14.
 */
public class Utils {

    public static boolean getTranslucentBarsSupported(Context context) {
        int id = context.getResources().getIdentifier("config_enableTranslucentDecor", "bool", "android");
        return id != 0 && context.getResources().getBoolean(id);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static void setTranslucentStatus(Activity activity, boolean on) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            params.flags |= bits;
        } else {
            params.flags &= ~bits;
        }
        window.setAttributes(params);
    }
}
