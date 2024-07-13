package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.of  reason: case insensitive filesystem */
public final class C0607of extends MessageNano {
    private static volatile C0607of[] q;

    /* renamed from: a  reason: collision with root package name */
    public int f6406a;

    /* renamed from: b  reason: collision with root package name */
    public int f6407b;

    /* renamed from: c  reason: collision with root package name */
    public int f6408c;

    /* renamed from: d  reason: collision with root package name */
    public int f6409d;

    /* renamed from: e  reason: collision with root package name */
    public int f6410e;

    /* renamed from: f  reason: collision with root package name */
    public String f6411f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6412g;

    /* renamed from: h  reason: collision with root package name */
    public int f6413h;
    public int i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;

    public C0607of() {
        a();
    }

    public static C0607of[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (q == null) {
                    q = new C0607of[0];
                }
            }
        }
        return q;
    }

    public C0607of a() {
        this.f6406a = -1;
        this.f6407b = 0;
        this.f6408c = -1;
        this.f6409d = -1;
        this.f6410e = -1;
        this.f6411f = "";
        this.f6412g = false;
        this.f6413h = 0;
        this.i = -1;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6406a;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int i3 = this.f6407b;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(2, i3);
        }
        int i4 = this.f6408c;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i4);
        }
        int i5 = this.f6409d;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i5);
        }
        int i6 = this.f6410e;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i6);
        }
        if (!this.f6411f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f6411f);
        }
        boolean z = this.f6412g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(7, z);
        }
        int i7 = this.f6413h;
        if (i7 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i7);
        }
        int i8 = this.i;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(9, i8);
        }
        long j2 = this.j;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(10, j2);
        }
        int i9 = this.k;
        if (i9 != Integer.MAX_VALUE) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(11, i9);
        }
        int i10 = this.l;
        if (i10 != Integer.MAX_VALUE) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(12, i10);
        }
        int i11 = this.m;
        if (i11 != Integer.MAX_VALUE) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(13, i11);
        }
        int i12 = this.n;
        if (i12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(14, i12);
        }
        int i13 = this.o;
        if (i13 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(15, i13);
        }
        int i14 = this.p;
        return i14 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(16, i14) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f6406a = codedInputByteBufferNano.readUInt32();
                    continue;
                case 16:
                    this.f6407b = codedInputByteBufferNano.readSInt32();
                    continue;
                case 24:
                    this.f6408c = codedInputByteBufferNano.readUInt32();
                    continue;
                case 32:
                    this.f6409d = codedInputByteBufferNano.readUInt32();
                    continue;
                case 40:
                    this.f6410e = codedInputByteBufferNano.readUInt32();
                    continue;
                case 50:
                    this.f6411f = codedInputByteBufferNano.readString();
                    continue;
                case 56:
                    this.f6412g = codedInputByteBufferNano.readBool();
                    continue;
                case 64:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                        this.f6413h = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 72:
                    this.i = codedInputByteBufferNano.readUInt32();
                    continue;
                case 80:
                    this.j = codedInputByteBufferNano.readUInt64();
                    continue;
                case 88:
                    this.k = codedInputByteBufferNano.readSInt32();
                    continue;
                case 96:
                    this.l = codedInputByteBufferNano.readSInt32();
                    continue;
                case 104:
                    this.m = codedInputByteBufferNano.readSInt32();
                    continue;
                case 112:
                    this.n = codedInputByteBufferNano.readUInt32();
                    continue;
                case 120:
                    this.o = codedInputByteBufferNano.readUInt32();
                    continue;
                case 128:
                    this.p = codedInputByteBufferNano.readUInt32();
                    continue;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.f6406a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        int i3 = this.f6407b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i3);
        }
        int i4 = this.f6408c;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeUInt32(3, i4);
        }
        int i5 = this.f6409d;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeUInt32(4, i5);
        }
        int i6 = this.f6410e;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeUInt32(5, i6);
        }
        if (!this.f6411f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f6411f);
        }
        boolean z = this.f6412g;
        if (z) {
            codedOutputByteBufferNano.writeBool(7, z);
        }
        int i7 = this.f6413h;
        if (i7 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i7);
        }
        int i8 = this.i;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeUInt32(9, i8);
        }
        long j2 = this.j;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(10, j2);
        }
        int i9 = this.k;
        if (i9 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(11, i9);
        }
        int i10 = this.l;
        if (i10 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(12, i10);
        }
        int i11 = this.m;
        if (i11 != Integer.MAX_VALUE) {
            codedOutputByteBufferNano.writeSInt32(13, i11);
        }
        int i12 = this.n;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeUInt32(14, i12);
        }
        int i13 = this.o;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeUInt32(15, i13);
        }
        int i14 = this.p;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeUInt32(16, i14);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
