package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;

/* renamed from: com.yandex.metrica.impl.ob.dg  reason: case insensitive filesystem */
public final class C0334dg {

    /* renamed from: a  reason: collision with root package name */
    public final String f5664a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5665b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5666c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5667d;

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public enum a {
        UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
        GP("gpl"),
        HMS("hms-content-provider");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f5672a;

        private a(String str) {
            this.f5672a = str;
        }
    }

    private C0334dg(byte[] bArr) throws InvalidProtocolBufferNanoException {
        C0727tf a2 = C0727tf.a(bArr);
        this.f5664a = a2.f6836a;
        this.f5665b = a2.f6838c;
        this.f5666c = a2.f6837b;
        this.f5667d = a(a2.f6839d);
    }

    public static C0334dg a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        if (A2.a(bArr)) {
            return null;
        }
        return new C0334dg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0334dg.class != obj.getClass()) {
            return false;
        }
        C0334dg dgVar = (C0334dg) obj;
        if (this.f5665b == dgVar.f5665b && this.f5666c == dgVar.f5666c && this.f5664a.equals(dgVar.f5664a) && this.f5667d == dgVar.f5667d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f5665b;
        long j2 = this.f5666c;
        return (((((this.f5664a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f5667d.hashCode();
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.f5664a + '\'' + ", referrerClickTimestampSeconds=" + this.f5665b + ", installBeginTimestampSeconds=" + this.f5666c + ", source=" + this.f5667d + '}';
    }

    public byte[] a() {
        C0727tf tfVar = new C0727tf();
        tfVar.f6836a = this.f5664a;
        tfVar.f6838c = this.f5665b;
        tfVar.f6837b = this.f5666c;
        int ordinal = this.f5667d.ordinal();
        int i = 2;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal != 2) {
            i = 0;
        }
        tfVar.f6839d = i;
        return MessageNano.toByteArray(tfVar);
    }

    public C0334dg(String str, long j, long j2, a aVar) {
        this.f5664a = str;
        this.f5665b = j;
        this.f5666c = j2;
        this.f5667d = aVar;
    }

    private a a(int i) {
        if (i == 1) {
            return a.GP;
        }
        if (i != 2) {
            return a.UNKNOWN;
        }
        return a.HMS;
    }
}
