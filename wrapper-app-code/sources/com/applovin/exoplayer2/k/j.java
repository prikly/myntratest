package com.applovin.exoplayer2.k;

import java.io.IOException;

public class j extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final int f13363a;

    public j(int i) {
        this.f13363a = i;
    }

    public j(String str, int i) {
        super(str);
        this.f13363a = i;
    }

    public j(String str, Throwable th, int i) {
        super(str, th);
        this.f13363a = i;
    }

    public j(Throwable th, int i) {
        super(th);
        this.f13363a = i;
    }

    public static boolean a(IOException iOException) {
        Throwable th;
        while (th != null) {
            if ((th instanceof j) && ((j) th).f13363a == 2008) {
                return true;
            }
            Throwable cause = th.getCause();
            th = iOException;
            th = cause;
        }
        return false;
    }
}
