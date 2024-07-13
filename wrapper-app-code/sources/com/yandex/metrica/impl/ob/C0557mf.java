package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.mf  reason: case insensitive filesystem */
public final class C0557mf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public int f6219a;

    /* renamed from: b  reason: collision with root package name */
    public q f6220b;

    /* renamed from: c  reason: collision with root package name */
    public o f6221c;

    /* renamed from: d  reason: collision with root package name */
    public p f6222d;

    /* renamed from: e  reason: collision with root package name */
    public b f6223e;

    /* renamed from: f  reason: collision with root package name */
    public h f6224f;

    /* renamed from: com.yandex.metrica.impl.ob.mf$a */
    public static final class a extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile a[] f6225c;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6226a;

        /* renamed from: b  reason: collision with root package name */
        public e f6227b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f6225c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6225c == null) {
                        f6225c = new a[0];
                    }
                }
            }
            return f6225c;
        }

        public a a() {
            this.f6226a = WireFormatNano.EMPTY_BYTES;
            this.f6227b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6226a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6226a);
            }
            e eVar = this.f6227b;
            return eVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, eVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6226a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    if (this.f6227b == null) {
                        this.f6227b = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f6227b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6226a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6226a);
            }
            e eVar = this.f6227b;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(2, eVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$b */
    public static final class b extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public c f6228a;

        public b() {
            a();
        }

        public b a() {
            this.f6228a = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            c cVar = this.f6228a;
            return cVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, cVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6228a == null) {
                        this.f6228a = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f6228a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            c cVar = this.f6228a;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(1, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$c */
    public static final class c extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public k f6229a;

        /* renamed from: b  reason: collision with root package name */
        public m f6230b;

        /* renamed from: c  reason: collision with root package name */
        public e f6231c;

        /* renamed from: d  reason: collision with root package name */
        public j f6232d;

        public c() {
            a();
        }

        public c a() {
            this.f6229a = null;
            this.f6230b = null;
            this.f6231c = null;
            this.f6232d = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            k kVar = this.f6229a;
            if (kVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            m mVar = this.f6230b;
            if (mVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, mVar);
            }
            e eVar = this.f6231c;
            if (eVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, eVar);
            }
            j jVar = this.f6232d;
            return jVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, jVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6229a == null) {
                        this.f6229a = new k();
                    }
                    codedInputByteBufferNano.readMessage(this.f6229a);
                } else if (readTag == 18) {
                    if (this.f6230b == null) {
                        this.f6230b = new m();
                    }
                    codedInputByteBufferNano.readMessage(this.f6230b);
                } else if (readTag == 26) {
                    if (this.f6231c == null) {
                        this.f6231c = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f6231c);
                } else if (readTag == 34) {
                    if (this.f6232d == null) {
                        this.f6232d = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f6232d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            k kVar = this.f6229a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            m mVar = this.f6230b;
            if (mVar != null) {
                codedOutputByteBufferNano.writeMessage(2, mVar);
            }
            e eVar = this.f6231c;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(3, eVar);
            }
            j jVar = this.f6232d;
            if (jVar != null) {
                codedOutputByteBufferNano.writeMessage(4, jVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$d */
    public static final class d extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[][] f6233a;

        public d() {
            a();
        }

        public d a() {
            this.f6233a = WireFormatNano.EMPTY_BYTES_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            byte[][] bArr = this.f6233a;
            if (bArr == null || bArr.length <= 0) {
                return computeSerializedSize;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f6233a;
                if (i >= bArr2.length) {
                    return computeSerializedSize + i2 + (i3 * 1);
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3);
                }
                i++;
            }
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    byte[][] bArr = this.f6233a;
                    int length = bArr == null ? 0 : bArr.length;
                    int i = repeatedFieldArrayLength + length;
                    byte[][] bArr2 = new byte[i][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bArr2[length] = codedInputByteBufferNano.readBytes();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    this.f6233a = bArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            byte[][] bArr = this.f6233a;
            if (bArr != null && bArr.length > 0) {
                int i = 0;
                while (true) {
                    byte[][] bArr2 = this.f6233a;
                    if (i >= bArr2.length) {
                        break;
                    }
                    byte[] bArr3 = bArr2[i];
                    if (bArr3 != null) {
                        codedOutputByteBufferNano.writeBytes(1, bArr3);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$e */
    public static final class e extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f6234a;

        /* renamed from: b  reason: collision with root package name */
        public int f6235b;

        public e() {
            a();
        }

        public e a() {
            this.f6234a = 0;
            this.f6235b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f6234a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            int i = this.f6235b;
            return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6234a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f6235b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f6234a;
            if (j != 0) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            int i = this.f6235b;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$f */
    public static final class f extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6236a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f6237b;

        /* renamed from: c  reason: collision with root package name */
        public i f6238c;

        /* renamed from: d  reason: collision with root package name */
        public g[] f6239d;

        /* renamed from: e  reason: collision with root package name */
        public int f6240e;

        public f() {
            a();
        }

        public f a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f6236a = bArr;
            this.f6237b = bArr;
            this.f6238c = null;
            this.f6239d = g.b();
            this.f6240e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6236a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6236a);
            }
            if (!Arrays.equals(this.f6237b, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6237b);
            }
            i iVar = this.f6238c;
            if (iVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, iVar);
            }
            g[] gVarArr = this.f6239d;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    g[] gVarArr2 = this.f6239d;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f6240e;
            return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6236a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f6237b = codedInputByteBufferNano.readBytes();
                } else if (readTag == 26) {
                    if (this.f6238c == null) {
                        this.f6238c = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f6238c);
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    g[] gVarArr = this.f6239d;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    g[] gVarArr2 = new g[i];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        gVarArr2[length] = new g();
                        codedInputByteBufferNano.readMessage(gVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    gVarArr2[length] = new g();
                    codedInputByteBufferNano.readMessage(gVarArr2[length]);
                    this.f6239d = gVarArr2;
                } else if (readTag == 40) {
                    this.f6240e = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6236a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6236a);
            }
            if (!Arrays.equals(this.f6237b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f6237b);
            }
            i iVar = this.f6238c;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(3, iVar);
            }
            g[] gVarArr = this.f6239d;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    g[] gVarArr2 = this.f6239d;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f6240e;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$g */
    public static final class g extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile g[] f6241c;

        /* renamed from: a  reason: collision with root package name */
        public int f6242a;

        /* renamed from: b  reason: collision with root package name */
        public c f6243b;

        public g() {
            a();
        }

        public static g[] b() {
            if (f6241c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6241c == null) {
                        f6241c = new g[0];
                    }
                }
            }
            return f6241c;
        }

        public g a() {
            this.f6242a = 0;
            this.f6243b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f6242a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            c cVar = this.f6243b;
            return cVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, cVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6242a = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 18) {
                    if (this.f6243b == null) {
                        this.f6243b = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f6243b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f6242a;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            c cVar = this.f6243b;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(2, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$h */
    public static final class h extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public f f6244a;

        public h() {
            a();
        }

        public h a() {
            this.f6244a = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            f fVar = this.f6244a;
            return fVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, fVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6244a == null) {
                        this.f6244a = new f();
                    }
                    codedInputByteBufferNano.readMessage(this.f6244a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            f fVar = this.f6244a;
            if (fVar != null) {
                codedOutputByteBufferNano.writeMessage(1, fVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$i */
    public static final class i extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public a[] f6245a;

        /* renamed from: b  reason: collision with root package name */
        public int f6246b;

        /* renamed from: com.yandex.metrica.impl.ob.mf$i$a */
        public static final class a extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile a[] f6247c;

            /* renamed from: a  reason: collision with root package name */
            public byte[] f6248a;

            /* renamed from: b  reason: collision with root package name */
            public byte[] f6249b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f6247c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f6247c == null) {
                            f6247c = new a[0];
                        }
                    }
                }
                return f6247c;
            }

            public a a() {
                byte[] bArr = WireFormatNano.EMPTY_BYTES;
                this.f6248a = bArr;
                this.f6249b = bArr;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                if (!Arrays.equals(this.f6248a, WireFormatNano.EMPTY_BYTES)) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6248a);
                }
                return !Arrays.equals(this.f6249b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6249b) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f6248a = codedInputByteBufferNano.readBytes();
                    } else if (readTag == 18) {
                        this.f6249b = codedInputByteBufferNano.readBytes();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!Arrays.equals(this.f6248a, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(1, this.f6248a);
                }
                if (!Arrays.equals(this.f6249b, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(2, this.f6249b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public i() {
            a();
        }

        public i a() {
            this.f6245a = a.b();
            this.f6246b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            a[] aVarArr = this.f6245a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f6245a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
                    }
                    i++;
                }
            }
            int i2 = this.f6246b;
            return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    a[] aVarArr = this.f6245a;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f6245a = aVarArr2;
                } else if (readTag == 16) {
                    this.f6246b = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            a[] aVarArr = this.f6245a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f6245a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, aVar);
                    }
                    i++;
                }
            }
            int i2 = this.f6246b;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$j */
    public static final class j extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public a f6250a;

        /* renamed from: b  reason: collision with root package name */
        public a[] f6251b;

        public j() {
            a();
        }

        public j a() {
            this.f6250a = null;
            this.f6251b = a.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            a aVar = this.f6250a;
            if (aVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
            }
            a[] aVarArr = this.f6251b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f6251b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar2);
                    }
                    i++;
                }
            }
            return computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6250a == null) {
                        this.f6250a = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f6250a);
                } else if (readTag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    a[] aVarArr = this.f6251b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f6251b = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            a aVar = this.f6250a;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(1, aVar);
            }
            a[] aVarArr = this.f6251b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f6251b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        codedOutputByteBufferNano.writeMessage(2, aVar2);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$k */
    public static final class k extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6252a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f6253b;

        /* renamed from: c  reason: collision with root package name */
        public d f6254c;

        /* renamed from: d  reason: collision with root package name */
        public i f6255d;

        /* renamed from: e  reason: collision with root package name */
        public j f6256e;

        /* renamed from: f  reason: collision with root package name */
        public j f6257f;

        /* renamed from: g  reason: collision with root package name */
        public l[] f6258g;

        public k() {
            a();
        }

        public k a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f6252a = bArr;
            this.f6253b = bArr;
            this.f6254c = null;
            this.f6255d = null;
            this.f6256e = null;
            this.f6257f = null;
            this.f6258g = l.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6252a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6252a);
            }
            if (!Arrays.equals(this.f6253b, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6253b);
            }
            d dVar = this.f6254c;
            if (dVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, dVar);
            }
            i iVar = this.f6255d;
            if (iVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, iVar);
            }
            j jVar = this.f6256e;
            if (jVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, jVar);
            }
            j jVar2 = this.f6257f;
            if (jVar2 != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, jVar2);
            }
            l[] lVarArr = this.f6258g;
            if (lVarArr != null && lVarArr.length > 0) {
                int i = 0;
                while (true) {
                    l[] lVarArr2 = this.f6258g;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i];
                    if (lVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, lVar);
                    }
                    i++;
                }
            }
            return computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6252a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f6253b = codedInputByteBufferNano.readBytes();
                } else if (readTag == 26) {
                    if (this.f6254c == null) {
                        this.f6254c = new d();
                    }
                    codedInputByteBufferNano.readMessage(this.f6254c);
                } else if (readTag == 34) {
                    if (this.f6255d == null) {
                        this.f6255d = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f6255d);
                } else if (readTag == 42) {
                    if (this.f6256e == null) {
                        this.f6256e = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f6256e);
                } else if (readTag == 50) {
                    if (this.f6257f == null) {
                        this.f6257f = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.f6257f);
                } else if (readTag == 58) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    l[] lVarArr = this.f6258g;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    l[] lVarArr2 = new l[i];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        lVarArr2[length] = new l();
                        codedInputByteBufferNano.readMessage(lVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    lVarArr2[length] = new l();
                    codedInputByteBufferNano.readMessage(lVarArr2[length]);
                    this.f6258g = lVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6252a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6252a);
            }
            if (!Arrays.equals(this.f6253b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f6253b);
            }
            d dVar = this.f6254c;
            if (dVar != null) {
                codedOutputByteBufferNano.writeMessage(3, dVar);
            }
            i iVar = this.f6255d;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(4, iVar);
            }
            j jVar = this.f6256e;
            if (jVar != null) {
                codedOutputByteBufferNano.writeMessage(5, jVar);
            }
            j jVar2 = this.f6257f;
            if (jVar2 != null) {
                codedOutputByteBufferNano.writeMessage(6, jVar2);
            }
            l[] lVarArr = this.f6258g;
            if (lVarArr != null && lVarArr.length > 0) {
                int i = 0;
                while (true) {
                    l[] lVarArr2 = this.f6258g;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i];
                    if (lVar != null) {
                        codedOutputByteBufferNano.writeMessage(7, lVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$l */
    public static final class l extends MessageNano {

        /* renamed from: b  reason: collision with root package name */
        private static volatile l[] f6259b;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6260a;

        public l() {
            a();
        }

        public static l[] b() {
            if (f6259b == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6259b == null) {
                        f6259b = new l[0];
                    }
                }
            }
            return f6259b;
        }

        public l a() {
            this.f6260a = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            return !Arrays.equals(this.f6260a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f6260a) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6260a = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6260a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6260a);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$m */
    public static final class m extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6261a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f6262b;

        /* renamed from: c  reason: collision with root package name */
        public n f6263c;

        public m() {
            a();
        }

        public m a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f6261a = bArr;
            this.f6262b = bArr;
            this.f6263c = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6261a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6261a);
            }
            if (!Arrays.equals(this.f6262b, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f6262b);
            }
            n nVar = this.f6263c;
            return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, nVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6261a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f6262b = codedInputByteBufferNano.readBytes();
                } else if (readTag == 26) {
                    if (this.f6263c == null) {
                        this.f6263c = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f6263c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6261a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6261a);
            }
            if (!Arrays.equals(this.f6262b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f6262b);
            }
            n nVar = this.f6263c;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(3, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$n */
    public static final class n extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6264a;

        /* renamed from: b  reason: collision with root package name */
        public d f6265b;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f6266c;

        /* renamed from: d  reason: collision with root package name */
        public i f6267d;

        public n() {
            a();
        }

        public n a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f6264a = bArr;
            this.f6265b = null;
            this.f6266c = bArr;
            this.f6267d = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6264a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6264a);
            }
            d dVar = this.f6265b;
            if (dVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dVar);
            }
            if (!Arrays.equals(this.f6266c, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f6266c);
            }
            i iVar = this.f6267d;
            return iVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, iVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6264a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    if (this.f6265b == null) {
                        this.f6265b = new d();
                    }
                    codedInputByteBufferNano.readMessage(this.f6265b);
                } else if (readTag == 26) {
                    this.f6266c = codedInputByteBufferNano.readBytes();
                } else if (readTag == 34) {
                    if (this.f6267d == null) {
                        this.f6267d = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.f6267d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6264a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6264a);
            }
            d dVar = this.f6265b;
            if (dVar != null) {
                codedOutputByteBufferNano.writeMessage(2, dVar);
            }
            if (!Arrays.equals(this.f6266c, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(3, this.f6266c);
            }
            i iVar = this.f6267d;
            if (iVar != null) {
                codedOutputByteBufferNano.writeMessage(4, iVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$o */
    public static final class o extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public k f6268a;

        /* renamed from: b  reason: collision with root package name */
        public n f6269b;

        public o() {
            a();
        }

        public o a() {
            this.f6268a = null;
            this.f6269b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            k kVar = this.f6268a;
            if (kVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            n nVar = this.f6269b;
            return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, nVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6268a == null) {
                        this.f6268a = new k();
                    }
                    codedInputByteBufferNano.readMessage(this.f6268a);
                } else if (readTag == 18) {
                    if (this.f6269b == null) {
                        this.f6269b = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f6269b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            k kVar = this.f6268a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            n nVar = this.f6269b;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(2, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$p */
    public static final class p extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public k f6270a;

        /* renamed from: b  reason: collision with root package name */
        public m f6271b;

        public p() {
            a();
        }

        public p a() {
            this.f6270a = null;
            this.f6271b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            k kVar = this.f6270a;
            if (kVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kVar);
            }
            m mVar = this.f6271b;
            return mVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, mVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6270a == null) {
                        this.f6270a = new k();
                    }
                    codedInputByteBufferNano.readMessage(this.f6270a);
                } else if (readTag == 18) {
                    if (this.f6271b == null) {
                        this.f6271b = new m();
                    }
                    codedInputByteBufferNano.readMessage(this.f6271b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            k kVar = this.f6270a;
            if (kVar != null) {
                codedOutputByteBufferNano.writeMessage(1, kVar);
            }
            m mVar = this.f6271b;
            if (mVar != null) {
                codedOutputByteBufferNano.writeMessage(2, mVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mf$q */
    public static final class q extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public n f6272a;

        public q() {
            a();
        }

        public q a() {
            this.f6272a = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            n nVar = this.f6272a;
            return nVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, nVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f6272a == null) {
                        this.f6272a = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.f6272a);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            n nVar = this.f6272a;
            if (nVar != null) {
                codedOutputByteBufferNano.writeMessage(1, nVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0557mf() {
        a();
    }

    public C0557mf a() {
        this.f6219a = 0;
        this.f6220b = null;
        this.f6221c = null;
        this.f6222d = null;
        this.f6223e = null;
        this.f6224f = null;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6219a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        q qVar = this.f6220b;
        if (qVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, qVar);
        }
        o oVar = this.f6221c;
        if (oVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, oVar);
        }
        p pVar = this.f6222d;
        if (pVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, pVar);
        }
        b bVar = this.f6223e;
        if (bVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, bVar);
        }
        h hVar = this.f6224f;
        return hVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, hVar) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f6219a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.f6220b == null) {
                        this.f6220b = new q();
                    }
                    codedInputByteBufferNano.readMessage(this.f6220b);
                } else if (readTag == 26) {
                    if (this.f6221c == null) {
                        this.f6221c = new o();
                    }
                    codedInputByteBufferNano.readMessage(this.f6221c);
                } else if (readTag == 34) {
                    if (this.f6222d == null) {
                        this.f6222d = new p();
                    }
                    codedInputByteBufferNano.readMessage(this.f6222d);
                } else if (readTag == 42) {
                    if (this.f6223e == null) {
                        this.f6223e = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f6223e);
                } else if (readTag == 50) {
                    if (this.f6224f == null) {
                        this.f6224f = new h();
                    }
                    codedInputByteBufferNano.readMessage(this.f6224f);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.f6219a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        q qVar = this.f6220b;
        if (qVar != null) {
            codedOutputByteBufferNano.writeMessage(2, qVar);
        }
        o oVar = this.f6221c;
        if (oVar != null) {
            codedOutputByteBufferNano.writeMessage(3, oVar);
        }
        p pVar = this.f6222d;
        if (pVar != null) {
            codedOutputByteBufferNano.writeMessage(4, pVar);
        }
        b bVar = this.f6223e;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(5, bVar);
        }
        h hVar = this.f6224f;
        if (hVar != null) {
            codedOutputByteBufferNano.writeMessage(6, hVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
