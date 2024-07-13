package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.hf  reason: case insensitive filesystem */
public final class C0433hf extends MessageNano {
    private static byte[] l;
    private static volatile boolean m;

    /* renamed from: a  reason: collision with root package name */
    public C0532lf f5921a;

    /* renamed from: b  reason: collision with root package name */
    public C0333df f5922b;

    /* renamed from: c  reason: collision with root package name */
    public String f5923c;

    /* renamed from: d  reason: collision with root package name */
    public int f5924d;

    /* renamed from: e  reason: collision with root package name */
    public C0482jf[] f5925e;

    /* renamed from: f  reason: collision with root package name */
    public String f5926f;

    /* renamed from: g  reason: collision with root package name */
    public int f5927g;

    /* renamed from: h  reason: collision with root package name */
    public a f5928h;
    public byte[] i;
    public byte[] j;
    public C0383ff[] k;

    /* renamed from: com.yandex.metrica.impl.ob.hf$a */
    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public String f5929a;

        public a() {
            a();
        }

        public a a() {
            this.f5929a = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f5929a);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f5929a = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f5929a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0433hf() {
        if (!m) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!m) {
                    l = InternalNano.bytesDefaultValue("JVM");
                    m = true;
                }
            }
        }
        a();
    }

    public C0433hf a() {
        this.f5921a = null;
        this.f5922b = null;
        this.f5923c = "";
        this.f5924d = -1;
        this.f5925e = C0482jf.b();
        this.f5926f = "";
        this.f5927g = 0;
        this.f5928h = null;
        this.i = (byte[]) l.clone();
        this.j = WireFormatNano.EMPTY_BYTES;
        this.k = C0383ff.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0532lf lfVar = this.f5921a;
        if (lfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, lfVar);
        }
        C0333df dfVar = this.f5922b;
        if (dfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, dfVar);
        }
        if (!this.f5923c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f5923c);
        }
        int i2 = this.f5924d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        C0482jf[] jfVarArr = this.f5925e;
        int i3 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f5925e;
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
        if (!this.f5926f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f5926f);
        }
        int i5 = this.f5927g;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        a aVar = this.f5928h;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, aVar);
        }
        if (!Arrays.equals(this.i, l)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        C0383ff[] ffVarArr = this.k;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C0383ff[] ffVarArr2 = this.k;
                if (i3 >= ffVarArr2.length) {
                    break;
                }
                C0383ff ffVar = ffVarArr2[i3];
                if (ffVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, ffVar);
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
                    if (this.f5921a == null) {
                        this.f5921a = new C0532lf();
                    }
                    codedInputByteBufferNano.readMessage(this.f5921a);
                    continue;
                case 18:
                    if (this.f5922b == null) {
                        this.f5922b = new C0333df();
                    }
                    codedInputByteBufferNano.readMessage(this.f5922b);
                    continue;
                case 26:
                    this.f5923c = codedInputByteBufferNano.readString();
                    continue;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                        this.f5924d = readInt32;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C0482jf[] jfVarArr = this.f5925e;
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
                    this.f5925e = jfVarArr2;
                    continue;
                case 50:
                    this.f5926f = codedInputByteBufferNano.readString();
                    continue;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == 0 || readInt322 == 1) {
                        this.f5927g = readInt322;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (this.f5928h == null) {
                        this.f5928h = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f5928h);
                    continue;
                case 74:
                    this.i = codedInputByteBufferNano.readBytes();
                    continue;
                case 82:
                    this.j = codedInputByteBufferNano.readBytes();
                    continue;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C0383ff[] ffVarArr = this.k;
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
                    this.k = ffVarArr2;
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
        C0532lf lfVar = this.f5921a;
        if (lfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, lfVar);
        }
        C0333df dfVar = this.f5922b;
        if (dfVar != null) {
            codedOutputByteBufferNano.writeMessage(2, dfVar);
        }
        if (!this.f5923c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5923c);
        }
        int i2 = this.f5924d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        C0482jf[] jfVarArr = this.f5925e;
        int i3 = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f5925e;
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
        if (!this.f5926f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f5926f);
        }
        int i5 = this.f5927g;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        a aVar = this.f5928h;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(8, aVar);
        }
        if (!Arrays.equals(this.i, l)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        C0383ff[] ffVarArr = this.k;
        if (ffVarArr != null && ffVarArr.length > 0) {
            while (true) {
                C0383ff[] ffVarArr2 = this.k;
                if (i3 >= ffVarArr2.length) {
                    break;
                }
                C0383ff ffVar = ffVarArr2[i3];
                if (ffVar != null) {
                    codedOutputByteBufferNano.writeMessage(11, ffVar);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
