package com.yandex.metrica.impl.ob;

import com.explorestack.protobuf.openrtb.LossReason;
import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.qf  reason: case insensitive filesystem */
public final class C0656qf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public d[] f6577a;

    /* renamed from: b  reason: collision with root package name */
    public c f6578b;

    /* renamed from: c  reason: collision with root package name */
    public a[] f6579c;

    /* renamed from: d  reason: collision with root package name */
    public e[] f6580d;

    /* renamed from: e  reason: collision with root package name */
    public String[] f6581e;

    /* renamed from: com.yandex.metrica.impl.ob.qf$a */
    public static final class a extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile a[] f6582c;

        /* renamed from: a  reason: collision with root package name */
        public String f6583a;

        /* renamed from: b  reason: collision with root package name */
        public String f6584b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f6582c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6582c == null) {
                        f6582c = new a[0];
                    }
                }
            }
            return f6582c;
        }

        public a a() {
            this.f6583a = "";
            this.f6584b = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f6583a) + CodedOutputByteBufferNano.computeStringSize(2, this.f6584b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6583a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f6584b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f6583a);
            codedOutputByteBufferNano.writeString(2, this.f6584b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$b */
    public static final class b extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public double f6585a;

        /* renamed from: b  reason: collision with root package name */
        public double f6586b;

        /* renamed from: c  reason: collision with root package name */
        public long f6587c;

        /* renamed from: d  reason: collision with root package name */
        public int f6588d;

        /* renamed from: e  reason: collision with root package name */
        public int f6589e;

        /* renamed from: f  reason: collision with root package name */
        public int f6590f;

        /* renamed from: g  reason: collision with root package name */
        public int f6591g;

        /* renamed from: h  reason: collision with root package name */
        public int f6592h;
        public String i;

        public b() {
            a();
        }

        public b a() {
            this.f6585a = 0.0d;
            this.f6586b = 0.0d;
            this.f6587c = 0;
            this.f6588d = 0;
            this.f6589e = 0;
            this.f6590f = 0;
            this.f6591g = 0;
            this.f6592h = 0;
            this.i = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeDoubleSize(1, this.f6585a) + CodedOutputByteBufferNano.computeDoubleSize(2, this.f6586b);
            long j = this.f6587c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
            }
            int i2 = this.f6588d;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(4, i2);
            }
            int i3 = this.f6589e;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i3);
            }
            int i4 = this.f6590f;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(6, i4);
            }
            int i5 = this.f6591g;
            if (i5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
            }
            int i6 = this.f6592h;
            if (i6 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i6);
            }
            return !this.i.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(9, this.i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 9) {
                    this.f6585a = codedInputByteBufferNano.readDouble();
                } else if (readTag == 17) {
                    this.f6586b = codedInputByteBufferNano.readDouble();
                } else if (readTag == 24) {
                    this.f6587c = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 32) {
                    this.f6588d = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 40) {
                    this.f6589e = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 48) {
                    this.f6590f = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 56) {
                    this.f6591g = codedInputByteBufferNano.readInt32();
                } else if (readTag == 64) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                        this.f6592h = readInt32;
                    }
                } else if (readTag == 74) {
                    this.i = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeDouble(1, this.f6585a);
            codedOutputByteBufferNano.writeDouble(2, this.f6586b);
            long j = this.f6587c;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j);
            }
            int i2 = this.f6588d;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(4, i2);
            }
            int i3 = this.f6589e;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i3);
            }
            int i4 = this.f6590f;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeUInt32(6, i4);
            }
            int i5 = this.f6591g;
            if (i5 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i5);
            }
            int i6 = this.f6592h;
            if (i6 != 0) {
                codedOutputByteBufferNano.writeInt32(8, i6);
            }
            if (!this.i.equals("")) {
                codedOutputByteBufferNano.writeString(9, this.i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$c */
    public static final class c extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public String f6593a;

        /* renamed from: b  reason: collision with root package name */
        public String f6594b;

        /* renamed from: c  reason: collision with root package name */
        public String f6595c;

        /* renamed from: d  reason: collision with root package name */
        public int f6596d;

        /* renamed from: e  reason: collision with root package name */
        public String f6597e;

        /* renamed from: f  reason: collision with root package name */
        public String f6598f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6599g;

        /* renamed from: h  reason: collision with root package name */
        public int f6600h;
        public String i;
        public String j;
        public int k;
        public a[] l;
        public String m;

        /* renamed from: com.yandex.metrica.impl.ob.qf$c$a */
        public static final class a extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile a[] f6601c;

            /* renamed from: a  reason: collision with root package name */
            public String f6602a;

            /* renamed from: b  reason: collision with root package name */
            public long f6603b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f6601c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f6601c == null) {
                            f6601c = new a[0];
                        }
                    }
                }
                return f6601c;
            }

            public a a() {
                this.f6602a = "";
                this.f6603b = 0;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f6602a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f6603b);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f6602a = codedInputByteBufferNano.readString();
                    } else if (readTag == 16) {
                        this.f6603b = codedInputByteBufferNano.readUInt64();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f6602a);
                codedOutputByteBufferNano.writeUInt64(2, this.f6603b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public c() {
            a();
        }

        public c a() {
            this.f6593a = "";
            this.f6594b = "";
            this.f6595c = "";
            this.f6596d = 0;
            this.f6597e = "";
            this.f6598f = "";
            this.f6599g = false;
            this.f6600h = 0;
            this.i = "";
            this.j = "";
            this.k = 0;
            this.l = a.b();
            this.m = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f6593a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6593a);
            }
            if (!this.f6594b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6594b);
            }
            if (!this.f6595c.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f6595c);
            }
            int i2 = this.f6596d;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
            }
            if (!this.f6597e.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f6597e);
            }
            if (!this.f6598f.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f6598f);
            }
            boolean z = this.f6599g;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
            }
            int i3 = this.f6600h;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i3);
            }
            if (!this.i.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.i);
            }
            if (!this.j.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.j);
            }
            int i4 = this.k;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i4);
            }
            a[] aVarArr = this.l;
            if (aVarArr != null && aVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    a[] aVarArr2 = this.l;
                    if (i5 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i5];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(23, aVar);
                    }
                    i5++;
                }
            }
            return !this.m.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.m) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 10:
                        this.f6593a = codedInputByteBufferNano.readString();
                        continue;
                    case 18:
                        this.f6594b = codedInputByteBufferNano.readString();
                        continue;
                    case 34:
                        this.f6595c = codedInputByteBufferNano.readString();
                        continue;
                    case 40:
                        this.f6596d = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 82:
                        this.f6597e = codedInputByteBufferNano.readString();
                        continue;
                    case 122:
                        this.f6598f = codedInputByteBufferNano.readString();
                        continue;
                    case 136:
                        this.f6599g = codedInputByteBufferNano.readBool();
                        continue;
                    case 144:
                        this.f6600h = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 154:
                        this.i = codedInputByteBufferNano.readString();
                        continue;
                    case 170:
                        this.j = codedInputByteBufferNano.readString();
                        continue;
                    case 176:
                        this.k = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 186:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                        a[] aVarArr = this.l;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        int i2 = repeatedFieldArrayLength + length;
                        a[] aVarArr2 = new a[i2];
                        if (length != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        }
                        while (length < i2 - 1) {
                            aVarArr2[length] = new a();
                            codedInputByteBufferNano.readMessage(aVarArr2[length]);
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        aVarArr2[length] = new a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        this.l = aVarArr2;
                        continue;
                    case 194:
                        this.m = codedInputByteBufferNano.readString();
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
            if (!this.f6593a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f6593a);
            }
            if (!this.f6594b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f6594b);
            }
            if (!this.f6595c.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.f6595c);
            }
            int i2 = this.f6596d;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(5, i2);
            }
            if (!this.f6597e.equals("")) {
                codedOutputByteBufferNano.writeString(10, this.f6597e);
            }
            if (!this.f6598f.equals("")) {
                codedOutputByteBufferNano.writeString(15, this.f6598f);
            }
            boolean z = this.f6599g;
            if (z) {
                codedOutputByteBufferNano.writeBool(17, z);
            }
            int i3 = this.f6600h;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(18, i3);
            }
            if (!this.i.equals("")) {
                codedOutputByteBufferNano.writeString(19, this.i);
            }
            if (!this.j.equals("")) {
                codedOutputByteBufferNano.writeString(21, this.j);
            }
            int i4 = this.k;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeUInt32(22, i4);
            }
            a[] aVarArr = this.l;
            if (aVarArr != null && aVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    a[] aVarArr2 = this.l;
                    if (i5 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i5];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(23, aVar);
                    }
                    i5++;
                }
            }
            if (!this.m.equals("")) {
                codedOutputByteBufferNano.writeString(24, this.m);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$d */
    public static final class d extends MessageNano {

        /* renamed from: d  reason: collision with root package name */
        private static volatile d[] f6604d;

        /* renamed from: a  reason: collision with root package name */
        public long f6605a;

        /* renamed from: b  reason: collision with root package name */
        public b f6606b;

        /* renamed from: c  reason: collision with root package name */
        public a[] f6607c;

        /* renamed from: com.yandex.metrica.impl.ob.qf$d$a */
        public static final class a extends MessageNano {
            private static volatile a[] y;

            /* renamed from: a  reason: collision with root package name */
            public long f6608a;

            /* renamed from: b  reason: collision with root package name */
            public long f6609b;

            /* renamed from: c  reason: collision with root package name */
            public int f6610c;

            /* renamed from: d  reason: collision with root package name */
            public String f6611d;

            /* renamed from: e  reason: collision with root package name */
            public byte[] f6612e;

            /* renamed from: f  reason: collision with root package name */
            public b f6613f;

            /* renamed from: g  reason: collision with root package name */
            public c f6614g;

            /* renamed from: h  reason: collision with root package name */
            public String f6615h;
            public C0055a i;
            public int j;
            public int k;
            public int l;
            public byte[] m;
            public int n;
            public long o;
            public long p;
            public int q;
            public int r;
            public int s;
            public int t;
            public int u;
            public boolean v;
            public long w;
            public b[] x;

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$a  reason: collision with other inner class name */
            public static final class C0055a extends MessageNano {

                /* renamed from: a  reason: collision with root package name */
                public String f6616a;

                /* renamed from: b  reason: collision with root package name */
                public String f6617b;

                /* renamed from: c  reason: collision with root package name */
                public String f6618c;

                public C0055a() {
                    a();
                }

                public C0055a a() {
                    this.f6616a = "";
                    this.f6617b = "";
                    this.f6618c = "";
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f6616a);
                    if (!this.f6617b.equals("")) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6617b);
                    }
                    return !this.f6618c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f6618c) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 10) {
                            this.f6616a = codedInputByteBufferNano.readString();
                        } else if (readTag == 18) {
                            this.f6617b = codedInputByteBufferNano.readString();
                        } else if (readTag == 26) {
                            this.f6618c = codedInputByteBufferNano.readString();
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeString(1, this.f6616a);
                    if (!this.f6617b.equals("")) {
                        codedOutputByteBufferNano.writeString(2, this.f6617b);
                    }
                    if (!this.f6618c.equals("")) {
                        codedOutputByteBufferNano.writeString(3, this.f6618c);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$b */
            public static final class b extends MessageNano {

                /* renamed from: c  reason: collision with root package name */
                private static volatile b[] f6619c;

                /* renamed from: a  reason: collision with root package name */
                public byte[] f6620a;

                /* renamed from: b  reason: collision with root package name */
                public byte[] f6621b;

                public b() {
                    a();
                }

                public static b[] b() {
                    if (f6619c == null) {
                        synchronized (InternalNano.LAZY_INIT_LOCK) {
                            if (f6619c == null) {
                                f6619c = new b[0];
                            }
                        }
                    }
                    return f6619c;
                }

                public b a() {
                    byte[] bArr = WireFormatNano.EMPTY_BYTES;
                    this.f6620a = bArr;
                    this.f6621b = bArr;
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize();
                    if (!Arrays.equals(this.f6620a, WireFormatNano.EMPTY_BYTES)) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6620a);
                    }
                    return !Arrays.equals(this.f6621b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6621b) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 10) {
                            this.f6620a = codedInputByteBufferNano.readBytes();
                        } else if (readTag == 18) {
                            this.f6621b = codedInputByteBufferNano.readBytes();
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    if (!Arrays.equals(this.f6620a, WireFormatNano.EMPTY_BYTES)) {
                        codedOutputByteBufferNano.writeBytes(1, this.f6620a);
                    }
                    if (!Arrays.equals(this.f6621b, WireFormatNano.EMPTY_BYTES)) {
                        codedOutputByteBufferNano.writeBytes(2, this.f6621b);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.qf$d$a$c */
            public static final class c extends MessageNano {

                /* renamed from: a  reason: collision with root package name */
                public C0607of[] f6622a;

                /* renamed from: b  reason: collision with root package name */
                public C0679rf[] f6623b;

                /* renamed from: c  reason: collision with root package name */
                public int f6624c;

                /* renamed from: d  reason: collision with root package name */
                public String f6625d;

                public c() {
                    a();
                }

                public c a() {
                    this.f6622a = C0607of.b();
                    this.f6623b = C0679rf.b();
                    this.f6624c = 2;
                    this.f6625d = "";
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize();
                    C0607of[] ofVarArr = this.f6622a;
                    int i = 0;
                    if (ofVarArr != null && ofVarArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            C0607of[] ofVarArr2 = this.f6622a;
                            if (i2 >= ofVarArr2.length) {
                                break;
                            }
                            C0607of ofVar = ofVarArr2[i2];
                            if (ofVar != null) {
                                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, ofVar);
                            }
                            i2++;
                        }
                    }
                    C0679rf[] rfVarArr = this.f6623b;
                    if (rfVarArr != null && rfVarArr.length > 0) {
                        while (true) {
                            C0679rf[] rfVarArr2 = this.f6623b;
                            if (i >= rfVarArr2.length) {
                                break;
                            }
                            C0679rf rfVar = rfVarArr2[i];
                            if (rfVar != null) {
                                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, rfVar);
                            }
                            i++;
                        }
                    }
                    int i3 = this.f6624c;
                    if (i3 != 2) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i3);
                    }
                    return !this.f6625d.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f6625d) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 10) {
                            int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                            C0607of[] ofVarArr = this.f6622a;
                            int length = ofVarArr == null ? 0 : ofVarArr.length;
                            int i = repeatedFieldArrayLength + length;
                            C0607of[] ofVarArr2 = new C0607of[i];
                            if (length != 0) {
                                System.arraycopy(ofVarArr, 0, ofVarArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ofVarArr2[length] = new C0607of();
                                codedInputByteBufferNano.readMessage(ofVarArr2[length]);
                                codedInputByteBufferNano.readTag();
                                length++;
                            }
                            ofVarArr2[length] = new C0607of();
                            codedInputByteBufferNano.readMessage(ofVarArr2[length]);
                            this.f6622a = ofVarArr2;
                        } else if (readTag != 18) {
                            if (readTag == 24) {
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
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f6624c = readInt32;
                                        break;
                                }
                            } else if (readTag == 34) {
                                this.f6625d = codedInputByteBufferNano.readString();
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        } else {
                            int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                            C0679rf[] rfVarArr = this.f6623b;
                            int length2 = rfVarArr == null ? 0 : rfVarArr.length;
                            int i2 = repeatedFieldArrayLength2 + length2;
                            C0679rf[] rfVarArr2 = new C0679rf[i2];
                            if (length2 != 0) {
                                System.arraycopy(rfVarArr, 0, rfVarArr2, 0, length2);
                            }
                            while (length2 < i2 - 1) {
                                rfVarArr2[length2] = new C0679rf();
                                codedInputByteBufferNano.readMessage(rfVarArr2[length2]);
                                codedInputByteBufferNano.readTag();
                                length2++;
                            }
                            rfVarArr2[length2] = new C0679rf();
                            codedInputByteBufferNano.readMessage(rfVarArr2[length2]);
                            this.f6623b = rfVarArr2;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    C0607of[] ofVarArr = this.f6622a;
                    int i = 0;
                    if (ofVarArr != null && ofVarArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            C0607of[] ofVarArr2 = this.f6622a;
                            if (i2 >= ofVarArr2.length) {
                                break;
                            }
                            C0607of ofVar = ofVarArr2[i2];
                            if (ofVar != null) {
                                codedOutputByteBufferNano.writeMessage(1, ofVar);
                            }
                            i2++;
                        }
                    }
                    C0679rf[] rfVarArr = this.f6623b;
                    if (rfVarArr != null && rfVarArr.length > 0) {
                        while (true) {
                            C0679rf[] rfVarArr2 = this.f6623b;
                            if (i >= rfVarArr2.length) {
                                break;
                            }
                            C0679rf rfVar = rfVarArr2[i];
                            if (rfVar != null) {
                                codedOutputByteBufferNano.writeMessage(2, rfVar);
                            }
                            i++;
                        }
                    }
                    int i3 = this.f6624c;
                    if (i3 != 2) {
                        codedOutputByteBufferNano.writeInt32(3, i3);
                    }
                    if (!this.f6625d.equals("")) {
                        codedOutputByteBufferNano.writeString(4, this.f6625d);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public a() {
                a();
            }

            public static a[] b() {
                if (y == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (y == null) {
                            y = new a[0];
                        }
                    }
                }
                return y;
            }

            public a a() {
                this.f6608a = 0;
                this.f6609b = 0;
                this.f6610c = 0;
                this.f6611d = "";
                byte[] bArr = WireFormatNano.EMPTY_BYTES;
                this.f6612e = bArr;
                this.f6613f = null;
                this.f6614g = null;
                this.f6615h = "";
                this.i = null;
                this.j = 0;
                this.k = 0;
                this.l = -1;
                this.m = bArr;
                this.n = -1;
                this.o = 0;
                this.p = 0;
                this.q = 0;
                this.r = 0;
                this.s = -1;
                this.t = 0;
                this.u = 0;
                this.v = false;
                this.w = 1;
                this.x = b.b();
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6608a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f6609b) + CodedOutputByteBufferNano.computeUInt32Size(3, this.f6610c);
                if (!this.f6611d.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f6611d);
                }
                if (!Arrays.equals(this.f6612e, WireFormatNano.EMPTY_BYTES)) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f6612e);
                }
                b bVar = this.f6613f;
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, bVar);
                }
                c cVar = this.f6614g;
                if (cVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, cVar);
                }
                if (!this.f6615h.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.f6615h);
                }
                C0055a aVar = this.i;
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(9, aVar);
                }
                int i2 = this.j;
                if (i2 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(10, i2);
                }
                int i3 = this.k;
                if (i3 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i3);
                }
                int i4 = this.l;
                if (i4 != -1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(13, i4);
                }
                if (!Arrays.equals(this.m, WireFormatNano.EMPTY_BYTES)) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(14, this.m);
                }
                int i5 = this.n;
                if (i5 != -1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i5);
                }
                long j2 = this.o;
                if (j2 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(16, j2);
                }
                long j3 = this.p;
                if (j3 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(17, j3);
                }
                int i6 = this.q;
                if (i6 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(18, i6);
                }
                int i7 = this.r;
                if (i7 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(19, i7);
                }
                int i8 = this.s;
                if (i8 != -1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(20, i8);
                }
                int i9 = this.t;
                if (i9 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(21, i9);
                }
                int i10 = this.u;
                if (i10 != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(22, i10);
                }
                boolean z = this.v;
                if (z) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(23, z);
                }
                long j4 = this.w;
                if (j4 != 1) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(24, j4);
                }
                b[] bVarArr = this.x;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i11 = 0;
                    while (true) {
                        b[] bVarArr2 = this.x;
                        if (i11 >= bVarArr2.length) {
                            break;
                        }
                        b bVar2 = bVarArr2[i11];
                        if (bVar2 != null) {
                            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(25, bVar2);
                        }
                        i11++;
                    }
                }
                return computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.f6608a = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 16:
                            this.f6609b = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 24:
                            this.f6610c = codedInputByteBufferNano.readUInt32();
                            continue;
                        case 34:
                            this.f6611d = codedInputByteBufferNano.readString();
                            continue;
                        case 42:
                            this.f6612e = codedInputByteBufferNano.readBytes();
                            continue;
                        case 50:
                            if (this.f6613f == null) {
                                this.f6613f = new b();
                            }
                            codedInputByteBufferNano.readMessage(this.f6613f);
                            continue;
                        case 58:
                            if (this.f6614g == null) {
                                this.f6614g = new c();
                            }
                            codedInputByteBufferNano.readMessage(this.f6614g);
                            continue;
                        case 66:
                            this.f6615h = codedInputByteBufferNano.readString();
                            continue;
                        case 74:
                            if (this.i == null) {
                                this.i = new C0055a();
                            }
                            codedInputByteBufferNano.readMessage(this.i);
                            continue;
                        case 80:
                            this.j = codedInputByteBufferNano.readUInt32();
                            continue;
                        case 96:
                            int readInt32 = codedInputByteBufferNano.readInt32();
                            if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                                this.k = readInt32;
                                break;
                            } else {
                                continue;
                            }
                        case 104:
                            int readInt322 = codedInputByteBufferNano.readInt32();
                            if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                                this.l = readInt322;
                                break;
                            } else {
                                continue;
                            }
                        case 114:
                            this.m = codedInputByteBufferNano.readBytes();
                            continue;
                        case 120:
                            int readInt323 = codedInputByteBufferNano.readInt32();
                            if (readInt323 == -1 || readInt323 == 0 || readInt323 == 1) {
                                this.n = readInt323;
                                break;
                            } else {
                                continue;
                            }
                        case 128:
                            this.o = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 136:
                            this.p = codedInputByteBufferNano.readUInt64();
                            continue;
                        case 144:
                            int readInt324 = codedInputByteBufferNano.readInt32();
                            if (readInt324 == 0 || readInt324 == 1 || readInt324 == 2 || readInt324 == 3 || readInt324 == 4) {
                                this.q = readInt324;
                                break;
                            } else {
                                continue;
                            }
                        case 152:
                            int readInt325 = codedInputByteBufferNano.readInt32();
                            if (readInt325 == 0 || readInt325 == 1 || readInt325 == 2 || readInt325 == 3) {
                                this.r = readInt325;
                                break;
                            } else {
                                continue;
                            }
                        case 160:
                            int readInt326 = codedInputByteBufferNano.readInt32();
                            if (readInt326 == -1 || readInt326 == 0 || readInt326 == 1) {
                                this.s = readInt326;
                                break;
                            } else {
                                continue;
                            }
                        case 168:
                            int readInt327 = codedInputByteBufferNano.readInt32();
                            if (readInt327 == 0 || readInt327 == 1 || readInt327 == 2 || readInt327 == 3) {
                                this.t = readInt327;
                                break;
                            } else {
                                continue;
                            }
                        case 176:
                            int readInt328 = codedInputByteBufferNano.readInt32();
                            if (readInt328 == 0 || readInt328 == 1) {
                                this.u = readInt328;
                                break;
                            } else {
                                continue;
                            }
                        case 184:
                            this.v = codedInputByteBufferNano.readBool();
                            continue;
                        case 192:
                            this.w = codedInputByteBufferNano.readUInt64();
                            continue;
                        case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                            int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE);
                            b[] bVarArr = this.x;
                            int length = bVarArr == null ? 0 : bVarArr.length;
                            int i2 = repeatedFieldArrayLength + length;
                            b[] bVarArr2 = new b[i2];
                            if (length != 0) {
                                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                            }
                            while (length < i2 - 1) {
                                bVarArr2[length] = new b();
                                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                                codedInputByteBufferNano.readTag();
                                length++;
                            }
                            bVarArr2[length] = new b();
                            codedInputByteBufferNano.readMessage(bVarArr2[length]);
                            this.x = bVarArr2;
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
                codedOutputByteBufferNano.writeUInt64(1, this.f6608a);
                codedOutputByteBufferNano.writeUInt64(2, this.f6609b);
                codedOutputByteBufferNano.writeUInt32(3, this.f6610c);
                if (!this.f6611d.equals("")) {
                    codedOutputByteBufferNano.writeString(4, this.f6611d);
                }
                if (!Arrays.equals(this.f6612e, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(5, this.f6612e);
                }
                b bVar = this.f6613f;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(6, bVar);
                }
                c cVar = this.f6614g;
                if (cVar != null) {
                    codedOutputByteBufferNano.writeMessage(7, cVar);
                }
                if (!this.f6615h.equals("")) {
                    codedOutputByteBufferNano.writeString(8, this.f6615h);
                }
                C0055a aVar = this.i;
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(9, aVar);
                }
                int i2 = this.j;
                if (i2 != 0) {
                    codedOutputByteBufferNano.writeUInt32(10, i2);
                }
                int i3 = this.k;
                if (i3 != 0) {
                    codedOutputByteBufferNano.writeInt32(12, i3);
                }
                int i4 = this.l;
                if (i4 != -1) {
                    codedOutputByteBufferNano.writeInt32(13, i4);
                }
                if (!Arrays.equals(this.m, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(14, this.m);
                }
                int i5 = this.n;
                if (i5 != -1) {
                    codedOutputByteBufferNano.writeInt32(15, i5);
                }
                long j2 = this.o;
                if (j2 != 0) {
                    codedOutputByteBufferNano.writeUInt64(16, j2);
                }
                long j3 = this.p;
                if (j3 != 0) {
                    codedOutputByteBufferNano.writeUInt64(17, j3);
                }
                int i6 = this.q;
                if (i6 != 0) {
                    codedOutputByteBufferNano.writeInt32(18, i6);
                }
                int i7 = this.r;
                if (i7 != 0) {
                    codedOutputByteBufferNano.writeInt32(19, i7);
                }
                int i8 = this.s;
                if (i8 != -1) {
                    codedOutputByteBufferNano.writeInt32(20, i8);
                }
                int i9 = this.t;
                if (i9 != 0) {
                    codedOutputByteBufferNano.writeInt32(21, i9);
                }
                int i10 = this.u;
                if (i10 != 0) {
                    codedOutputByteBufferNano.writeInt32(22, i10);
                }
                boolean z = this.v;
                if (z) {
                    codedOutputByteBufferNano.writeBool(23, z);
                }
                long j4 = this.w;
                if (j4 != 1) {
                    codedOutputByteBufferNano.writeUInt64(24, j4);
                }
                b[] bVarArr = this.x;
                if (bVarArr != null && bVarArr.length > 0) {
                    int i11 = 0;
                    while (true) {
                        b[] bVarArr2 = this.x;
                        if (i11 >= bVarArr2.length) {
                            break;
                        }
                        b bVar2 = bVarArr2[i11];
                        if (bVar2 != null) {
                            codedOutputByteBufferNano.writeMessage(25, bVar2);
                        }
                        i11++;
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.qf$d$b */
        public static final class b extends MessageNano {

            /* renamed from: a  reason: collision with root package name */
            public f f6626a;

            /* renamed from: b  reason: collision with root package name */
            public String f6627b;

            /* renamed from: c  reason: collision with root package name */
            public int f6628c;

            public b() {
                a();
            }

            public b a() {
                this.f6626a = null;
                this.f6627b = "";
                this.f6628c = 0;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                f fVar = this.f6626a;
                if (fVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, fVar);
                }
                int computeStringSize = computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f6627b);
                int i = this.f6628c;
                return i != 0 ? computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i) : computeStringSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        if (this.f6626a == null) {
                            this.f6626a = new f();
                        }
                        codedInputByteBufferNano.readMessage(this.f6626a);
                    } else if (readTag == 18) {
                        this.f6627b = codedInputByteBufferNano.readString();
                    } else if (readTag == 40) {
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                            this.f6628c = readInt32;
                        }
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                f fVar = this.f6626a;
                if (fVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, fVar);
                }
                codedOutputByteBufferNano.writeString(2, this.f6627b);
                int i = this.f6628c;
                if (i != 0) {
                    codedOutputByteBufferNano.writeInt32(5, i);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public d() {
            a();
        }

        public static d[] b() {
            if (f6604d == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6604d == null) {
                        f6604d = new d[0];
                    }
                }
            }
            return f6604d;
        }

        public d a() {
            this.f6605a = 0;
            this.f6606b = null;
            this.f6607c = a.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6605a);
            b bVar = this.f6606b;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
            }
            a[] aVarArr = this.f6607c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f6607c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, aVar);
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
                } else if (readTag == 8) {
                    this.f6605a = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 18) {
                    if (this.f6606b == null) {
                        this.f6606b = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f6606b);
                } else if (readTag == 26) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    a[] aVarArr = this.f6607c;
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
                    this.f6607c = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.f6605a);
            b bVar = this.f6606b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            a[] aVarArr = this.f6607c;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f6607c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$e */
    public static final class e extends MessageNano {

        /* renamed from: e  reason: collision with root package name */
        private static volatile e[] f6629e;

        /* renamed from: a  reason: collision with root package name */
        public int f6630a;

        /* renamed from: b  reason: collision with root package name */
        public int f6631b;

        /* renamed from: c  reason: collision with root package name */
        public String f6632c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6633d;

        public e() {
            a();
        }

        public static e[] b() {
            if (f6629e == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6629e == null) {
                        f6629e = new e[0];
                    }
                }
            }
            return f6629e;
        }

        public e a() {
            this.f6630a = 0;
            this.f6631b = 0;
            this.f6632c = "";
            this.f6633d = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f6630a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
            }
            int i2 = this.f6631b;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i2);
            }
            if (!this.f6632c.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6632c);
            }
            boolean z = this.f6633d;
            return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6630a = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 16) {
                    this.f6631b = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 26) {
                    this.f6632c = codedInputByteBufferNano.readString();
                } else if (readTag == 32) {
                    this.f6633d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f6630a;
            if (i != 0) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            int i2 = this.f6631b;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(2, i2);
            }
            if (!this.f6632c.equals("")) {
                codedOutputByteBufferNano.writeString(3, this.f6632c);
            }
            boolean z = this.f6633d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qf$f */
    public static final class f extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f6634a;

        /* renamed from: b  reason: collision with root package name */
        public int f6635b;

        /* renamed from: c  reason: collision with root package name */
        public long f6636c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6637d;

        public f() {
            a();
        }

        public f a() {
            this.f6634a = 0;
            this.f6635b = 0;
            this.f6636c = 0;
            this.f6637d = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6634a) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f6635b);
            long j = this.f6636c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j);
            }
            boolean z = this.f6637d;
            return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6634a = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    this.f6635b = codedInputByteBufferNano.readSInt32();
                } else if (readTag == 24) {
                    this.f6636c = codedInputByteBufferNano.readInt64();
                } else if (readTag == 32) {
                    this.f6637d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.f6634a);
            codedOutputByteBufferNano.writeSInt32(2, this.f6635b);
            long j = this.f6636c;
            if (j != 0) {
                codedOutputByteBufferNano.writeInt64(3, j);
            }
            boolean z = this.f6637d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0656qf() {
        a();
    }

    public C0656qf a() {
        this.f6577a = d.b();
        this.f6578b = null;
        this.f6579c = a.b();
        this.f6580d = e.b();
        this.f6581e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        d[] dVarArr = this.f6577a;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                d[] dVarArr2 = this.f6577a;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, dVar);
                }
                i2++;
            }
        }
        c cVar = this.f6578b;
        if (cVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, cVar);
        }
        a[] aVarArr = this.f6579c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f6579c;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, aVar);
                }
                i3++;
            }
        }
        e[] eVarArr = this.f6580d;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e[] eVarArr2 = this.f6580d;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i4];
                if (eVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f6581e;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.f6581e;
            if (i >= strArr2.length) {
                return computeSerializedSize + i5 + (i6 * 1);
            }
            String str = strArr2[i];
            if (str != null) {
                i6++;
                i5 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
            }
            i++;
        }
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                d[] dVarArr = this.f6577a;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i = repeatedFieldArrayLength + length;
                d[] dVarArr2 = new d[i];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i - 1) {
                    dVarArr2[length] = new d();
                    codedInputByteBufferNano.readMessage(dVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                dVarArr2[length] = new d();
                codedInputByteBufferNano.readMessage(dVarArr2[length]);
                this.f6577a = dVarArr2;
            } else if (readTag == 34) {
                if (this.f6578b == null) {
                    this.f6578b = new c();
                }
                codedInputByteBufferNano.readMessage(this.f6578b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                a[] aVarArr = this.f6579c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                a[] aVarArr2 = new a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    aVarArr2[length2] = new a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length2]);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                aVarArr2[length2] = new a();
                codedInputByteBufferNano.readMessage(aVarArr2[length2]);
                this.f6579c = aVarArr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                e[] eVarArr = this.f6580d;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i3 = repeatedFieldArrayLength3 + length3;
                e[] eVarArr2 = new e[i3];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    eVarArr2[length3] = new e();
                    codedInputByteBufferNano.readMessage(eVarArr2[length3]);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                eVarArr2[length3] = new e();
                codedInputByteBufferNano.readMessage(eVarArr2[length3]);
                this.f6580d = eVarArr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f6581e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f6581e = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        d[] dVarArr = this.f6577a;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                d[] dVarArr2 = this.f6577a;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, dVar);
                }
                i2++;
            }
        }
        c cVar = this.f6578b;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(4, cVar);
        }
        a[] aVarArr = this.f6579c;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f6579c;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(7, aVar);
                }
                i3++;
            }
        }
        e[] eVarArr = this.f6580d;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e[] eVarArr2 = this.f6580d;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i4];
                if (eVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f6581e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f6581e;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
