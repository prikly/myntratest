package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Bf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a[] f3766a;

    public static final class a extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile a[] f3767c;

        /* renamed from: a  reason: collision with root package name */
        public String f3768a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3769b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f3767c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f3767c == null) {
                        f3767c = new a[0];
                    }
                }
            }
            return f3767c;
        }

        public a a() {
            this.f3768a = "";
            this.f3769b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f3768a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f3769b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f3768a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f3769b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f3768a);
            codedOutputByteBufferNano.writeBool(2, this.f3769b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Bf() {
        a();
    }

    public Bf a() {
        this.f3766a = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f3766a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f3766a;
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
        return computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                a[] aVarArr = this.f3766a;
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
                this.f3766a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.f3766a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f3766a;
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
        super.writeTo(codedOutputByteBufferNano);
    }
}
