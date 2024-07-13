package com.bytedance.sdk.openadsdk.i.a;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.d;
import java.util.List;
import java.util.Map;

/* compiled from: GifRequestResult */
public class b {

    /* renamed from: a  reason: collision with root package name */
    int f2002a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f2003b = null;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f2004c = null;

    /* renamed from: d  reason: collision with root package name */
    private List<Object> f2005d = null;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f2006e = null;

    public b(byte[] bArr, int i) {
        this.f2003b = bArr;
        this.f2002a = i;
    }

    public b(Bitmap bitmap, int i) {
        this.f2004c = bitmap;
        this.f2002a = i;
    }

    public Bitmap a() {
        return this.f2004c;
    }

    public byte[] b() {
        try {
            if (this.f2003b == null) {
                this.f2003b = d.a(this.f2004c);
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        return this.f2003b;
    }

    public boolean c() {
        if (this.f2004c != null) {
            return true;
        }
        byte[] bArr = this.f2003b;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }
}
