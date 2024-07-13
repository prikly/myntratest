package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class ad implements d {
    protected ad() {
    }

    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public o a(Looper looper, Handler.Callback callback) {
        return new ae(new Handler(looper, callback));
    }

    public long b() {
        return SystemClock.uptimeMillis();
    }

    public void c() {
    }
}
