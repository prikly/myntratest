package com.onesignal;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.onesignal.ActivityLifecycleHandler;
import java.lang.ref.WeakReference;

class OSViewUtils {
    private static final int MARGIN_ERROR_PX_SIZE = dpToPx(24);

    OSViewUtils() {
    }

    static boolean isKeyboardUp(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view == null || displayMetrics.heightPixels - rect.bottom <= MARGIN_ERROR_PX_SIZE) {
            return false;
        }
        return true;
    }

    static void decorViewReady(Activity activity, final Runnable runnable) {
        final String str = "decorViewReady:" + runnable;
        activity.getWindow().getDecorView().post(new Runnable() {
            public void run() {
                final ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
                if (activityLifecycleHandler != null) {
                    activityLifecycleHandler.addActivityAvailableListener(str, new ActivityLifecycleHandler.ActivityAvailableListener() {
                        /* access modifiers changed from: package-private */
                        public void available(Activity activity) {
                            activityLifecycleHandler.removeActivityAvailableListener(str);
                            if (OSViewUtils.isActivityFullyReady(activity)) {
                                runnable.run();
                            } else {
                                OSViewUtils.decorViewReady(activity, runnable);
                            }
                        }
                    });
                }
            }
        });
    }

    private static Rect getWindowVisibleDisplayFrame(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    static int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f2;
        DisplayCutout cutout;
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(16908290);
        float top = ((float) (windowVisibleDisplayFrame.top - findViewById.getTop())) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = ((float) (findViewById.getBottom() - windowVisibleDisplayFrame.bottom)) / Resources.getSystem().getDisplayMetrics().density;
        float f3 = 0.0f;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            f2 = 0.0f;
        } else {
            f3 = ((float) cutout.getSafeInsetRight()) / Resources.getSystem().getDisplayMetrics().density;
            f2 = ((float) cutout.getSafeInsetLeft()) / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(f3), Math.round(f2)};
    }

    static int getFullbleedWindowWidth(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.getWindow().getDecorView().getWidth();
        }
        return getWindowWidth(activity);
    }

    static int getWindowWidth(Activity activity) {
        return getWindowVisibleDisplayFrame(activity).width();
    }

    static int getWindowHeight(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getWindowHeightAPI23Plus(activity);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return getWindowHeightLollipop(activity);
        }
        return getDisplaySizeY(activity);
    }

    private static int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private static int getWindowHeightLollipop(Activity activity) {
        if (activity.getResources().getConfiguration().orientation == 2) {
            return getWindowVisibleDisplayFrame(activity).height();
        }
        return getDisplaySizeY(activity);
    }

    private static int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    static int dpToPx(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    static boolean isActivityFullyReady(Activity activity) {
        boolean z = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z;
        }
        boolean z2 = activity.getWindow().getDecorView().getRootWindowInsets() != null;
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
