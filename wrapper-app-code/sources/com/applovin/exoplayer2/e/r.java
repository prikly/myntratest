package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.e.e;
import com.applovin.exoplayer2.g.e.i;
import com.applovin.exoplayer2.l.ai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class r {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f12443c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f12444a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f12445b = -1;

    private boolean a(String str) {
        Matcher matcher = f12443c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) ai.a(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) ai.a(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f12444a = parseInt;
            this.f12445b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f12444a == -1 || this.f12445b == -1) ? false : true;
    }

    public boolean a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f12444a = i2;
        this.f12445b = i3;
        return true;
    }

    public boolean a(a aVar) {
        for (int i = 0; i < aVar.a(); i++) {
            a.C0122a a2 = aVar.a(i);
            if (a2 instanceof e) {
                e eVar = (e) a2;
                if ("iTunSMPB".equals(eVar.f12632b) && a(eVar.f12633c)) {
                    return true;
                }
            } else if (a2 instanceof i) {
                i iVar = (i) a2;
                if ("com.apple.iTunes".equals(iVar.f12644a) && "iTunSMPB".equals(iVar.f12645b) && a(iVar.f12646c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
