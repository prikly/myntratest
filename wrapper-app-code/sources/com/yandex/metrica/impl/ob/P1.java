package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0656qf;
import com.yandex.metrica.impl.ob.C0687s;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.SendingDataTaskHelper;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

public class P1 implements UnderlyingNetworkTask {

    /* renamed from: a  reason: collision with root package name */
    private final L3 f4728a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f4729b;

    /* renamed from: c  reason: collision with root package name */
    private Ig f4730c;

    /* renamed from: d  reason: collision with root package name */
    private C0656qf f4731d;

    /* renamed from: e  reason: collision with root package name */
    private final L7 f4732e;

    /* renamed from: f  reason: collision with root package name */
    private List<Long> f4733f;

    /* renamed from: g  reason: collision with root package name */
    private int f4734g;

    /* renamed from: h  reason: collision with root package name */
    private int f4735h;
    private b i;
    private final C0391fn<byte[]> j;
    private final C0315cm k;
    private final C0276b8 l;
    private final M0 m;
    private final Qg n;
    private final FullUrlFormer<Lg> o;
    private final C0319d1 p;
    private final RequestDataHolder q;
    private final ResponseDataHolder r;
    private final SendingDataTaskHelper s;
    private int t;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final C0656qf.d f4736a;

        /* renamed from: b  reason: collision with root package name */
        final C0687s.a f4737b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f4738c;

        a(C0656qf.d dVar, C0687s.a aVar, boolean z) {
            this.f4736a = dVar;
            this.f4737b = aVar;
            this.f4738c = z;
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final List<C0656qf.d> f4739a;

        /* renamed from: b  reason: collision with root package name */
        final List<Long> f4740b;

        /* renamed from: c  reason: collision with root package name */
        final JSONObject f4741c;

        b(List<C0656qf.d> list, List<Long> list2, JSONObject jSONObject) {
            this.f4739a = list;
            this.f4740b = list2;
            this.f4741c = jSONObject;
        }
    }

    public P1(L3 l3, Qg qg, C0319d1 d1Var, FullUrlFormer<Lg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(l3, qg, d1Var, fullUrlFormer, requestDataHolder, responseDataHolder, l3.i(), l3.q(), l3.x(), requestBodyEncrypter);
    }

    static /* synthetic */ int a(P1 p1, int i2) {
        int i3 = p1.f4734g + i2;
        p1.f4734g = i3;
        return i3;
    }

