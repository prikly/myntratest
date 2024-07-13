package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.pf  reason: case insensitive filesystem */
public final class C0632pf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public b[] f6442a;

    /* renamed from: b  reason: collision with root package name */
    public a[] f6443b;

    /* renamed from: com.yandex.metrica.impl.ob.pf$a */
    public static final class a extends MessageNano {

        /* renamed from: h  reason: collision with root package name */
        private static volatile a[] f6444h;

        /* renamed from: a  reason: collision with root package name */
        public long f6445a;

        /* renamed from: b  reason: collision with root package name */
        public long f6446b;

        /* renamed from: c  reason: collision with root package name */
        public C0607of[] f6447c;

        /* renamed from: d  reason: collision with root package name */
        public C0679rf[] f6448d;

        /* renamed from: e  reason: collision with root package name */
        public long f6449e;

        /* renamed from: f  reason: collision with root package name */
        public int f6450f;

        /* renamed from: g  reason: collision with root package name */
        public int f6451g;

        public a() {
            a();
        }

        public static a[] b() {
            if (f6444h == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6444h == null) {
                        f6444h = new a[0];
                    }
                }
            }
            return f6444h;
        }

        public a a() {
            this.f6445a = 0;
            this.f6446b = 0;
            this.f6447c = C0607of.b();
            this.f6448d = C0679rf.b();
            this.f6449e = 0;
            this.f6450f = 0;
            this.f6451g = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6445a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f6446b);
            C0607of[] ofVarArr = this.f6447c;
            int i = 0;
            if (ofVarArr != null && ofVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C0607of[] ofVarArr2 = this.f6447c;
                    if (i2 >= ofVarArr2.length) {
                        break;
                    }
                    C0607of ofVar = ofVarArr2[i2];
                    if (ofVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, ofVar);
                    }
                    i2++;
                }
            }
            C0679rf[] rfVarArr = this.f6448d;
            if (rfVarArr != null && rfVarArr.length > 0) {
                while (true) {
                    C0679rf[] rfVarArr2 = this.f6448d;
                    if (i >= rfVarArr2.length) {
                        break;
                    }
                    C0679rf rfVar = rfVarArr2[i];
                    if (rfVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, rfVar);
                    }
                    i++;
                }
            }
            long j = this.f6449e;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(5, j);
            }
            int i3 = this.f6450f;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i3);
            }
            int i4 = this.f6451g;
            return i4 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(7, i4) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6445a = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 16) {
                    this.f6446b = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 26) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    C0607of[] ofVarArr = this.f6447c;
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
                    this.f6447c = ofVarArr2;
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C0679rf[] rfVarArr = this.f6448d;
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
                    this.f6448d = rfVarArr2;
                } else if (readTag == 40) {
                    this.f6449e = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 48) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                        this.f6450f = readInt32;
                    }
                } else if (readTag == 56) {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3) {
                        this.f6451g = readInt322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeUInt64(1, this.f6445a);
            codedOutputByteBufferNano.writeUInt64(2, this.f6446b);
            C0607of[] ofVarArr = this.f6447c;
            int i = 0;
            if (ofVarArr != null && ofVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C0607of[] ofVarArr2 = this.f6447c;
                    if (i2 >= ofVarArr2.length) {
                        break;
                    }
                    C0607of ofVar = ofVarArr2[i2];
                    if (ofVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, ofVar);
                    }
                    i2++;
                }
            }
            C0679rf[] rfVarArr = this.f6448d;
            if (rfVarArr != null && rfVarArr.length > 0) {
                while (true) {
                    C0679rf[] rfVarArr2 = this.f6448d;
                    if (i >= rfVarArr2.length) {
                        break;
                    }
                    C0679rf rfVar = rfVarArr2[i];
                    if (rfVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, rfVar);
                    }
                    i++;
                }
            }
            long j = this.f6449e;
            if (j != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j);
            }
            int i3 = this.f6450f;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i3);
            }
            int i4 = this.f6451g;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pf$b */
    public static final class b extends MessageNano {
        private static volatile b[] n;

        /* renamed from: a  reason: collision with root package name */
        public long f6452a;

        /* renamed from: b  reason: collision with root package name */
        public long f6453b;

        /* renamed from: c  reason: collision with root package name */
        public long f6454c;

        /* renamed from: d  reason: collision with root package name */
        public double f6455d;

        /* renamed from: e  reason: collision with root package name */
        public double f6456e;

        /* renamed from: f  reason: collision with root package name */
        public int f6457f;

        /* renamed from: g  reason: collision with root package name */
        public int f6458g;

        /* renamed from: h  reason: collision with root package name */
        public int f6459h;
        public int i;
        public int j;
        public int k;
        public long l;
        public int m;

        public b() {
            a();
        }

        public static b[] b() {
            if (n == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (n == null) {
                        n = new b[0];
                    }
                }
            }
            return n;
        }

        public b a() {
            this.f6452a = 0;
            this.f6453b = 0;
            this.f6454c = 0;
            this.f6455d = 0.0d;
            this.f6456e = 0.0d;
            this.f6457f = 0;
            this.f6458g = 0;
            this.f6459h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeUInt64Size(1, this.f6452a) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f6453b);
            long j2 = this.f6454c;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
            }
            int computeDoubleSize = computeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(4, this.f6455d) + CodedOutputByteBufferNano.computeDoubleSize(5, this.f6456e);
            int i2 = this.f6457f;
            if (i2 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i2);
            }
            int i3 = this.f6458g;
            if (i3 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(7, i3);
            }
            int i4 = this.f6459h;
            if (i4 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(8, i4);
            }
            int i5 = this.i;
            if (i5 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(9, i5);
            }
            int i6 = this.j;
            if (i6 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(10, i6);
            }
            int i7 = this.k;
            if (i7 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(11, i7);
            }
            long j3 = this.l;
            if (j3 != 0) {
                computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(12, j3);
            }
            int i8 = this.m;
            return i8 != 0 ? computeDoubleSize + CodedOutputByteBufferNano.computeInt32Size(13, i8) : computeDoubleSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f6452a = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 16:
                        this.f6453b = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 24:
                        this.f6454c = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 33:
                        this.f6455d = codedInputByteBufferNano.readDouble();
                        continue;
                    case 41:
                        this.f6456e = codedInputByteBufferNano.readDouble();
                        continue;
                    case 48:
                        this.f6457f = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 56:
                        this.f6458g = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 64:
                        this.f6459h = codedInputByteBufferNano.readUInt32();
                        continue;
                    case 72:
                        this.i = codedInputByteBufferNano.readInt32();
                        continue;
                    case 80:
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                            this.j = readInt32;
                            break;
                        } else {
                            continue;
                        }
                    case 88:
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3) {
                            this.k = readInt322;
                            break;
                        } else {
                            continue;
                        }
                    case 96:
                        this.l = codedInputByteBufferNano.readUInt64();
                        continue;
                    case 104:
                        int readInt323 = codedInputByteBufferNano.readInt32();
                        if (readInt323 == 0 || readInt323 == 1 || readInt323 == 2 || readInt323 == 3 || readInt323 == 4) {
                            this.m = readInt323;
                            break;
                        } else {
                            continue;
                        }
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
            codedOutputByteBufferNano.writeUInt64(1, this.f6452a);
            codedOutputByteBufferNano.writeUInt64(2, this.f6453b);
            long j2 = this.f6454c;
            if (j2 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j2);
            }
            codedOutputByteBufferNano.writeDouble(4, this.f6455d);
            codedOutputByteBufferNano.writeDouble(5, this.f6456e);
            int i2 = this.f6457f;
            if (i2 != 0) {
                codedOutputByteBufferNano.writeUInt32(6, i2);
            }
            int i3 = this.f6458g;
            if (i3 != 0) {
                codedOutputByteBufferNano.writeUInt32(7, i3);
            }
            int i4 = this.f6459h;
            if (i4 != 0) {
                codedOutputByteBufferNano.writeUInt32(8, i4);
            }
            int i5 = this.i;
            if (i5 != 0) {
                codedOutputByteBufferNano.writeInt32(9, i5);
            }
            int i6 = this.j;
            if (i6 != 0) {
                codedOutputByteBufferNano.writeInt32(10, i6);
            }
            int i7 = this.k;
            if (i7 != 0) {
                codedOutputByteBufferNano.writeInt32(11, i7);
            }
            long j3 = this.l;
            if (j3 != 0) {
                codedOutputByteBufferNano.writeUInt64(12, j3);
            }
            int i8 = this.m;
            if (i8 != 0) {
                codedOutputByteBufferNano.writeInt32(13, i8);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0632pf() {
        a();
    }

    public C0632pf a() {
        this.f6442a = b.b();
        this.f6443b = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        b[] bVarArr = this.f6442a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f6442a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
                }
                i2++;
            }
        }
        a[] aVarArr = this.f6443b;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f6443b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
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
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                b[] bVarArr = this.f6442a;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = repeatedFieldArrayLength + length;
                b[] bVarArr2 = new b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new b();
                    codedInputByteBufferNano.readMessage(bVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bVarArr2[length] = new b();
                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                this.f6442a = bVarArr2;
            } else if (readTag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                a[] aVarArr = this.f6443b;
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
                this.f6443b = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        b[] bVarArr = this.f6442a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f6442a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, bVar);
                }
                i2++;
            }
        }
        a[] aVarArr = this.f6443b;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f6443b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
