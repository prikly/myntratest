package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final int REMOTE = 1;
    public static final VersionPolicy zza = new zzl();
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzp) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0283, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r17, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r18, java.lang.String r19) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.ThreadLocal r0 = zzg
            java.lang.Object r0 = r0.get()
            r5 = r0
            com.google.android.gms.dynamite.zzn r5 = (com.google.android.gms.dynamite.zzn) r5
            com.google.android.gms.dynamite.zzn r6 = new com.google.android.gms.dynamite.zzn
            r7 = 0
            r6.<init>(r7)
            java.lang.ThreadLocal r0 = zzg
            r0.set(r6)
            java.lang.ThreadLocal r0 = zzh
            java.lang.Object r0 = r0.get()
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            r10 = 0
            java.lang.ThreadLocal r0 = zzh     // Catch:{ all -> 0x02da }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02da }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02da }
            r0.set(r12)     // Catch:{ all -> 0x02da }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r0 = zzi     // Catch:{ all -> 0x02da }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r12 = r2.selectModule(r1, r3, r0)     // Catch:{ all -> 0x02da }
            int r0 = r12.localVersion     // Catch:{ all -> 0x02da }
            int r13 = r12.remoteVersion     // Catch:{ all -> 0x02da }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x02da }
            r14.<init>()     // Catch:{ all -> 0x02da }
            java.lang.String r15 = "Considering local module "
            r14.append(r15)     // Catch:{ all -> 0x02da }
            r14.append(r3)     // Catch:{ all -> 0x02da }
            java.lang.String r15 = ":"
            r14.append(r15)     // Catch:{ all -> 0x02da }
            r14.append(r0)     // Catch:{ all -> 0x02da }
            java.lang.String r0 = " and remote module "
            r14.append(r0)     // Catch:{ all -> 0x02da }
            r14.append(r3)     // Catch:{ all -> 0x02da }
            java.lang.String r0 = ":"
            r14.append(r0)     // Catch:{ all -> 0x02da }
            r14.append(r13)     // Catch:{ all -> 0x02da }
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x02da }
            android.util.Log.i(r0, r13)     // Catch:{ all -> 0x02da }
            int r0 = r12.selection     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x02a6
            r13 = -1
            if (r0 != r13) goto L_0x007b
            int r0 = r12.localVersion     // Catch:{ all -> 0x02da }
            if (r0 == 0) goto L_0x02a6
            r0 = -1
        L_0x007b:
            r14 = 1
            if (r0 != r14) goto L_0x0082
            int r15 = r12.remoteVersion     // Catch:{ all -> 0x02da }
            if (r15 == 0) goto L_0x02a6
        L_0x0082:
            if (r0 != r13) goto L_0x00a8
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{ all -> 0x02da }
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0092
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x009b
        L_0x0092:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x009b:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x00a2
        L_0x009f:
            r1.close()
        L_0x00a2:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r5)
            return r0
        L_0x00a8:
            if (r0 != r14) goto L_0x028f
            int r0 = r12.remoteVersion     // Catch:{ LoadingException -> 0x023a }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            boolean r16 = zzf(r17)     // Catch:{ all -> 0x021d }
            if (r16 == 0) goto L_0x0215
            java.lang.Boolean r16 = zzb     // Catch:{ all -> 0x021d }
            monitor-exit(r4)     // Catch:{ all -> 0x021d }
            if (r16 == 0) goto L_0x020d
            boolean r16 = r16.booleanValue()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r14 = 2
            if (r16 == 0) goto L_0x0161
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r15 = "Selected remote version of "
            r13.append(r15)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r13.append(r3)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r15 = ", version >= "
            r13.append(r15)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r13.append(r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r15 = "DynamiteModule"
            java.lang.String r13 = r13.toString()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            android.util.Log.i(r15, r13)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamite.zzr r13 = zzl     // Catch:{ all -> 0x015e }
            monitor-exit(r4)     // Catch:{ all -> 0x015e }
            if (r13 == 0) goto L_0x0156
            java.lang.ThreadLocal r15 = zzg     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.Object r15 = r15.get()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamite.zzn r15 = (com.google.android.gms.dynamite.zzn) r15     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r15 == 0) goto L_0x014e
            android.database.Cursor r10 = r15.zza     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r10 == 0) goto L_0x014e
            android.content.Context r10 = r17.getApplicationContext()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            android.database.Cursor r11 = r15.zza     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            int r15 = zze     // Catch:{ all -> 0x014b }
            if (r15 < r14) goto L_0x0101
            r14 = 1
            goto L_0x0102
        L_0x0101:
            r14 = 0
        L_0x0102:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x014b }
            monitor-exit(r4)     // Catch:{ all -> 0x014b }
            boolean r4 = r14.booleanValue()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r4 == 0) goto L_0x0121
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r14 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r14)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r13.zzf(r4, r3, r0, r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            goto L_0x0134
        L_0x0121:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r14 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r14)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r13.zze(r4, r3, r0, r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x0134:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r0 == 0) goto L_0x0143
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            goto L_0x01db
        L_0x0143:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "Failed to get module context"
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x014b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x014e:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "No result cursor"
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x0156:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x015e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x0161:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r10 = "Selected remote version of "
            r4.append(r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r4.append(r3)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r10 = ", version >= "
            r4.append(r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r4.append(r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            android.util.Log.i(r10, r4)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamite.zzq r4 = zzg(r17)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r4 == 0) goto L_0x0205
            int r10 = r4.zze()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r11 = 3
            if (r10 < r11) goto L_0x01ad
            java.lang.ThreadLocal r10 = zzg     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.Object r10 = r10.get()     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamite.zzn r10 = (com.google.android.gms.dynamite.zzn) r10     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r10 == 0) goto L_0x01a5
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r17)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            android.database.Cursor r10 = r10.zza     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzi(r11, r3, r0, r10)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            goto L_0x01ce
        L_0x01a5:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "No cached result cursor holder"
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x01ad:
            if (r10 != r14) goto L_0x01bf
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "IDynamite loader version = 2"
            android.util.Log.w(r10, r11)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r17)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzj(r10, r3, r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            goto L_0x01ce
        L_0x01bf:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r10, r11)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r17)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzh(r10, r3, r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x01ce:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            if (r0 == 0) goto L_0x01fd
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            r4.<init>(r0)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x01db:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01e7
            java.lang.ThreadLocal r0 = zzh
            r0.remove()
            goto L_0x01f0
        L_0x01e7:
            java.lang.ThreadLocal r0 = zzh
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.set(r1)
        L_0x01f0:
            android.database.Cursor r0 = r6.zza
            if (r0 == 0) goto L_0x01f7
            r0.close()
        L_0x01f7:
            java.lang.ThreadLocal r0 = zzg
            r0.set(r5)
            return r4
        L_0x01fd:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "Failed to load remote module."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x0205:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x020d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r0.<init>(r4, r7)     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x0215:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x021d }
            java.lang.String r10 = "Remote loading disabled"
            r0.<init>(r10, r7)     // Catch:{ all -> 0x021d }
            throw r0     // Catch:{ all -> 0x021d }
        L_0x021d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x021d }
            throw r0     // Catch:{ RemoteException -> 0x0224, LoadingException -> 0x0222, all -> 0x0220 }
        L_0x0220:
            r0 = move-exception
            goto L_0x0226
        L_0x0222:
            r0 = move-exception
            goto L_0x0231
        L_0x0224:
            r0 = move-exception
            goto L_0x0232
        L_0x0226:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch:{ all -> 0x02d6 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02d6 }
            java.lang.String r10 = "Failed to load remote module."
            r4.<init>(r10, r0, r7)     // Catch:{ all -> 0x02d6 }
            throw r4     // Catch:{ all -> 0x02d6 }
        L_0x0231:
            throw r0     // Catch:{ all -> 0x02d6 }
        L_0x0232:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x02d6 }
            java.lang.String r10 = "Failed to load remote module."
            r4.<init>(r10, r0, r7)     // Catch:{ all -> 0x02d6 }
            throw r4     // Catch:{ all -> 0x02d6 }
        L_0x023a:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()     // Catch:{  }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{  }
            r10.<init>()     // Catch:{  }
            java.lang.String r11 = "Failed to load remote module: "
            r10.append(r11)     // Catch:{  }
            r10.append(r4)     // Catch:{  }
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r10 = r10.toString()     // Catch:{  }
            android.util.Log.w(r4, r10)     // Catch:{  }
            int r4 = r12.localVersion     // Catch:{  }
            if (r4 == 0) goto L_0x0287
            com.google.android.gms.dynamite.zzo r10 = new com.google.android.gms.dynamite.zzo     // Catch:{  }
            r11 = 0
            r10.<init>(r4, r11)     // Catch:{  }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r2 = r2.selectModule(r1, r3, r10)     // Catch:{  }
            int r2 = r2.selection     // Catch:{  }
            r4 = -1
            if (r2 != r4) goto L_0x0287
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{  }
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0278
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x0281
        L_0x0278:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x0281:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x00a2
            goto L_0x009f
        L_0x0287:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0, r7)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x028f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
            r2.<init>()     // Catch:{  }
            java.lang.String r3 = "VersionPolicy returned invalid code:"
            r2.append(r3)     // Catch:{  }
            r2.append(r0)     // Catch:{  }
            java.lang.String r0 = r2.toString()     // Catch:{  }
            r1.<init>(r0, r7)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x02a6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            int r1 = r12.localVersion     // Catch:{  }
            int r2 = r12.remoteVersion     // Catch:{  }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            r4.<init>()     // Catch:{  }
            java.lang.String r10 = "No acceptable module "
            r4.append(r10)     // Catch:{  }
            r4.append(r3)     // Catch:{  }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{  }
            r4.append(r2)     // Catch:{  }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = r4.toString()     // Catch:{  }
            r0.<init>(r1, r7)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x02d6:
            r0 = move-exception
            r1 = 0
            goto L_0x02dc
        L_0x02da:
            r0 = move-exception
            r1 = r10
        L_0x02dc:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x02e6
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x02ef
        L_0x02e6:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x02ef:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x02f6
            r1.close()
        L_0x02f6:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:17:0x003b=Splitter:B:17:0x003b, B:50:0x009c=Splitter:B:50:0x009c} */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r1 = zzb     // Catch:{ all -> 0x01c1 }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00da
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            zzd(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x003f:
            boolean r5 = zzf(r10)     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r3
        L_0x0048:
            boolean r5 = zzd     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x00a9
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x00b4 }
            if (r5 == 0) goto L_0x0055
            goto L_0x00a9
        L_0x0055:
            r5 = 1
            int r5 = zzb(r10, r11, r12, r5)     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x009f }
            if (r6 == 0) goto L_0x009c
            boolean r6 = r6.isEmpty()     // Catch:{ LoadingException -> 0x009f }
            if (r6 == 0) goto L_0x0065
            goto L_0x009c
        L_0x0065:
            java.lang.ClassLoader r6 = com.google.android.gms.dynamite.zzb.zza()     // Catch:{ LoadingException -> 0x009f }
            if (r6 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009f }
            r7 = 29
            if (r6 < r7) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = zzc     // Catch:{ LoadingException -> 0x009f }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x009f }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.zzc r6 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = zzc     // Catch:{ LoadingException -> 0x009f }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x009f }
        L_0x008f:
            zzd(r6)     // Catch:{ LoadingException -> 0x009f }
            r1.set(r2, r6)     // Catch:{ LoadingException -> 0x009f }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x009f }
            zzb = r6     // Catch:{ LoadingException -> 0x009f }
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r5
        L_0x009c:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r5
        L_0x009f:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x00a9:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x00d8
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            goto L_0x00bc
        L_0x00b9:
            r1 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r1 = move-exception
        L_0x00bc:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r4.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x01c1 }
            r4.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01c1 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01c1 }
        L_0x00d8:
            zzb = r1     // Catch:{ all -> 0x01c1 }
        L_0x00da:
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0102
            int r10 = zzb(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00e6 }
            return r10
        L_0x00e6:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r12.<init>()     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01c4 }
            r12.append(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01c4 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01c4 }
            return r3
        L_0x0102:
            com.google.android.gms.dynamite.zzq r4 = zzg(r10)     // Catch:{ all -> 0x01c4 }
            if (r4 != 0) goto L_0x010a
            goto L_0x01b8
        L_0x010a:
            int r0 = r4.zze()     // Catch:{ RemoteException -> 0x0197 }
            r1 = 3
            if (r0 < r1) goto L_0x0172
            java.lang.ThreadLocal r0 = zzg     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x0197 }
            if (r0 == 0) goto L_0x0125
            android.database.Cursor r0 = r0.zza     // Catch:{ RemoteException -> 0x0197 }
            if (r0 == 0) goto L_0x0125
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01b8
        L_0x0125:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0197 }
            java.lang.ThreadLocal r0 = zzh     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0197 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0197 }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.zzk(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)     // Catch:{ RemoteException -> 0x0197 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0197 }
            if (r11 == 0) goto L_0x015f
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r12 != 0) goto L_0x014a
            goto L_0x015f
        L_0x014a:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r12 <= 0) goto L_0x0157
            boolean r0 = zze(r11)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r0 == 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r2 = r11
        L_0x0158:
            if (r2 == 0) goto L_0x015d
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x015d:
            r3 = r12
            goto L_0x01b8
        L_0x015f:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r11 == 0) goto L_0x01b8
            r11.close()     // Catch:{ all -> 0x01c4 }
            goto L_0x01b8
        L_0x016c:
            r12 = move-exception
            r2 = r11
            goto L_0x01bb
        L_0x016f:
            r12 = move-exception
            r2 = r11
            goto L_0x0199
        L_0x0172:
            r1 = 2
            if (r0 != r1) goto L_0x0185
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0197 }
            int r3 = r4.zzg(r0, r11, r12)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01b8
        L_0x0185:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0197 }
            int r3 = r4.zzf(r0, r11, r12)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01b8
        L_0x0195:
            r12 = r11
            goto L_0x01bb
        L_0x0197:
            r11 = move-exception
            r12 = r11
        L_0x0199:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x01b9 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r12.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01b9 }
            r12.append(r11)     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01b9 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x01b8
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x01b8:
            return r3
        L_0x01b9:
            r11 = move-exception
            goto L_0x0195
        L_0x01bb:
            if (r2 == 0) goto L_0x01c0
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x01c0:
            throw r12     // Catch:{ all -> 0x01c4 }
        L_0x01c1:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            throw r11     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = zzh     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            zzc = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            zze = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            zzd = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = zze(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00c7
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00c5 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00c5 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00c5 }
            throw r12     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r0 = r10
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            r0.close()
        L_0x00cc:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            zzl = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, (zzp) null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zzn = (zzn) zzg.get();
        if (zzn == null || zzn.zza != null) {
            return false;
        }
        zzn.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (Boolean.TRUE.equals((Object) null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzf = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = zzk;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    zzk = zzq;
                    return zzq;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
        }
        return null;
    }

    public Context getModuleContext() {
        return this.zzj;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, (zzp) null);
        }
    }
}
