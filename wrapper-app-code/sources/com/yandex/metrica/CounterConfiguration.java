package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.C0368f0;
import com.yandex.metrica.impl.ob.C0772vc;

@Deprecated
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final ContentValues f3363a;

    class a implements Parcelable.Creator<CounterConfiguration> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues) parcel.readBundle(C0368f0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        public Object[] newArray(int i) {
            return new CounterConfiguration[i];
        }
    }

    public enum b {
        MAIN("main"),
        MANUAL("manual"),
        APPMETRICA("appmetrica"),
        COMMUTATION("commutation"),
        SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
        SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
        CRASH(AppMeasurement.CRASH_ORIGIN);
        

        /* renamed from: a  reason: collision with root package name */
        private final String f3371a;

        private b(String str) {
            this.f3371a = str;
        }

        public String a() {
            return this.f3371a;
        }

        public static b a(String str) {
            b[] values = values();
            for (int i2 = 0; i2 < 7; i2++) {
                b bVar = values[i2];
                if (bVar.f3371a.equals(str)) {
                    return bVar;
                }
            }
            return MAIN;
        }
    }

    public CounterConfiguration(CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f3363a = new ContentValues(counterConfiguration.f3363a);
            r();
        }
    }

    private void a(String str) {
        if (A2.a((Object) str)) {
            synchronized (this) {
                this.f3363a.put("CFG_API_KEY", str);
            }
        }
    }

    private void b(Integer num) {
        if (A2.a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                ContentValues contentValues = this.f3363a;
                if (intValue <= 0) {
                    intValue = Integer.MAX_VALUE;
                }
                contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(intValue));
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void c(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "20799a27-fa80-4b36-b2db-0f8141f24180"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001a
            com.yandex.metrica.CounterConfiguration$b r3 = com.yandex.metrica.CounterConfiguration.b.APPMETRICA
            monitor-enter(r2)
            android.content.ContentValues r0 = r2.f3363a     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            r0.put(r1, r3)     // Catch:{ all -> 0x0017 }
            goto L_0x0028
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x001a:
            com.yandex.metrica.CounterConfiguration$b r3 = com.yandex.metrica.CounterConfiguration.b.MANUAL
            monitor-enter(r2)
            android.content.ContentValues r0 = r2.f3363a     // Catch:{ all -> 0x002a }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            r0.put(r1, r3)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.c(java.lang.String):void");
    }

    private void d(Integer num) {
        if (A2.a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f3363a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(intValue));
            }
        }
    }

    private void e(i iVar) {
        if (A2.a((Object) iVar.locationTracking)) {
            b(iVar.locationTracking.booleanValue());
        }
    }

    private void f(i iVar) {
        if (A2.a((Object) iVar.location)) {
            a(iVar.location);
        }
    }

    private void g(i iVar) {
        if (A2.a((Object) iVar.j)) {
            boolean booleanValue = iVar.j.booleanValue();
            synchronized (this) {
                this.f3363a.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(booleanValue));
            }
        }
    }

    private void h(i iVar) {
        if (A2.a((Object) iVar.revenueAutoTrackingEnabled)) {
            boolean booleanValue = iVar.revenueAutoTrackingEnabled.booleanValue();
            synchronized (this) {
                this.f3363a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(booleanValue));
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void r() {
        /*
            r3 = this;
            android.content.ContentValues r0 = r3.f3363a
            java.lang.String r1 = "CFG_REPORTER_TYPE"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.content.ContentValues r0 = r3.f3363a
            java.lang.String r1 = "CFG_MAIN_REPORTER"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x003d
            android.content.ContentValues r0 = r3.f3363a
            java.lang.String r1 = "CFG_MAIN_REPORTER"
            java.lang.Boolean r0 = r0.getAsBoolean(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0035
            com.yandex.metrica.CounterConfiguration$b r0 = com.yandex.metrica.CounterConfiguration.b.MAIN
            monitor-enter(r3)
            android.content.ContentValues r1 = r3.f3363a     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "CFG_REPORTER_TYPE"
            r1.put(r2, r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0063
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0035:
            java.lang.String r0 = r3.a()
            r3.c((java.lang.String) r0)
            goto L_0x0068
        L_0x003d:
            android.content.ContentValues r0 = r3.f3363a
            java.lang.String r1 = "CFG_COMMUTATION_REPORTER"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0068
            android.content.ContentValues r0 = r3.f3363a
            java.lang.String r1 = "CFG_COMMUTATION_REPORTER"
            java.lang.Boolean r0 = r0.getAsBoolean(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            com.yandex.metrica.CounterConfiguration$b r0 = com.yandex.metrica.CounterConfiguration.b.COMMUTATION
            monitor-enter(r3)
            android.content.ContentValues r1 = r3.f3363a     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "CFG_REPORTER_TYPE"
            r1.put(r2, r0)     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r3)
            goto L_0x0068
        L_0x0065:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.r():void");
    }

    public int describeContents() {
        return 0;
    }

    public Integer i() {
        return this.f3363a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    public Boolean j() {
        return this.f3363a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    public b k() {
        return b.a(this.f3363a.getAsString("CFG_REPORTER_TYPE"));
    }

    public Integer l() {
        return this.f3363a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public Boolean m() {
        return this.f3363a.getAsBoolean("CFG_STATISTICS_SENDING");
    }

    public Boolean n() {
        return this.f3363a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    public Boolean o() {
        return this.f3363a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    public Boolean p() {
        return this.f3363a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    public synchronized Boolean q() {
        return this.f3363a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f3363a + '}';
    }

    public synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f3363a);
        parcel.writeBundle(bundle);
    }

    private void a(Integer num) {
        if (A2.a((Object) num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f3363a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(intValue));
            }
        }
    }

    public Integer e() {
        return this.f3363a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public Boolean f() {
        return this.f3363a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
    }

    private void b(i iVar) {
        if (!TextUtils.isEmpty(iVar.appVersion)) {
            String str = iVar.appVersion;
            synchronized (this) {
                this.f3363a.put("CFG_APP_VERSION", str);
            }
        }
    }

    private void d(i iVar) {
        if (A2.a((Object) iVar.firstActivationAsUpdate)) {
            boolean booleanValue = iVar.firstActivationAsUpdate.booleanValue();
            synchronized (this) {
                this.f3363a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(booleanValue));
            }
        }
    }

    public Location g() {
        if (!this.f3363a.containsKey("CFG_MANUAL_LOCATION")) {
            return null;
        }
        byte[] asByteArray = this.f3363a.getAsByteArray("CFG_MANUAL_LOCATION");
        int i = C0772vc.q;
        if (asByteArray == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(asByteArray, 0, asByteArray.length);
            obtain.setDataPosition(0);
            Location location = (Location) obtain.readValue(Location.class.getClassLoader());
            obtain.recycle();
            return location;
        } catch (Throwable unused) {
            obtain.recycle();
            return null;
        }
    }

    public Integer h() {
        return this.f3363a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    public CounterConfiguration() {
        this.f3363a = new ContentValues();
    }

    private void a(Boolean bool) {
        if (A2.a((Object) bool)) {
            boolean booleanValue = bool.booleanValue();
            synchronized (this) {
                this.f3363a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(booleanValue));
            }
        }
    }

    private void c(i iVar) {
        if (A2.a((Object) iVar.f3627a)) {
            String str = iVar.f3627a;
            synchronized (this) {
                ContentValues contentValues = this.f3363a;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
            }
        }
    }

    public String d() {
        return this.f3363a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    public CounterConfiguration(i iVar, b bVar) {
        this();
        synchronized (this) {
            a(iVar.apiKey);
            d(iVar.sessionTimeout);
            f(iVar);
            e(iVar);
            c(iVar);
            a(iVar.f3632f);
            b(iVar.f3633g);
            b(iVar);
            a(iVar);
            g(iVar);
            d(iVar);
            c(iVar.statisticsSending);
            c(iVar.maxReportsInDatabaseCount);
            b(iVar.nativeCrashReporting);
            h(iVar);
            a(bVar);
        }
    }

    private void b(Boolean bool) {
        if (A2.a((Object) bool)) {
            this.f3363a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
        }
    }

    public synchronized void d(String str) {
        this.f3363a.put("CFG_UUID", str);
    }

    private void a(i iVar) {
        if (A2.a((Object) iVar.f3631e)) {
            int intValue = iVar.f3631e.intValue();
            synchronized (this) {
                this.f3363a.put("CFG_APP_VERSION_CODE", String.valueOf(intValue));
            }
        }
    }

    private void c(Boolean bool) {
        if (A2.a((Object) bool)) {
            c(bool.booleanValue());
        }
    }

    public synchronized void b(String str) {
        this.f3363a.put("CFG_API_KEY", str);
    }

    private void c(Integer num) {
        if (A2.a((Object) num)) {
            this.f3363a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    public synchronized void b(boolean z) {
        this.f3363a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    public String a() {
        return this.f3363a.getAsString("CFG_API_KEY");
    }

    public String b() {
        return this.f3363a.getAsString("CFG_APP_VERSION_CODE");
    }

    public synchronized void a(boolean z) {
        this.f3363a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf(z));
    }

    public String c() {
        return this.f3363a.getAsString("CFG_APP_VERSION");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.location.Location r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.ContentValues r0 = r4.f3363a     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "CFG_MANUAL_LOCATION"
            int r2 = com.yandex.metrica.impl.ob.C0772vc.q     // Catch:{ all -> 0x001d }
            r2 = 0
            if (r5 == 0) goto L_0x0018
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x001d }
            r3.writeValue(r5)     // Catch:{ all -> 0x0015 }
            byte[] r2 = r3.marshall()     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.recycle()     // Catch:{ all -> 0x001d }
        L_0x0018:
            r0.put(r1, r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r4)
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.a(android.location.Location):void");
    }

    public final synchronized void c(boolean z) {
        this.f3363a.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z));
    }

    public CounterConfiguration(e eVar) {
        this();
        synchronized (this) {
            a(eVar.apiKey);
            d(eVar.sessionTimeout);
            a(eVar.f3574a);
            b(eVar.f3575b);
            a(eVar.logs);
            c(eVar.statisticsSending);
            c(eVar.maxReportsInDatabaseCount);
            c(eVar.apiKey);
        }
    }

    CounterConfiguration(ContentValues contentValues) {
        this.f3363a = contentValues;
        r();
    }

    public synchronized void a(b bVar) {
        this.f3363a.put("CFG_REPORTER_TYPE", bVar.a());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static com.yandex.metrica.CounterConfiguration a(android.os.Bundle r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x000e
            java.lang.String r1 = "COUNTER_CFG_OBJ"
            android.os.Parcelable r1 = r4.getParcelable(r1)     // Catch:{ all -> 0x000d }
            com.yandex.metrica.CounterConfiguration r1 = (com.yandex.metrica.CounterConfiguration) r1     // Catch:{ all -> 0x000d }
            r0 = r1
            goto L_0x000e
        L_0x000d:
            return r0
        L_0x000e:
            if (r0 != 0) goto L_0x0015
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            r0.<init>()
        L_0x0015:
            monitor-enter(r0)
            if (r4 != 0) goto L_0x001a
            goto L_0x009b
        L_0x001a:
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = "CFG_DISPATCH_PERIOD"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f3363a     // Catch:{ all -> 0x0036 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "CFG_DISPATCH_PERIOD"
            r2.put(r3, r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0039
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x0039:
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "CFG_SESSION_TIMEOUT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f3363a     // Catch:{ all -> 0x0055 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "CFG_SESSION_TIMEOUT"
            r2.put(r3, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x0058
        L_0x0055:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x0058:
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x007c
            java.lang.String r1 = "CFG_MAX_REPORTS_COUNT"
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x009d }
            monitor-enter(r0)     // Catch:{ all -> 0x009d }
            android.content.ContentValues r2 = r0.f3363a     // Catch:{ all -> 0x0079 }
            java.lang.String r3 = "CFG_MAX_REPORTS_COUNT"
            if (r1 > 0) goto L_0x0070
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0070:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x007c
        L_0x0079:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r4     // Catch:{ all -> 0x009d }
        L_0x007c:
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "-1"
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x009b
            java.lang.String r1 = "CFG_API_KEY"
            java.lang.String r4 = r4.getString(r1)     // Catch:{ all -> 0x009d }
            r0.b((java.lang.String) r4)     // Catch:{ all -> 0x009d }
        L_0x009b:
            monitor-exit(r0)
            return r0
        L_0x009d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.CounterConfiguration.a(android.os.Bundle):com.yandex.metrica.CounterConfiguration");
    }
}
