package h;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import g.a;
import h.a;
import java.util.List;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteOpenHelper f7416a;

    public b(Context context) {
        this.f7416a = new a(context);
    }

    public List<b.a> a() {
        return a.C0062a.a(this.f7416a, (Integer) null);
    }

    public List<b.a> a(int i) {
        return a.C0062a.a(this.f7416a, Integer.valueOf(i));
    }

    public void a(List<b.a> list) {
        a.C0062a.a(this.f7416a, list);
    }

    public boolean a(b.a aVar) {
        return a.C0062a.a(this.f7416a, aVar);
    }

    public void b() {
        a.C0062a.a(this.f7416a);
    }

    public void b(List<b.a> list) {
        a.C0062a.c(this.f7416a, list);
    }

    public void c(List<b.a> list) {
        a.C0062a.b(this.f7416a, list);
    }
}
