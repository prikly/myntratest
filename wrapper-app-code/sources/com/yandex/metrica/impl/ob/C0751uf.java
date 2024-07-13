package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.uf  reason: case insensitive filesystem */
public final class C0751uf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public int f6889a;

    /* renamed from: b  reason: collision with root package name */
    public double f6890b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f6891c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6892d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f6893e;

    /* renamed from: f  reason: collision with root package name */
    public a f6894f;

    /* renamed from: g  reason: collision with root package name */
    public long f6895g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6896h;
    public int i;
    public int j;
    public c k;
    public b l;

    /* renamed from: com.yandex.metrica.impl.ob.uf$a */
    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6897a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f6898b;

        public a() {
            a();
        }

        public a a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f6897a = bArr;
            this.f6898b = bArr;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6897a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6897a);
            }
            return !Arrays.equals(this.f6898b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6898b) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6897a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    this.f6898b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6897a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6897a);
            }
            if (!Arrays.equals(this.f6898b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f6898b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uf$b */
    public static final class b extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6899a;

        /* renamed from: b  reason: collision with root package name */
        public C0057b f6900b;

        /* renamed from: c  reason: collision with root package name */
        public a f6901c;

        /* renamed from: com.yandex.metrica.impl.ob.uf$b$a */
        public static final class a extends MessageNano {

            /* renamed from: a  reason: collision with root package name */
            public long f6902a;

            /* renamed from: b  reason: collision with root package name */
            public C0057b f6903b;

            /* renamed from: c  reason: collision with root package name */
            public int f6904c;

            /* renamed from: d  reason: collision with root package name */
            public byte[] f6905d;

            public a() {
                a();
            }

            public a a() {
                this.f6902a = 0;
                this.f6903b = null;
                this.f6904c = 0;
                this.f6905d = WireFormatNano.EMPTY_BYTES;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                long j = this.f6902a;
                if (j != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
                }
                C0057b bVar = this.f6903b;
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
                }
                int i = this.f6904c;
                if (i != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
                }
                return !Arrays.equals(this.f6905d, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f6905d) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 8) {
                        this.f6902a = codedInputByteBufferNano.readInt64();
                    } else if (readTag == 18) {
                        if (this.f6903b == null) {
                            this.f6903b = new C0057b();
                        }
                        codedInputByteBufferNano.readMessage(this.f6903b);
                    } else if (readTag == 24) {
                        this.f6904c = codedInputByteBufferNano.readUInt32();
                    } else if (readTag == 34) {
                        this.f6905d = codedInputByteBufferNano.readBytes();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                long j = this.f6902a;
                if (j != 0) {
                    codedOutputByteBufferNano.writeInt64(1, j);
                }
                C0057b bVar = this.f6903b;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, bVar);
                }
                int i = this.f6904c;
                if (i != 0) {
                    codedOutputByteBufferNano.writeUInt32(3, i);
                }
                if (!Arrays.equals(this.f6905d, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(4, this.f6905d);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.uf$b$b  reason: collision with other inner class name */
        public static final class C0057b extends MessageNano {

            /* renamed from: a  reason: collision with root package name */
            public int f6906a;

            /* renamed from: b  reason: collision with root package name */
            public int f6907b;

            public C0057b() {
                a();
            }

            public C0057b a() {
                this.f6906a = 0;
                this.f6907b = 0;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                int i = this.f6906a;
                if (i != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
                }
                int i2 = this.f6907b;
                return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 8) {
                        this.f6906a = codedInputByteBufferNano.readUInt32();
                    } else if (readTag == 16) {
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                            this.f6907b = readInt32;
                        }
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int i = this.f6906a;
                if (i != 0) {
                    codedOutputByteBufferNano.writeUInt32(1, i);
                }
                int i2 = this.f6907b;
                if (i2 != 0) {
                    codedOutputByteBufferNano.writeInt32(2, i2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public b() {
            a();
        }

        public b a() {
            this.f6899a = false;
            this.f6900b = null;
            this.f6901c = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.f6899a;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            C0057b bVar = this.f6900b;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
            }
            a aVar = this.f6901c;
            return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6899a = codedInputByteBufferNano.readBool();
                } else if (readTag == 18) {
                    if (this.f6900b == null) {
                        this.f6900b = new C0057b();
                    }
                    codedInputByteBufferNano.readMessage(this.f6900b);
                } else if (readTag == 26) {
                    if (this.f6901c == null) {
                        this.f6901c = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f6901c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.f6899a;
            if (z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            C0057b bVar = this.f6900b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            a aVar = this.f6901c;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(3, aVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uf$c */
    public static final class c extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6908a;

        /* renamed from: b  reason: collision with root package name */
        public long f6909b;

        /* renamed from: c  reason: collision with root package name */
        public int f6910c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f6911d;

        /* renamed from: e  reason: collision with root package name */
        public long f6912e;

        public c() {
            a();
        }

        public c a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f6908a = bArr;
            this.f6909b = 0;
            this.f6910c = 0;
            this.f6911d = bArr;
            this.f6912e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6908a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6908a);
            }
            long j = this.f6909b;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
            }
            int i = this.f6910c;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
            }
            if (!Arrays.equals(this.f6911d, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6911d);
            }
            long j2 = this.f6912e;
            return j2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6908a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 16) {
                    this.f6909b = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.f6910c = readInt32;
                    }
                } else if (readTag == 34) {
                    this.f6911d = codedInputByteBufferNano.readBytes();
                } else if (readTag == 40) {
                    this.f6912e = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6908a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6908a);
            }
            long j = this.f6909b;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j);
            }
            int i = this.f6910c;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(3, i);
            }
            if (!Arrays.equals(this.f6911d, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(4, this.f6911d);
            }
            long j2 = this.f6912e;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0751uf() {
        a();
    }

    public C0751uf a() {
        this.f6889a = 1;
        this.f6890b = 0.0d;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6891c = bArr;
        this.f6892d = bArr;
        this.f6893e = bArr;
        this.f6894f = null;
        this.f6895g = 0;
        this.f6896h = false;
        this.i = 0;
        this.j = 1;
        this.k = null;
        this.l = null;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6889a;
        if (i2 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        if (Double.doubleToLongBits(this.f6890b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f6890b);
        }
        int computeBytesSize = computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(3, this.f6891c);
        if (!Arrays.equals(this.f6892d, WireFormatNano.EMPTY_BYTES)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f6892d);
        }
        if (!Arrays.equals(this.f6893e, WireFormatNano.EMPTY_BYTES)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6893e);
        }
        a aVar = this.f6894f;
        if (aVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, aVar);
        }
        long j2 = this.f6895g;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z = this.f6896h;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i3 = this.i;
        if (i3 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.j;
        if (i4 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        c cVar = this.k;
        if (cVar != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, cVar);
        }
        b bVar = this.l;
        return bVar != null ? computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, bVar) : computeBytesSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f6889a = codedInputByteBufferNano.readUInt32();
                    continue;
                case 17:
                    this.f6890b = codedInputByteBufferNano.readDouble();
                    continue;
                case 26:
                    this.f6891c = codedInputByteBufferNano.readBytes();
                    continue;
                case 34:
                    this.f6892d = codedInputByteBufferNano.readBytes();
                    continue;
                case 42:
                    this.f6893e = codedInputByteBufferNano.readBytes();
                    continue;
                case 50:
                    if (this.f6894f == null) {
                        this.f6894f = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f6894f);
                    continue;
                case 56:
                    this.f6895g = codedInputByteBufferNano.readInt64();
                    continue;
                case 64:
                    this.f6896h = codedInputByteBufferNano.readBool();
                    continue;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.i = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 1 || readInt322 == 2) {
                        this.j = readInt322;
                        break;
                    } else {
                        continue;
                    }
                case 90:
                    if (this.k == null) {
                        this.k = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.l);
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
        int i2 = this.f6889a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        if (Double.doubleToLongBits(this.f6890b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f6890b);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f6891c);
        if (!Arrays.equals(this.f6892d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f6892d);
        }
        if (!Arrays.equals(this.f6893e, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6893e);
        }
        a aVar = this.f6894f;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(6, aVar);
        }
        long j2 = this.f6895g;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z = this.f6896h;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i3 = this.i;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.j;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        c cVar = this.k;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(11, cVar);
        }
        b bVar = this.l;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(12, bVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
