package net.matricom.tvremote.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by bmc on 10/3/14.
 */
public class Utils {

    public static String codeNameToDeviceName(String codename) {
        String device = "";
        switch (codename.split("_")[1]) {
            case "k200":
                device = "G-Box Q";
                break;
            case "g18":
                device = "G-Box MX2";
                break;
        }
        return device;
    }
}
