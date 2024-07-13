package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.l6  reason: case insensitive filesystem */
public class C0523l6 extends FileObserver {

    /* renamed from: a  reason: collision with root package name */
    private final C0564mm<File> f6125a;

    /* renamed from: b  reason: collision with root package name */
    private final File f6126b;

    /* renamed from: c  reason: collision with root package name */
    private final B0 f6127c;

    public C0523l6(File file, C0564mm<File> mmVar) {
        this(file, mmVar, new B0());
    }

    public void onEvent(int i, String str) {
        if (i == 8 && !TextUtils.isEmpty(str)) {
            C0564mm<File> mmVar = this.f6125a;
            B0 b0 = this.f6127c;
            File file = this.f6126b;
            b0.getClass();
            mmVar.b(new File(file, str));
        }
    }

    C0523l6(File file, C0564mm<File> mmVar, B0 b0) {
        super(file.getAbsolutePath(), 8);
        this.f6125a = mmVar;
        this.f6126b = file;
        this.f6127c = b0;
    }
}
