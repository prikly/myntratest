package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;
import com.appodeal.ads.modules.common.internal.LogConstants;

public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    public static void setComponentEnabled(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            Logger logger = Logger.get();
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : LogConstants.MSG_AD_TYPE_DISABLED;
            logger.debug(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e2) {
            Logger logger2 = Logger.get();
            String str3 = TAG;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = LogConstants.MSG_AD_TYPE_DISABLED;
            }
            objArr2[1] = str;
            logger2.debug(str3, String.format("%s could not be %s", objArr2), e2);
        }
    }
}
