package a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f9761a;

    static {
        HandlerThread handlerThread = new HandlerThread("BMAnalyticHandlerThread");
        handlerThread.start();
        f9761a = new Handler(handlerThread.getLooper());
    }

    public static <T> List<List<T>> a(List<T> list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + i;
            arrayList.add(list.subList(i2, Math.min(i3, size)));
            i2 = i3;
        }
        return arrayList;
    }

    public static JSONArray a(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next instanceof List) {
                next = a((List<?>) (List) next);
            } else if (next instanceof Map) {
                next = a((Map<?, ?>) (Map) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    public static JSONObject a(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                String obj = next.getKey().toString();
                Object value = next.getValue();
                if (!TextUtils.isEmpty(obj)) {
                    if (value != null) {
                        if (value instanceof List) {
                            value = a((List<?>) (List) value);
                        } else if (value instanceof Map) {
                            value = a((Map<?, ?>) (Map) value);
                        }
                        jSONObject.put(obj, value);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Runnable runnable) {
        f9761a.removeCallbacks(runnable);
    }

    public static void a(Runnable runnable, long j) {
        if (j != 0 || !a(f9761a)) {
            f9761a.postDelayed(runnable, j);
        } else {
            runnable.run();
        }
    }

    public static boolean a(Handler handler) {
        return Looper.myLooper() == handler.getLooper();
    }

    public static void b(Runnable runnable) {
        a(runnable, 0);
    }

    public static void b(Runnable runnable, long j) {
        a(runnable);
        a(runnable, j);
    }
}
