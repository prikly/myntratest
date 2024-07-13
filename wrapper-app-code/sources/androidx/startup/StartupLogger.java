package androidx.startup;

import android.util.Log;

public final class StartupLogger {
    public static void w(String str) {
        Log.w("StartupLogger", str);
    }
}
