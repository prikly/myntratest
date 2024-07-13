package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.h;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContinueDownloadTask */
public class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final List<? extends g> f586a;

    public a(String str, List<? extends g> list) {
        super(str);
        this.f586a = list;
    }

    public void run() {
        List<? extends g> list;
        if (!(o.c(m.a()) == 0 || (list = this.f586a) == null)) {
            Iterator<? extends g> it = list.iterator();
            while (it.hasNext()) {
                e.a((g) it.next(), 1);
                it.remove();
            }
        }
        try {
            h.a().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
