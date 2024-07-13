package com.yandex.metrica.impl.ob;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.impl.ob.C0855z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/metrica/impl/ob/y;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/v;", "converter", "Lcom/yandex/metrica/impl/ob/z;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/v;)Lcom/yandex/metrica/impl/ob/z;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.impl.ob.y  reason: case insensitive filesystem */
public final class C0831y {

    /* renamed from: a  reason: collision with root package name */
    public static final C0831y f7128a = new C0831y();

    /* renamed from: com.yandex.metrica.impl.ob.y$a */
    static final class a<T, R> implements C0614om<UsageStatsManager, C0855z.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0759v f7129a;

        a(C0759v vVar) {
            this.f7129a = vVar;
        }

        public Object a(Object obj) {
            C0759v vVar = this.f7129a;
            int appStandbyBucket = ((UsageStatsManager) obj).getAppStandbyBucket();
            vVar.getClass();
            if (A2.a(28)) {
                if (A2.a(30) && appStandbyBucket == 45) {
                    return C0855z.a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return C0855z.a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return C0855z.a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return C0855z.a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return C0855z.a.RARE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$b */
    static final class b<T, R> implements C0614om<ActivityManager, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7130a = new b();

        b() {
        }

        public Object a(Object obj) {
            return Boolean.valueOf(((ActivityManager) obj).isBackgroundRestricted());
        }
    }

    private C0831y() {
    }

    public static final C0855z a(Context context, C0759v vVar) {
        return new C0855z((C0855z.a) A2.a(new a(vVar), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) A2.a(b.f7130a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
