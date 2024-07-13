package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.cf  reason: case insensitive filesystem */
public final class C0308cf extends MessageNano {
    private static byte[] l;
    private static volatile boolean m;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f5625a;

    /* renamed from: b  reason: collision with root package name */
    public a f5626b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5627c;

    /* renamed from: d  reason: collision with root package name */
    public int f5628d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5629e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5630f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5631g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5632h;
    public byte[] i;
    public byte[] j;
    public byte[] k;

    /* renamed from: com.yandex.metrica.impl.ob.cf$a */
    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f5633a;

        /* renamed from: b  reason: collision with root package name */
        public int f5634b;

        public a() {
            a();
        }

        public a a() {
            this.f5633a = 0;
            this.f5634b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f5633a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            int i = this.f5634b;
            return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f5633a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f5634b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f5633a;
            if (j != 0) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            int i = this.f5634b;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0308cf() {
        if (!m) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!m) {
                    l = InternalNano.bytesDefaultValue("manual");
                    m = true;
                }
            }
        }
        a();
    }

    public C0308cf a() {
        this.f5625a = (byte[]) l.clone();
        this.f5626b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5627c = bArr;
        this.f5628d = 0;
        this.f5629e = bArr;
        this.f5630f = bArr;
        this.f5631g = bArr;
        this.f5632h = bArr;
        this.i = bArr;
        this.j = bArr;
        this.k = bArr;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f5625a, l)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5625a);
        }
        a aVar = this.f5626b;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        if (!Arrays.equals(this.f5627c, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f5627c);
        }
        int i2 = this.f5628d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        if (!Arrays.equals(this.f5629e, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f5629e);
        }
        if (!Arrays.equals(this.f5630f, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f5630f);
        }
        if (!Arrays.equals(this.f5631g, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f5631g);
        }
        if (!Arrays.equals(this.f5632h, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f5632h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        return !Arrays.equals(this.k, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.k) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f5625a = codedInputByteBufferNano.readBytes();
                    continue;
                case 18:
                    if (this.f5626b == null) {
                        this.f5626b = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f5626b);
                    continue;
                case 26:
                    this.f5627c = codedInputByteBufferNano.readBytes();
                    continue;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f5628d = readInt32;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f5629e = codedInputByteBufferNano.readBytes();
                    continue;
                case 50:
                    this.f5630f = codedInputByteBufferNano.readBytes();
                    continue;
                case 58:
                    this.f5631g = codedInputByteBufferNano.readBytes();
                    continue;
                case 66:
                    this.f5632h = codedInputByteBufferNano.readBytes();
                    continue;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    continue;
                case 82:
                    this.j = codedInputByteBufferNano.readBytes();
                    continue;
                case 90:
                    this.k = codedInputByteBufferNano.readBytes();
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
        if (!Arrays.equals(this.f5625a, l)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5625a);
        }
        a aVar = this.f5626b;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        if (!Arrays.equals(this.f5627c, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(3, this.f5627c);
        }
        int i2 = this.f5628d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        if (!Arrays.equals(this.f5629e, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(5, this.f5629e);
        }
        if (!Arrays.equals(this.f5630f, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(6, this.f5630f);
        }
        if (!Arrays.equals(this.f5631g, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(7, this.f5631g);
        }
        if (!Arrays.equals(this.f5632h, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(8, this.f5632h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        if (!Arrays.equals(this.k, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(11, this.k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
