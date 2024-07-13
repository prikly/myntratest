package com.yandex.metrica.coreutils.logger;

import android.util.Log;

public abstract class BaseLogger {
    private volatile boolean mIsEnabled = false;

    private static String wrapMsg(String str) {
        return str == null ? "" : str;
    }

    /* access modifiers changed from: protected */
    public abstract String formatMessage(String str, Object[] objArr);

    /* access modifiers changed from: protected */
    public abstract String getPrefix();

    /* access modifiers changed from: protected */
    public abstract String getTag();

    public void setEnabled() {
        this.mIsEnabled = true;
    }

    public void setDisabled() {
        this.mIsEnabled = false;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public BaseLogger(boolean z) {
        this.mIsEnabled = z;
    }

    public void d(String str) {
        log(3, wrapMsg(str));
    }

    public void i(String str) {
        log(4, str);
    }

    public void w(String str) {
        log(5, str);
    }

    public void e(String str) {
        log(6, str);
    }

    public void e(Throwable th, String str) {
        log(6, th, str);
    }

    public void fd(String str, Object... objArr) {
        log(3, wrapMsg(str), objArr);
    }

    public void fi(String str, Object... objArr) {
        log(4, str, objArr);
    }

    public void fw(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public void fe(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public void fe(Throwable th, String str, Object... objArr) {
        log(6, th, str, objArr);
    }

    public void forceI(String str, Object... objArr) {
        Log.println(4, getTag(), getFormattedMessage(str, objArr));
    }

    public void forceW(String str, Object... objArr) {
        Log.println(5, getTag(), getFormattedMessage(str, objArr));
    }

    public void forceE(Throwable th, String str, Object... objArr) {
        String tag = getTag();
        Log.println(6, tag, getFormattedMessage(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    /* access modifiers changed from: package-private */
    public void log(int i, String str) {
        if (shouldLog()) {
            Log.println(i, getTag(), getMessage(str));
        }
    }

    /* access modifiers changed from: package-private */
    public void log(int i, String str, Object... objArr) {
        if (shouldLog()) {
            Log.println(i, getTag(), getFormattedMessage(str, objArr));
        }
    }

    /* access modifiers changed from: package-private */
    public void log(int i, Throwable th, String str) {
        if (shouldLog()) {
            String tag = getTag();
            Log.println(i, tag, getMessage(str) + "\n" + Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: package-private */
    public void log(int i, Throwable th, String str, Object... objArr) {
        if (shouldLog()) {
            String tag = getTag();
            Log.println(i, tag, getFormattedMessage(str, objArr) + "\n" + Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldLog() {
        return this.mIsEnabled;
    }

    private String getMessage(String str) {
        return getPrefix() + wrapMsg(str);
    }

    private String getFormattedMessage(String str, Object[] objArr) {
        try {
            return getPrefix() + formatMessage(wrapMsg(str), objArr);
        } catch (Throwable unused) {
            return onFormatException();
        }
    }

    /* access modifiers changed from: package-private */
    public String onFormatException() {
        return getPrefix();
    }
}
