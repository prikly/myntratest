package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Af extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3701a;

    /* renamed from: b  reason: collision with root package name */
    public int f3702b;

    /* renamed from: c  reason: collision with root package name */
    public int f3703c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3704d;

    public Af() {
        a();
    }

    public Af a() {
        this.f3701a = false;
        this.f3702b = 0;
        this.f3703c = 0;
        this.f3704d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBoolSize(1, this.f3701a) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f3702b) + CodedOutputByteBufferNano.computeUInt32Size(3, this.f3703c);
        int[] iArr = this.f3704d;
        if (iArr == null || iArr.length <= 0) {
            return computeSerializedSize;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.f3704d;
            if (i >= iArr2.length) {
                return computeSerializedSize + i2 + (iArr2.length * 1);
            }
            i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
            i++;
        }
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 8) {
                this.f3701a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f3702b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f3703c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f3704d;
                int length = iArr == null ? 0 : iArr.length;
                int i = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f3704d = iArr2;
            } else if (readTag == 34) {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i2 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i2++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f3704d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f3704d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f3701a);
        codedOutputByteBufferNano.writeUInt32(2, this.f3702b);
        codedOutputByteBufferNano.writeUInt32(3, this.f3703c);
        int[] iArr = this.f3704d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f3704d;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
