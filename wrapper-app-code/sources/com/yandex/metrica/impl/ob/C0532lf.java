package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.lf  reason: case insensitive filesystem */
public final class C0532lf extends MessageNano {

    /* renamed from: f  reason: collision with root package name */
    private static volatile C0532lf[] f6150f;

    /* renamed from: a  reason: collision with root package name */
    public String f6151a;

    /* renamed from: b  reason: collision with root package name */
    public String f6152b;

    /* renamed from: c  reason: collision with root package name */
    public C0482jf[] f6153c;

    /* renamed from: d  reason: collision with root package name */
    public C0532lf f6154d;

    /* renamed from: e  reason: collision with root package name */
    public C0532lf[] f6155e;

    public C0532lf() {
        a();
    }

    public C0532lf a() {
        this.f6151a = "";
        this.f6152b = "";
        this.f6153c = C0482jf.b();
        this.f6154d = null;
        if (f6150f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f6150f == null) {
                    f6150f = new C0532lf[0];
                }
            }
        }
        this.f6155e = f6150f;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f6151a);
        if (!this.f6152b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6152b);
        }
        C0482jf[] jfVarArr = this.f6153c;
        int i = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f6153c;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C0482jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, jfVar);
                }
                i2++;
            }
        }
        C0532lf lfVar = this.f6154d;
        if (lfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, lfVar);
        }
        C0532lf[] lfVarArr = this.f6155e;
        if (lfVarArr != null && lfVarArr.length > 0) {
            while (true) {
                C0532lf[] lfVarArr2 = this.f6155e;
                if (i >= lfVarArr2.length) {
                    break;
                }
                C0532lf lfVar2 = lfVarArr2[i];
                if (lfVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, lfVar2);
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
                this.f6151a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6152b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0482jf[] jfVarArr = this.f6153c;
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
                this.f6153c = jfVarArr2;
            } else if (readTag == 34) {
                if (this.f6154d == null) {
                    this.f6154d = new C0532lf();
                }
                codedInputByteBufferNano.readMessage(this.f6154d);
            } else if (readTag == 42) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C0532lf[] lfVarArr = this.f6155e;
                int length2 = lfVarArr == null ? 0 : lfVarArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C0532lf[] lfVarArr2 = new C0532lf[i2];
                if (length2 != 0) {
                    System.arraycopy(lfVarArr, 0, lfVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    lfVarArr2[length2] = new C0532lf();
                    codedInputByteBufferNano.readMessage(lfVarArr2[length2]);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                lfVarArr2[length2] = new C0532lf();
                codedInputByteBufferNano.readMessage(lfVarArr2[length2]);
                this.f6155e = lfVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f6151a);
        if (!this.f6152b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6152b);
        }
        C0482jf[] jfVarArr = this.f6153c;
        int i = 0;
        if (jfVarArr != null && jfVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C0482jf[] jfVarArr2 = this.f6153c;
                if (i2 >= jfVarArr2.length) {
                    break;
                }
                C0482jf jfVar = jfVarArr2[i2];
                if (jfVar != null) {
                    codedOutputByteBufferNano.writeMessage(3, jfVar);
                }
                i2++;
            }
        }
        C0532lf lfVar = this.f6154d;
        if (lfVar != null) {
            codedOutputByteBufferNano.writeMessage(4, lfVar);
        }
        C0532lf[] lfVarArr = this.f6155e;
        if (lfVarArr != null && lfVarArr.length > 0) {
            while (true) {
                C0532lf[] lfVarArr2 = this.f6155e;
                if (i >= lfVarArr2.length) {
                    break;
                }
                C0532lf lfVar2 = lfVarArr2[i];
                if (lfVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(5, lfVar2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
