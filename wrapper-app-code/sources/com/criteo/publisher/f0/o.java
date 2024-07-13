package com.criteo.publisher.f0;

import android.content.Context;
import android.util.AtomicFile;
import com.criteo.publisher.n0.g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* compiled from: MetricDirectory */
class o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2489a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2490b;

    /* renamed from: c  reason: collision with root package name */
    private final q f2491c;

    o(Context context, g gVar, q qVar) {
        this.f2489a = context;
        this.f2490b = gVar;
        this.f2491c = qVar;
    }

    /* compiled from: MetricDirectory */
    class a implements FilenameFilter {
        a(o oVar) {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".csm");
        }
    }

    /* access modifiers changed from: package-private */
    public Collection<File> b() {
        File[] listFiles = a().listFiles(new a(this));
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    /* access modifiers changed from: package-private */
    public File a(String str) {
        return new File(a(), b(str));
    }

    /* access modifiers changed from: package-private */
    public d0 a(File file) {
        return new d0(b(file), new AtomicFile(file), this.f2491c);
    }

    /* access modifiers changed from: package-private */
    public File a() {
        return this.f2489a.getDir(this.f2490b.e(), 0);
    }

    private String b(String str) {
        return str + ".csm";
    }

    private String b(File file) {
        String name = file.getName();
        return name.substring(0, name.length() - 4);
    }
}
