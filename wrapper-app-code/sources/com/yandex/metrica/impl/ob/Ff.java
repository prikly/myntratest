package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Ff extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a[] f4006a;

    /* renamed from: b  reason: collision with root package name */
    public String f4007b;

    /* renamed from: c  reason: collision with root package name */
    public long f4008c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4009d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4010e;

    public static final class a extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile a[] f4011c;

        /* renamed from: a  reason: collision with root package name */
        public String f4012a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f4013b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f4011c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4011c == null) {
                        f4011c = new a[0];
                    }
                }
            }
            return f4011c;
        }

        public a a() {
            this.f4012a = "";
            this.f4013b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f4012a);
            String[] strArr = this.f4013b;
            if (strArr == null || strArr.length <= 0) {
                return computeSerializedSize;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f4013b;
                if (i >= strArr2.length) {
                    return computeSerializedSize + i2 + (i3 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i++;
            }
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f4012a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.f4013b;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f4013b = strArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f4012a);
            String[] strArr = this.f4013b;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.f4013b;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        codedOutputByteBufferNano.writeString(2, str);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Ff() {
        a();
    }

    public Ff a() {
        this.f4006a = a.b();
        this.f4007b = "";
        this.f4008c = 0;
        this.f4009d = false;
        this.f4010e = false;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f4006a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f4006a;
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
        return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f4007b) + CodedOutputByteBufferNano.computeInt64Size(3, this.f4008c) + CodedOutputByteBufferNano.computeBoolSize(4, this.f4009d) + CodedOutputByteBufferNano.computeBoolSize(5, this.f4010e);
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                a[] aVarArr = this.f4006a;
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
                this.f4006a = aVarArr2;
            } else if (readTag == 18) {
                this.f4007b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f4008c = codedInputByteBufferNano.readInt64();
            } else if (readTag == 32) {
                this.f4009d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f4010e = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.f4006a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f4006a;
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
        codedOutputByteBufferNano.writeString(2, this.f4007b);
        codedOutputByteBufferNano.writeInt64(3, this.f4008c);
        codedOutputByteBufferNano.writeBool(4, this.f4009d);
        codedOutputByteBufferNano.writeBool(5, this.f4010e);
        super.writeTo(codedOutputByteBufferNano);
    }
}
