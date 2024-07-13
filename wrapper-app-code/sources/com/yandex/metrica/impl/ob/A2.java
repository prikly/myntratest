package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public final class A2 {

    /* renamed from: a  reason: collision with root package name */
    private static final C0565mn f3683a = new C0565mn();

    class a implements NetworkTask.ShouldTryNextHostCondition {
        a() {
        }

        public boolean shouldTryNextHost(int i) {
            return !A2.b(i);
        }
    }

    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return "0.0";
        }
        return packageInfo.versionName;
    }

    public static boolean a(Object obj) {
        return obj != null;
    }

    public static int b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    public static boolean b(int i) {
        return i == 400;
    }

    public static <K, V> Map<K, V> c(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public static <K, V> Map<K, V> d(Map<K, V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static <K, V> Map<K, V> e(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <T> List<T> c(Collection<T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static boolean a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static boolean b(Map map) {
        return map == null || map.size() == 0;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    public static Set<Integer> a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int valueOf : iArr) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        return hashSet;
    }

    public static String a(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() > i ? str.substring(0, i) : str;
    }

    public static List<String> a(String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return c(treeSet);
    }

    public static <T, S> Object a(C0614om omVar, Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return omVar.a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, S> S a(C0614om<T, S> omVar, Context context, String str, String str2, String str3) {
        try {
            return a((C0614om) omVar, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <K, V> List<Map.Entry<K, V>> a(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, V> simpleEntry : map.entrySet()) {
            arrayList.add(new AbstractMap.SimpleEntry(simpleEntry));
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> a(List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry next : list) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    public static <T> List<T> a(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    public static BigDecimal a(long j) {
        return new BigDecimal(j).divide(new BigDecimal(1000000), 6, 6);
    }

    public static double a(double d2, double d3) {
        return (Double.isNaN(d2) || Double.isInfinite(d2)) ? d3 : d2;
    }

    public static NetworkTask.ShouldTryNextHostCondition a() {
        return new a();
    }
}
