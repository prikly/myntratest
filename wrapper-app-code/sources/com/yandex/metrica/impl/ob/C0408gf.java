package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.gf  reason: case insensitive filesystem */
public final class C0408gf extends MessageNano {
    private static byte[] k;
    private static volatile boolean l;

    /* renamed from: a  reason: collision with root package name */
    public C0532lf f5859a;

    /* renamed from: b  reason: collision with root package name */
    public C0333df f5860b;

    /* renamed from: c  reason: collision with root package name */
    public String f5861c;

    /* renamed from: d  reason: collision with root package name */
    public int f5862d;

    /* renamed from: e  reason: collision with root package name */
    public C0482jf[] f5863e;

    /* renamed from: f  reason: collision with root package name */
    public int f5864f;

    /* renamed from: g  reason: collision with root package name */
    public a f5865g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5866h;
    public byte[] i;
    public C0383ff[] j;

    /* renamed from: com.yandex.metrica.impl.ob.gf$a */
    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f5867a;

        /* renamed from: b  reason: collision with root package name */
        public Cif f5868b;

        public a() {
            a();
        }

        public a a() {
            this.f5867a = WireFormatNano.EMPTY_BYTES;
            this.f5868b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f5867a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5867a);
            }
            Cif ifVar = this.f5868b;
            return ifVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, ifVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5867a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 18) {
                    if (this.f5868b == null) {
                        this.f5868b = new Cif();
                    }
                    codedInputByteBufferNano.readMessage(this.f5868b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f5867a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f5867a);
            }
            Cif ifVar = this.f5868b;
            if (ifVar != null) {
                codedOutputByteBufferNano.writeMessage(2, ifVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0408gf() {
        if (!l) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!l) {
                    k = InternalNano.bytesDefaultValue("JVM");
                    l = true;
                }
            }
        }
        a();
    }

    public C0408gf a() {
        this.f5859a = null;
        this.f5860b = null;
        this.f5861c = "";
        this.f5862d = -1;
        this.f5863e = C0482jf.b();
        this.f5864f = 0;
        this.f5865g = null;
        this.f5866h = (byte[]) k.clone();
        this.i = WireFormatNano.EMPTY_BYTES;
        this.j = C0383ff.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0532lf lfVar = this.f5859a;
        if (lfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, lfVar);
        }
        C0333df dfVar = this.f5860b;
        if (dfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dfVar);
        }
        if (!this.f5861c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f5861c);
        }
        int i2 = this.f5862d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        C0482jf[] jfVarArr = this.f5863e;
        int i3 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f5863e;
                if (i4 >= jfVarArr2.length) {
                    break;
                }
                C0482jf jfVar = jfVarArr2[i4];
                if (jfVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, jfVar);
                }
                i4++;
            }
        }
        int i5 = this.f5864f;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i5);
        }
        a aVar = this.f5865g;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, aVar);
        }
        if (!Arrays.equals(this.f5866h, k)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f5866h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        C0383ff[] ffVarArr = this.j;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C0383ff[] ffVarArr2 = this.j;
                if (i3 >= ffVarArr2.length) {
                    break;
                }
                C0383ff ffVar = ffVarArr2[i3];
                if (ffVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, ffVar);
                }
                i3++;
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
                case 10:
                    if (this.f5859a == null) {
                        this.f5859a = new C0532lf();
                    }
                    codedInputByteBufferNano.readMessage(this.f5859a);
                    continue;
                case 18:
                    if (this.f5860b == null) {
                        this.f5860b = new C0333df();
                    }
                    codedInputByteBufferNano.readMessage(this.f5860b);
                    continue;
                case 26:
                    this.f5861c = codedInputByteBufferNano.readString();
                    continue;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                        this.f5862d = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0482jf[] jfVarArr = this.f5863e;
                    int length = jfVarArr == null ? 0 : jfVarArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    C0482jf[] jfVarArr2 = new C0482jf[i2];
                    if (length != 0) {
                        System.arraycopy(jfVarArr, 0, jfVarArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        jfVarArr2[length] = new C0482jf();
                        codedInputByteBufferNano.readMessage(jfVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    jfVarArr2[length] = new C0482jf();
                    codedInputByteBufferNano.readMessage(jfVarArr2[length]);
                    this.f5863e = jfVarArr2;
                    continue;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1) {
                        this.f5864f = readInt322;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (this.f5865g == null) {
                        this.f5865g = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f5865g);
                    continue;
                case 66:
                    this.f5866h = codedInputByteBufferNano.readBytes();
                    continue;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    continue;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C0383ff[] ffVarArr = this.j;
                    int length2 = ffVarArr == null ? 0 : ffVarArr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    C0383ff[] ffVarArr2 = new C0383ff[i3];
                    if (length2 != 0) {
                        System.arraycopy(ffVarArr, 0, ffVarArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        ffVarArr2[length2] = new C0383ff();
                        codedInputByteBufferNano.readMessage(ffVarArr2[length2]);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    ffVarArr2[length2] = new C0383ff();
                    codedInputByteBufferNano.readMessage(ffVarArr2[length2]);
                    this.j = ffVarArr2;
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
        C0532lf lfVar = this.f5859a;
        if (lfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, lfVar);
        }
        C0333df dfVar = this.f5860b;
        if (dfVar != null) {
            codedOutputByteBufferNano.writeMessage(2, dfVar);
        }
        if (!this.f5861c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5861c);
        }
        int i2 = this.f5862d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        C0482jf[] jfVarArr = this.f5863e;
        int i3 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f5863e;
                if (i4 >= jfVarArr2.length) {
                    break;
                }
                C0482jf jfVar = jfVarArr2[i4];
                if (jfVar != null) {
                    codedOutputByteBufferNano.writeMessage(5, jfVar);
                }
                i4++;
            }
        }
        int i5 = this.f5864f;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i5);
        }
        a aVar = this.f5865g;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(7, aVar);
        }
        if (!Arrays.equals(this.f5866h, k)) {
            codedOutputByteBufferNano.writeBytes(8, this.f5866h);
        }
        if (!Arrays.equals(this.i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        C0383ff[] ffVarArr = this.j;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C0383ff[] ffVarArr2 = this.j;
                if (i3 >= ffVarArr2.length) {
                    break;
                }
                C0383ff ffVar = ffVarArr2[i3];
                if (ffVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, ffVar);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
