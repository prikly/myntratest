package c;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f9768a = new AtomicBoolean(false);

    public final void a(Context context) {
        if (f9768a.compareAndSet(false, true)) {
            try {
                b(context);
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void b(Context context);
}
