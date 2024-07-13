package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ui  reason: case insensitive filesystem */
public class C0754ui {

    /* renamed from: a  reason: collision with root package name */
    public final a f6924a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6925b;

    /* renamed from: com.yandex.metrica.impl.ob.ui$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6926a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6927b;

        public a(int i, long j) {
            this.f6926a = i;
            this.f6927b = j;
        }

        public String toString() {
            return "Item{refreshEventCount=" + this.f6926a + ", refreshPeriodSeconds=" + this.f6927b + '}';
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ui$b */
    public enum b {
        WIFI,
        CELL
    }

    public C0754ui(a aVar, a aVar2) {
        this.f6924a = aVar;
        this.f6925b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.f6924a + ", wifi=" + this.f6925b + '}';
    }
}
