package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static n f15360a;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f15361b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f15362c;

    public e(n nVar) {
        this.f15362c = nVar.P().getSharedPreferences("com.applovin.sdk.preferences." + nVar.C(), 0);
        if (!nVar.e()) {
            f15360a = nVar;
        }
    }

    private static SharedPreferences a(Context context) {
        if (f15361b == null) {
            f15361b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f15361b;
    }

    public static <T> T a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        T t2;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    t2 = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    t2 = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    t2 = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0);
                    }
                    t2 = Long.valueOf(j);
                } else if (Double.class.equals(cls)) {
                    t2 = Double.valueOf(t != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0)));
                } else {
                    t2 = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                if (t2 != null) {
                    return cls.cast(t2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t;
        } catch (Throwable th) {
            if (f15360a != null) {
                f15360a.D();
                if (v.a()) {
                    v D = f15360a.D();
                    D.b("SharedPreferencesManager", "Error getting value for key: " + str, th);
                }
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void a(final SharedPreferences.Editor editor) {
        try {
            if (f15360a != null && ((Boolean) f15360a.a(b.eU)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                    return;
                } else if (f15360a.V() != null) {
                    f15360a.V().a((a) new z(f15360a, new Runnable() {
                        public void run() {
                            editor.commit();
                        }
                    }), o.a.BACKGROUND);
                    return;
                }
            }
            editor.apply();
        } catch (Throwable th) {
            v.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    public static <T> void a(d<T> dVar, T t, Context context) {
        a(dVar.a(), t, a(context), (SharedPreferences.Editor) null);
    }

    public static <T> void a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t == null) {
            editor.remove(str);
        } else if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else {
            if (t instanceof Long) {
                doubleToRawLongBits = ((Long) t).longValue();
            } else if (t instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t).doubleValue());
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                v.i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                z = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (z && !z2) {
            a(editor);
        }
    }

    public static <T> T b(d<T> dVar, T t, Context context) {
        return a(dVar.a(), t, (Class) dVar.b(), a(context));
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public <T> void a(d<T> dVar) {
        a(this.f15362c.edit().remove(dVar.a()));
    }

    public <T> void a(d<T> dVar, T t) {
        a(dVar, t, this.f15362c);
    }

    public <T> void a(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        a(dVar.a(), t, sharedPreferences);
    }

    public <T> void a(String str, T t, SharedPreferences.Editor editor) {
        a(str, t, (SharedPreferences) null, editor);
    }

    public <T> void a(String str, T t, SharedPreferences sharedPreferences) {
        a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public <T> T b(d<T> dVar, T t) {
        return b(dVar, t, this.f15362c);
    }

    public <T> T b(d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return a(dVar.a(), t, (Class) dVar.b(), sharedPreferences);
    }
}
