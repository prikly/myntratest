package com.adcolony.sdk;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class f0 {

    /* renamed from: e  reason: collision with root package name */
    static final SimpleDateFormat f10051e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Date f10052a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f10053b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b0 f10054c;

    /* renamed from: d  reason: collision with root package name */
    protected String f10055d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        protected f0 f10056a = new f0();

        a() {
        }

        /* access modifiers changed from: package-private */
        public a a(int i) {
            int unused = this.f10056a.f10053b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(b0 b0Var) {
            b0 unused = this.f10056a.f10054c = b0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a a(String str) {
            this.f10056a.f10055d = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public f0 a() {
            if (this.f10056a.f10052a == null) {
                Date unused = this.f10056a.f10052a = new Date(System.currentTimeMillis());
            }
            return this.f10056a;
        }
    }

    f0() {
    }

    /* access modifiers changed from: package-private */
    public String b() {
        int i = this.f10053b;
        if (i == -1) {
            return "Fatal";
        }
        if (i == 0) {
            return LogConstants.EVENT_ERROR;
        }
        if (i == 1) {
            return "Warn";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return LogConstants.EVENT_INFO;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f10055d;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return f10051e.format(this.f10052a);
    }

    public String toString() {
        return d() + " " + b() + "/" + a().a() + ": " + c();
    }

    /* access modifiers changed from: package-private */
    public b0 a() {
        return this.f10054c;
    }
}
