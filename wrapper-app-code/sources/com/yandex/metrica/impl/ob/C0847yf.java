package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.yf  reason: case insensitive filesystem */
public final class C0847yf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a f7157a;

    /* renamed from: b  reason: collision with root package name */
    public a[] f7158b;

    /* renamed from: com.yandex.metrica.impl.ob.yf$a */
    public static final class a extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile a[] f7159c;

        /* renamed from: a  reason: collision with root package name */
        public b f7160a;

        /* renamed from: b  reason: collision with root package name */
        public int f7161b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f7159c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f7159c == null) {
                        f7159c = new a[0];
                    }
                }
            }
            return f7159c;
        }

        public a a() {
            this.f7160a = null;
            this.f7161b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            b bVar = this.f7160a;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
            }
            int i = this.f7161b;
            return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f7160a == null) {
                        this.f7160a = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f7160a);
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f7161b = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            b bVar = this.f7160a;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(1, bVar);
            }
            int i = this.f7161b;
            if (i != 0) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.yf$b */
    public static final class b extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public a[] f7162a;

        /* renamed from: com.yandex.metrica.impl.ob.yf$b$a */
        public static final class a extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile a[] f7163c;

            /* renamed from: a  reason: collision with root package name */
            public String f7164a;

            /* renamed from: b  reason: collision with root package name */
            public String f7165b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f7163c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f7163c == null) {
                            f7163c = new a[0];
                        }
                    }
                }
                return f7163c;
            }

            public a a() {
                this.f7164a = "";
                this.f7165b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                if (!this.f7164a.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7164a);
                }
                return !this.f7165b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f7165b) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f7164a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f7165b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.f7164a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f7164a);
                }
                if (!this.f7165b.equals("")) {
                    codedOutputByteBufferNano.writeString(2, this.f7165b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public b() {
            a();
        }

        public b a() {
            this.f7162a = a.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            a[] aVarArr = this.f7162a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f7162a;
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
                    a[] aVarArr = this.f7162a;
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
                    this.f7162a = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            a[] aVarArr = this.f7162a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f7162a;
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

    public C0847yf() {
        a();
    }

    public C0847yf a() {
        this.f7157a = null;
        this.f7158b = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a aVar = this.f7157a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        a[] aVarArr = this.f7158b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f7158b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar2);
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
                if (this.f7157a == null) {
                    this.f7157a = new a();
                }
                codedInputByteBufferNano.readMessage(this.f7157a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                a[] aVarArr = this.f7158b;
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
                this.f7158b = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.f7157a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        a[] aVarArr = this.f7158b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f7158b;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
