package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.kf  reason: case insensitive filesystem */
public final class C0507kf extends MessageNano {

    /* renamed from: g  reason: collision with root package name */
    private static volatile C0507kf[] f6092g;

    /* renamed from: a  reason: collision with root package name */
    public String f6093a;

    /* renamed from: b  reason: collision with root package name */
    public int f6094b;

    /* renamed from: c  reason: collision with root package name */
    public long f6095c;

    /* renamed from: d  reason: collision with root package name */
    public String f6096d;

    /* renamed from: e  reason: collision with root package name */
    public int f6097e;

    /* renamed from: f  reason: collision with root package name */
    public C0482jf[] f6098f;

    public C0507kf() {
        a();
    }

    public static C0507kf[] b() {
        if (f6092g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f6092g == null) {
                    f6092g = new C0507kf[0];
                }
            }
        }
        return f6092g;
    }

    public C0507kf a() {
        this.f6093a = "";
        this.f6094b = 0;
        this.f6095c = 0;
        this.f6096d = "";
        this.f6097e = 0;
        this.f6098f = C0482jf.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f6093a) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f6094b) + CodedOutputByteBufferNano.computeSInt64Size(3, this.f6095c);
        if (!this.f6096d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f6096d);
        }
        int i = this.f6097e;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C0482jf[] jfVarArr = this.f6098f;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f6098f;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C0482jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, jfVar);
                }
                i2++;
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
                this.f6093a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f6094b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f6095c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f6096d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f6097e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 50) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C0482jf[] jfVarArr = this.f6098f;
                int length = jfVarArr == null ? 0 : jfVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C0482jf[] jfVarArr2 = new C0482jf[i];
                if (length != 0) {
                    System.arraycopy(jfVarArr, 0, jfVarArr2, 0, length);
                }
                while (length < i - 1) {
                    jfVarArr2[length] = new C0482jf();
                    codedInputByteBufferNano.readMessage(jfVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jfVarArr2[length] = new C0482jf();
                codedInputByteBufferNano.readMessage(jfVarArr2[length]);
                this.f6098f = jfVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f6093a);
        codedOutputByteBufferNano.writeSInt32(2, this.f6094b);
        codedOutputByteBufferNano.writeSInt64(3, this.f6095c);
        if (!this.f6096d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6096d);
        }
        int i = this.f6097e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C0482jf[] jfVarArr = this.f6098f;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f6098f;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C0482jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    codedOutputByteBufferNano.writeMessage(6, jfVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
