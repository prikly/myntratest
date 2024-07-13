package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.i;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class A3 implements Parcelable {
    public static final Parcelable.Creator<A3> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f3684c = UUID.randomUUID().toString();

    /* renamed from: a  reason: collision with root package name */
    private final ContentValues f3685a;

    /* renamed from: b  reason: collision with root package name */
    private ResultReceiver f3686b;

    class a implements Parcelable.Creator<A3> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C0368f0.class.getClassLoader());
            return new A3((ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        public Object[] newArray(int i) {
            return new A3[i];
        }
    }

    public A3(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f3685a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f3684c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(YandexMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f3686b = resultReceiver;
    }

    public static A3 a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (A3) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void b(com.yandex.metrica.i r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<java.lang.String> r0 = r4.f3630d     // Catch:{ all -> 0x0040 }
            boolean r0 = com.yandex.metrica.impl.ob.A2.a((java.lang.Object) r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x001c
            java.util.List<java.lang.String> r0 = r4.f3630d     // Catch:{ all -> 0x0040 }
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r1 = r3.f3685a     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = com.yandex.metrica.impl.ob.Tl.c((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = "PROCESS_CFG_CUSTOM_HOSTS"
            r1.put(r2, r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x001c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f3628b     // Catch:{ all -> 0x0040 }
            boolean r0 = com.yandex.metrica.impl.ob.A2.a((java.lang.Object) r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f3628b     // Catch:{ all -> 0x0040 }
            java.util.Map r0 = com.yandex.metrica.impl.ob.Tl.i(r0)     // Catch:{ all -> 0x0040 }
            monitor-enter(r3)     // Catch:{ all -> 0x0040 }
            android.content.ContentValues r1 = r3.f3685a     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = com.yandex.metrica.impl.ob.Tl.g(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "PROCESS_CFG_CLIDS"
            r1.put(r2, r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x003b
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x003b:
            r3.a((com.yandex.metrica.i) r4)     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.A3.b(com.yandex.metrica.i):void");
    }

    public ResultReceiver c() {
        return this.f3686b;
    }

    public String d() {
        return this.f3685a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f3685a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public String f() {
        return this.f3685a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public Integer g() {
        return this.f3685a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public String h() {
        return this.f3685a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public int i() {
        return this.f3685a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    public boolean j() {
        return this.f3685a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f3685a + ", mDataResultReceiver=" + this.f3686b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f3685a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f3686b);
        parcel.writeBundle(bundle);
    }

    private void a(i iVar) {
        if (A2.a((Object) iVar.f3629c)) {
            String str = iVar.f3629c;
            synchronized (this) {
                this.f3685a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            synchronized (this) {
                this.f3685a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            }
        }
    }

    public synchronized void a(List<String> list) {
        this.f3685a.put("PROCESS_CFG_CUSTOM_HOSTS", Tl.c(list));
    }

    public Map<String, String> a() {
        return Tl.d(this.f3685a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public synchronized void a(Map<String, String> map) {
        this.f3685a.put("PROCESS_CFG_CLIDS", Tl.g(map));
    }

    public A3(A3 a3) {
        synchronized (a3) {
            this.f3685a = new ContentValues(a3.f3685a);
            this.f3686b = a3.f3686b;
        }
    }

    public synchronized void a(String str) {
        this.f3685a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    public List<String> b() {
        String asString = this.f3685a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return Tl.c(asString);
    }

    public synchronized void b(String str) {
        this.f3685a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
    }

    public A3(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f3685a = contentValues == null ? new ContentValues() : contentValues;
        this.f3686b = resultReceiver;
    }
}
