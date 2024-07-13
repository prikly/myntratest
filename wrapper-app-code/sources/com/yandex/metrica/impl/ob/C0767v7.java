package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.v7  reason: case insensitive filesystem */
public class C0767v7 implements C0375f7<C0671r7> {

    /* renamed from: a  reason: collision with root package name */
    private final L1 f6965a;

    /* renamed from: com.yandex.metrica.impl.ob.v7$a */
    class a implements C0589nm<String, C0293c0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0671r7 f6966a;

        a(C0767v7 v7Var, C0671r7 r7Var) {
            this.f6966a = r7Var;
        }

        public Object a(Object obj) {
            return C0856z0.a((String) obj, Ul.b(this.f6966a.f6689b.a())).c(this.f6966a.f6690c.f4040a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.v7$b */
    class b implements C0589nm<String, C0293c0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0671r7 f6967a;

        b(C0767v7 v7Var, C0671r7 r7Var) {
            this.f6967a = r7Var;
        }

        public Object a(Object obj) {
            return C0856z0.b((String) obj, Ul.b(this.f6967a.f6689b.a())).c(this.f6967a.f6690c.f4040a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.v7$c */
    public static class c implements C0564mm<File> {

        /* renamed from: a  reason: collision with root package name */
        private final String f6968a;

        public c(String str) {
            this.f6968a = str;
        }

        public void b(Object obj) {
            File file = (File) obj;
            CrashpadServiceHelper.a(this.f6968a);
        }
    }

    public C0767v7(L1 l1) {
        this.f6965a = l1;
    }

    public void a(Object obj) {
        C0671r7 r7Var = (C0671r7) obj;
        this.f6965a.a(r7Var, (C0589nm<String, C0293c0>) new b(this, r7Var));
    }

    public void b(Object obj) {
        C0671r7 r7Var = (C0671r7) obj;
        this.f6965a.a(r7Var, (C0589nm<String, C0293c0>) new a(this, r7Var));
    }

    public void a(C0671r7 r7Var) {
        this.f6965a.a(r7Var, (C0589nm<String, C0293c0>) new a(this, r7Var));
    }

    public void b(C0671r7 r7Var) {
        this.f6965a.a(r7Var, (C0589nm<String, C0293c0>) new b(this, r7Var));
    }
}
