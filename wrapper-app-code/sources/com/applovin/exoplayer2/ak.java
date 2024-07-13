package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.g;

public class ak extends Exception implements g {
    public static final g.a<ak> k = $$Lambda$PI0wrKiCQtn6T0ZADJh0UvnZKvQ.INSTANCE;
    public final int i;
    public final long j;

    protected ak(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    protected ak(String str, Throwable th, int i2, long j2) {
        super(str, th);
        this.i = i2;
        this.j = j2;
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    protected static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(a(3));
        String string2 = bundle.getString(a(4));
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, ak.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = a(cls, string2);
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    private static Throwable a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }
}
