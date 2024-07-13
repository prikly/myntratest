package com.yandex.metrica.impl.ob;

import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class If extends MessageNano {
    public String A;
    public String B;
    public long C;
    public long D;
    public boolean E;
    public n F;
    public j G;
    public int H;
    public int I;
    public w J;
    public v K;
    public v L;
    public v M;
    public t N;
    public c O;
    public f P;
    public String[] Q;
    public b R;
    public a S;
    public h T;
    public g U;
    public r V;
    public l[] W;

    /* renamed from: a  reason: collision with root package name */
    public String f4138a;

    /* renamed from: b  reason: collision with root package name */
    public long f4139b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f4140c;

    /* renamed from: d  reason: collision with root package name */
    public String f4141d;

    /* renamed from: e  reason: collision with root package name */
    public String f4142e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f4143f;

    /* renamed from: g  reason: collision with root package name */
    public String[] f4144g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f4145h;
    public String[] i;
    public d[] j;
    public i k;
    public k[] l;
    public q m;
    public o[] n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public String s;
    public String[] t;
    public s u;
    public boolean v;
    public m[] w;
    public p x;
    public String y;
    public String z;

    public static final class a extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public b[] f4146a;

        /* renamed from: com.yandex.metrica.impl.ob.If$a$a  reason: collision with other inner class name */
        public static final class C0046a extends MessageNano {

            /* renamed from: a  reason: collision with root package name */
            public String f4147a;

            public C0046a() {
                a();
            }

            public C0046a a() {
                this.f4147a = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                return !this.f4147a.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f4147a) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f4147a = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.f4147a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f4147a);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public static final class b extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile b[] f4148c;

            /* renamed from: a  reason: collision with root package name */
            public String f4149a;

            /* renamed from: b  reason: collision with root package name */
            public C0046a f4150b;

            public b() {
                a();
            }

            public static b[] b() {
                if (f4148c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f4148c == null) {
                            f4148c = new b[0];
                        }
                    }
                }
                return f4148c;
            }

            public b a() {
                this.f4149a = "";
                this.f4150b = null;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize();
                if (!this.f4149a.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4149a);
                }
                C0046a aVar = this.f4150b;
                return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, aVar) : computeSerializedSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f4149a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        if (this.f4150b == null) {
                            this.f4150b = new C0046a();
                        }
                        codedInputByteBufferNano.readMessage(this.f4150b);
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                if (!this.f4149a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f4149a);
                }
                C0046a aVar = this.f4150b;
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public a() {
            a();
        }

        public a a() {
            this.f4146a = b.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            b[] bVarArr = this.f4146a;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    b[] bVarArr2 = this.f4146a;
                    if (i >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i];
                    if (bVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
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
                    b[] bVarArr = this.f4146a;
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
                    this.f4146a = bVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            b[] bVarArr = this.f4146a;
            if (bVarArr != null && bVarArr.length > 0) {
                int i = 0;
                while (true) {
                    b[] bVarArr2 = this.f4146a;
                    if (i >= bVarArr2.length) {
                        break;
                    }
                    b bVar = bVarArr2[i];
                    if (bVar != null) {
                        codedOutputByteBufferNano.writeMessage(1, bVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public int f4151a;

        /* renamed from: b  reason: collision with root package name */
        public int f4152b;

        public b() {
            a();
        }

        public b a() {
            this.f4151a = 86400;
            this.f4152b = 86400;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f4151a;
            if (i != 86400) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            int i2 = this.f4152b;
            return i2 != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4151a = codedInputByteBufferNano.readInt32();
                } else if (readTag == 16) {
                    this.f4152b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f4151a;
            if (i != 86400) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            int i2 = this.f4152b;
            if (i2 != 86400) {
                codedOutputByteBufferNano.writeInt32(2, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class c extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4153a;

        /* renamed from: b  reason: collision with root package name */
        public long f4154b;

        /* renamed from: c  reason: collision with root package name */
        public long f4155c;

        /* renamed from: d  reason: collision with root package name */
        public long f4156d;

        public c() {
            a();
        }

        public c a() {
            this.f4153a = 10000;
            this.f4154b = 10000;
            this.f4155c = 10000;
            this.f4156d = 10000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f4153a;
            if (j != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            long j2 = this.f4154b;
            if (j2 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
            }
            long j3 = this.f4155c;
            if (j3 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j3);
            }
            long j4 = this.f4156d;
            return j4 != 10000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, j4) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4153a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f4154b = codedInputByteBufferNano.readInt64();
                } else if (readTag == 24) {
                    this.f4155c = codedInputByteBufferNano.readInt64();
                } else if (readTag == 32) {
                    this.f4156d = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f4153a;
            if (j != 10000) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            long j2 = this.f4154b;
            if (j2 != 10000) {
                codedOutputByteBufferNano.writeInt64(2, j2);
            }
            long j3 = this.f4155c;
            if (j3 != 10000) {
                codedOutputByteBufferNano.writeInt64(3, j3);
            }
            long j4 = this.f4156d;
            if (j4 != 10000) {
                codedOutputByteBufferNano.writeInt64(4, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class d extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile d[] f4157c;

        /* renamed from: a  reason: collision with root package name */
        public String f4158a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f4159b;

        public d() {
            a();
        }

        public static d[] b() {
            if (f4157c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4157c == null) {
                        f4157c = new d[0];
                    }
                }
            }
            return f4157c;
        }

        public d a() {
            this.f4158a = "";
            this.f4159b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f4158a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4158a);
            }
            String[] strArr = this.f4159b;
            if (strArr == null || strArr.length <= 0) {
                return computeSerializedSize;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f4159b;
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
                    this.f4158a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.f4159b;
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
                    this.f4159b = strArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f4158a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f4158a);
            }
            String[] strArr = this.f4159b;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.f4159b;
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

    public static final class e extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4160a;

        /* renamed from: b  reason: collision with root package name */
        public int f4161b;

        public e() {
            a();
        }

        public e a() {
            this.f4160a = 0;
            this.f4161b = 86400;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4160a);
            int i = this.f4161b;
            return i != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4160a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f4161b = codedInputByteBufferNano.readInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f4160a);
            int i = this.f4161b;
            if (i != 86400) {
                codedOutputByteBufferNano.writeInt32(2, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class f extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public e f4162a;

        /* renamed from: b  reason: collision with root package name */
        public e f4163b;

        /* renamed from: c  reason: collision with root package name */
        public e f4164c;

        public f() {
            a();
        }

        public f a() {
            this.f4162a = null;
            this.f4163b = null;
            this.f4164c = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            e eVar = this.f4162a;
            if (eVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, eVar);
            }
            e eVar2 = this.f4163b;
            if (eVar2 != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, eVar2);
            }
            e eVar3 = this.f4164c;
            return eVar3 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, eVar3) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f4162a == null) {
                        this.f4162a = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f4162a);
                } else if (readTag == 18) {
                    if (this.f4163b == null) {
                        this.f4163b = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f4163b);
                } else if (readTag == 26) {
                    if (this.f4164c == null) {
                        this.f4164c = new e();
                    }
                    codedInputByteBufferNano.readMessage(this.f4164c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            e eVar = this.f4162a;
            if (eVar != null) {
                codedOutputByteBufferNano.writeMessage(1, eVar);
            }
            e eVar2 = this.f4163b;
            if (eVar2 != null) {
                codedOutputByteBufferNano.writeMessage(2, eVar2);
            }
            e eVar3 = this.f4164c;
            if (eVar3 != null) {
                codedOutputByteBufferNano.writeMessage(3, eVar3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class g extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4165a;

        public g() {
            a();
        }

        public g a() {
            this.f4165a = 1209600;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f4165a;
            return j != 1209600 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(1, j) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4165a = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f4165a;
            if (j != 1209600) {
                codedOutputByteBufferNano.writeUInt64(1, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class h extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public String f4166a;

        /* renamed from: b  reason: collision with root package name */
        public int f4167b;

        /* renamed from: c  reason: collision with root package name */
        public int f4168c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4169d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4170e;

        public h() {
            a();
        }

        public h a() {
            this.f4166a = "";
            this.f4167b = 600;
            this.f4168c = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
            this.f4169d = false;
            this.f4170e = true;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f4166a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4166a);
            }
            int i = this.f4167b;
            if (i != 600) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i);
            }
            int i2 = this.f4168c;
            if (i2 != 300) {
                computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i2);
            }
            boolean z = this.f4169d;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z);
            }
            boolean z2 = this.f4170e;
            return !z2 ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(5, z2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f4166a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f4167b = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 24) {
                    this.f4168c = codedInputByteBufferNano.readUInt32();
                } else if (readTag == 32) {
                    this.f4169d = codedInputByteBufferNano.readBool();
                } else if (readTag == 40) {
                    this.f4170e = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f4166a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f4166a);
            }
            int i = this.f4167b;
            if (i != 600) {
                codedOutputByteBufferNano.writeUInt32(2, i);
            }
            int i2 = this.f4168c;
            if (i2 != 300) {
                codedOutputByteBufferNano.writeUInt32(3, i2);
            }
            boolean z = this.f4169d;
            if (z) {
                codedOutputByteBufferNano.writeBool(4, z);
            }
            boolean z2 = this.f4170e;
            if (!z2) {
                codedOutputByteBufferNano.writeBool(5, z2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class i extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4171a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4172b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4173c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4174d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4175e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4176f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4177g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4178h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;

        public i() {
            a();
        }

        public i a() {
            this.f4171a = false;
            this.f4172b = false;
            this.f4173c = false;
            this.f4174d = false;
            this.f4175e = false;
            this.f4176f = false;
            this.f4177g = false;
            this.f4178h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = true;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = -1;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f4171a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f4172b) + CodedOutputByteBufferNano.computeBoolSize(3, this.f4173c) + CodedOutputByteBufferNano.computeBoolSize(4, this.f4174d) + CodedOutputByteBufferNano.computeBoolSize(6, this.f4175e) + CodedOutputByteBufferNano.computeBoolSize(8, this.f4176f) + CodedOutputByteBufferNano.computeBoolSize(9, this.f4177g) + CodedOutputByteBufferNano.computeBoolSize(11, this.f4178h) + CodedOutputByteBufferNano.computeBoolSize(12, this.i) + CodedOutputByteBufferNano.computeBoolSize(15, this.j) + CodedOutputByteBufferNano.computeBoolSize(16, this.k) + CodedOutputByteBufferNano.computeBoolSize(18, this.l) + CodedOutputByteBufferNano.computeBoolSize(19, this.m) + CodedOutputByteBufferNano.computeBoolSize(21, this.n) + CodedOutputByteBufferNano.computeBoolSize(22, this.o) + CodedOutputByteBufferNano.computeBoolSize(23, this.p) + CodedOutputByteBufferNano.computeBoolSize(24, this.q) + CodedOutputByteBufferNano.computeBoolSize(25, this.r) + CodedOutputByteBufferNano.computeBoolSize(26, this.s) + CodedOutputByteBufferNano.computeBoolSize(27, this.t) + CodedOutputByteBufferNano.computeBoolSize(28, this.u);
            boolean z = this.v;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(29, z);
            }
            boolean z2 = this.w;
            if (z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(33, z2);
            }
            int i2 = this.x;
            return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(34, i2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f4171a = codedInputByteBufferNano.readBool();
                        continue;
                    case 16:
                        this.f4172b = codedInputByteBufferNano.readBool();
                        continue;
                    case 24:
                        this.f4173c = codedInputByteBufferNano.readBool();
                        continue;
                    case 32:
                        this.f4174d = codedInputByteBufferNano.readBool();
                        continue;
                    case 48:
                        this.f4175e = codedInputByteBufferNano.readBool();
                        continue;
                    case 64:
                        this.f4176f = codedInputByteBufferNano.readBool();
                        continue;
                    case 72:
                        this.f4177g = codedInputByteBufferNano.readBool();
                        continue;
                    case 88:
                        this.f4178h = codedInputByteBufferNano.readBool();
                        continue;
                    case 96:
                        this.i = codedInputByteBufferNano.readBool();
                        continue;
                    case 120:
                        this.j = codedInputByteBufferNano.readBool();
                        continue;
                    case 128:
                        this.k = codedInputByteBufferNano.readBool();
                        continue;
                    case 144:
                        this.l = codedInputByteBufferNano.readBool();
                        continue;
                    case 152:
                        this.m = codedInputByteBufferNano.readBool();
                        continue;
                    case 168:
                        this.n = codedInputByteBufferNano.readBool();
                        continue;
                    case 176:
                        this.o = codedInputByteBufferNano.readBool();
                        continue;
                    case 184:
                        this.p = codedInputByteBufferNano.readBool();
                        continue;
                    case 192:
                        this.q = codedInputByteBufferNano.readBool();
                        continue;
                    case 200:
                        this.r = codedInputByteBufferNano.readBool();
                        continue;
                    case LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE:
                        this.s = codedInputByteBufferNano.readBool();
                        continue;
                    case 216:
                        this.t = codedInputByteBufferNano.readBool();
                        continue;
                    case 224:
                        this.u = codedInputByteBufferNano.readBool();
                        continue;
                    case 232:
                        this.v = codedInputByteBufferNano.readBool();
                        continue;
                    case 264:
                        this.w = codedInputByteBufferNano.readBool();
                        continue;
                    case 272:
                        int readInt32 = codedInputByteBufferNano.readInt32();
                        if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                            this.x = readInt32;
                            break;
                        } else {
                            continue;
                        }
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            continue;
                        }
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBool(1, this.f4171a);
            codedOutputByteBufferNano.writeBool(2, this.f4172b);
            codedOutputByteBufferNano.writeBool(3, this.f4173c);
            codedOutputByteBufferNano.writeBool(4, this.f4174d);
            codedOutputByteBufferNano.writeBool(6, this.f4175e);
            codedOutputByteBufferNano.writeBool(8, this.f4176f);
            codedOutputByteBufferNano.writeBool(9, this.f4177g);
            codedOutputByteBufferNano.writeBool(11, this.f4178h);
            codedOutputByteBufferNano.writeBool(12, this.i);
            codedOutputByteBufferNano.writeBool(15, this.j);
            codedOutputByteBufferNano.writeBool(16, this.k);
            codedOutputByteBufferNano.writeBool(18, this.l);
            codedOutputByteBufferNano.writeBool(19, this.m);
            codedOutputByteBufferNano.writeBool(21, this.n);
            codedOutputByteBufferNano.writeBool(22, this.o);
            codedOutputByteBufferNano.writeBool(23, this.p);
            codedOutputByteBufferNano.writeBool(24, this.q);
            codedOutputByteBufferNano.writeBool(25, this.r);
            codedOutputByteBufferNano.writeBool(26, this.s);
            codedOutputByteBufferNano.writeBool(27, this.t);
            codedOutputByteBufferNano.writeBool(28, this.u);
            boolean z = this.v;
            if (z) {
                codedOutputByteBufferNano.writeBool(29, z);
            }
            boolean z2 = this.w;
            if (z2) {
                codedOutputByteBufferNano.writeBool(33, z2);
            }
            int i2 = this.x;
            if (i2 != -1) {
                codedOutputByteBufferNano.writeInt32(34, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class j extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4179a;

        public j() {
            a();
        }

        public j a() {
            this.f4179a = 900;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4179a);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4179a = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f4179a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class k extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile k[] f4180c;

        /* renamed from: a  reason: collision with root package name */
        public a f4181a;

        /* renamed from: b  reason: collision with root package name */
        public b f4182b;

        public static final class a extends MessageNano {

            /* renamed from: a  reason: collision with root package name */
            public long f4183a;

            /* renamed from: b  reason: collision with root package name */
            public float f4184b;

            /* renamed from: c  reason: collision with root package name */
            public int f4185c;

            /* renamed from: d  reason: collision with root package name */
            public int f4186d;

            /* renamed from: e  reason: collision with root package name */
            public long f4187e;

            /* renamed from: f  reason: collision with root package name */
            public int f4188f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f4189g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f4190h;
            public boolean i;
            public long j;
            public C0047a k;
            public C0047a l;
            public C0047a m;
            public C0047a n;
            public b o;
            public boolean p;
            public boolean q;

            /* renamed from: com.yandex.metrica.impl.ob.If$k$a$a  reason: collision with other inner class name */
            public static final class C0047a extends MessageNano {

                /* renamed from: a  reason: collision with root package name */
                public boolean f4191a;

                /* renamed from: b  reason: collision with root package name */
                public boolean f4192b;

                /* renamed from: c  reason: collision with root package name */
                public C0048a f4193c;

                /* renamed from: com.yandex.metrica.impl.ob.If$k$a$a$a  reason: collision with other inner class name */
                public static final class C0048a extends MessageNano {

                    /* renamed from: a  reason: collision with root package name */
                    public long f4194a;

                    /* renamed from: b  reason: collision with root package name */
                    public long f4195b;

                    public C0048a() {
                        a();
                    }

                    public C0048a a() {
                        this.f4194a = 0;
                        this.f4195b = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    /* access modifiers changed from: protected */
                    public int computeSerializedSize() {
                        return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4194a) + CodedOutputByteBufferNano.computeInt64Size(2, this.f4195b);
                    }

                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                        while (true) {
                            int readTag = codedInputByteBufferNano.readTag();
                            if (readTag == 0) {
                                break;
                            } else if (readTag == 8) {
                                this.f4194a = codedInputByteBufferNano.readInt64();
                            } else if (readTag == 16) {
                                this.f4195b = codedInputByteBufferNano.readInt64();
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        }
                        return this;
                    }

                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                        codedOutputByteBufferNano.writeInt64(1, this.f4194a);
                        codedOutputByteBufferNano.writeInt64(2, this.f4195b);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }

                public C0047a() {
                    a();
                }

                public C0047a a() {
                    this.f4191a = true;
                    this.f4192b = false;
                    this.f4193c = null;
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f4191a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f4192b);
                    C0048a aVar = this.f4193c;
                    return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 8) {
                            this.f4191a = codedInputByteBufferNano.readBool();
                        } else if (readTag == 16) {
                            this.f4192b = codedInputByteBufferNano.readBool();
                        } else if (readTag == 26) {
                            if (this.f4193c == null) {
                                this.f4193c = new C0048a();
                            }
                            codedInputByteBufferNano.readMessage(this.f4193c);
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeBool(1, this.f4191a);
                    codedOutputByteBufferNano.writeBool(2, this.f4192b);
                    C0048a aVar = this.f4193c;
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public static final class b extends MessageNano {

                /* renamed from: a  reason: collision with root package name */
                public boolean f4196a;

                /* renamed from: b  reason: collision with root package name */
                public boolean f4197b;

                /* renamed from: c  reason: collision with root package name */
                public C0049a f4198c;

                /* renamed from: com.yandex.metrica.impl.ob.If$k$a$b$a  reason: collision with other inner class name */
                public static final class C0049a extends MessageNano {

                    /* renamed from: a  reason: collision with root package name */
                    public long f4199a;

                    /* renamed from: b  reason: collision with root package name */
                    public long f4200b;

                    /* renamed from: c  reason: collision with root package name */
                    public int f4201c;

                    public C0049a() {
                        a();
                    }

                    public C0049a a() {
                        this.f4199a = 0;
                        this.f4200b = 0;
                        this.f4201c = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    /* access modifiers changed from: protected */
                    public int computeSerializedSize() {
                        return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4199a) + CodedOutputByteBufferNano.computeInt64Size(2, this.f4200b) + CodedOutputByteBufferNano.computeInt32Size(3, this.f4201c);
                    }

                    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                        while (true) {
                            int readTag = codedInputByteBufferNano.readTag();
                            if (readTag == 0) {
                                break;
                            } else if (readTag == 8) {
                                this.f4199a = codedInputByteBufferNano.readInt64();
                            } else if (readTag == 16) {
                                this.f4200b = codedInputByteBufferNano.readInt64();
                            } else if (readTag == 24) {
                                int readInt32 = codedInputByteBufferNano.readInt32();
                                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                                    this.f4201c = readInt32;
                                }
                            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            }
                        }
                        return this;
                    }

                    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                        codedOutputByteBufferNano.writeInt64(1, this.f4199a);
                        codedOutputByteBufferNano.writeInt64(2, this.f4200b);
                        codedOutputByteBufferNano.writeInt32(3, this.f4201c);
                        super.writeTo(codedOutputByteBufferNano);
                    }
                }

                public b() {
                    a();
                }

                public b a() {
                    this.f4196a = true;
                    this.f4197b = false;
                    this.f4198c = null;
                    this.cachedSize = -1;
                    return this;
                }

                /* access modifiers changed from: protected */
                public int computeSerializedSize() {
                    int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f4196a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f4197b);
                    C0049a aVar = this.f4198c;
                    return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : computeSerializedSize;
                }

                public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                    while (true) {
                        int readTag = codedInputByteBufferNano.readTag();
                        if (readTag == 0) {
                            break;
                        } else if (readTag == 8) {
                            this.f4196a = codedInputByteBufferNano.readBool();
                        } else if (readTag == 16) {
                            this.f4197b = codedInputByteBufferNano.readBool();
                        } else if (readTag == 26) {
                            if (this.f4198c == null) {
                                this.f4198c = new C0049a();
                            }
                            codedInputByteBufferNano.readMessage(this.f4198c);
                        } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    }
                    return this;
                }

                public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                    codedOutputByteBufferNano.writeBool(1, this.f4196a);
                    codedOutputByteBufferNano.writeBool(2, this.f4197b);
                    C0049a aVar = this.f4198c;
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(3, aVar);
                    }
                    super.writeTo(codedOutputByteBufferNano);
                }
            }

            public a() {
                a();
            }

            public a a() {
                this.f4183a = 5000;
                this.f4184b = 10.0f;
                this.f4185c = 20;
                this.f4186d = 200;
                this.f4187e = 60000;
                this.f4188f = 10000;
                this.f4189g = false;
                this.f4190h = false;
                this.i = true;
                this.j = 60000;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = false;
                this.q = false;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4183a) + CodedOutputByteBufferNano.computeFloatSize(2, this.f4184b) + CodedOutputByteBufferNano.computeInt32Size(3, this.f4185c) + CodedOutputByteBufferNano.computeInt32Size(4, this.f4186d) + CodedOutputByteBufferNano.computeInt64Size(5, this.f4187e) + CodedOutputByteBufferNano.computeInt32Size(6, this.f4188f) + CodedOutputByteBufferNano.computeBoolSize(7, this.f4189g) + CodedOutputByteBufferNano.computeBoolSize(8, this.f4190h) + CodedOutputByteBufferNano.computeInt64Size(9, this.j);
                C0047a aVar = this.k;
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, aVar);
                }
                C0047a aVar2 = this.l;
                if (aVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(11, aVar2);
                }
                C0047a aVar3 = this.m;
                if (aVar3 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(12, aVar3);
                }
                int computeBoolSize = computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(13, this.i);
                C0047a aVar4 = this.n;
                if (aVar4 != null) {
                    computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(14, aVar4);
                }
                b bVar = this.o;
                if (bVar != null) {
                    computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(15, bVar);
                }
                boolean z = this.p;
                if (z) {
                    computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(16, z);
                }
                boolean z2 = this.q;
                return z2 ? computeBoolSize + CodedOutputByteBufferNano.computeBoolSize(17, z2) : computeBoolSize;
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    switch (readTag) {
                        case 0:
                            break;
                        case 8:
                            this.f4183a = codedInputByteBufferNano.readInt64();
                            continue;
                        case 21:
                            this.f4184b = codedInputByteBufferNano.readFloat();
                            continue;
                        case 24:
                            this.f4185c = codedInputByteBufferNano.readInt32();
                            continue;
                        case 32:
                            this.f4186d = codedInputByteBufferNano.readInt32();
                            continue;
                        case 40:
                            this.f4187e = codedInputByteBufferNano.readInt64();
                            continue;
                        case 48:
                            this.f4188f = codedInputByteBufferNano.readInt32();
                            continue;
                        case 56:
                            this.f4189g = codedInputByteBufferNano.readBool();
                            continue;
                        case 64:
                            this.f4190h = codedInputByteBufferNano.readBool();
                            continue;
                        case 72:
                            this.j = codedInputByteBufferNano.readInt64();
                            continue;
                        case 82:
                            if (this.k == null) {
                                this.k = new C0047a();
                            }
                            codedInputByteBufferNano.readMessage(this.k);
                            continue;
                        case 90:
                            if (this.l == null) {
                                this.l = new C0047a();
                            }
                            codedInputByteBufferNano.readMessage(this.l);
                            continue;
                        case 98:
                            if (this.m == null) {
                                this.m = new C0047a();
                            }
                            codedInputByteBufferNano.readMessage(this.m);
                            continue;
                        case 104:
                            this.i = codedInputByteBufferNano.readBool();
                            continue;
                        case 114:
                            if (this.n == null) {
                                this.n = new C0047a();
                            }
                            codedInputByteBufferNano.readMessage(this.n);
                            continue;
                        case 122:
                            if (this.o == null) {
                                this.o = new b();
                            }
                            codedInputByteBufferNano.readMessage(this.o);
                            continue;
                        case 128:
                            this.p = codedInputByteBufferNano.readBool();
                            continue;
                        case 136:
                            this.q = codedInputByteBufferNano.readBool();
                            continue;
                        default:
                            if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeInt64(1, this.f4183a);
                codedOutputByteBufferNano.writeFloat(2, this.f4184b);
                codedOutputByteBufferNano.writeInt32(3, this.f4185c);
                codedOutputByteBufferNano.writeInt32(4, this.f4186d);
                codedOutputByteBufferNano.writeInt64(5, this.f4187e);
                codedOutputByteBufferNano.writeInt32(6, this.f4188f);
                codedOutputByteBufferNano.writeBool(7, this.f4189g);
                codedOutputByteBufferNano.writeBool(8, this.f4190h);
                codedOutputByteBufferNano.writeInt64(9, this.j);
                C0047a aVar = this.k;
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(10, aVar);
                }
                C0047a aVar2 = this.l;
                if (aVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(11, aVar2);
                }
                C0047a aVar3 = this.m;
                if (aVar3 != null) {
                    codedOutputByteBufferNano.writeMessage(12, aVar3);
                }
                codedOutputByteBufferNano.writeBool(13, this.i);
                C0047a aVar4 = this.n;
                if (aVar4 != null) {
                    codedOutputByteBufferNano.writeMessage(14, aVar4);
                }
                b bVar = this.o;
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(15, bVar);
                }
                boolean z = this.p;
                if (z) {
                    codedOutputByteBufferNano.writeBool(16, z);
                }
                boolean z2 = this.q;
                if (z2) {
                    codedOutputByteBufferNano.writeBool(17, z2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public static final class b extends MessageNano {

            /* renamed from: a  reason: collision with root package name */
            public int[] f4202a;

            /* renamed from: b  reason: collision with root package name */
            public int[] f4203b;

            public b() {
                a();
            }

            public b a() {
                int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
                this.f4202a = iArr;
                this.f4203b = iArr;
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                int[] iArr;
                int computeSerializedSize = super.computeSerializedSize();
                int[] iArr2 = this.f4202a;
                int i = 0;
                if (iArr2 != null && iArr2.length > 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        iArr = this.f4202a;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        i3 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i2]);
                        i2++;
                    }
                    computeSerializedSize = computeSerializedSize + i3 + (iArr.length * 1);
                }
                int[] iArr3 = this.f4203b;
                if (iArr3 == null || iArr3.length <= 0) {
                    return computeSerializedSize;
                }
                int i4 = 0;
                while (true) {
                    int[] iArr4 = this.f4203b;
                    if (i >= iArr4.length) {
                        return computeSerializedSize + i4 + (iArr4.length * 1);
                    }
                    i4 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr4[i]);
                    i++;
                }
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 8) {
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 8);
                        int[] iArr = new int[repeatedFieldArrayLength];
                        int i = 0;
                        for (int i2 = 0; i2 < repeatedFieldArrayLength; i2++) {
                            if (i2 != 0) {
                                codedInputByteBufferNano.readTag();
                            }
                            int readInt32 = codedInputByteBufferNano.readInt32();
                            if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                                iArr[i] = readInt32;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.f4202a;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == repeatedFieldArrayLength) {
                                this.f4202a = iArr;
                            } else {
                                int[] iArr3 = new int[(length + i)];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.f4202a = iArr3;
                            }
                        }
                    } else if (readTag == 10) {
                        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i3 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt322 = codedInputByteBufferNano.readInt32();
                            if (readInt322 == 0 || readInt322 == 1 || readInt322 == 2 || readInt322 == 3 || readInt322 == 4) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            codedInputByteBufferNano.rewindToPosition(position);
                            int[] iArr4 = this.f4202a;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                int readInt323 = codedInputByteBufferNano.readInt32();
                                if (readInt323 == 0 || readInt323 == 1 || readInt323 == 2 || readInt323 == 3 || readInt323 == 4) {
                                    iArr5[length2] = readInt323;
                                    length2++;
                                }
                            }
                            this.f4202a = iArr5;
                        }
                        codedInputByteBufferNano.popLimit(pushLimit);
                    } else if (readTag == 16) {
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                        int[] iArr6 = new int[repeatedFieldArrayLength2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < repeatedFieldArrayLength2; i5++) {
                            if (i5 != 0) {
                                codedInputByteBufferNano.readTag();
                            }
                            int readInt324 = codedInputByteBufferNano.readInt32();
                            if (readInt324 == 0 || readInt324 == 2 || readInt324 == 3) {
                                iArr6[i4] = readInt324;
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            int[] iArr7 = this.f4203b;
                            int length3 = iArr7 == null ? 0 : iArr7.length;
                            if (length3 == 0 && i4 == repeatedFieldArrayLength2) {
                                this.f4203b = iArr6;
                            } else {
                                int[] iArr8 = new int[(length3 + i4)];
                                if (length3 != 0) {
                                    System.arraycopy(iArr7, 0, iArr8, 0, length3);
                                }
                                System.arraycopy(iArr6, 0, iArr8, length3, i4);
                                this.f4203b = iArr8;
                            }
                        }
                    } else if (readTag == 18) {
                        int pushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position2 = codedInputByteBufferNano.getPosition();
                        int i6 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            int readInt325 = codedInputByteBufferNano.readInt32();
                            if (readInt325 == 0 || readInt325 == 2 || readInt325 == 3) {
                                i6++;
                            }
                        }
                        if (i6 != 0) {
                            codedInputByteBufferNano.rewindToPosition(position2);
                            int[] iArr9 = this.f4203b;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            int[] iArr10 = new int[(i6 + length4)];
                            if (length4 != 0) {
                                System.arraycopy(iArr9, 0, iArr10, 0, length4);
                            }
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                int readInt326 = codedInputByteBufferNano.readInt32();
                                if (readInt326 == 0 || readInt326 == 2 || readInt326 == 3) {
                                    iArr10[length4] = readInt326;
                                    length4++;
                                }
                            }
                            this.f4203b = iArr10;
                        }
                        codedInputByteBufferNano.popLimit(pushLimit2);
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                int[] iArr = this.f4202a;
                int i = 0;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = this.f4202a;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        codedOutputByteBufferNano.writeInt32(1, iArr2[i2]);
                        i2++;
                    }
                }
                int[] iArr3 = this.f4203b;
                if (iArr3 != null && iArr3.length > 0) {
                    while (true) {
                        int[] iArr4 = this.f4203b;
                        if (i >= iArr4.length) {
                            break;
                        }
                        codedOutputByteBufferNano.writeInt32(2, iArr4[i]);
                        i++;
                    }
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public k() {
            a();
        }

        public static k[] b() {
            if (f4180c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4180c == null) {
                        f4180c = new k[0];
                    }
                }
            }
            return f4180c;
        }

        public k a() {
            this.f4181a = null;
            this.f4182b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            a aVar = this.f4181a;
            if (aVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
            }
            b bVar = this.f4182b;
            return bVar != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, bVar) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f4181a == null) {
                        this.f4181a = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f4181a);
                } else if (readTag == 18) {
                    if (this.f4182b == null) {
                        this.f4182b = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f4182b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            a aVar = this.f4181a;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(1, aVar);
            }
            b bVar = this.f4182b;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(2, bVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class l extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile l[] f4204c;

        /* renamed from: a  reason: collision with root package name */
        public String f4205a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f4206b;

        public l() {
            a();
        }

        public static l[] b() {
            if (f4204c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4204c == null) {
                        f4204c = new l[0];
                    }
                }
            }
            return f4204c;
        }

        public l a() {
            this.f4205a = "";
            this.f4206b = WireFormatNano.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f4205a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4205a);
            }
            return !Arrays.equals(this.f4206b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4206b) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f4205a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f4206b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (!this.f4205a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f4205a);
            }
            if (!Arrays.equals(this.f4206b, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(2, this.f4206b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class m extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile m[] f4207c;

        /* renamed from: a  reason: collision with root package name */
        public String f4208a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4209b;

        public m() {
            a();
        }

        public static m[] b() {
            if (f4207c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4207c == null) {
                        f4207c = new m[0];
                    }
                }
            }
            return f4207c;
        }

        public m a() {
            this.f4208a = "";
            this.f4209b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f4208a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f4209b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    this.f4208a = codedInputByteBufferNano.readString();
                } else if (readTag == 16) {
                    this.f4209b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f4208a);
            codedOutputByteBufferNano.writeBool(2, this.f4209b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class n extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4210a;

        /* renamed from: b  reason: collision with root package name */
        public long f4211b;

        public n() {
            a();
        }

        public n a() {
            this.f4210a = 86400;
            this.f4211b = 432000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4210a) + CodedOutputByteBufferNano.computeInt64Size(2, this.f4211b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4210a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f4211b = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f4210a);
            codedOutputByteBufferNano.writeInt64(2, this.f4211b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class o extends MessageNano {

        /* renamed from: g  reason: collision with root package name */
        private static volatile o[] f4212g;

        /* renamed from: a  reason: collision with root package name */
        public String f4213a;

        /* renamed from: b  reason: collision with root package name */
        public String f4214b;

        /* renamed from: c  reason: collision with root package name */
        public String f4215c;

        /* renamed from: d  reason: collision with root package name */
        public a[] f4216d;

        /* renamed from: e  reason: collision with root package name */
        public long f4217e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f4218f;

        public static final class a extends MessageNano {

            /* renamed from: c  reason: collision with root package name */
            private static volatile a[] f4219c;

            /* renamed from: a  reason: collision with root package name */
            public String f4220a;

            /* renamed from: b  reason: collision with root package name */
            public String f4221b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f4219c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        if (f4219c == null) {
                            f4219c = new a[0];
                        }
                    }
                }
                return f4219c;
            }

            public a a() {
                this.f4220a = "";
                this.f4221b = "";
                this.cachedSize = -1;
                return this;
            }

            /* access modifiers changed from: protected */
            public int computeSerializedSize() {
                return super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f4220a) + CodedOutputByteBufferNano.computeStringSize(2, this.f4221b);
            }

            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
                while (true) {
                    int readTag = codedInputByteBufferNano.readTag();
                    if (readTag == 0) {
                        break;
                    } else if (readTag == 10) {
                        this.f4220a = codedInputByteBufferNano.readString();
                    } else if (readTag == 18) {
                        this.f4221b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    }
                }
                return this;
            }

            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
                codedOutputByteBufferNano.writeString(1, this.f4220a);
                codedOutputByteBufferNano.writeString(2, this.f4221b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public o() {
            a();
        }

        public static o[] b() {
            if (f4212g == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4212g == null) {
                        f4212g = new o[0];
                    }
                }
            }
            return f4212g;
        }

        public o a() {
            this.f4213a = "";
            this.f4214b = "";
            this.f4215c = "";
            this.f4216d = a.b();
            this.f4217e = 0;
            this.f4218f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f4213a) + CodedOutputByteBufferNano.computeStringSize(2, this.f4214b) + CodedOutputByteBufferNano.computeStringSize(3, this.f4215c);
            a[] aVarArr = this.f4216d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.f4216d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, aVar);
                    }
                    i2++;
                }
            }
            int computeInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(5, this.f4217e);
            int[] iArr = this.f4218f;
            if (iArr == null || iArr.length <= 0) {
                return computeInt64Size;
            }
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f4218f;
                if (i >= iArr2.length) {
                    return computeInt64Size + i3 + (iArr2.length * 1);
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
                    this.f4213a = codedInputByteBufferNano.readString();
                } else if (readTag == 18) {
                    this.f4214b = codedInputByteBufferNano.readString();
                } else if (readTag == 26) {
                    this.f4215c = codedInputByteBufferNano.readString();
                } else if (readTag == 34) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    a[] aVarArr = this.f4216d;
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
                    this.f4216d = aVarArr2;
                } else if (readTag == 40) {
                    this.f4217e = codedInputByteBufferNano.readInt64();
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
                        int[] iArr2 = this.f4218f;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == repeatedFieldArrayLength2) {
                            this.f4218f = iArr;
                        } else {
                            int[] iArr3 = new int[(length2 + i2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f4218f = iArr3;
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
                        int[] iArr4 = this.f4218f;
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
                        this.f4218f = iArr5;
                    }
                    codedInputByteBufferNano.popLimit(pushLimit);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeString(1, this.f4213a);
            codedOutputByteBufferNano.writeString(2, this.f4214b);
            codedOutputByteBufferNano.writeString(3, this.f4215c);
            a[] aVarArr = this.f4216d;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.f4216d;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        codedOutputByteBufferNano.writeMessage(4, aVar);
                    }
                    i2++;
                }
            }
            codedOutputByteBufferNano.writeInt64(5, this.f4217e);
            int[] iArr = this.f4218f;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f4218f;
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

    public static final class p extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4222a;

        /* renamed from: b  reason: collision with root package name */
        public long f4223b;

        /* renamed from: c  reason: collision with root package name */
        public long f4224c;

        /* renamed from: d  reason: collision with root package name */
        public long f4225d;

        public p() {
            a();
        }

        public p a() {
            this.f4222a = 432000000;
            this.f4223b = Constants.MILLIS_IN_DAY;
            this.f4224c = 10000;
            this.f4225d = 3600000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f4222a;
            if (j != 432000000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
            }
            long j2 = this.f4223b;
            if (j2 != Constants.MILLIS_IN_DAY) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
            }
            long j3 = this.f4224c;
            if (j3 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(3, j3);
            }
            long j4 = this.f4225d;
            return j4 != 3600000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, j4) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4222a = codedInputByteBufferNano.readInt64();
                } else if (readTag == 16) {
                    this.f4223b = codedInputByteBufferNano.readInt64();
                } else if (readTag == 24) {
                    this.f4224c = codedInputByteBufferNano.readInt64();
                } else if (readTag == 32) {
                    this.f4225d = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            long j = this.f4222a;
            if (j != 432000000) {
                codedOutputByteBufferNano.writeInt64(1, j);
            }
            long j2 = this.f4223b;
            if (j2 != Constants.MILLIS_IN_DAY) {
                codedOutputByteBufferNano.writeInt64(2, j2);
            }
            long j3 = this.f4224c;
            if (j3 != 10000) {
                codedOutputByteBufferNano.writeInt64(3, j3);
            }
            long j4 = this.f4225d;
            if (j4 != 3600000) {
                codedOutputByteBufferNano.writeInt64(4, j4);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class q extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4226a;

        /* renamed from: b  reason: collision with root package name */
        public String f4227b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f4228c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f4229d;

        /* renamed from: e  reason: collision with root package name */
        public long f4230e;

        /* renamed from: f  reason: collision with root package name */
        public int f4231f;

        /* renamed from: g  reason: collision with root package name */
        public long f4232g;

        /* renamed from: h  reason: collision with root package name */
        public long f4233h;
        public long i;
        public long j;

        public q() {
            a();
        }

        public q a() {
            this.f4226a = 0;
            this.f4227b = "";
            int[] iArr = WireFormatNano.EMPTY_INT_ARRAY;
            this.f4228c = iArr;
            this.f4229d = iArr;
            this.f4230e = 259200;
            this.f4231f = 10;
            this.f4232g = 43200;
            this.f4233h = 3600;
            this.i = 86400;
            this.j = 30;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int[] iArr;
            int[] iArr2;
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4226a) + CodedOutputByteBufferNano.computeStringSize(2, this.f4227b);
            int[] iArr3 = this.f4228c;
            int i2 = 0;
            if (iArr3 != null && iArr3.length > 0) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    iArr2 = this.f4228c;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    i4 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i3]);
                    i3++;
                }
                computeSerializedSize = computeSerializedSize + i4 + (iArr2.length * 1);
            }
            int computeInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(4, this.f4230e) + CodedOutputByteBufferNano.computeInt32Size(5, this.f4231f);
            long j2 = this.f4232g;
            if (j2 != 43200) {
                computeInt64Size += CodedOutputByteBufferNano.computeInt64Size(6, j2);
            }
            long j3 = this.f4233h;
            if (j3 != 3600) {
                computeInt64Size += CodedOutputByteBufferNano.computeInt64Size(7, j3);
            }
            long j4 = this.i;
            if (j4 != 86400) {
                computeInt64Size += CodedOutputByteBufferNano.computeInt64Size(8, j4);
            }
            int[] iArr4 = this.f4229d;
            if (iArr4 != null && iArr4.length > 0) {
                int i5 = 0;
                while (true) {
                    iArr = this.f4229d;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    i5 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr[i2]);
                    i2++;
                }
                computeInt64Size = computeInt64Size + i5 + (iArr.length * 1);
            }
            long j5 = this.j;
            return j5 != 30 ? computeInt64Size + CodedOutputByteBufferNano.computeInt64Size(10, j5) : computeInt64Size;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f4226a = codedInputByteBufferNano.readInt64();
                        continue;
                    case 18:
                        this.f4227b = codedInputByteBufferNano.readString();
                        continue;
                    case 24:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 24);
                        int[] iArr = this.f4228c;
                        int length = iArr == null ? 0 : iArr.length;
                        int i2 = repeatedFieldArrayLength + length;
                        int[] iArr2 = new int[i2];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i2 - 1) {
                            iArr2[length] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        iArr2[length] = codedInputByteBufferNano.readInt32();
                        this.f4228c = iArr2;
                        continue;
                    case 26:
                        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i3 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i3++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        int[] iArr3 = this.f4228c;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i4 = i3 + length2;
                        int[] iArr4 = new int[i4];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i4) {
                            iArr4[length2] = codedInputByteBufferNano.readInt32();
                            length2++;
                        }
                        this.f4228c = iArr4;
                        codedInputByteBufferNano.popLimit(pushLimit);
                        continue;
                    case 32:
                        this.f4230e = codedInputByteBufferNano.readInt64();
                        continue;
                    case 40:
                        this.f4231f = codedInputByteBufferNano.readInt32();
                        continue;
                    case 48:
                        this.f4232g = codedInputByteBufferNano.readInt64();
                        continue;
                    case 56:
                        this.f4233h = codedInputByteBufferNano.readInt64();
                        continue;
                    case 64:
                        this.i = codedInputByteBufferNano.readInt64();
                        continue;
                    case 72:
                        int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 72);
                        int[] iArr5 = this.f4229d;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i5 = repeatedFieldArrayLength2 + length3;
                        int[] iArr6 = new int[i5];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i5 - 1) {
                            iArr6[length3] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            length3++;
                        }
                        iArr6[length3] = codedInputByteBufferNano.readInt32();
                        this.f4229d = iArr6;
                        continue;
                    case 74:
                        int pushLimit2 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position2 = codedInputByteBufferNano.getPosition();
                        int i6 = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt32();
                            i6++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position2);
                        int[] iArr7 = this.f4229d;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i7 = i6 + length4;
                        int[] iArr8 = new int[i7];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i7) {
                            iArr8[length4] = codedInputByteBufferNano.readInt32();
                            length4++;
                        }
                        this.f4229d = iArr8;
                        codedInputByteBufferNano.popLimit(pushLimit2);
                        continue;
                    case 80:
                        this.j = codedInputByteBufferNano.readInt64();
                        continue;
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            continue;
                        }
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f4226a);
            codedOutputByteBufferNano.writeString(2, this.f4227b);
            int[] iArr = this.f4228c;
            int i2 = 0;
            if (iArr != null && iArr.length > 0) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = this.f4228c;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(3, iArr2[i3]);
                    i3++;
                }
            }
            codedOutputByteBufferNano.writeInt64(4, this.f4230e);
            codedOutputByteBufferNano.writeInt32(5, this.f4231f);
            long j2 = this.f4232g;
            if (j2 != 43200) {
                codedOutputByteBufferNano.writeInt64(6, j2);
            }
            long j3 = this.f4233h;
            if (j3 != 3600) {
                codedOutputByteBufferNano.writeInt64(7, j3);
            }
            long j4 = this.i;
            if (j4 != 86400) {
                codedOutputByteBufferNano.writeInt64(8, j4);
            }
            int[] iArr3 = this.f4229d;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f4229d;
                    if (i2 >= iArr4.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(9, iArr4[i2]);
                    i2++;
                }
            }
            long j5 = this.j;
            if (j5 != 30) {
                codedOutputByteBufferNano.writeInt64(10, j5);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class r extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public int f4234a;

        public r() {
            a();
        }

        public r a() {
            this.f4234a = 86400;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f4234a;
            return i != 86400 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4234a = codedInputByteBufferNano.readUInt32();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f4234a;
            if (i != 86400) {
                codedOutputByteBufferNano.writeUInt32(1, i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class s extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public long f4235a;

        public s() {
            a();
        }

        public s a() {
            this.f4235a = 18000000;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt64Size(1, this.f4235a);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4235a = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt64(1, this.f4235a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class t extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public u f4236a;

        /* renamed from: b  reason: collision with root package name */
        public u f4237b;

        public t() {
            a();
        }

        public t a() {
            this.f4236a = null;
            this.f4237b = null;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            u uVar = this.f4236a;
            if (uVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, uVar);
            }
            u uVar2 = this.f4237b;
            return uVar2 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, uVar2) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 10) {
                    if (this.f4236a == null) {
                        this.f4236a = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f4236a);
                } else if (readTag == 18) {
                    if (this.f4237b == null) {
                        this.f4237b = new u();
                    }
                    codedInputByteBufferNano.readMessage(this.f4237b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            u uVar = this.f4236a;
            if (uVar != null) {
                codedOutputByteBufferNano.writeMessage(1, uVar);
            }
            u uVar2 = this.f4237b;
            if (uVar2 != null) {
                codedOutputByteBufferNano.writeMessage(2, uVar2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class u extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public int f4238a;

        /* renamed from: b  reason: collision with root package name */
        public long f4239b;

        public u() {
            a();
        }

        public u a() {
            this.f4238a = 100;
            this.f4239b = 60;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f4238a;
            if (i != 100) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
            }
            long j = this.f4239b;
            return j != 60 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(2, j) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4238a = codedInputByteBufferNano.readInt32();
                } else if (readTag == 16) {
                    this.f4239b = codedInputByteBufferNano.readInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i = this.f4238a;
            if (i != 100) {
                codedOutputByteBufferNano.writeInt32(1, i);
            }
            long j = this.f4239b;
            if (j != 60) {
                codedOutputByteBufferNano.writeInt64(2, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class v extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4240a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4241b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4242c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4243d;

        /* renamed from: e  reason: collision with root package name */
        public int f4244e;

        /* renamed from: f  reason: collision with root package name */
        public int f4245f;

        /* renamed from: g  reason: collision with root package name */
        public int f4246g;

        /* renamed from: h  reason: collision with root package name */
        public int f4247h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public y[] m;
        public boolean n;
        public boolean o;
        public int p;

        public v() {
            a();
        }

        public v a() {
            this.f4240a = true;
            this.f4241b = true;
            this.f4242c = true;
            this.f4243d = true;
            this.f4244e = 10000;
            this.f4245f = 1000;
            this.f4246g = 1000;
            this.f4247h = 200000;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = y.b();
            this.n = false;
            this.o = false;
            this.p = TTAdSdk.INIT_LOCAL_FAIL_CODE;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            boolean z = this.f4240a;
            if (!z) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
            }
            boolean z2 = this.f4241b;
            if (!z2) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(2, z2);
            }
            boolean z3 = this.f4242c;
            if (!z3) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z3);
            }
            boolean z4 = this.f4243d;
            if (!z4) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z4);
            }
            int i2 = this.f4244e;
            if (i2 != 10000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i2);
            }
            int i3 = this.f4245f;
            if (i3 != 1000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i3);
            }
            int i4 = this.f4246g;
            if (i4 != 1000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
            }
            int i5 = this.f4247h;
            if (i5 != 200000) {
                computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
            }
            boolean z5 = this.i;
            if (z5) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(9, z5);
            }
            boolean z6 = this.j;
            if (z6) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(10, z6);
            }
            boolean z7 = this.k;
            if (z7) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(11, z7);
            }
            boolean z8 = this.l;
            if (z8) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(12, z8);
            }
            y[] yVarArr = this.m;
            if (yVarArr != null && yVarArr.length > 0) {
                int i6 = 0;
                while (true) {
                    y[] yVarArr2 = this.m;
                    if (i6 >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i6];
                    if (yVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(13, yVar);
                    }
                    i6++;
                }
            }
            boolean z9 = this.n;
            if (z9) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(14, z9);
            }
            boolean z10 = this.o;
            if (z10) {
                computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(15, z10);
            }
            int i7 = this.p;
            return i7 != 4000 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(16, i7) : computeSerializedSize;
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                switch (readTag) {
                    case 0:
                        break;
                    case 8:
                        this.f4240a = codedInputByteBufferNano.readBool();
                        continue;
                    case 16:
                        this.f4241b = codedInputByteBufferNano.readBool();
                        continue;
                    case 24:
                        this.f4242c = codedInputByteBufferNano.readBool();
                        continue;
                    case 32:
                        this.f4243d = codedInputByteBufferNano.readBool();
                        continue;
                    case 40:
                        this.f4244e = codedInputByteBufferNano.readInt32();
                        continue;
                    case 48:
                        this.f4245f = codedInputByteBufferNano.readInt32();
                        continue;
                    case 56:
                        this.f4246g = codedInputByteBufferNano.readInt32();
                        continue;
                    case 64:
                        this.f4247h = codedInputByteBufferNano.readInt32();
                        continue;
                    case 72:
                        this.i = codedInputByteBufferNano.readBool();
                        continue;
                    case 80:
                        this.j = codedInputByteBufferNano.readBool();
                        continue;
                    case 88:
                        this.k = codedInputByteBufferNano.readBool();
                        continue;
                    case 96:
                        this.l = codedInputByteBufferNano.readBool();
                        continue;
                    case 106:
                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 106);
                        y[] yVarArr = this.m;
                        int length = yVarArr == null ? 0 : yVarArr.length;
                        int i2 = repeatedFieldArrayLength + length;
                        y[] yVarArr2 = new y[i2];
                        if (length != 0) {
                            System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                        }
                        while (length < i2 - 1) {
                            yVarArr2[length] = new y();
                            codedInputByteBufferNano.readMessage(yVarArr2[length]);
                            codedInputByteBufferNano.readTag();
                            length++;
                        }
                        yVarArr2[length] = new y();
                        codedInputByteBufferNano.readMessage(yVarArr2[length]);
                        this.m = yVarArr2;
                        continue;
                    case 112:
                        this.n = codedInputByteBufferNano.readBool();
                        continue;
                    case 120:
                        this.o = codedInputByteBufferNano.readBool();
                        continue;
                    case 128:
                        this.p = codedInputByteBufferNano.readInt32();
                        continue;
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        } else {
                            continue;
                        }
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            boolean z = this.f4240a;
            if (!z) {
                codedOutputByteBufferNano.writeBool(1, z);
            }
            boolean z2 = this.f4241b;
            if (!z2) {
                codedOutputByteBufferNano.writeBool(2, z2);
            }
            boolean z3 = this.f4242c;
            if (!z3) {
                codedOutputByteBufferNano.writeBool(3, z3);
            }
            boolean z4 = this.f4243d;
            if (!z4) {
                codedOutputByteBufferNano.writeBool(4, z4);
            }
            int i2 = this.f4244e;
            if (i2 != 10000) {
                codedOutputByteBufferNano.writeInt32(5, i2);
            }
            int i3 = this.f4245f;
            if (i3 != 1000) {
                codedOutputByteBufferNano.writeInt32(6, i3);
            }
            int i4 = this.f4246g;
            if (i4 != 1000) {
                codedOutputByteBufferNano.writeInt32(7, i4);
            }
            int i5 = this.f4247h;
            if (i5 != 200000) {
                codedOutputByteBufferNano.writeInt32(8, i5);
            }
            boolean z5 = this.i;
            if (z5) {
                codedOutputByteBufferNano.writeBool(9, z5);
            }
            boolean z6 = this.j;
            if (z6) {
                codedOutputByteBufferNano.writeBool(10, z6);
            }
            boolean z7 = this.k;
            if (z7) {
                codedOutputByteBufferNano.writeBool(11, z7);
            }
            boolean z8 = this.l;
            if (z8) {
                codedOutputByteBufferNano.writeBool(12, z8);
            }
            y[] yVarArr = this.m;
            if (yVarArr != null && yVarArr.length > 0) {
                int i6 = 0;
                while (true) {
                    y[] yVarArr2 = this.m;
                    if (i6 >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i6];
                    if (yVar != null) {
                        codedOutputByteBufferNano.writeMessage(13, yVar);
                    }
                    i6++;
                }
            }
            boolean z9 = this.n;
            if (z9) {
                codedOutputByteBufferNano.writeBool(14, z9);
            }
            boolean z10 = this.o;
            if (z10) {
                codedOutputByteBufferNano.writeBool(15, z10);
            }
            int i7 = this.p;
            if (i7 != 4000) {
                codedOutputByteBufferNano.writeInt32(16, i7);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class w extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public int f4248a;

        /* renamed from: b  reason: collision with root package name */
        public int f4249b;

        /* renamed from: c  reason: collision with root package name */
        public int f4250c;

        /* renamed from: d  reason: collision with root package name */
        public long f4251d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4252e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4253f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4254g;

        /* renamed from: h  reason: collision with root package name */
        public y[] f4255h;

        public w() {
            a();
        }

        public w a() {
            this.f4248a = 10000;
            this.f4249b = 1000;
            this.f4250c = 100;
            this.f4251d = 5000;
            this.f4252e = true;
            this.f4253f = false;
            this.f4254g = true;
            this.f4255h = y.b();
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.f4248a) + CodedOutputByteBufferNano.computeInt32Size(2, this.f4249b) + CodedOutputByteBufferNano.computeInt32Size(3, this.f4250c) + CodedOutputByteBufferNano.computeInt64Size(4, this.f4251d) + CodedOutputByteBufferNano.computeBoolSize(5, this.f4252e) + CodedOutputByteBufferNano.computeBoolSize(6, this.f4253f) + CodedOutputByteBufferNano.computeBoolSize(7, this.f4254g);
            y[] yVarArr = this.f4255h;
            if (yVarArr != null && yVarArr.length > 0) {
                int i = 0;
                while (true) {
                    y[] yVarArr2 = this.f4255h;
                    if (i >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i];
                    if (yVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, yVar);
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
                } else if (readTag == 8) {
                    this.f4248a = codedInputByteBufferNano.readInt32();
                } else if (readTag == 16) {
                    this.f4249b = codedInputByteBufferNano.readInt32();
                } else if (readTag == 24) {
                    this.f4250c = codedInputByteBufferNano.readInt32();
                } else if (readTag == 32) {
                    this.f4251d = codedInputByteBufferNano.readInt64();
                } else if (readTag == 40) {
                    this.f4252e = codedInputByteBufferNano.readBool();
                } else if (readTag == 48) {
                    this.f4253f = codedInputByteBufferNano.readBool();
                } else if (readTag == 56) {
                    this.f4254g = codedInputByteBufferNano.readBool();
                } else if (readTag == 66) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    y[] yVarArr = this.f4255h;
                    int length = yVarArr == null ? 0 : yVarArr.length;
                    int i = repeatedFieldArrayLength + length;
                    y[] yVarArr2 = new y[i];
                    if (length != 0) {
                        System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        yVarArr2[length] = new y();
                        codedInputByteBufferNano.readMessage(yVarArr2[length]);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    yVarArr2[length] = new y();
                    codedInputByteBufferNano.readMessage(yVarArr2[length]);
                    this.f4255h = yVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.f4248a);
            codedOutputByteBufferNano.writeInt32(2, this.f4249b);
            codedOutputByteBufferNano.writeInt32(3, this.f4250c);
            codedOutputByteBufferNano.writeInt64(4, this.f4251d);
            codedOutputByteBufferNano.writeBool(5, this.f4252e);
            codedOutputByteBufferNano.writeBool(6, this.f4253f);
            codedOutputByteBufferNano.writeBool(7, this.f4254g);
            y[] yVarArr = this.f4255h;
            if (yVarArr != null && yVarArr.length > 0) {
                int i = 0;
                while (true) {
                    y[] yVarArr2 = this.f4255h;
                    if (i >= yVarArr2.length) {
                        break;
                    }
                    y yVar = yVarArr2[i];
                    if (yVar != null) {
                        codedOutputByteBufferNano.writeMessage(8, yVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class x extends MessageNano {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4256a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4257b;

        public x() {
            a();
        }

        public x a() {
            this.f4256a = true;
            this.f4257b = false;
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f4256a) + CodedOutputByteBufferNano.computeBoolSize(2, this.f4257b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    this.f4256a = codedInputByteBufferNano.readBool();
                } else if (readTag == 16) {
                    this.f4257b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeBool(1, this.f4256a);
            codedOutputByteBufferNano.writeBool(2, this.f4257b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class y extends MessageNano {

        /* renamed from: c  reason: collision with root package name */
        private static volatile y[] f4258c;

        /* renamed from: a  reason: collision with root package name */
        public int f4259a;

        /* renamed from: b  reason: collision with root package name */
        public String f4260b;

        public y() {
            a();
        }

        public static y[] b() {
            if (f4258c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    if (f4258c == null) {
                        f4258c = new y[0];
                    }
                }
            }
            return f4258c;
        }

        public y a() {
            this.f4259a = 0;
            this.f4260b = "";
            this.cachedSize = -1;
            return this;
        }

        /* access modifiers changed from: protected */
        public int computeSerializedSize() {
            return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, this.f4259a) + CodedOutputByteBufferNano.computeStringSize(2, this.f4260b);
        }

        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int readTag = codedInputByteBufferNano.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                        this.f4259a = readInt32;
                    }
                } else if (readTag == 18) {
                    this.f4260b = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            }
            return this;
        }

        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.writeInt32(1, this.f4259a);
            codedOutputByteBufferNano.writeString(2, this.f4260b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public If() {
        a();
    }

    public If a() {
        this.f4138a = "";
        this.f4139b = 0;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f4140c = strArr;
        this.f4141d = "";
        this.f4142e = "";
        this.f4143f = strArr;
        this.f4144g = strArr;
        this.f4145h = strArr;
        this.i = strArr;
        this.j = d.b();
        this.k = null;
        this.l = k.b();
        this.m = null;
        this.n = o.b();
        this.o = "";
        this.p = "";
        this.q = "";
        this.r = false;
        this.s = "";
        this.t = WireFormatNano.EMPTY_STRING_ARRAY;
        this.u = null;
        this.v = false;
        this.w = m.b();
        this.x = null;
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = "";
        this.C = 0;
        this.D = 0;
        this.E = false;
        this.F = null;
        this.G = null;
        this.H = 600;
        this.I = 1;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = WireFormatNano.EMPTY_STRING_ARRAY;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = l.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4138a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f4138a);
        }
        int computeInt64Size = computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(3, this.f4139b);
        String[] strArr = this.f4140c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f4140c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    i4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i3++;
            }
            computeInt64Size = computeInt64Size + i4 + (i5 * 1);
        }
        if (!this.f4141d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f4141d);
        }
        if (!this.f4142e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(6, this.f4142e);
        }
        String[] strArr3 = this.f4143f;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.f4143f;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    i8++;
                    i7 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i6++;
            }
            computeInt64Size = computeInt64Size + i7 + (i8 * 1);
        }
        String[] strArr5 = this.f4144g;
        if (strArr5 != null && strArr5.length > 0) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr6 = this.f4144g;
                if (i9 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i9];
                if (str3 != null) {
                    i11++;
                    i10 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i9++;
            }
            computeInt64Size = computeInt64Size + i10 + (i11 * 1);
        }
        String[] strArr7 = this.f4145h;
        if (strArr7 != null && strArr7.length > 0) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f4145h;
                if (i12 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i12];
                if (str4 != null) {
                    i14++;
                    i13 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i12++;
            }
            computeInt64Size = computeInt64Size + i13 + (i14 * 1);
        }
        i iVar = this.k;
        if (iVar != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(10, iVar);
        }
        k[] kVarArr = this.l;
        if (kVarArr != null && kVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                k[] kVarArr2 = this.l;
                if (i15 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i15];
                if (kVar != null) {
                    computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(11, kVar);
                }
                i15++;
            }
        }
        q qVar = this.m;
        if (qVar != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(13, qVar);
        }
        o[] oVarArr = this.n;
        if (oVarArr != null && oVarArr.length > 0) {
            int i16 = 0;
            while (true) {
                o[] oVarArr2 = this.n;
                if (i16 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i16];
                if (oVar != null) {
                    computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(14, oVar);
                }
                i16++;
            }
        }
        if (!this.o.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(15, this.o);
        }
        if (!this.p.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(16, this.p);
        }
        int computeBoolSize = computeInt64Size + CodedOutputByteBufferNano.computeBoolSize(17, this.r);
        if (!this.s.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(19, this.s);
        }
        String[] strArr9 = this.t;
        if (strArr9 != null && strArr9.length > 0) {
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr10 = this.t;
                if (i17 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i17];
                if (str5 != null) {
                    i19++;
                    i18 += CodedOutputByteBufferNano.computeStringSizeNoTag(str5);
                }
                i17++;
            }
            computeBoolSize = computeBoolSize + i18 + (i19 * 2);
        }
        s sVar = this.u;
        if (sVar != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(21, sVar);
        }
        boolean z2 = this.v;
        if (z2) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(22, z2);
        }
        m[] mVarArr = this.w;
        if (mVarArr != null && mVarArr.length > 0) {
            int i20 = 0;
            while (true) {
                m[] mVarArr2 = this.w;
                if (i20 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i20];
                if (mVar != null) {
                    computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(23, mVar);
                }
                i20++;
            }
        }
        p pVar = this.x;
        if (pVar != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(24, pVar);
        }
        if (!this.y.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(25, this.y);
        }
        if (!this.z.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(26, this.z);
        }
        if (!this.A.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(27, this.A);
        }
        int computeInt64Size2 = computeBoolSize + CodedOutputByteBufferNano.computeInt64Size(28, this.C) + CodedOutputByteBufferNano.computeInt64Size(29, this.D);
        boolean z3 = this.E;
        if (z3) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(30, z3);
        }
        n nVar = this.F;
        if (nVar != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(32, nVar);
        }
        j jVar = this.G;
        if (jVar != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(33, jVar);
        }
        int computeInt32Size = computeInt64Size2 + CodedOutputByteBufferNano.computeInt32Size(35, this.H) + CodedOutputByteBufferNano.computeInt32Size(36, this.I);
        w wVar = this.J;
        if (wVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(37, wVar);
        }
        v vVar = this.K;
        if (vVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(38, vVar);
        }
        v vVar2 = this.L;
        if (vVar2 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(39, vVar2);
        }
        t tVar = this.N;
        if (tVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(41, tVar);
        }
        c cVar = this.O;
        if (cVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(42, cVar);
        }
        v vVar3 = this.M;
        if (vVar3 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(43, vVar3);
        }
        if (!this.q.equals("")) {
            computeInt32Size += CodedOutputByteBufferNano.computeStringSize(44, this.q);
        }
        f fVar = this.P;
        if (fVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(45, fVar);
        }
        String[] strArr11 = this.i;
        if (strArr11 != null && strArr11.length > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                String[] strArr12 = this.i;
                if (i21 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i21];
                if (str6 != null) {
                    i23++;
                    i22 += CodedOutputByteBufferNano.computeStringSizeNoTag(str6);
                }
                i21++;
            }
            computeInt32Size = computeInt32Size + i22 + (i23 * 2);
        }
        String[] strArr13 = this.Q;
        if (strArr13 != null && strArr13.length > 0) {
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (true) {
                String[] strArr14 = this.Q;
                if (i24 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i24];
                if (str7 != null) {
                    i26++;
                    i25 += CodedOutputByteBufferNano.computeStringSizeNoTag(str7);
                }
                i24++;
            }
            computeInt32Size = computeInt32Size + i25 + (i26 * 2);
        }
        b bVar = this.R;
        if (bVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(48, bVar);
        }
        if (!this.B.equals("")) {
            computeInt32Size += CodedOutputByteBufferNano.computeStringSize(49, this.B);
        }
        a aVar = this.S;
        if (aVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(51, aVar);
        }
        h hVar = this.T;
        if (hVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(52, hVar);
        }
        g gVar = this.U;
        if (gVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(53, gVar);
        }
        d[] dVarArr = this.j;
        if (dVarArr != null && dVarArr.length > 0) {
            int i27 = 0;
            while (true) {
                d[] dVarArr2 = this.j;
                if (i27 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i27];
                if (dVar != null) {
                    computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(54, dVar);
                }
                i27++;
            }
        }
        r rVar = this.V;
        if (rVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(55, rVar);
        }
        l[] lVarArr = this.W;
        if (lVarArr != null && lVarArr.length > 0) {
            while (true) {
                l[] lVarArr2 = this.W;
                if (i2 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i2];
                if (lVar != null) {
                    computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(56, lVar);
                }
                i2++;
            }
        }
        return computeInt32Size;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f4138a = codedInputByteBufferNano.readString();
                    continue;
                case 24:
                    this.f4139b = codedInputByteBufferNano.readInt64();
                    continue;
                case 34:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    String[] strArr = this.f4140c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f4140c = strArr2;
                    continue;
                case 42:
                    this.f4141d = codedInputByteBufferNano.readString();
                    continue;
                case 50:
                    this.f4142e = codedInputByteBufferNano.readString();
                    continue;
                case 58:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr3 = this.f4143f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f4143f = strArr4;
                    continue;
                case 66:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    String[] strArr5 = this.f4144g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f4144g = strArr6;
                    continue;
                case 74:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 74);
                    String[] strArr7 = this.f4145h;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = repeatedFieldArrayLength4 + length4;
                    String[] strArr8 = new String[i5];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        strArr8[length4] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    strArr8[length4] = codedInputByteBufferNano.readString();
                    this.f4145h = strArr8;
                    continue;
                case 82:
                    if (this.k == null) {
                        this.k = new i();
                    }
                    codedInputByteBufferNano.readMessage(this.k);
                    continue;
                case 90:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    k[] kVarArr = this.l;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i6 = repeatedFieldArrayLength5 + length5;
                    k[] kVarArr2 = new k[i6];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        kVarArr2[length5] = new k();
                        codedInputByteBufferNano.readMessage(kVarArr2[length5]);
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    kVarArr2[length5] = new k();
                    codedInputByteBufferNano.readMessage(kVarArr2[length5]);
                    this.l = kVarArr2;
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new q();
                    }
                    codedInputByteBufferNano.readMessage(this.m);
                    continue;
                case 114:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 114);
                    o[] oVarArr = this.n;
                    int length6 = oVarArr == null ? 0 : oVarArr.length;
                    int i7 = repeatedFieldArrayLength6 + length6;
                    o[] oVarArr2 = new o[i7];
                    if (length6 != 0) {
                        System.arraycopy(oVarArr, 0, oVarArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        oVarArr2[length6] = new o();
                        codedInputByteBufferNano.readMessage(oVarArr2[length6]);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    oVarArr2[length6] = new o();
                    codedInputByteBufferNano.readMessage(oVarArr2[length6]);
                    this.n = oVarArr2;
                    continue;
                case 122:
                    this.o = codedInputByteBufferNano.readString();
                    continue;
                case 130:
                    this.p = codedInputByteBufferNano.readString();
                    continue;
                case 136:
                    this.r = codedInputByteBufferNano.readBool();
                    continue;
                case 154:
                    this.s = codedInputByteBufferNano.readString();
                    continue;
                case 162:
                    int repeatedFieldArrayLength7 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 162);
                    String[] strArr9 = this.t;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i8 = repeatedFieldArrayLength7 + length7;
                    String[] strArr10 = new String[i8];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i8 - 1) {
                        strArr10[length7] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length7++;
                    }
                    strArr10[length7] = codedInputByteBufferNano.readString();
                    this.t = strArr10;
                    continue;
                case 170:
                    if (this.u == null) {
                        this.u = new s();
                    }
                    codedInputByteBufferNano.readMessage(this.u);
                    continue;
                case 176:
                    this.v = codedInputByteBufferNano.readBool();
                    continue;
                case 186:
                    int repeatedFieldArrayLength8 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    m[] mVarArr = this.w;
                    int length8 = mVarArr == null ? 0 : mVarArr.length;
                    int i9 = repeatedFieldArrayLength8 + length8;
                    m[] mVarArr2 = new m[i9];
                    if (length8 != 0) {
                        System.arraycopy(mVarArr, 0, mVarArr2, 0, length8);
                    }
                    while (length8 < i9 - 1) {
                        mVarArr2[length8] = new m();
                        codedInputByteBufferNano.readMessage(mVarArr2[length8]);
                        codedInputByteBufferNano.readTag();
                        length8++;
                    }
                    mVarArr2[length8] = new m();
                    codedInputByteBufferNano.readMessage(mVarArr2[length8]);
                    this.w = mVarArr2;
                    continue;
                case 194:
                    if (this.x == null) {
                        this.x = new p();
                    }
                    codedInputByteBufferNano.readMessage(this.x);
                    continue;
                case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                    this.y = codedInputByteBufferNano.readString();
                    continue;
                case LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE:
                    this.z = codedInputByteBufferNano.readString();
                    continue;
                case 218:
                    this.A = codedInputByteBufferNano.readString();
                    continue;
                case 224:
                    this.C = codedInputByteBufferNano.readInt64();
                    continue;
                case 232:
                    this.D = codedInputByteBufferNano.readInt64();
                    continue;
                case 240:
                    this.E = codedInputByteBufferNano.readBool();
                    continue;
                case 258:
                    if (this.F == null) {
                        this.F = new n();
                    }
                    codedInputByteBufferNano.readMessage(this.F);
                    continue;
                case 266:
                    if (this.G == null) {
                        this.G = new j();
                    }
                    codedInputByteBufferNano.readMessage(this.G);
                    continue;
                case ms.bd.o.Pgl.c.COLLECT_MODE_ML_TEEN /*280*/:
                    this.H = codedInputByteBufferNano.readInt32();
                    continue;
                case 288:
                    this.I = codedInputByteBufferNano.readInt32();
                    continue;
                case 298:
                    if (this.J == null) {
                        this.J = new w();
                    }
                    codedInputByteBufferNano.readMessage(this.J);
                    continue;
                case 306:
                    if (this.K == null) {
                        this.K = new v();
                    }
                    codedInputByteBufferNano.readMessage(this.K);
                    continue;
                case 314:
                    if (this.L == null) {
                        this.L = new v();
                    }
                    codedInputByteBufferNano.readMessage(this.L);
                    continue;
                case ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOKLITE /*330*/:
                    if (this.N == null) {
                        this.N = new t();
                    }
                    codedInputByteBufferNano.readMessage(this.N);
                    continue;
                case 338:
                    if (this.O == null) {
                        this.O = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.O);
                    continue;
                case 346:
                    if (this.M == null) {
                        this.M = new v();
                    }
                    codedInputByteBufferNano.readMessage(this.M);
                    continue;
                case 354:
                    this.q = codedInputByteBufferNano.readString();
                    continue;
                case 362:
                    if (this.P == null) {
                        this.P = new f();
                    }
                    codedInputByteBufferNano.readMessage(this.P);
                    continue;
                case 370:
                    int repeatedFieldArrayLength9 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 370);
                    String[] strArr11 = this.i;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i10 = repeatedFieldArrayLength9 + length9;
                    String[] strArr12 = new String[i10];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i10 - 1) {
                        strArr12[length9] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length9++;
                    }
                    strArr12[length9] = codedInputByteBufferNano.readString();
                    this.i = strArr12;
                    continue;
                case 378:
                    int repeatedFieldArrayLength10 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 378);
                    String[] strArr13 = this.Q;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i11 = repeatedFieldArrayLength10 + length10;
                    String[] strArr14 = new String[i11];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i11 - 1) {
                        strArr14[length10] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length10++;
                    }
                    strArr14[length10] = codedInputByteBufferNano.readString();
                    this.Q = strArr14;
                    continue;
                case 386:
                    if (this.R == null) {
                        this.R = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.R);
                    continue;
                case 394:
                    this.B = codedInputByteBufferNano.readString();
                    continue;
                case TTAdConstant.IMAGE_LIST_SIZE_CODE /*410*/:
                    if (this.S == null) {
                        this.S = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.S);
                    continue;
                case 418:
                    if (this.T == null) {
                        this.T = new h();
                    }
                    codedInputByteBufferNano.readMessage(this.T);
                    continue;
                case 426:
                    if (this.U == null) {
                        this.U = new g();
                    }
                    codedInputByteBufferNano.readMessage(this.U);
                    continue;
                case 434:
                    int repeatedFieldArrayLength11 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 434);
                    d[] dVarArr = this.j;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i12 = repeatedFieldArrayLength11 + length11;
                    d[] dVarArr2 = new d[i12];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i12 - 1) {
                        dVarArr2[length11] = new d();
                        codedInputByteBufferNano.readMessage(dVarArr2[length11]);
                        codedInputByteBufferNano.readTag();
                        length11++;
                    }
                    dVarArr2[length11] = new d();
                    codedInputByteBufferNano.readMessage(dVarArr2[length11]);
                    this.j = dVarArr2;
                    continue;
                case 442:
                    if (this.V == null) {
                        this.V = new r();
                    }
                    codedInputByteBufferNano.readMessage(this.V);
                    continue;
                case 450:
                    int repeatedFieldArrayLength12 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 450);
                    l[] lVarArr = this.W;
                    int length12 = lVarArr == null ? 0 : lVarArr.length;
                    int i13 = repeatedFieldArrayLength12 + length12;
                    l[] lVarArr2 = new l[i13];
                    if (length12 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length12);
                    }
                    while (length12 < i13 - 1) {
                        lVarArr2[length12] = new l();
                        codedInputByteBufferNano.readMessage(lVarArr2[length12]);
                        codedInputByteBufferNano.readTag();
                        length12++;
                    }
                    lVarArr2[length12] = new l();
                    codedInputByteBufferNano.readMessage(lVarArr2[length12]);
                    this.W = lVarArr2;
                    continue;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f4138a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4138a);
        }
        codedOutputByteBufferNano.writeInt64(3, this.f4139b);
        String[] strArr = this.f4140c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f4140c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(4, str);
                }
                i3++;
            }
        }
        if (!this.f4141d.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f4141d);
        }
        if (!this.f4142e.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f4142e);
        }
        String[] strArr3 = this.f4143f;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.f4143f;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(7, str2);
                }
                i4++;
            }
        }
        String[] strArr5 = this.f4144g;
        if (strArr5 != null && strArr5.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.f4144g;
                if (i5 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i5];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(8, str3);
                }
                i5++;
            }
        }
        String[] strArr7 = this.f4145h;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.f4145h;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(9, str4);
                }
                i6++;
            }
        }
        i iVar = this.k;
        if (iVar != null) {
            codedOutputByteBufferNano.writeMessage(10, iVar);
        }
        k[] kVarArr = this.l;
        if (kVarArr != null && kVarArr.length > 0) {
            int i7 = 0;
            while (true) {
                k[] kVarArr2 = this.l;
                if (i7 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i7];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(11, kVar);
                }
                i7++;
            }
        }
        q qVar = this.m;
        if (qVar != null) {
            codedOutputByteBufferNano.writeMessage(13, qVar);
        }
        o[] oVarArr = this.n;
        if (oVarArr != null && oVarArr.length > 0) {
            int i8 = 0;
            while (true) {
                o[] oVarArr2 = this.n;
                if (i8 >= oVarArr2.length) {
                    break;
                }
                o oVar = oVarArr2[i8];
                if (oVar != null) {
                    codedOutputByteBufferNano.writeMessage(14, oVar);
                }
                i8++;
            }
        }
        if (!this.o.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.o);
        }
        if (!this.p.equals("")) {
            codedOutputByteBufferNano.writeString(16, this.p);
        }
        codedOutputByteBufferNano.writeBool(17, this.r);
        if (!this.s.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.s);
        }
        String[] strArr9 = this.t;
        if (strArr9 != null && strArr9.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr10 = this.t;
                if (i9 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i9];
                if (str5 != null) {
                    codedOutputByteBufferNano.writeString(20, str5);
                }
                i9++;
            }
        }
        s sVar = this.u;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(21, sVar);
        }
        boolean z2 = this.v;
        if (z2) {
            codedOutputByteBufferNano.writeBool(22, z2);
        }
        m[] mVarArr = this.w;
        if (mVarArr != null && mVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                m[] mVarArr2 = this.w;
                if (i10 >= mVarArr2.length) {
                    break;
                }
                m mVar = mVarArr2[i10];
                if (mVar != null) {
                    codedOutputByteBufferNano.writeMessage(23, mVar);
                }
                i10++;
            }
        }
        p pVar = this.x;
        if (pVar != null) {
            codedOutputByteBufferNano.writeMessage(24, pVar);
        }
        if (!this.y.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.y);
        }
        if (!this.z.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.z);
        }
        if (!this.A.equals("")) {
            codedOutputByteBufferNano.writeString(27, this.A);
        }
        codedOutputByteBufferNano.writeInt64(28, this.C);
        codedOutputByteBufferNano.writeInt64(29, this.D);
        boolean z3 = this.E;
        if (z3) {
            codedOutputByteBufferNano.writeBool(30, z3);
        }
        n nVar = this.F;
        if (nVar != null) {
            codedOutputByteBufferNano.writeMessage(32, nVar);
        }
        j jVar = this.G;
        if (jVar != null) {
            codedOutputByteBufferNano.writeMessage(33, jVar);
        }
        codedOutputByteBufferNano.writeInt32(35, this.H);
        codedOutputByteBufferNano.writeInt32(36, this.I);
        w wVar = this.J;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(37, wVar);
        }
        v vVar = this.K;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(38, vVar);
        }
        v vVar2 = this.L;
        if (vVar2 != null) {
            codedOutputByteBufferNano.writeMessage(39, vVar2);
        }
        t tVar = this.N;
        if (tVar != null) {
            codedOutputByteBufferNano.writeMessage(41, tVar);
        }
        c cVar = this.O;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(42, cVar);
        }
        v vVar3 = this.M;
        if (vVar3 != null) {
            codedOutputByteBufferNano.writeMessage(43, vVar3);
        }
        if (!this.q.equals("")) {
            codedOutputByteBufferNano.writeString(44, this.q);
        }
        f fVar = this.P;
        if (fVar != null) {
            codedOutputByteBufferNano.writeMessage(45, fVar);
        }
        String[] strArr11 = this.i;
        if (strArr11 != null && strArr11.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr12 = this.i;
                if (i11 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i11];
                if (str6 != null) {
                    codedOutputByteBufferNano.writeString(46, str6);
                }
                i11++;
            }
        }
        String[] strArr13 = this.Q;
        if (strArr13 != null && strArr13.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr14 = this.Q;
                if (i12 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i12];
                if (str7 != null) {
                    codedOutputByteBufferNano.writeString(47, str7);
                }
                i12++;
            }
        }
        b bVar = this.R;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(48, bVar);
        }
        if (!this.B.equals("")) {
            codedOutputByteBufferNano.writeString(49, this.B);
        }
        a aVar = this.S;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(51, aVar);
        }
        h hVar = this.T;
        if (hVar != null) {
            codedOutputByteBufferNano.writeMessage(52, hVar);
        }
        g gVar = this.U;
        if (gVar != null) {
            codedOutputByteBufferNano.writeMessage(53, gVar);
        }
        d[] dVarArr = this.j;
        if (dVarArr != null && dVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                d[] dVarArr2 = this.j;
                if (i13 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i13];
                if (dVar != null) {
                    codedOutputByteBufferNano.writeMessage(54, dVar);
                }
                i13++;
            }
        }
        r rVar = this.V;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(55, rVar);
        }
        l[] lVarArr = this.W;
        if (lVarArr != null && lVarArr.length > 0) {
            while (true) {
                l[] lVarArr2 = this.W;
                if (i2 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i2];
                if (lVar != null) {
                    codedOutputByteBufferNano.writeMessage(56, lVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