    public String description() {
        return "ReportTask_" + this.f4728a.e().a();
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.o;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.q;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.r;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f4728a.m().q();
    }

    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a5, code lost:
        r18 = r6;
        r19 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0194 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01c3 A[EDGE_INSN: B:117:0x01c3->B:87:0x01c3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e1 A[LOOP:2: B:96:0x01db->B:98:0x01e1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateTask() {
        /*
            r20 = this;
            r8 = r20
            java.lang.String r9 = "protobuf_serialization_error"
            com.yandex.metrica.impl.ob.L3 r0 = r8.f4728a
            com.yandex.metrica.impl.ob.L7 r0 = r0.i()
            java.util.List r0 = r0.b()
            boolean r1 = r0.isEmpty()
            r10 = 0
            if (r1 == 0) goto L_0x0016
            return r10
        L_0x0016:
            java.lang.Object r0 = r0.get(r10)
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f4729b
            r1.clear()
            java.util.Set r1 = r0.valueSet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0029:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f4729b
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r3.put(r4, r2)
            goto L_0x0029
        L_0x0047:
            java.lang.String r1 = "report_request_parameters"
            java.lang.String r0 = r0.getAsString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0072
            com.yandex.metrica.impl.ob.Tl$a r1 = new com.yandex.metrica.impl.ob.Tl$a     // Catch:{ all -> 0x0065 }
            r1.<init>(r0)     // Catch:{ all -> 0x0065 }
            com.yandex.metrica.impl.ob.Ig r0 = new com.yandex.metrica.impl.ob.Ig     // Catch:{ all -> 0x0065 }
            r0.<init>(r1)     // Catch:{ all -> 0x0065 }
            r8.f4730c = r0     // Catch:{ all -> 0x0065 }
            com.yandex.metrica.impl.ob.Qg r1 = r8.n     // Catch:{ all -> 0x0065 }
            r1.a((com.yandex.metrica.impl.ob.Ig) r0)     // Catch:{ all -> 0x0065 }
            goto L_0x007e
        L_0x0065:
            com.yandex.metrica.impl.ob.Ig r0 = new com.yandex.metrica.impl.ob.Ig
            r0.<init>()
            r8.f4730c = r0
            com.yandex.metrica.impl.ob.Qg r1 = r8.n
            r1.a((com.yandex.metrica.impl.ob.Ig) r0)
            goto L_0x007e
        L_0x0072:
            com.yandex.metrica.impl.ob.Ig r0 = new com.yandex.metrica.impl.ob.Ig
            r0.<init>()
            r8.f4730c = r0
            com.yandex.metrica.impl.ob.Qg r1 = r8.n
            r1.a((com.yandex.metrica.impl.ob.Ig) r0)
        L_0x007e:
            com.yandex.metrica.impl.ob.d1 r0 = r8.p
            com.yandex.metrica.impl.ob.Lg r11 = r0.a()
            java.util.List r12 = r11.D()
            boolean r0 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r12)
            if (r0 == 0) goto L_0x008f
            return r10
        L_0x008f:
            com.yandex.metrica.networktasks.api.FullUrlFormer<com.yandex.metrica.impl.ob.Lg> r0 = r8.o
            java.util.List r1 = r11.M()
            r0.setHosts(r1)
            boolean r0 = r11.S()
            if (r0 == 0) goto L_0x029f
            com.yandex.metrica.networktasks.api.FullUrlFormer<com.yandex.metrica.impl.ob.Lg> r0 = r8.o
            java.util.List r0 = r0.getAllHosts()
            boolean r0 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r0)
            if (r0 == 0) goto L_0x00ac
            goto L_0x029f
        L_0x00ac:
            r1 = 0
            r8.f4733f = r1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r7 = 1
            com.yandex.metrica.impl.ob.L7 r0 = r8.f4732e     // Catch:{ all -> 0x01c9 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f4729b     // Catch:{ all -> 0x01c9 }
            android.database.Cursor r6 = r0.a((java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x01b6
            r0 = r1
            r16 = r2
        L_0x00d1:
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x01ac }
            if (r1 == 0) goto L_0x01a5
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x01ac }
            r1.<init>()     // Catch:{ all -> 0x01ac }
            com.yandex.metrica.impl.ob.C0267b.a((android.database.Cursor) r6, (android.content.ContentValues) r1)     // Catch:{ all -> 0x00df }
        L_0x00df:
            java.lang.String r2 = "id"
            java.lang.Long r5 = r1.getAsLong(r2)     // Catch:{ all -> 0x01ac }
            if (r5 != 0) goto L_0x0108
            com.yandex.metrica.impl.ob.M0 r2 = r8.m     // Catch:{ all -> 0x0102 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r3.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r4 = "no session_id in values: "
            r3.append(r4)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0102 }
            r3.append(r1)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0102 }
            r2.d(r9, r1)     // Catch:{ all -> 0x0102 }
            goto L_0x00d1
        L_0x0102:
            r0 = move-exception
            r1 = r6
            r2 = r16
            goto L_0x01ca
        L_0x0108:
            java.lang.String r2 = "type"
            java.lang.Integer r2 = r1.getAsInteger(r2)     // Catch:{ all -> 0x01ac }
            com.yandex.metrica.impl.ob.f6 r3 = com.yandex.metrica.impl.ob.C0374f6.FOREGROUND     // Catch:{ all -> 0x01ac }
            if (r2 == 0) goto L_0x011d
            int r2 = r2.intValue()     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x011d
            if (r2 == r7) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            com.yandex.metrica.impl.ob.f6 r3 = com.yandex.metrica.impl.ob.C0374f6.BACKGROUND     // Catch:{ all -> 0x0102 }
        L_0x011d:
            com.yandex.metrica.impl.ob.qf$f r1 = com.yandex.metrica.impl.ob.J1.a((android.content.ContentValues) r1)     // Catch:{ all -> 0x01ac }
            int r2 = com.yandex.metrica.impl.ob.J1.a((com.yandex.metrica.impl.ob.C0374f6) r3)     // Catch:{ all -> 0x01ac }
            java.lang.String r3 = r11.k()     // Catch:{ all -> 0x01ac }
            com.yandex.metrica.impl.ob.qf$d$b r4 = new com.yandex.metrica.impl.ob.qf$d$b     // Catch:{ all -> 0x01ac }
            r4.<init>()     // Catch:{ all -> 0x01ac }
            r4.f6626a = r1     // Catch:{ all -> 0x01ac }
            r4.f6627b = r3     // Catch:{ all -> 0x01ac }
            r4.f6628c = r2     // Catch:{ all -> 0x01ac }
            int r1 = r8.f4734g     // Catch:{ all -> 0x01ac }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.protobuf.nano.ym.CodedOutputByteBufferNano.computeUInt64Size(r7, r2)     // Catch:{ all -> 0x01ac }
            int r1 = r1 + r2
            r8.f4734g = r1     // Catch:{ all -> 0x01ac }
            r2 = 2
            int r2 = com.google.protobuf.nano.ym.CodedOutputByteBufferNano.computeMessageSize(r2, r4)     // Catch:{ all -> 0x01ac }
            int r1 = r1 + r2
            r8.f4734g = r1     // Catch:{ all -> 0x01ac }
            r2 = 250880(0x3d400, float:3.51558E-40)
            if (r1 < r2) goto L_0x0150
            goto L_0x01a5
        L_0x0150:
            long r2 = r5.longValue()     // Catch:{ all -> 0x01ac }
            int r17 = r13.size()     // Catch:{ all -> 0x01ac }
            r1 = r20
            r10 = r5
            r5 = r11
            r18 = r6
            r6 = r15
            r19 = 1
            r7 = r17
            com.yandex.metrica.impl.ob.P1$a r1 = r1.a(r2, r4, r5, r6, r7)     // Catch:{ all -> 0x01a3 }
            if (r1 == 0) goto L_0x019d
            if (r0 != 0) goto L_0x016e
            com.yandex.metrica.impl.ob.s$a r0 = r1.f4737b     // Catch:{ all -> 0x01a3 }
            goto L_0x0177
        L_0x016e:
            com.yandex.metrica.impl.ob.s$a r2 = r1.f4737b     // Catch:{ all -> 0x01a3 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x01a3 }
            if (r2 != 0) goto L_0x0177
            goto L_0x01a9
        L_0x0177:
            r14.add(r10)     // Catch:{ all -> 0x01a3 }
            com.yandex.metrica.impl.ob.qf$d r2 = r1.f4736a     // Catch:{ all -> 0x01a3 }
            r13.add(r2)     // Catch:{ all -> 0x01a3 }
            com.yandex.metrica.impl.ob.s$a r2 = r1.f4737b     // Catch:{ all -> 0x01a3 }
            java.lang.String r2 = r2.f6766a     // Catch:{ all -> 0x01a3 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01a3 }
            if (r2 != 0) goto L_0x0194
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0194 }
            com.yandex.metrica.impl.ob.s$a r3 = r1.f4737b     // Catch:{ all -> 0x0194 }
            java.lang.String r3 = r3.f6766a     // Catch:{ all -> 0x0194 }
            r2.<init>(r3)     // Catch:{ all -> 0x0194 }
            r16 = r2
        L_0x0194:
            boolean r1 = r1.f4738c     // Catch:{ all -> 0x0199 }
            if (r1 == 0) goto L_0x019d
            goto L_0x01c3
        L_0x0199:
            r0 = move-exception
            r6 = r18
            goto L_0x01cf
        L_0x019d:
            r6 = r18
            r7 = 1
            r10 = 0
            goto L_0x00d1
        L_0x01a3:
            r0 = move-exception
            goto L_0x01b1
        L_0x01a5:
            r18 = r6
            r19 = 1
        L_0x01a9:
            r2 = r16
            goto L_0x01c1
        L_0x01ac:
            r0 = move-exception
            r18 = r6
            r19 = 1
        L_0x01b1:
            r2 = r16
        L_0x01b3:
            r1 = r18
            goto L_0x01cc
        L_0x01b6:
            r18 = r6
            r19 = 1
            com.yandex.metrica.impl.ob.M0 r0 = r8.m     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = "no sessions cursor"
            r0.d(r9, r1)     // Catch:{ all -> 0x01c7 }
        L_0x01c1:
            r16 = r2
        L_0x01c3:
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r18)
            goto L_0x01d5
        L_0x01c7:
            r0 = move-exception
            goto L_0x01b3
        L_0x01c9:
            r0 = move-exception
        L_0x01ca:
            r19 = 1
        L_0x01cc:
            r6 = r1
            r16 = r2
        L_0x01cf:
            r15.add(r0)     // Catch:{ all -> 0x0299 }
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r6)
        L_0x01d5:
            r0 = r16
            java.util.Iterator r1 = r15.iterator()
        L_0x01db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ed
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            com.yandex.metrica.impl.ob.M0 r3 = r8.m
            r3.reportError((java.lang.String) r9, (java.lang.Throwable) r2)
            goto L_0x01db
        L_0x01ed:
            com.yandex.metrica.impl.ob.P1$b r1 = new com.yandex.metrica.impl.ob.P1$b
            r1.<init>(r13, r14, r0)
            r8.i = r1
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x01fc
            r1 = 0
            return r1
        L_0x01fc:
            com.yandex.metrica.impl.ob.b8 r0 = r8.l
            int r0 = r0.g()
            int r0 = r0 + 1
            r8.t = r0
            com.yandex.metrica.impl.ob.Qg r1 = r8.n
            long r2 = (long) r0
            r1.a((long) r2)
            com.yandex.metrica.impl.ob.P1$b r0 = r8.i
            com.yandex.metrica.impl.ob.qf r1 = new com.yandex.metrica.impl.ob.qf
            r1.<init>()
            com.yandex.metrica.impl.ob.qf$c r2 = new com.yandex.metrica.impl.ob.qf$c
            r2.<init>()
            com.yandex.metrica.impl.ob.Ig r3 = r8.f4730c
            java.lang.String r3 = r3.f4262b
            java.lang.String r4 = r11.w()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0227
            r3 = r4
        L_0x0227:
            r2.f6593a = r3
            com.yandex.metrica.impl.ob.Ig r3 = r8.f4730c
            java.lang.String r3 = r3.f4261a
            java.lang.String r4 = r11.g()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x0238
            r3 = r4
        L_0x0238:
            r2.f6594b = r3
            int r3 = r8.f4734g
            r4 = 4
            int r4 = com.google.protobuf.nano.ym.CodedOutputByteBufferNano.computeMessageSize(r4, r2)
            int r3 = r3 + r4
            r8.f4734g = r3
            r1.f6578b = r2
            com.yandex.metrica.impl.ob.F0 r2 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.Xj r2 = r2.v()
            com.yandex.metrica.impl.ob.O1 r3 = new com.yandex.metrica.impl.ob.O1
            r3.<init>(r8, r1)
            r2.a((com.yandex.metrica.impl.ob.C0263ak) r3)
            java.util.List<com.yandex.metrica.impl.ob.qf$d> r2 = r0.f4739a
            int r3 = r2.size()
            com.yandex.metrica.impl.ob.qf$d[] r3 = new com.yandex.metrica.impl.ob.C0656qf.d[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            com.yandex.metrica.impl.ob.qf$d[] r2 = (com.yandex.metrica.impl.ob.C0656qf.d[]) r2
            r1.f6577a = r2
            org.json.JSONObject r0 = r0.f4741c
            com.yandex.metrica.impl.ob.qf$a[] r0 = r8.a((org.json.JSONObject) r0)
            r1.f6579c = r0
            int r0 = r12.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r12.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.f6581e = r0
            int r0 = r8.f4734g
            r2 = 8
            int r2 = com.google.protobuf.nano.ym.CodedOutputByteBufferNano.computeTagSize(r2)
            int r0 = r0 + r2
            r8.f4734g = r0
            r8.f4731d = r1
            com.yandex.metrica.impl.ob.P1$b r0 = r8.i
            java.util.List<java.lang.Long> r0 = r0.f4740b
            r8.f4733f = r0
            com.yandex.metrica.networktasks.api.SendingDataTaskHelper r0 = r8.s
            byte[] r1 = com.google.protobuf.nano.ym.MessageNano.toByteArray(r1)
            r0.prepareAndSetPostData(r1)
            return r19
        L_0x0299:
            r0 = move-exception
            r1 = r0
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r6)
            throw r1
        L_0x029f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P1.onCreateTask():boolean");
    }

    public void onPerformRequest() {
        this.s.onPerformRequest();
    }

    public void onPostRequestComplete(boolean z) {
        if (z) {
            a(false);
        } else if (A2.b(this.r.getResponseCode())) {
            a(true);
        }
        if (z && this.k.isEnabled()) {
            for (int i2 = 0; i2 < this.i.f4739a.size(); i2++) {
                this.k.a(this.i.f4739a.get(i2), "Event sent");
            }
        }
    }

    public boolean onRequestComplete() {
        return this.s.isResponseValid();
    }

    public void onRequestError(Throwable th) {
    }

    public void onShouldNotExecute() {
    }

    public void onSuccessfulTaskFinished() {
        this.f4728a.l().c();
    }

    public void onTaskAdded() {
        this.f4728a.l().a();
    }

    public void onTaskFinished() {
        this.f4728a.i().a();
        this.f4728a.l().b();
    }

    public void onTaskRemoved() {
        this.f4728a.l().b();
    }

    public void onUnsuccessfulTaskFinished() {
    }

    private C0656qf.a[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C0656qf.a[] aVarArr = new C0656qf.a[length];
        Iterator<String> keys = jSONObject.keys();
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C0656qf.a aVar = new C0656qf.a();
                aVar.f6583a = next;
                aVar.f6584b = jSONObject.getString(next);
                aVarArr[i2] = aVar;
            } catch (Throwable unused) {
            }
            i2++;
        }
        return aVarArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private P1(com.yandex.metrica.impl.ob.L3 r14, com.yandex.metrica.impl.ob.Qg r15, com.yandex.metrica.impl.ob.C0319d1 r16, com.yandex.metrica.networktasks.api.FullUrlFormer<com.yandex.metrica.impl.ob.Lg> r17, com.yandex.metrica.networktasks.api.RequestDataHolder r18, com.yandex.metrica.networktasks.api.ResponseDataHolder r19, com.yandex.metrica.impl.ob.L7 r20, com.yandex.metrica.impl.ob.C0315cm r21, com.yandex.metrica.impl.ob.C0276b8 r22, com.yandex.metrica.networktasks.api.RequestBodyEncrypter r23) {
        /*
            r13 = this;
            com.yandex.metrica.impl.ob.Tm r7 = new com.yandex.metrica.impl.ob.Tm
            r0 = 1024000(0xfa000, float:1.43493E-39)
            java.lang.String r1 = "event value in ReportTask"
            r2 = r21
            r7.<init>(r0, r1, r2)
            com.yandex.metrica.impl.ob.M0 r8 = com.yandex.metrica.impl.ob.C0609oh.a()
            r0 = r13
            r1 = r14
            r3 = r20
            r4 = r15
            r5 = r22
            r6 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P1.<init>(com.yandex.metrica.impl.ob.L3, com.yandex.metrica.impl.ob.Qg, com.yandex.metrica.impl.ob.d1, com.yandex.metrica.networktasks.api.FullUrlFormer, com.yandex.metrica.networktasks.api.RequestDataHolder, com.yandex.metrica.networktasks.api.ResponseDataHolder, com.yandex.metrica.impl.ob.L7, com.yandex.metrica.impl.ob.cm, com.yandex.metrica.impl.ob.b8, com.yandex.metrica.networktasks.api.RequestBodyEncrypter):void");
    }

    private void a(boolean z) {
        this.l.c(this.t);
        C0656qf.d[] dVarArr = this.f4731d.f6577a;
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            try {
                C0656qf.d dVar = dVarArr[i2];
                this.f4732e.a(this.f4733f.get(i2).longValue(), J1.a(dVar.f6606b.f6628c).a(), dVar.f6607c.length, z);
                int i3 = J1.f4302e;
            } catch (Throwable unused) {
            }
        }
        this.f4732e.a(this.f4728a.v().a());
    }

    P1(L3 l3, C0315cm cmVar, L7 l7, Qg qg, C0276b8 b8Var, C0319d1 d1Var, Tm tm, M0 m0, FullUrlFormer<Lg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f4729b = new LinkedHashMap();
        this.f4734g = 0;
        this.f4735h = -1;
        this.s = new SendingDataTaskHelper(requestBodyEncrypter, new Ql(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.n = qg;
        this.f4728a = l3;
        this.f4732e = l7;
        this.k = cmVar;
        this.j = tm;
        this.l = b8Var;
        this.p = d1Var;
        this.m = m0;
        this.q = requestDataHolder;
        this.r = responseDataHolder;
        this.o = fullUrlFormer;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052 A[Catch:{ all -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00f2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.ob.P1.a a(long r17, com.yandex.metrica.impl.ob.C0656qf.d.b r19, com.yandex.metrica.impl.ob.Lg r20, java.util.List<java.lang.Throwable> r21, int r22) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r19
            r4 = r21
            com.yandex.metrica.impl.ob.qf$d r5 = new com.yandex.metrica.impl.ob.qf$d
            r5.<init>()
            r5.f6605a = r2
            r5.f6606b = r0
            int r0 = r0.f6628c
            com.yandex.metrica.impl.ob.f6 r0 = com.yandex.metrica.impl.ob.J1.a((int) r0)
            com.yandex.metrica.impl.ob.L7 r7 = r1.f4732e     // Catch:{ all -> 0x0132 }
            android.database.Cursor r2 = r7.b(r2, r0)     // Catch:{ all -> 0x0132 }
            if (r2 == 0) goto L_0x0113
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0130 }
            r3.<init>()     // Catch:{ all -> 0x0130 }
            r7 = 0
        L_0x0025:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0130 }
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x00f7
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0130 }
            r10.<init>()     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.C0267b.a((android.database.Cursor) r2, (android.content.ContentValues) r10)     // Catch:{ all -> 0x0035 }
        L_0x0035:
            com.yandex.metrica.impl.ob.qe r0 = new com.yandex.metrica.impl.ob.qe     // Catch:{ all -> 0x0049 }
            r0.<init>(r10)     // Catch:{ all -> 0x0049 }
            com.yandex.metrica.impl.ob.a1 r11 = r0.j     // Catch:{ all -> 0x0049 }
            com.yandex.metrica.impl.ob.re r11 = com.yandex.metrica.impl.ob.J1.a((com.yandex.metrica.impl.ob.C0244a1) r11)     // Catch:{ all -> 0x0049 }
            r12 = r20
            com.yandex.metrica.impl.ob.qf$d$a r0 = r11.a(r0, r12)     // Catch:{ all -> 0x0047 }
            goto L_0x0050
        L_0x0047:
            r0 = move-exception
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            r12 = r20
        L_0x004c:
            r4.add(r0)     // Catch:{ all -> 0x0130 }
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x00f2
            com.yandex.metrica.impl.ob.s$a r11 = new com.yandex.metrica.impl.ob.s$a     // Catch:{ all -> 0x0130 }
            java.lang.String r13 = "app_environment"
            java.lang.String r13 = r10.getAsString(r13)     // Catch:{ all -> 0x0130 }
            if (r13 != 0) goto L_0x005e
            java.lang.String r13 = ""
        L_0x005e:
            java.lang.String r14 = "app_environment_revision"
            java.lang.Long r10 = r10.getAsLong(r14)     // Catch:{ all -> 0x0130 }
            r14 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0130 }
            if (r10 != 0) goto L_0x006d
            r10 = r14
        L_0x006d:
            long r14 = r10.longValue()     // Catch:{ all -> 0x0130 }
            r11.<init>(r13, r14)     // Catch:{ all -> 0x0130 }
            if (r7 != 0) goto L_0x00a1
            int r7 = r1.f4735h     // Catch:{ all -> 0x0130 }
            if (r7 >= 0) goto L_0x009f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = r11.f6766a     // Catch:{ all -> 0x0097 }
            r7.<init>(r10)     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.qf$a[] r7 = r1.a((org.json.JSONObject) r7)     // Catch:{ all -> 0x0097 }
            if (r7 == 0) goto L_0x0097
            int r10 = r7.length     // Catch:{ all -> 0x0097 }
            r13 = 0
            r14 = 0
        L_0x008a:
            if (r13 >= r10) goto L_0x0098
            r15 = r7[r13]     // Catch:{ all -> 0x0097 }
            r6 = 7
            int r6 = com.google.protobuf.nano.ym.CodedOutputByteBufferNano.computeMessageSize(r6, r15)     // Catch:{ all -> 0x0097 }
            int r14 = r14 + r6
            int r13 = r13 + 1
            goto L_0x008a
        L_0x0097:
            r14 = 0
        L_0x0098:
            r1.f4735h = r14     // Catch:{ all -> 0x0130 }
            int r6 = r1.f4734g     // Catch:{ all -> 0x0130 }
            int r6 = r6 + r14
            r1.f4734g = r6     // Catch:{ all -> 0x0130 }
        L_0x009f:
            r7 = r11
            goto L_0x00a8
        L_0x00a1:
            boolean r6 = r7.equals(r11)     // Catch:{ all -> 0x0130 }
            if (r6 != 0) goto L_0x00a8
            goto L_0x00f8
        L_0x00a8:
            com.yandex.metrica.impl.ob.fn<byte[]> r6 = r1.j     // Catch:{ all -> 0x0130 }
            byte[] r10 = r0.f6612e     // Catch:{ all -> 0x0130 }
            java.lang.Object r6 = r6.a(r10)     // Catch:{ all -> 0x0130 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0130 }
            byte[] r10 = r0.f6612e     // Catch:{ all -> 0x0130 }
            if (r10 == r6) goto L_0x00c8
            int r11 = r0.j     // Catch:{ all -> 0x0130 }
            if (r10 != 0) goto L_0x00bc
            r10 = 0
            goto L_0x00bd
        L_0x00bc:
            int r10 = r10.length     // Catch:{ all -> 0x0130 }
        L_0x00bd:
            if (r6 != 0) goto L_0x00c1
            r13 = 0
            goto L_0x00c2
        L_0x00c1:
            int r13 = r6.length     // Catch:{ all -> 0x0130 }
        L_0x00c2:
            int r10 = r10 - r13
            int r11 = r11 + r10
            r0.j = r11     // Catch:{ all -> 0x0130 }
            r0.f6612e = r6     // Catch:{ all -> 0x0130 }
        L_0x00c8:
            int r6 = r1.f4734g     // Catch:{ all -> 0x0130 }
            r10 = 3
            int r10 = com.google.protobuf.nano.ym.CodedOutputByteBufferNano.computeMessageSize(r10, r0)     // Catch:{ all -> 0x0130 }
            int r6 = r6 + r10
            r1.f4734g = r6     // Catch:{ all -> 0x0130 }
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r6 == 0) goto L_0x00dc
            if (r22 != 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            if (r6 == 0) goto L_0x00e6
            int r6 = r1.f4734g     // Catch:{ all -> 0x0130 }
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r6 < r10) goto L_0x00ee
            goto L_0x00ef
        L_0x00e6:
            int r6 = r1.f4734g     // Catch:{ all -> 0x0130 }
            r10 = 250880(0x3d400, float:3.51558E-40)
            if (r6 < r10) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r8 = 0
        L_0x00ef:
            if (r8 == 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            r3.add(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x0025
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            int r0 = r3.size()     // Catch:{ all -> 0x0130 }
            if (r0 <= 0) goto L_0x012b
            int r0 = r3.size()     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.qf$d$a[] r0 = new com.yandex.metrica.impl.ob.C0656qf.d.a[r0]     // Catch:{ all -> 0x0130 }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.qf$d$a[] r0 = (com.yandex.metrica.impl.ob.C0656qf.d.a[]) r0     // Catch:{ all -> 0x0130 }
            r5.f6607c = r0     // Catch:{ all -> 0x0130 }
            com.yandex.metrica.impl.ob.P1$a r0 = new com.yandex.metrica.impl.ob.P1$a     // Catch:{ all -> 0x0130 }
            r0.<init>(r5, r7, r8)     // Catch:{ all -> 0x0130 }
            r6 = r0
            goto L_0x012c
        L_0x0113:
            com.yandex.metrica.impl.ob.M0 r0 = r1.m     // Catch:{ all -> 0x0130 }
            java.lang.String r3 = "protobuf_serialization_error"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r6.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r7 = "no reports cursor for session: "
            r6.append(r7)     // Catch:{ all -> 0x0130 }
            r6.append(r5)     // Catch:{ all -> 0x0130 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0130 }
            r0.d(r3, r5)     // Catch:{ all -> 0x0130 }
        L_0x012b:
            r6 = 0
        L_0x012c:
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r2)
            goto L_0x013b
        L_0x0130:
            r0 = move-exception
            goto L_0x0134
        L_0x0132:
            r0 = move-exception
            r2 = 0
        L_0x0134:
            r4.add(r0)     // Catch:{ all -> 0x013c }
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r2)
            r6 = 0
        L_0x013b:
            return r6
        L_0x013c:
            r0 = move-exception
            r3 = r0
            com.yandex.metrica.impl.ob.A2.a((android.database.Cursor) r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P1.a(long, com.yandex.metrica.impl.ob.qf$d$b, com.yandex.metrica.impl.ob.Lg, java.util.List, int):com.yandex.metrica.impl.ob.P1$a");
    }
}
