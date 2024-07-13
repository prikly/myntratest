package com.bytedance.sdk.component.a;

import android.net.Uri;
import com.bytedance.sdk.component.a.k;
import com.bytedance.sdk.component.a.v;
import com.bytedance.sdk.component.a.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PermissionChecker */
class u {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f18272a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f18273b;

    /* renamed from: c  reason: collision with root package name */
    private final w f18274c = r.f18260a;

    /* renamed from: d  reason: collision with root package name */
    private final v f18275d;

    /* renamed from: e  reason: collision with root package name */
    private k.b f18276e;

    u(v vVar, Set<String> set, Set<String> set2) {
        this.f18275d = vVar;
        if (set == null || set.isEmpty()) {
            this.f18272a = new LinkedHashSet();
        } else {
            this.f18272a = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.f18273b = new LinkedHashSet();
        } else {
            this.f18273b = new LinkedHashSet(set2);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized x a(boolean z, String str, b bVar) throws v.a {
        x xVar;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        x xVar2 = this.f18273b.contains(bVar.a()) ? x.PUBLIC : null;
        Iterator<String> it = this.f18272a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (parse.getHost().equals(next)) {
                break;
            }
            if (host.endsWith("." + next)) {
                break;
            }
        }
        xVar2 = x.PRIVATE;
        if (xVar2 == null && this.f18276e != null && this.f18276e.a(str)) {
            if (this.f18276e.a(str, bVar.a())) {
                return null;
            }
            xVar2 = x.PRIVATE;
        }
        if (z) {
            xVar = a(str, bVar);
        } else {
            xVar = b(str, bVar);
        }
        if (xVar != null) {
            return xVar;
        }
        return xVar2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized x a(String str, b bVar) throws v.a {
        return a(str, bVar, true);
    }

    /* access modifiers changed from: package-private */
    public final synchronized x b(String str, b bVar) {
        return a(str, bVar, false);
    }

    /* access modifiers changed from: package-private */
    public void a(k.b bVar) {
        this.f18276e = bVar;
    }

    /* access modifiers changed from: package-private */
    public void a(w.a aVar) {
        w wVar = this.f18274c;
        if (wVar != null) {
            wVar.a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(w.a aVar) {
        w wVar = this.f18274c;
        if (wVar != null) {
            wVar.b(aVar);
        }
    }

    private x a(String str, b bVar, boolean z) {
        v vVar;
        if (!z || (vVar = this.f18275d) == null) {
            return null;
        }
        v.c a2 = vVar.a(str, this.f18272a);
        if (a2.f18290c.contains(bVar.a())) {
            return null;
        }
        if (a2.f18289b.contains(bVar.a())) {
            return x.PRIVATE;
        }
        if (a2.f18288a.compareTo(bVar.b()) < 0) {
            return null;
        }
        return a2.f18288a;
    }
}
