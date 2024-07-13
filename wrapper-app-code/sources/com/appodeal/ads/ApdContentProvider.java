package com.appodeal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appodeal.ads.context.g;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/ApdContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "a", "apd_core"}, k = 1, mv = {1, 6, 0})
public final class ApdContentProvider extends ContentProvider {

    public static final class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        public static boolean f16109b;

        /* renamed from: a  reason: collision with root package name */
        public final Context f16110a;

        /* renamed from: com.appodeal.ads.ApdContentProvider$a$a  reason: collision with other inner class name */
        public static final class C0159a {
            public static void a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (!a.f16109b) {
                    a.f16109b = true;
                    new a(context, 0).start();
                }
            }
        }

        public a(Context context) {
            this.f16110a = context;
            setName("AppodealPrepare");
        }

        public /* synthetic */ a(Context context, int i) {
            this(context);
        }

        public final void run() {
            try {
                i.c(this.f16110a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final boolean onCreate() {
        Context applicationContext;
        Context context = getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return false;
        }
        NetworkStatus.INSTANCE.init(applicationContext);
        g.f16345b.setApplicationContext(applicationContext);
        boolean z = a.f16109b;
        a.C0159a.a(applicationContext);
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
