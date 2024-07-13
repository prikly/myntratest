package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.multipro.a.b;
import com.bytedance.sdk.openadsdk.multipro.c.a;
import com.bytedance.sdk.openadsdk.multipro.d.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TTProviderManager */
public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f2179a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<Context> f2180b;

    /* renamed from: c  reason: collision with root package name */
    private static List<a> f2181c;

    private boolean c(Uri uri) {
        return true;
    }

    public String a() {
        return "";
    }

    public void b() {
    }

    static {
        List<a> synchronizedList = Collections.synchronizedList(new ArrayList());
        f2181c = synchronizedList;
        synchronizedList.add(new c());
        f2181c.add(new b());
        f2181c.add(new com.bytedance.sdk.openadsdk.multipro.c.b());
        f2181c.add(new a());
        for (a b2 : f2181c) {
            b2.b();
        }
    }

    public static f a(Context context) {
        if (context != null) {
            f2180b = new WeakReference<>(context.getApplicationContext());
        }
        if (f2179a == null) {
            synchronized (f.class) {
                if (f2179a == null) {
                    f2179a = new f();
                }
            }
        }
        return f2179a;
    }

    private f() {
    }

    private a b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!c(uri)) {
            l.b("TTProviderManager", "uri is error1");
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            l.b("TTProviderManager", "uri is error2");
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            l.b("TTProviderManager", "uri is error3");
            return null;
        }
        for (a next : f2181c) {
            if (str.equals(next.a())) {
                return next;
            }
        }
        l.b("TTProviderManager", "uri is error4");
        return null;
    }

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            a b2 = b(uri);
            if (b2 != null) {
                return b2.a(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider query error==", th);
            return null;
        }
    }

    public String a(Uri uri) {
        try {
            a b2 = b(uri);
            if (b2 != null) {
                return b2.a(uri);
            }
            return null;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider getType error==", th);
            return null;
        }
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        try {
            a b2 = b(uri);
            if (b2 != null) {
                return b2.a(uri, contentValues);
            }
            return null;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider insert error==", th);
            return null;
        }
    }

    public int a(Uri uri, String str, String[] strArr) {
        try {
            a b2 = b(uri);
            if (b2 != null) {
                return b2.a(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider delete error==", th);
            return 0;
        }
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            a b2 = b(uri);
            if (b2 != null) {
                return b2.a(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            l.a("TTProviderManager", "==provider update error==", th);
            return 0;
        }
    }
}
