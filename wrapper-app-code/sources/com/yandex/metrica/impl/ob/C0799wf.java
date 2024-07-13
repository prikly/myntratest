package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.wf  reason: case insensitive filesystem */
public final class C0799wf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public b[] f7043a;

    /* renamed from: b  reason: collision with root package name */
    public a f7044b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f7045c;

    /* renamed from: com.yandex.metrica.impl.ob.wf$a */
    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public int f7046a;

        /* renamed from: b  reason: collision with root package name */
        public int f7047b;

        public a() {
            a();
        }

        public a a() {
            this.f7046a = 0;
            this.f7047b = -1;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(2, this.f7046a) + CodedOutputByteBufferNano.computeInt32Size(3, this.f7047b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                        this.f7046a = readInt32;
                    }
                } else if (readTag == 24) {
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                        this.f7047b = readInt322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(2, this.f7046a);
            codedOutputByteBufferNano.writeInt32(3, this.f7047b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wf$b */
    public static final class b extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile b[] f7048c;

        /* renamed from: a  reason: collision with root package name */
        public String f7049a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7050b;

        public b() {
            a();
        }

        public static b[] b() {
            if (f7048c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f7048c == null) {
                        f7048c = new b[0];
                    }
                }
            }
            return f7048c;
        }

        public b a() {
            this.f7049a = "";
            this.f7050b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f7049a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f7050b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f7049a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f7050b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f7049a);
            codedOutputByteBufferNano.writeBool(2, this.f7050b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0799wf() {
        a();
    }

    public C0799wf a() {
        this.f7043a = b.b();
        this.f7044b = null;
        this.f7045c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        b[] bVarArr = this.f7043a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f7043a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
                }
                i2++;
            }
        }
        a aVar = this.f7044b;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        String[] strArr = this.f7045c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f7045c;
            if (i >= strArr2.length) {
                return computeSerializedSize + i3 + (i4 * 1);
            }
            String str = strArr2[i];
            if (str != null) {
                i4++;
                i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
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
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                b[] bVarArr = this.f7043a;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = repeatedFieldArrayLength + length;
                b[] bVarArr2 = new b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    bVarArr2[length] = new b();
                    codedInputByteBufferNano.readMessage(bVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bVarArr2[length] = new b();
                codedInputByteBufferNano.readMessage(bVarArr2[length]);
                this.f7043a = bVarArr2;
            } else if (readTag == 18) {
                if (this.f7044b == null) {
                    this.f7044b = new a();
                }
                codedInputByteBufferNano.readMessage(this.f7044b);
            } else if (readTag == 26) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f7045c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f7045c = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        b[] bVarArr = this.f7043a;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.f7043a;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, bVar);
                }
                i2++;
            }
        }
        a aVar = this.f7044b;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        String[] strArr = this.f7045c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f7045c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
