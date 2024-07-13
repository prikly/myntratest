package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.io.FileUtils;
import java.io.File;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.n7  reason: case insensitive filesystem */
public class C0574n7 implements C0350e7<File> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6306a;

    /* renamed from: b  reason: collision with root package name */
    private final File f6307b;

    /* renamed from: c  reason: collision with root package name */
    private final C0302c9 f6308c;

    /* renamed from: d  reason: collision with root package name */
    private final B0 f6309d;

    /* renamed from: e  reason: collision with root package name */
    private final C0450i7 f6310e;

    /* renamed from: f  reason: collision with root package name */
    private final C0375f7<String> f6311f;

    /* renamed from: g  reason: collision with root package name */
    private final ICommonExecutor f6312g;

    /* renamed from: com.yandex.metrica.impl.ob.n7$a */
    static class a implements C0564mm<File> {
        a() {
        }

        public void b(Object obj) {
            ((File) obj).delete();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n7$b */
    static class b implements C0564mm<String> {

        /* renamed from: a  reason: collision with root package name */
        private final C0375f7<String> f6313a;

        b(C0375f7<String> f7Var) {
            this.f6313a = f7Var;
        }

        public void b(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f6313a.b(str);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n7$c */
    static class c implements C0564mm<String> {

        /* renamed from: a  reason: collision with root package name */
        private final C0375f7<String> f6314a;

        c(C0375f7<String> f7Var) {
            this.f6314a = f7Var;
        }

        public void b(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                this.f6314a.a(str);
            }
        }
    }

    public C0574n7(Context context, B0 b0, C0450i7 i7Var, C0375f7<String> f7Var, ICommonExecutor iCommonExecutor, C0302c9 c9Var) {
        this.f6306a = context;
        this.f6309d = b0;
        this.f6307b = b0.b(context);
        this.f6310e = i7Var;
        this.f6311f = f7Var;
        this.f6312g = iCommonExecutor;
        this.f6308c = c9Var;
    }

    public void a(Object obj) {
        this.f6312g.execute(new C0718t6((File) obj, this.f6310e, new a(), new b(this.f6311f)));
    }

    public synchronized void a() {
        File b2;
        if (FileUtils.needToUseNoBackup() && (b2 = this.f6309d.b(this.f6306a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (!this.f6308c.o()) {
                a(b2);
                this.f6308c.p();
            } else if (b2.exists()) {
                try {
                    b2.delete();
                } catch (Throwable unused) {
                }
            }
        }
        a(this.f6307b);
    }

    private void a(File file) {
        File[] fileArr;
        if (file == null || !file.exists()) {
            fileArr = new File[0];
        } else {
            fileArr = file.listFiles(new C0549m7(this));
            if (fileArr == null) {
                fileArr = new File[0];
            }
        }
        for (File t6Var : fileArr) {
            this.f6312g.execute(new C0718t6(t6Var, this.f6310e, new a(), new c(this.f6311f)));
        }
    }
}
