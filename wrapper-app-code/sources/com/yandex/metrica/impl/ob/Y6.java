package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import java.io.File;

public class Y6 {

    /* renamed from: a  reason: collision with root package name */
    private final FileObserver f5368a;

    /* renamed from: b  reason: collision with root package name */
    private final File f5369b;

    /* renamed from: c  reason: collision with root package name */
    private final C0548m6 f5370c;

    public Y6(File file, C0564mm<File> mmVar) {
        this(new C0523l6(file, mmVar), file, new C0548m6());
    }

    public void a() {
        this.f5370c.a(this.f5369b);
        this.f5368a.startWatching();
    }

    Y6(FileObserver fileObserver, File file, C0548m6 m6Var) {
        this.f5368a = fileObserver;
        this.f5369b = file;
        this.f5370c = m6Var;
    }
}
