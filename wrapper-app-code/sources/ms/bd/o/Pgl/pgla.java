package ms.bd.o.Pgl;

import android.content.Context;

public final class pgla {

    /* renamed from: b  reason: collision with root package name */
    private static final pgla f9735b = new pgla();

    /* renamed from: a  reason: collision with root package name */
    private Context f9736a;

    public static pgla a() {
        return f9735b;
    }

    public void a(Context context) {
        this.f9736a = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f9736a;
    }
}
