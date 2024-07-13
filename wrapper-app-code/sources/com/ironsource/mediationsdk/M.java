package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.H;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.i;
import com.ironsource.mediationsdk.utils.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

final class M implements j {
    private static M u;
    private NetworkStateReceiver A;
    private a B = a.NOT_INIT;
    private c C = new c() {
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02e1 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ Exception -> 0x0390 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x0390 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ironsource.mediationsdk.H r0 = com.ironsource.mediationsdk.H.a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.ah r1 = com.ironsource.mediationsdk.ah.a()     // Catch:{ Exception -> 0x0390 }
                java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0016 }
                com.ironsource.mediationsdk.ah$1 r3 = new com.ironsource.mediationsdk.ah$1     // Catch:{ Exception -> 0x0016 }
                r3.<init>()     // Catch:{ Exception -> 0x0016 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0016 }
                r2.start()     // Catch:{ Exception -> 0x0016 }
                goto L_0x001a
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()     // Catch:{ Exception -> 0x0390 }
            L_0x001a:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0390 }
                com.ironsource.d.a r2 = new com.ironsource.d.a     // Catch:{ Exception -> 0x0390 }
                r2.<init>()     // Catch:{ Exception -> 0x0390 }
                r3 = 0
                r4 = 0
                java.lang.String r5 = "userId"
                r6 = 1
                if (r1 == 0) goto L_0x0047
                if (r1 == 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0390 }
                if (r7 <= 0) goto L_0x003c
                int r7 = r1.length()     // Catch:{ Exception -> 0x0390 }
                r8 = 64
                if (r7 > r8) goto L_0x003c
                r7 = 1
                goto L_0x003d
            L_0x003c:
                r7 = 0
            L_0x003d:
                if (r7 != 0) goto L_0x004e
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r3)     // Catch:{ Exception -> 0x0390 }
            L_0x0043:
                r2.a((com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ Exception -> 0x0390 }
                goto L_0x004e
            L_0x0047:
                java.lang.String r7 = "it's missing"
                com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r5, r1, r7)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0043
            L_0x004e:
                boolean r1 = r2.a()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x005b
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "userGenerated"
                r1.o = r2     // Catch:{ Exception -> 0x0390 }
                goto L_0x00a8
            L_0x005b:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = com.ironsource.mediationsdk.H.a((android.content.Context) r2)     // Catch:{ Exception -> 0x0390 }
                r1.l = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x007c
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "GAID"
            L_0x0079:
                r1.o = r2     // Catch:{ Exception -> 0x0390 }
                goto L_0x00a1
            L_0x007c:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = com.ironsource.environment.h.x(r2)     // Catch:{ Exception -> 0x0390 }
                r1.l = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x009b
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "UUID"
                goto L_0x0079
            L_0x009b:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = ""
                r1.l = r2     // Catch:{ Exception -> 0x0390 }
            L_0x00a1:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0390 }
                r0.a((java.lang.String) r1, (boolean) r4)     // Catch:{ Exception -> 0x0390 }
            L_0x00a8:
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.e.a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "userIdType"
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.o     // Catch:{ Exception -> 0x0390 }
                r1.a(r2, r4)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.l     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x00ca
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.e.a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r2.l     // Catch:{ Exception -> 0x0390 }
                r1.a(r5, r2)     // Catch:{ Exception -> 0x0390 }
            L_0x00ca:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r1 = r1.m     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x00e1
                com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.e.a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "appKey"
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.m     // Catch:{ Exception -> 0x0390 }
                r1.a(r2, r4)     // Catch:{ Exception -> 0x0390 }
            L_0x00e1:
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.d.b r1 = r1.s     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r2.l     // Catch:{ Exception -> 0x0390 }
                r1.e(r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0390 }
                r2.<init>()     // Catch:{ Exception -> 0x0390 }
                long r4 = r2.getTime()     // Catch:{ Exception -> 0x0390 }
                r1.r = r4     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.lang.String r4 = r4.l     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.H$a r5 = r11.f8263c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r2 = r0.a((android.content.Context) r2, (java.lang.String) r4, (com.ironsource.mediationsdk.H.a) r5)     // Catch:{ Exception -> 0x0390 }
                r1.n = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x02e1
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                android.os.Handler r1 = r1.i     // Catch:{ Exception -> 0x0390 }
                r1.removeCallbacks(r11)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r1.b()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x02b6
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.M.a.INITIATED     // Catch:{ Exception -> 0x0390 }
                r1.a((com.ironsource.mediationsdk.M.a) r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r2 = r2.n     // Catch:{ Exception -> 0x0390 }
                r1.a((com.ironsource.mediationsdk.utils.l) r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                boolean r2 = r0.m()     // Catch:{ Exception -> 0x0390 }
                r1.b(r2)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.g r1 = com.ironsource.environment.g.f8081a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r1 = r1.n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r1 = r1.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r1 = r1.f8748e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.b r1 = r1.f()     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r1.f8893c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.g.a(r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r4 = r4.n     // Catch:{ Exception -> 0x0390 }
                r1.a(r2, r4)     // Catch:{ Exception -> 0x0390 }
                java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                long r1 = r1.getTime()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                long r4 = r4.r     // Catch:{ Exception -> 0x0390 }
                long r1 = r1 - r4
                boolean r4 = r0.m()     // Catch:{ Exception -> 0x0390 }
                org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4)     // Catch:{ Exception -> 0x0390 }
                java.lang.String r5 = "duration"
                r4.put(r5, r1)     // Catch:{ Exception -> 0x0186 }
                java.lang.String r1 = "sessionDepth"
                int r0 = r0.t     // Catch:{ Exception -> 0x0186 }
                r4.put(r1, r0)     // Catch:{ Exception -> 0x0186 }
                goto L_0x018a
            L_0x0186:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0390 }
            L_0x018a:
                com.ironsource.mediationsdk.a.c r0 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0390 }
                r1 = 514(0x202, float:7.2E-43)
                r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.a.h r1 = com.ironsource.mediationsdk.a.h.e()     // Catch:{ Exception -> 0x0390 }
                r1.b((com.ironsource.mediationsdk.a.c) r0)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.af r1 = new com.ironsource.mediationsdk.af     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                r0.f8239a = r1     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.af r0 = r0.f8239a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.af$a r1 = new com.ironsource.mediationsdk.af$a     // Catch:{ Exception -> 0x0390 }
                r1.<init>()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.lifecycle.a r2 = new com.ironsource.lifecycle.a     // Catch:{ Exception -> 0x0390 }
                com.ironsource.lifecycle.g r1 = (com.ironsource.lifecycle.g) r1     // Catch:{ Exception -> 0x0390 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0390 }
                r0.f8559a = r2     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f8748e     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.d()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x01d6
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x01d6
                com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x01d6:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0390 }
                org.json.JSONObject r1 = r0.f8940d     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0230
                com.ironsource.mediationsdk.model.g r1 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x01e3
                goto L_0x0230
            L_0x01e3:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0390 }
                r3.<init>()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r1 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.o r1 = r1.f8744a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0201
                com.ironsource.mediationsdk.model.m r1 = r0.f8937a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0201
                com.ironsource.mediationsdk.model.m r1 = r0.f8937a     // Catch:{ Exception -> 0x0390 }
                java.util.ArrayList<java.lang.String> r1 = r1.f8780a     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0390 }
                if (r1 <= 0) goto L_0x0201
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x0201:
                com.ironsource.mediationsdk.model.g r1 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.h r1 = r1.f8745b     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.m r1 = r0.f8937a     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x021a
                com.ironsource.mediationsdk.model.m r1 = r0.f8937a     // Catch:{ Exception -> 0x0390 }
                java.util.ArrayList<java.lang.String> r1 = r1.f8783d     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0390 }
                if (r1 <= 0) goto L_0x021a
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x021a:
                com.ironsource.mediationsdk.model.g r1 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.i r1 = r1.f8746c     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0225
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ Exception -> 0x0390 }
                r3.add(r1)     // Catch:{ Exception -> 0x0390 }
            L_0x0225:
                com.ironsource.mediationsdk.model.g r0 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.e r0 = r0.f8747d     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0230
                com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ Exception -> 0x0390 }
                r3.add(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x0230:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x0238:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0252
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r2 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                boolean r2 = r2.f8245g     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r4 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r4 = r4.n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r4 = r4.f8939c     // Catch:{ Exception -> 0x0390 }
                r1.a(r3, r2, r4)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0238
            L_0x0252:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.sdk.SegmentListener r0 = r0.p     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0277
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f8748e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.p r0 = r0.b()     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0277
                java.lang.String r1 = r0.f8797a     // Catch:{ Exception -> 0x0390 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0390 }
                if (r1 != 0) goto L_0x0277
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.sdk.SegmentListener r1 = r1.p     // Catch:{ Exception -> 0x0390 }
                java.lang.String r0 = r0.f8797a     // Catch:{ Exception -> 0x0390 }
                r1.onSegmentReceived(r0)     // Catch:{ Exception -> 0x0390 }
            L_0x0277:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.l r0 = r0.n     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.model.g r0 = r0.f8939c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.f.a r0 = r0.f8748e     // Catch:{ Exception -> 0x0390 }
                com.ironsource.sdk.controller.u r0 = r0.e()     // Catch:{ Exception -> 0x0390 }
                boolean r1 = r0.b()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0394
                java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.e r2 = com.ironsource.environment.e.a()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ Exception -> 0x0390 }
                android.content.Context r3 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0390 }
                java.util.HashSet r4 = r0.a()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r5 = r0.c()     // Catch:{ Exception -> 0x0390 }
                java.lang.String r6 = r0.d()     // Catch:{ Exception -> 0x0390 }
                boolean r7 = r0.e()     // Catch:{ Exception -> 0x0390 }
                int r9 = r0.f()     // Catch:{ Exception -> 0x0390 }
                boolean r10 = r0.g()     // Catch:{ Exception -> 0x0390 }
                r2.a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0394
            L_0x02b6:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.f8246h     // Catch:{ Exception -> 0x0390 }
                if (r0 != 0) goto L_0x038f
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.M.a.INIT_FAILED     // Catch:{ Exception -> 0x0390 }
                r0.a((com.ironsource.mediationsdk.M.a) r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                r0.f8246h = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x02cf:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0394
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "serverResponseIsNotValid"
                r1.a(r2)     // Catch:{ Exception -> 0x0390 }
                goto L_0x02cf
            L_0x02e1:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f8241c     // Catch:{ Exception -> 0x0390 }
                r1 = 3
                if (r0 != r1) goto L_0x0304
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                r0.q = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x02f4:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0304
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0390 }
                r1.f()     // Catch:{ Exception -> 0x0390 }
                goto L_0x02f4
            L_0x0304:
                boolean r0 = r11.f8261a     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0338
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f8241c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f8242d     // Catch:{ Exception -> 0x0390 }
                if (r0 >= r1) goto L_0x0338
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                r0.f8245g = r6     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                android.os.Handler r0 = r0.i     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f8240b     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 * 1000
                long r1 = (long) r1     // Catch:{ Exception -> 0x0390 }
                r0.postDelayed(r11, r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f8241c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f8243e     // Catch:{ Exception -> 0x0390 }
                if (r0 >= r1) goto L_0x0338
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f8240b     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 * 2
                r0.f8240b = r1     // Catch:{ Exception -> 0x0390 }
            L_0x0338:
                boolean r0 = r11.f8261a     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x0346
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r0 = r0.f8241c     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r1.f8244f     // Catch:{ Exception -> 0x0390 }
                if (r0 != r1) goto L_0x0388
            L_0x0346:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                boolean r0 = r0.f8246h     // Catch:{ Exception -> 0x0390 }
                if (r0 != 0) goto L_0x0388
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                r0.f8246h = r6     // Catch:{ Exception -> 0x0390 }
                java.lang.String r0 = r11.f8262b     // Catch:{ Exception -> 0x0390 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0390 }
                if (r0 == 0) goto L_0x035c
                java.lang.String r0 = "noServerResponse"
                r11.f8262b = r0     // Catch:{ Exception -> 0x0390 }
            L_0x035c:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                java.util.List<com.ironsource.mediationsdk.utils.i> r0 = r0.k     // Catch:{ Exception -> 0x0390 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0390 }
            L_0x0364:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
                if (r1 == 0) goto L_0x0376
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.utils.i r1 = (com.ironsource.mediationsdk.utils.i) r1     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = r11.f8262b     // Catch:{ Exception -> 0x0390 }
                r1.a(r2)     // Catch:{ Exception -> 0x0390 }
                goto L_0x0364
            L_0x0376:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.M.a.INIT_FAILED     // Catch:{ Exception -> 0x0390 }
                r0.a((com.ironsource.mediationsdk.M.a) r1)     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ Exception -> 0x0390 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0390 }
                java.lang.String r2 = "Mediation availability false reason: No server response"
                r0.log(r1, r2, r6)     // Catch:{ Exception -> 0x0390 }
            L_0x0388:
                com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.M.this     // Catch:{ Exception -> 0x0390 }
                int r1 = r0.f8241c     // Catch:{ Exception -> 0x0390 }
                int r1 = r1 + r6
                r0.f8241c = r1     // Catch:{ Exception -> 0x0390 }
            L_0x038f:
                return
            L_0x0390:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0394:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.M.AnonymousClass1.run():void");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    af f8239a;

    /* renamed from: b  reason: collision with root package name */
    int f8240b;

    /* renamed from: c  reason: collision with root package name */
    int f8241c;

    /* renamed from: d  reason: collision with root package name */
    int f8242d;

    /* renamed from: e  reason: collision with root package name */
    int f8243e;

    /* renamed from: f  reason: collision with root package name */
    int f8244f;

    /* renamed from: g  reason: collision with root package name */
    boolean f8245g;

    /* renamed from: h  reason: collision with root package name */
    boolean f8246h = false;
    Handler i;
    CountDownTimer j;
    List<i> k = new ArrayList();
    String l;
    String m;
    l n;
    String o;
    SegmentListener p;
    boolean q;
    long r;
    com.ironsource.d.b s;
    private int t = b.f8260e;
    private final String v = Constants.APP_KEY;
    private final String w = getClass().getSimpleName();
    private HandlerThread x = null;
    private boolean y = false;
    private AtomicBoolean z;

    /* renamed from: com.ironsource.mediationsdk.M$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8250a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ironsource.mediationsdk.M$a[] r0 = com.ironsource.mediationsdk.M.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8250a = r0
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.M.a.INIT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8250a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.M.a.NOT_INIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8250a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.M.a.INITIATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.M.AnonymousClass3.<clinit>():void");
        }
    }

    enum a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static int f8256a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static int f8257b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static int f8258c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static int f8259d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static int f8260e = 4;
    }

    abstract class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f8261a = true;

        /* renamed from: b  reason: collision with root package name */
        String f8262b;

        /* renamed from: c  reason: collision with root package name */
        protected H.a f8263c = new H.a() {
            public final void a(String str) {
                c.this.f8261a = false;
                c.this.f8262b = str;
            }
        };

        c() {
        }
    }

    private M() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.x = handlerThread;
        handlerThread.start();
        this.i = new Handler(this.x.getLooper());
        this.f8240b = 1;
        this.f8241c = 0;
        this.f8242d = 62;
        this.f8243e = 12;
        this.f8244f = 5;
        this.z = new AtomicBoolean(true);
        this.f8245g = false;
        this.q = false;
        this.s = new com.ironsource.d.b();
    }

    public static synchronized M a() {
        M m2;
        synchronized (M.class) {
            if (u == null) {
                u = new M();
            }
            m2 = u;
        }
        return m2;
    }

    public final void a(Context context, l lVar) {
        this.s.e(lVar.a().f8154b);
        this.s.a(lVar.a().f8153a);
        com.ironsource.sdk.f.a aVar = lVar.f8939c.f8748e;
        this.s.f(aVar.i().f8731a);
        this.s.b(aVar.c().f8962c);
        this.s.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    public final synchronized void a(Context context, String str, String str2) {
        try {
            if (this.z == null || !this.z.compareAndSet(true, false)) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                logger.log(ironSourceTag, this.w + ": Multiple calls to init are not allowed", 2);
                return;
            }
            a(a.INIT_IN_PROGRESS);
            this.l = str2;
            this.m = str;
            if (IronSourceUtils.isNetworkConnected(context)) {
                this.i.post(this.C);
            } else {
                this.y = true;
                if (this.A == null) {
                    this.A = new NetworkStateReceiver(context, this);
                }
                context.registerReceiver(this.A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                com.ironsource.environment.e.c.f8074a.c(new Runnable() {
                    public final void run() {
                        M.this.j = new CountDownTimer(60000, 15000) {
                            public final void onFinish() {
                                if (!M.this.f8246h) {
                                    M.this.f8246h = true;
                                    for (i a2 : M.this.k) {
                                        a2.a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                                    }
                                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                                }
                            }

                            public final void onTick(long j) {
                                if (j <= 45000) {
                                    M.this.q = true;
                                    for (i f2 : M.this.k) {
                                        f2.f();
                                    }
                                }
                            }
                        }.start();
                    }
                });
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.B + ", new status: " + aVar + ")");
        this.B = aVar;
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.k.add(iVar);
        }
    }

    public final synchronized void a(l lVar) {
        int i2;
        int i3 = lVar != null ? lVar.f8941e : l.a.f8945a;
        a aVar = this.B;
        if (i3 == l.a.f8946b) {
            i2 = b.f8258c;
        } else {
            int i4 = AnonymousClass3.f8250a[aVar.ordinal()];
            i2 = i4 != 1 ? i4 != 2 ? i4 != 3 ? b.f8256a : b.f8257b : b.f8260e : b.f8259d;
        }
        this.t = i2;
        this.s.a(i2);
    }

    public final void a(boolean z2) {
        if (this.y && z2) {
            CountDownTimer countDownTimer = this.j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.y = false;
            this.f8245g = true;
            this.i.post(this.C);
        }
    }

    public final synchronized a b() {
        return this.B;
    }

    public final void b(boolean z2) {
        Map<String, String> map;
        if (z2 && TextUtils.isEmpty(H.a().o) && (map = this.n.f8939c.f8748e.g().f8732a) != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (IronSourceUtils.doesClassExist(next)) {
                    String str = map.get(next);
                    if (!TextUtils.isEmpty(str)) {
                        next = str;
                    }
                    H.a().d(next);
                    return;
                }
            }
        }
    }

    public final synchronized boolean c() {
        return this.q;
    }
}
