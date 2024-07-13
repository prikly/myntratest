package com.appodeal.advertising;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.advertising.b;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo;", "", "Landroid/content/Context;", "context", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "getAdvertisingProfile", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchAdvertisingProfile", "", "defaultAdvertisingId", "Ljava/lang/String;", "AdvertisingProfile", "AmazonAdvertisingProfile", "DefaultAdvertisingProfile", "GoogleAdvertisingProfile", "HuaweiAdvertisingProfile", "apd_advertising"}, k = 1, mv = {1, 6, 0})
public final class AdvertisingInfo {
    public static final AdvertisingInfo INSTANCE = new AdvertisingInfo();

    /* renamed from: a  reason: collision with root package name */
    public static final List<AdvertisingProfile> f17768a = CollectionsKt.listOf(new GoogleAdvertisingProfile(), new AmazonAdvertisingProfile(), new HuaweiAdvertisingProfile(), DefaultAdvertisingProfile.INSTANCE);

    /* renamed from: b  reason: collision with root package name */
    public static final MutableStateFlow<b> f17769b = StateFlowKt.MutableStateFlow(b.c.f17780a);
    public static final String defaultAdvertisingId = "00000000-0000-0000-0000-000000000000";

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\fH\u0016R*\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f8\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016R*\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0012\u0010\u001cR*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@DX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "", "Landroid/content/Context;", "context", "", "isEnabled$apd_advertising", "(Landroid/content/Context;)Z", "isEnabled", "", "extractParams$apd_advertising", "(Landroid/content/Context;)V", "extractParams", "", "getUUID$apd_advertising", "(Landroid/content/Context;)Ljava/lang/String;", "getUUID", "toString", "<set-?>", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "id", "b", "Z", "isLimitAdTrackingEnabled", "()Z", "(Z)V", "c", "isAdvertisingIdWasGenerated", "setAdvertisingIdWasGenerated", "<init>", "()V", "apd_advertising"}, k = 1, mv = {1, 6, 0})
    public static abstract class AdvertisingProfile {

        /* renamed from: a  reason: collision with root package name */
        public String f17770a = AdvertisingInfo.defaultAdvertisingId;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17771b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17772c;

        public final void a(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f17770a = str;
        }

        public final void a(boolean z) {
            this.f17771b = z;
        }

        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f17771b || Intrinsics.areEqual((Object) this.f17770a, (Object) AdvertisingInfo.defaultAdvertisingId) || StringsKt.isBlank(this.f17770a) || !a.a(this.f17770a)) {
                this.f17770a = getUUID$apd_advertising(context);
                this.f17772c = true;
            }
        }

        public final String getId() {
            return this.f17770a;
        }

        public String getUUID$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("appodeal", 0);
            String string = sharedPreferences.getString(Constants.UUID, (String) null);
            if (string != null) {
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(Constants.UUID, uuid);
            edit.apply();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString().…apply()\n                }");
            return uuid;
        }

        public final boolean isAdvertisingIdWasGenerated() {
            return this.f17772c;
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return true;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.f17771b;
        }

        public String toString() {
            return getClass().getSimpleName() + "(id='" + this.f17770a + "', isLimitAdTrackingEnabled=" + this.f17771b + ", isAdvertisingIdWasGenerated=" + this.f17772c + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$AmazonAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "()V", "extractParams", "", "context", "Landroid/content/Context;", "extractParams$apd_advertising", "isEnabled", "", "isEnabled$apd_advertising", "apd_advertising"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AmazonAdvertisingProfile extends AdvertisingProfile {
        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(contentResolver, \"advertising_id\")");
            a(string);
            a(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0);
            super.extractParams$apd_advertising(context);
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return Intrinsics.areEqual((Object) "Amazon", (Object) Build.MANUFACTURER);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$DefaultAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "apd_advertising"}, k = 1, mv = {1, 6, 0})
    public static final class DefaultAdvertisingProfile extends AdvertisingProfile {
        public static final DefaultAdvertisingProfile INSTANCE = new DefaultAdvertisingProfile();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$GoogleAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "()V", "extractParams", "", "context", "Landroid/content/Context;", "extractParams$apd_advertising", "isEnabled", "", "isEnabled$apd_advertising", "apd_advertising"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class GoogleAdvertisingProfile extends AdvertisingProfile {
        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            Object invoke2 = cls.getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (invoke2 != null) {
                a((String) invoke2);
                Object invoke3 = cls.getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (invoke3 != null) {
                    a(((Boolean) invoke3).booleanValue());
                    super.extractParams$apd_advertising(context);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/advertising/AdvertisingInfo$HuaweiAdvertisingProfile;", "Lcom/appodeal/advertising/AdvertisingInfo$AdvertisingProfile;", "()V", "extractParams", "", "context", "Landroid/content/Context;", "extractParams$apd_advertising", "isEnabled", "", "isEnabled$apd_advertising", "apd_advertising"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class HuaweiAdvertisingProfile extends AdvertisingProfile {
        public void extractParams$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient$Info");
            Object invoke2 = cls.getDeclaredMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (invoke2 != null) {
                a((String) invoke2);
                Object invoke3 = cls.getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (invoke3 != null) {
                    a(((Boolean) invoke3).booleanValue());
                    super.extractParams$apd_advertising(context);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public boolean isEnabled$apd_advertising(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            return true;
        }
    }

    @DebugMetadata(c = "com.appodeal.advertising.AdvertisingInfo$fetchAdvertisingProfile$2", f = "AdvertisingInfo.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17773a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17773a = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f17773a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            b.a aVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AdvertisingInfo.f17769b.setValue(b.C0211b.f17779a);
            MutableStateFlow access$getState$p = AdvertisingInfo.f17769b;
            List access$getSupportedAdvertisingProfiles$p = AdvertisingInfo.f17768a;
            Context context = this.f17773a;
            Iterator it = access$getSupportedAdvertisingProfiles$p.iterator();
            do {
                aVar = null;
                if (!it.hasNext()) {
                    break;
                }
                AdvertisingProfile advertisingProfile = (AdvertisingProfile) it.next();
                try {
                    if (advertisingProfile.isEnabled$apd_advertising(context)) {
                        advertisingProfile.extractParams$apd_advertising(context);
                        aVar = new b.a(advertisingProfile);
                        continue;
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                }
            } while (aVar == null);
            if (aVar == null) {
                aVar = new b.a(AdvertisingInfo.access$getDefaultProfile(AdvertisingInfo.INSTANCE, this.f17773a));
            }
            access$getState$p.setValue(aVar);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.appodeal.advertising.AdvertisingInfo$getAdvertisingProfile$2", f = "AdvertisingInfo.kt", l = {35, 37}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdvertisingProfile>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f17774a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f17775b;

        @DebugMetadata(c = "com.appodeal.advertising.AdvertisingInfo$getAdvertisingProfile$2$profile$1", f = "AdvertisingInfo.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2<b, Continuation<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f17776a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f17776a = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((b) this.f17776a) instanceof b.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f17775b = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f17775b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f17774a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x001f
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x004f
            L_0x0013:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001b:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x003d
            L_0x001f:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.appodeal.advertising.AdvertisingInfo.f17769b
                com.appodeal.advertising.b$c r1 = com.appodeal.advertising.b.c.f17780a
                com.appodeal.advertising.b$b r5 = com.appodeal.advertising.b.C0211b.f17779a
                boolean r7 = r7.compareAndSet(r1, r5)
                if (r7 == 0) goto L_0x003d
                com.appodeal.advertising.AdvertisingInfo r7 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
                android.content.Context r1 = r6.f17775b
                r6.f17774a = r3
                java.lang.Object r7 = r7.fetchAdvertisingProfile(r1, r6)
                if (r7 != r0) goto L_0x003d
                return r0
            L_0x003d:
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.appodeal.advertising.AdvertisingInfo.f17769b
                com.appodeal.advertising.AdvertisingInfo$b$a r1 = new com.appodeal.advertising.AdvertisingInfo$b$a
                r1.<init>(r4)
                r6.f17774a = r2
                java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.first(r7, r1, r6)
                if (r7 != r0) goto L_0x004f
                return r0
            L_0x004f:
                boolean r0 = r7 instanceof com.appodeal.advertising.b.a
                if (r0 == 0) goto L_0x0056
                com.appodeal.advertising.b$a r7 = (com.appodeal.advertising.b.a) r7
                goto L_0x0057
            L_0x0056:
                r7 = r4
            L_0x0057:
                if (r7 != 0) goto L_0x005a
                goto L_0x005e
            L_0x005a:
                com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r4 = r7.a()
            L_0x005e:
                if (r4 != 0) goto L_0x0068
                com.appodeal.advertising.AdvertisingInfo r7 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
                android.content.Context r0 = r6.f17775b
                com.appodeal.advertising.AdvertisingInfo$DefaultAdvertisingProfile r4 = com.appodeal.advertising.AdvertisingInfo.access$getDefaultProfile(r7, r0)
            L_0x0068:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.advertising.AdvertisingInfo.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final DefaultAdvertisingProfile access$getDefaultProfile(AdvertisingInfo advertisingInfo, Context context) {
        advertisingInfo.getClass();
        DefaultAdvertisingProfile defaultAdvertisingProfile = DefaultAdvertisingProfile.INSTANCE;
        defaultAdvertisingProfile.extractParams$apd_advertising(context);
        return defaultAdvertisingProfile;
    }

    public final Object fetchAdvertisingProfile(Context context, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new a(context, (Continuation<? super a>) null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object getAdvertisingProfile(Context context, Continuation<? super AdvertisingProfile> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(context, (Continuation<? super b>) null), continuation);
    }
}
