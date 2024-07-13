package com.criteo.publisher.model;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.n0.l;
import com.criteo.publisher.n0.n;
import com.criteo.publisher.n0.q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* compiled from: Config */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final g f2847a;

    /* renamed from: b  reason: collision with root package name */
    private volatile y f2848b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f2849c;

    /* renamed from: d  reason: collision with root package name */
    private final l f2850d;

    /* compiled from: Config */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final RemoteLogRecords.RemoteLogLevel f2851a = RemoteLogRecords.RemoteLogLevel.WARNING;
    }

    public t() {
        this.f2847a = h.b(getClass());
        this.f2849c = null;
        this.f2850d = null;
        this.f2848b = y.a();
    }

    public t(SharedPreferences sharedPreferences, l lVar) {
        this.f2847a = h.b(getClass());
        this.f2849c = sharedPreferences;
        this.f2850d = lVar;
        this.f2848b = k();
    }

    private y k() {
        ByteArrayInputStream byteArrayInputStream;
        y a2 = y.a();
        SharedPreferences sharedPreferences = this.f2849c;
        if (!(sharedPreferences == null || this.f2850d == null)) {
            try {
                byteArrayInputStream = new ByteArrayInputStream(new q(sharedPreferences).a("CriteoCachedConfig", JsonUtils.EMPTY_JSON).getBytes(Charset.forName("UTF-8")));
                y yVar = (y) this.f2850d.a(y.class, (InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                return a(a2, yVar);
            } catch (IOException e2) {
                this.f2847a.a("Couldn't read cached values", (Throwable) e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return a2;
        throw th;
    }

    private y a(y yVar, y yVar2) {
        return y.a((Boolean) n.a(yVar2.g(), yVar.g()), (String) n.a(yVar2.e(), yVar.e()), (String) n.a(yVar2.d(), yVar.d()), (String) n.a(yVar2.b(), yVar.b()), (String) n.a(yVar2.c(), yVar.c()), (Boolean) n.a(yVar2.f(), yVar.f()), (Boolean) n.a(yVar2.h(), yVar.h()), (Integer) n.a(yVar2.i(), yVar.i()), (Boolean) n.a(yVar2.j(), yVar.j()), (RemoteLogRecords.RemoteLogLevel) n.a(yVar2.k(), yVar.k()));
    }

    public void b(y yVar) {
        this.f2848b = a(this.f2848b, yVar);
        a(this.f2848b);
    }

    private void a(y yVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.f2849c != null && this.f2850d != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                this.f2850d.a((Object) yVar, (OutputStream) byteArrayOutputStream);
                String str = new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
                byteArrayOutputStream.close();
                SharedPreferences.Editor edit = this.f2849c.edit();
                edit.putString("CriteoCachedConfig", str);
                edit.apply();
                return;
            } catch (Exception e2) {
                this.f2847a.a("Couldn't persist values", (Throwable) e2);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean h() {
        return ((Boolean) n.a(this.f2848b.g(), false)).booleanValue();
    }

    public boolean g() {
        return ((Boolean) n.a(this.f2848b.f(), true)).booleanValue();
    }

    public boolean i() {
        return ((Boolean) n.a(this.f2848b.h(), false)).booleanValue();
    }

    public int e() {
        return ((Integer) n.a(this.f2848b.i(), 8000)).intValue();
    }

    public boolean j() {
        return ((Boolean) n.a(this.f2848b.j(), true)).booleanValue();
    }

    public String d() {
        return (String) n.a(this.f2848b.e(), "%%displayUrl%%");
    }

    public String c() {
        return (String) n.a(this.f2848b.d(), "<html><body style='text-align:center; margin:0px; padding:0px; horizontal-align:center;'><script src=\"%%displayUrl%%\"></script></body></html>");
    }

    public String a() {
        return (String) n.a(this.f2848b.b(), "%%adTagData%%");
    }

    public String b() {
        return (String) n.a(this.f2848b.c(), "<html><body style='text-align:center; margin:0px; padding:0px; horizontal-align:center;'><script>%%adTagData%%</script></body></html>");
    }

    public RemoteLogRecords.RemoteLogLevel f() {
        return (RemoteLogRecords.RemoteLogLevel) n.a(this.f2848b.k(), a.f2851a);
    }
}
