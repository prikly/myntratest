package ms.bd.o.Pgl;

import android.content.Context;
import android.util.DisplayMetrics;

public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f9751a;

    public static String a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f9751a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f9751a;
    }
}
