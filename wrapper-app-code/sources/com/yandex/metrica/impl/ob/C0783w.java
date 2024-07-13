package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.metrica.impl.ob.w  reason: case insensitive filesystem */
public class C0783w implements C0519l2 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Integer> f7006a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f7007b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile a f7008c = a.UNKNOWN;

    /* renamed from: d  reason: collision with root package name */
    private final Set<b> f7009d = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    public enum a {
        UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
        BACKGROUND("background"),
        VISIBLE("visible");

        private a(String str) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public interface b {
        void a(a aVar);
    }

    private void d() {
        a aVar = a.UNKNOWN;
        if (!this.f7006a.isEmpty()) {
            aVar = a.VISIBLE;
        } else if (!this.f7007b.isEmpty()) {
            aVar = a.BACKGROUND;
        }
        if (this.f7008c != aVar) {
            this.f7008c = aVar;
            for (b a2 : this.f7009d) {
                a2.a(this.f7008c);
            }
        }
    }

    public void a() {
        d();
    }

    public void b() {
        if (this.f7008c == a.VISIBLE) {
            this.f7008c = a.BACKGROUND;
        }
    }

    public a c() {
        return this.f7008c;
    }

    public a a(b bVar) {
        this.f7009d.add(bVar);
        return this.f7008c;
    }

    public void c(int i) {
        this.f7006a.add(Integer.valueOf(i));
        this.f7007b.remove(Integer.valueOf(i));
        d();
    }

    public void b(int i) {
        this.f7007b.add(Integer.valueOf(i));
        this.f7006a.remove(Integer.valueOf(i));
        d();
    }

    public void a(int i) {
        this.f7006a.remove(Integer.valueOf(i));
        d();
    }
}
