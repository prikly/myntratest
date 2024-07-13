package com.google.protobuf.nano.ym;

import com.applovin.exoplayer2.common.base.Ascii;

public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int currentLimit = Integer.MAX_VALUE;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.bufferStart = i;
        this.bufferSize = i2 + i;
        this.bufferPos = i;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i, int i2) {
        return new CodedInputByteBufferNano(bArr, i, i2);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i2 = this.currentLimit;
        if (i > i2) {
            int i3 = i - i2;
            this.bufferSizeAfterLimit = i3;
            this.bufferSize = i - i3;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    public void checkLastTagWas(int i) {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.bufferPos;
    }

    public byte[] getData(int i, int i2) {
        if (i2 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.bufferStart + i, bArr, 0, i2);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) {
        if (i >= 0) {
            int i2 = i + this.bufferPos;
            int i3 = this.currentLimit;
            if (i2 <= i3) {
                this.currentLimit = i2;
                recomputeBufferSizeAfterLimit();
                return i3;
            }
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        throw InvalidProtocolBufferNanoException.negativeSize();
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            return readRawBytes(readRawVarint32);
        }
        byte[] bArr = new byte[readRawVarint32];
        System.arraycopy(this.buffer, i2, bArr, 0, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return bArr;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i) {
        int i2 = this.recursionDepth;
        if (i2 < this.recursionLimit) {
            this.recursionDepth = i2 + 1;
            messageNano.mergeFrom(this);
            checkLastTagWas(WireFormatNano.makeTag(i, 4));
            this.recursionDepth--;
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            messageNano.mergeFrom(this);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
    }

    public byte readRawByte() {
        int i = this.bufferPos;
        if (i != this.bufferSize) {
            byte[] bArr = this.buffer;
            this.bufferPos = i + 1;
            return bArr[i];
        }
        throw InvalidProtocolBufferNanoException.truncatedMessage();
    }

    public byte[] readRawBytes(int i) {
        if (i >= 0) {
            int i2 = this.bufferPos;
            int i3 = i2 + i;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i <= this.bufferSize - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.buffer, i2, bArr, 0, i);
                this.bufferPos += i;
                return bArr;
            } else {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
    }

    public int readRawLittleEndian32() {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << Ascii.DLE) | ((readRawByte() & 255) << Ascii.CAN);
    }

    public long readRawLittleEndian64() {
        byte readRawByte = readRawByte();
        byte readRawByte2 = readRawByte();
        return ((((long) readRawByte2) & 255) << 8) | (((long) readRawByte) & 255) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
    }

    public int readRawVarint32() {
        int i;
        byte readRawByte = readRawByte();
        if (readRawByte >= 0) {
            return readRawByte;
        }
        byte b2 = readRawByte & Ascii.DEL;
        byte readRawByte2 = readRawByte();
        if (readRawByte2 >= 0) {
            i = readRawByte2 << 7;
        } else {
            b2 |= (readRawByte2 & Ascii.DEL) << 7;
            byte readRawByte3 = readRawByte();
            if (readRawByte3 >= 0) {
                i = readRawByte3 << Ascii.SO;
            } else {
                b2 |= (readRawByte3 & Ascii.DEL) << Ascii.SO;
                byte readRawByte4 = readRawByte();
                if (readRawByte4 >= 0) {
                    i = readRawByte4 << Ascii.NAK;
                } else {
                    byte b3 = b2 | ((readRawByte4 & Ascii.DEL) << Ascii.NAK);
                    byte readRawByte5 = readRawByte();
                    byte b4 = b3 | (readRawByte5 << Ascii.FS);
                    if (readRawByte5 >= 0) {
                        return b4;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (readRawByte() >= 0) {
                            return b4;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
            }
        }
        return b2 | i;
    }

    public long readRawVarint64() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte readRawByte = readRawByte();
            j |= ((long) (readRawByte & Ascii.DEL)) << i;
            if ((readRawByte & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 > this.bufferSize - this.bufferPos || readRawVarint32 <= 0) {
            return new String(readRawBytes(readRawVarint32), "UTF-8");
        }
        String str = new String(this.buffer, this.bufferPos, readRawVarint32, "UTF-8");
        this.bufferPos += readRawVarint32;
        return str;
    }

    public int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (readRawVarint32 != 0) {
            return readRawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void resetSizeCounter() {
    }

    public void rewindToPosition(int i) {
        int i2 = this.bufferPos;
        int i3 = this.bufferStart;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.bufferPos - this.bufferStart));
        } else if (i >= 0) {
            this.bufferPos = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position " + i);
        }
    }

    public int setRecursionLimit(int i) {
        if (i >= 0) {
            int i2 = this.recursionLimit;
            this.recursionLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    public int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.sizeLimit;
            this.sizeLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public boolean skipField(int i) {
        int tagWireType = WireFormatNano.getTagWireType(i);
        if (tagWireType == 0) {
            readInt32();
            return true;
        } else if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        } else if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        } else if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i), 4));
            return true;
        } else if (tagWireType == 4) {
            return false;
        } else {
            if (tagWireType == 5) {
                readRawLittleEndian32();
                return true;
            }
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void skipMessage() {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.readTag()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.skipField(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.ym.CodedInputByteBufferNano.skipMessage():void");
    }

    public void skipRawBytes(int i) {
        if (i >= 0) {
            int i2 = this.bufferPos;
            int i3 = i2 + i;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes(i4 - i2);
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            } else if (i <= this.bufferSize - i2) {
                this.bufferPos = i3;
            } else {
                throw InvalidProtocolBufferNanoException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
    }
}
