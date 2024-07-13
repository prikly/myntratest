package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.xf  reason: case insensitive filesystem */
public final class C0823xf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a[] f7106a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7107b;

    /* renamed from: com.yandex.metrica.impl.ob.xf$a */
    public static final class a extends MessageNano {

        /* renamed from: f  reason: collision with root package name */
        private static volatile a[] f7108f;

        /* renamed from: a  reason: collision with root package name */
        public int f7109a;

        /* renamed from: b  reason: collision with root package name */
        public String f7110b;

        /* renamed from: c  reason: collision with root package name */
        public String f7111c;

        /* renamed from: d  reason: collision with root package name */
        public long f7112d;

        /* renamed from: e  reason: collision with root package name */
        public long f7113e;

        public a() {
            a();
        }

        public static a[] b() {
            if (f7108f == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f7108f == null) {
                        f7108f = new a[0];
                    }
                }
            }
            return f7108f;
        }

        public a a() {
            this.f7109a = 1;
            this.f7110b = "";
            this.f7111c = "";
            this.f7112d = 0;
            this.f7113e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.f7109a) + CodedOutputByteBufferNano.computeStringSize(2, this.f7110b) + CodedOutputByteBufferNano.computeStringSize(3, this.f7111c) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f7112d) + CodedOutputByteBufferNano.computeUInt64Size(5, this.f7113e);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f7109a = readInt32;
                    }
                } else if (readTag == 18) {
                    this.f7110b = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.f7111c = codedInputByteBufferNano.readString();
                } else if (readTag == 32) {
                    this.f7112d = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 40) {
                    this.f7113e = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.f7109a);
            codedOutputByteBufferNano.writeString(2, this.f7110b);
            codedOutputByteBufferNano.writeString(3, this.f7111c);
            codedOutputByteBufferNano.writeUInt64(4, this.f7112d);
            codedOutputByteBufferNano.writeUInt64(5, this.f7113e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0823xf() {
        a();
    }

    public C0823xf a() {
        this.f7106a = a.b();
        this.f7107b = false;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f7106a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f7106a;
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
        return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, this.f7107b);
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                a[] aVarArr = this.f7106a;
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
                this.f7106a = aVarArr2;
            } else if (readTag == 16) {
                this.f7107b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.f7106a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f7106a;
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
        codedOutputByteBufferNano.writeBool(2, this.f7107b);
        super.writeTo(codedOutputByteBufferNano);
    }
}
