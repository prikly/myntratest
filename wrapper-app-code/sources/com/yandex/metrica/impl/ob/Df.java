package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Df extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a[] f3875a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f3876b;

    public static final class a extends MessageNano {

        /* renamed from: g  reason: collision with root package name */
        private static volatile a[] f3877g;

        /* renamed from: a  reason: collision with root package name */
        public String f3878a;

        /* renamed from: b  reason: collision with root package name */
        public String f3879b;

        /* renamed from: c  reason: collision with root package name */
        public String f3880c;

        /* renamed from: d  reason: collision with root package name */
        public C0044a[] f3881d;

        /* renamed from: e  reason: collision with root package name */
        public long f3882e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f3883f;

        /* renamed from: com.yandex.metrica.impl.ob.Df$a$a  reason: collision with other inner class name */
        public static final class C0044a extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile C0044a[] f3884c;

            /* renamed from: a  reason: collision with root package name */
            public String f3885a;

            /* renamed from: b  reason: collision with root package name */
            public String f3886b;

            public C0044a() {
                a();
            }

            public static C0044a[] b() {
                if (f3884c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f3884c == null) {
                            f3884c = new C0044a[0];
                        }
                    }
                }
                return f3884c;
            }

            public C0044a a() {
                this.f3885a = "";
                this.f3886b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f3885a) + CodedOutputByteBufferNano.computeStringSize(2, this.f3886b);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f3885a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f3886b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f3885a);
                codedOutputByteBufferNano.writeString(2, this.f3886b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public a() {
            a();
        }

        public static a[] b() {
            if (f3877g == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f3877g == null) {
                        f3877g = new a[0];
                    }
                }
            }
            return f3877g;
        }

        public a a() {
            this.f3878a = "";
            this.f3879b = "";
            this.f3880c = "";
            this.f3881d = C0044a.b();
            this.f3882e = 0;
            this.f3883f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f3878a) + CodedOutputByteBufferNano.computeStringSize(2, this.f3879b) + CodedOutputByteBufferNano.computeStringSize(3, this.f3880c);
            C0044a[] aVarArr = this.f3881d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C0044a[] aVarArr2 = this.f3881d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C0044a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, aVar);
                    }
                    i2++;
                }
            }
            int computeUInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, this.f3882e);
            int[] iArr = this.f3883f;
            if (iArr == null || iArr.length <= 0) {
                return computeUInt64Size;
            }
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f3883f;
                if (i >= iArr2.length) {
                    return computeUInt64Size + i3 + (iArr2.length * 1);
                }
                i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                i++;
            }
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f3878a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f3879b = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.f3880c = codedInputByteBufferNano.readString();
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C0044a[] aVarArr = this.f3881d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    C0044a[] aVarArr2 = new C0044a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        aVarArr2[length] = new C0044a();
                        codedInputByteBufferNano.readMessage(aVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    aVarArr2[length] = new C0044a();
                    codedInputByteBufferNano.readMessage(aVarArr2[length]);
                    this.f3881d = aVarArr2;
                } else if (readTag == 40) {
                    this.f3882e = codedInputByteBufferNano.readUInt64();
                } else if (readTag == 48) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 48);
                    int[] iArr = new int[repeatedFieldArrayLength2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < repeatedFieldArrayLength2; i3++) {
                        if (i3 != 0) {
                            codedInputByteBufferNano.readTag();
                        }
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == 1 || readInt32 == 2) {
                            iArr[i2] = readInt32;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f3883f;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == repeatedFieldArrayLength2) {
                            this.f3883f = iArr;
                        } else {
                            int[] iArr3 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f3883f = iArr3;
                        }
                    }
                } else if (readTag == 50) {
                    int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                    int position = codedInputByteBufferNano.getPosition();
                    int i4 = 0;
                    while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                        int readInt322 = codedInputByteBufferNano.readInt32();
                        if (readInt322 == 1 || readInt322 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        codedInputByteBufferNano.rewindToPosition(position);
                        int[] iArr4 = this.f3883f;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[(i4 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt323 = codedInputByteBufferNano.readInt32();
                            if (readInt323 == 1 || readInt323 == 2) {
                                iArr5[length3] = readInt323;
                                length3++;
                            }
                        }
                        this.f3883f = iArr5;
                    }
                    codedInputByteBufferNano.popLimit(pushLimit);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f3878a);
            codedOutputByteBufferNano.writeString(2, this.f3879b);
            codedOutputByteBufferNano.writeString(3, this.f3880c);
            C0044a[] aVarArr = this.f3881d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C0044a[] aVarArr2 = this.f3881d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C0044a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, aVar);
                    }
                    i2++;
                }
            }
            codedOutputByteBufferNano.writeUInt64(5, this.f3882e);
            int[] iArr = this.f3883f;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f3883f;
                    if (i >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(6, iArr2[i]);
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Df() {
        a();
    }

    public Df a() {
        this.f3875a = a.b();
        this.f3876b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f3875a;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f3875a;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.f3876b;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f3876b;
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
                a[] aVarArr = this.f3875a;
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
                this.f3875a = aVarArr2;
            } else if (readTag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f3876b;
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
                this.f3876b = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.f3875a;
        int i = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                a[] aVarArr2 = this.f3875a;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i2];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i2++;
            }
        }
        String[] strArr = this.f3876b;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f3876b;
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
