package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Ef extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a f3938a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3939b;

    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public C0045a[] f3940a;

        /* renamed from: com.yandex.metrica.impl.ob.Ef$a$a  reason: collision with other inner class name */
        public static final class C0045a extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile C0045a[] f3941c;

            /* renamed from: a  reason: collision with root package name */
            public String f3942a;

            /* renamed from: b  reason: collision with root package name */
            public String f3943b;

            public C0045a() {
                a();
            }

            public static C0045a[] b() {
                if (f3941c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f3941c == null) {
                            f3941c = new C0045a[0];
                        }
                    }
                }
                return f3941c;
            }

            public C0045a a() {
                this.f3942a = "";
                this.f3943b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f3942a);
                return !this.f3943b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f3943b) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f3942a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f3943b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f3942a);
                if (!this.f3943b.equals("")) {
                    codedOutputByteBufferNano.writeString(2, this.f3943b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public a() {
            a();
        }

        public a a() {
            this.f3940a = C0045a.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            C0045a[] aVarArr = this.f3940a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C0045a[] aVarArr2 = this.f3940a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C0045a aVar = aVarArr2[i];
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
                    C0045a[] aVarArr = this.f3940a;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C0045a[] aVarArr2 = new C0045a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C0045a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C0045a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f3940a = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            C0045a[] aVarArr = this.f3940a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C0045a[] aVarArr2 = this.f3940a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C0045a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Ef() {
        a();
    }

    public Ef a() {
        this.f3938a = null;
        this.f3939b = false;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a aVar = this.f3938a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        boolean z = this.f3939b;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                if (this.f3938a == null) {
                    this.f3938a = new a();
                }
                codedInputByteBufferNano.readMessage(this.f3938a);
            } else if (readTag == 16) {
                this.f3939b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.f3938a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        boolean z = this.f3939b;
        if (z) {
            codedOutputByteBufferNano.writeBool(2, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
