package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Cf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a f3820a;

    /* renamed from: b  reason: collision with root package name */
    public b[] f3821b;

    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public String f3822a;

        /* renamed from: b  reason: collision with root package name */
        public String f3823b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3824c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3825d;

        /* renamed from: e  reason: collision with root package name */
        public int f3826e;

        public a() {
            a();
        }

        public a a() {
            this.f3822a = "";
            this.f3823b = "";
            this.f3824c = false;
            this.f3825d = false;
            this.f3826e = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f3822a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f3822a);
            }
            if (!this.f3823b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f3823b);
            }
            boolean z = this.f3824c;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
            }
            boolean z2 = this.f3825d;
            if (z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
            }
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(5, this.f3826e);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f3822a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f3823b = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    this.f3824c = codedInputByteBufferNano.readBool();
                } else if (readTag == 32) {
                    this.f3825d = codedInputByteBufferNano.readBool();
                } else if (readTag == 40) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f3826e = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f3822a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f3822a);
            }
            if (!this.f3823b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f3823b);
            }
            boolean z = this.f3824c;
            if (z) {
                codedOutputByteBufferNano.writeBool(3, z);
            }
            boolean z2 = this.f3825d;
            if (z2) {
                codedOutputByteBufferNano.writeBool(4, z2);
            }
            codedOutputByteBufferNano.writeInt32(5, this.f3826e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b extends MessageNano {

        /* renamed from: d  reason: collision with root package name */
        private static volatile b[] f3827d;

        /* renamed from: a  reason: collision with root package name */
        public String f3828a;

        /* renamed from: b  reason: collision with root package name */
        public String f3829b;

        /* renamed from: c  reason: collision with root package name */
        public int f3830c;

        public b() {
            a();
        }

        public static b[] b() {
            if (f3827d == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f3827d == null) {
                        f3827d = new b[0];
                    }
                }
            }
            return f3827d;
        }

        public b a() {
            this.f3828a = "";
            this.f3829b = "";
            this.f3830c = 0;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f3828a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f3828a);
            }
            if (!this.f3829b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f3829b);
            }
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, this.f3830c);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f3828a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f3829b = codedInputByteBufferNano.readString();
                } else if (readTag == 24) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f3830c = readInt32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f3828a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f3828a);
            }
            if (!this.f3829b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f3829b);
            }
            codedOutputByteBufferNano.writeInt32(3, this.f3830c);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Cf() {
        a();
    }

    public Cf a() {
        this.f3820a = null;
        this.f3821b = b.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a aVar = this.f3820a;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        b[] bVarArr = this.f3821b;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                b[] bVarArr2 = this.f3821b;
                if (i >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, bVar);
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
                if (this.f3820a == null) {
                    this.f3820a = new a();
                }
                codedInputByteBufferNano.readMessage(this.f3820a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                b[] bVarArr = this.f3821b;
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
                this.f3821b = bVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a aVar = this.f3820a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        b[] bVarArr = this.f3821b;
        if (bVarArr != null && bVarArr.length > 0) {
            int i = 0;
            while (true) {
                b[] bVarArr2 = this.f3821b;
                if (i >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, bVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
