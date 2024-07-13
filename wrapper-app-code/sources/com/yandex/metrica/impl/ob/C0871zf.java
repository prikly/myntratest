package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.zf  reason: case insensitive filesystem */
public final class C0871zf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a[] f7225a;

    /* renamed from: com.yandex.metrica.impl.ob.zf$a */
    public static final class a extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile a[] f7226c;

        /* renamed from: a  reason: collision with root package name */
        public String f7227a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f7228b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f7226c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f7226c == null) {
                        f7226c = new a[0];
                    }
                }
            }
            return f7226c;
        }

        public a a() {
            this.f7227a = "";
            this.f7228b = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f7227a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7227a);
            }
            return !Arrays.equals(this.f7228b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7228b) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f7227a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f7228b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f7227a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f7227a);
            }
            if (!Arrays.equals(this.f7228b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f7228b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0871zf() {
        a();
    }

    public C0871zf a() {
        this.f7225a = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f7225a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f7225a;
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
                a[] aVarArr = this.f7225a;
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
                this.f7225a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.f7225a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f7225a;
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
