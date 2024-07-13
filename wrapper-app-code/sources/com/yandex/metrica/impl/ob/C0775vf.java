package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.vf  reason: case insensitive filesystem */
public final class C0775vf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public a[] f6989a;

    /* renamed from: com.yandex.metrica.impl.ob.vf$a */
    public static final class a extends MessageNano {

        /* renamed from: e  reason: collision with root package name */
        private static volatile a[] f6990e;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6991a;

        /* renamed from: b  reason: collision with root package name */
        public int f6992b;

        /* renamed from: c  reason: collision with root package name */
        public b f6993c;

        /* renamed from: d  reason: collision with root package name */
        public c f6994d;

        public a() {
            a();
        }

        public static a[] b() {
            if (f6990e == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f6990e == null) {
                        f6990e = new a[0];
                    }
                }
            }
            return f6990e;
        }

        public a a() {
            this.f6991a = WireFormatNano.EMPTY_BYTES;
            this.f6992b = 0;
            this.f6993c = null;
            this.f6994d = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBytesSize(1, this.f6991a) + CodedOutputByteBufferNano.computeInt32Size(2, this.f6992b);
            b bVar = this.f6993c;
            if (bVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, bVar);
            }
            c cVar = this.f6994d;
            return cVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, cVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6991a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 16) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f6992b = readInt32;
                    }
                } else if (readTag == 26) {
                    if (this.f6993c == null) {
                        this.f6993c = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f6993c);
                } else if (readTag == 34) {
                    if (this.f6994d == null) {
                        this.f6994d = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f6994d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBytes(1, this.f6991a);
            codedOutputByteBufferNano.writeInt32(2, this.f6992b);
            b bVar = this.f6993c;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(3, bVar);
            }
            c cVar = this.f6994d;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(4, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vf$b */
    public static final class b extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6995a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6996b;

        public b() {
            a();
        }

        public b a() {
            this.f6995a = false;
            this.f6996b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.f6995a;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            boolean z2 = this.f6996b;
            return z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f6995a = codedInputByteBufferNano.readBool();
                } else if (readTag == 16) {
                    this.f6996b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.f6995a;
            if (z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            boolean z2 = this.f6996b;
            if (z2) {
                codedOutputByteBufferNano.writeBool(2, z2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vf$c */
    public static final class c extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f6997a;

        /* renamed from: b  reason: collision with root package name */
        public double f6998b;

        /* renamed from: c  reason: collision with root package name */
        public double f6999c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f7000d;

        public c() {
            a();
        }

        public c a() {
            this.f6997a = WireFormatNano.EMPTY_BYTES;
            this.f6998b = 0.0d;
            this.f6999c = 0.0d;
            this.f7000d = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f6997a, WireFormatNano.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6997a);
            }
            if (Double.doubleToLongBits(this.f6998b) != Double.doubleToLongBits(0.0d)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f6998b);
            }
            if (Double.doubleToLongBits(this.f6999c) != Double.doubleToLongBits(0.0d)) {
                computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f6999c);
            }
            boolean z = this.f7000d;
            return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f6997a = codedInputByteBufferNano.readBytes();
                } else if (readTag == 17) {
                    this.f6998b = codedInputByteBufferNano.readDouble();
                } else if (readTag == 25) {
                    this.f6999c = codedInputByteBufferNano.readDouble();
                } else if (readTag == 32) {
                    this.f7000d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!Arrays.equals(this.f6997a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f6997a);
            }
            if (Double.doubleToLongBits(this.f6998b) != Double.doubleToLongBits(0.0d)) {
                codedOutputByteBufferNano.writeDouble(2, this.f6998b);
            }
            if (Double.doubleToLongBits(this.f6999c) != Double.doubleToLongBits(0.0d)) {
                codedOutputByteBufferNano.writeDouble(3, this.f6999c);
            }
            boolean z = this.f7000d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C0775vf() {
        a();
    }

    public C0775vf a() {
        this.f6989a = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f6989a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f6989a;
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
                a[] aVarArr = this.f6989a;
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
                this.f6989a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        a[] aVarArr = this.f6989a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f6989a;
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
