package com.appodeal.ads.api;

import com.appodeal.ads.api.AdStats;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class Session extends GeneratedMessageV3 implements SessionOrBuilder {
    private static final Session DEFAULT_INSTANCE = new Session();
    /* access modifiers changed from: private */
    public static final Parser<Session> PARSER = new AbstractParser<Session>() {
        public Session parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Session(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public int activeSessionId_;
    /* access modifiers changed from: private */
    public long activeSessionUptime_;
    /* access modifiers changed from: private */
    public AdStats adStats_;
    /* access modifiers changed from: private */
    public long appSessionAverageLength_;
    /* access modifiers changed from: private */
    public volatile Object ext_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public long monotonicAppSessionAverageLength_;
    /* access modifiers changed from: private */
    public long monotonicSessionUptime_;
    /* access modifiers changed from: private */
    public int segmentId_;
    /* access modifiers changed from: private */
    public long sessionId_;
    /* access modifiers changed from: private */
    public long sessionUptime_;
    /* access modifiers changed from: private */
    public volatile Object sessionUuid_;
    /* access modifiers changed from: private */
    public boolean test_;
    /* access modifiers changed from: private */
    public volatile Object token_;

    private Session(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Session() {
        this.memoizedIsInitialized = -1;
        this.ext_ = "";
        this.token_ = "";
        this.sessionUuid_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Session();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Session(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.test_ = codedInputStream.readBool();
                            break;
                        case 18:
                            this.ext_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 26:
                            this.token_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 32:
                            this.sessionId_ = codedInputStream.readInt64();
                            break;
                        case 42:
                            this.sessionUuid_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 48:
                            this.sessionUptime_ = codedInputStream.readInt64();
                            break;
                        case 56:
                            this.segmentId_ = codedInputStream.readInt32();
                            break;
                        case 66:
                            AdStats.Builder builder = this.adStats_ != null ? this.adStats_.toBuilder() : null;
                            AdStats adStats = (AdStats) codedInputStream.readMessage(AdStats.parser(), extensionRegistryLite);
                            this.adStats_ = adStats;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(adStats);
                                this.adStats_ = builder.buildPartial();
                                break;
                            }
                        case 72:
                            this.monotonicSessionUptime_ = codedInputStream.readInt64();
                            break;
                        case 80:
                            this.activeSessionUptime_ = codedInputStream.readInt64();
                            break;
                        case 88:
                            this.activeSessionId_ = codedInputStream.readInt32();
                            break;
                        case 96:
                            this.appSessionAverageLength_ = codedInputStream.readInt64();
                            break;
                        case 104:
                            this.monotonicAppSessionAverageLength_ = codedInputStream.readInt64();
                            break;
                        default:
                            if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Api.internal_static_com_appodeal_ads_Session_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
    }

    public boolean getTest() {
        return this.test_;
    }

    public String getExt() {
        Object obj = this.ext_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ext_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getExtBytes() {
        Object obj = this.ext_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ext_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.token_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getSessionId() {
        return this.sessionId_;
    }

    public String getSessionUuid() {
        Object obj = this.sessionUuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionUuid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSessionUuidBytes() {
        Object obj = this.sessionUuid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionUuid_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getSessionUptime() {
        return this.sessionUptime_;
    }

    public int getSegmentId() {
        return this.segmentId_;
    }

    public boolean hasAdStats() {
        return this.adStats_ != null;
    }

    public AdStats getAdStats() {
        AdStats adStats = this.adStats_;
        return adStats == null ? AdStats.getDefaultInstance() : adStats;
    }

    public long getMonotonicSessionUptime() {
        return this.monotonicSessionUptime_;
    }

    @Deprecated
    public long getActiveSessionUptime() {
        return this.activeSessionUptime_;
    }

    @Deprecated
    public int getActiveSessionId() {
        return this.activeSessionId_;
    }

    public long getAppSessionAverageLength() {
        return this.appSessionAverageLength_;
    }

    public long getMonotonicAppSessionAverageLength() {
        return this.monotonicAppSessionAverageLength_;
    }

    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.test_;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!getExtBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.ext_);
        }
        if (!getTokenBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.token_);
        }
        long j = this.sessionId_;
        if (j != 0) {
            codedOutputStream.writeInt64(4, j);
        }
        if (!getSessionUuidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.sessionUuid_);
        }
        long j2 = this.sessionUptime_;
        if (j2 != 0) {
            codedOutputStream.writeInt64(6, j2);
        }
        int i = this.segmentId_;
        if (i != 0) {
            codedOutputStream.writeInt32(7, i);
        }
        if (this.adStats_ != null) {
            codedOutputStream.writeMessage(8, getAdStats());
        }
        long j3 = this.monotonicSessionUptime_;
        if (j3 != 0) {
            codedOutputStream.writeInt64(9, j3);
        }
        long j4 = this.activeSessionUptime_;
        if (j4 != 0) {
            codedOutputStream.writeInt64(10, j4);
        }
        int i2 = this.activeSessionId_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(11, i2);
        }
        long j5 = this.appSessionAverageLength_;
        if (j5 != 0) {
            codedOutputStream.writeInt64(12, j5);
        }
        long j6 = this.monotonicAppSessionAverageLength_;
        if (j6 != 0) {
            codedOutputStream.writeInt64(13, j6);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.test_;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (!getExtBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.ext_);
        }
        if (!getTokenBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.token_);
        }
        long j = this.sessionId_;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(4, j);
        }
        if (!getSessionUuidBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(5, this.sessionUuid_);
        }
        long j2 = this.sessionUptime_;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(6, j2);
        }
        int i3 = this.segmentId_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(7, i3);
        }
        if (this.adStats_ != null) {
            i2 += CodedOutputStream.computeMessageSize(8, getAdStats());
        }
        long j3 = this.monotonicSessionUptime_;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeInt64Size(9, j3);
        }
        long j4 = this.activeSessionUptime_;
        if (j4 != 0) {
            i2 += CodedOutputStream.computeInt64Size(10, j4);
        }
        int i4 = this.activeSessionId_;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(11, i4);
        }
        long j5 = this.appSessionAverageLength_;
        if (j5 != 0) {
            i2 += CodedOutputStream.computeInt64Size(12, j5);
        }
        long j6 = this.monotonicAppSessionAverageLength_;
        if (j6 != 0) {
            i2 += CodedOutputStream.computeInt64Size(13, j6);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session session = (Session) obj;
        if (getTest() != session.getTest() || !getExt().equals(session.getExt()) || !getToken().equals(session.getToken()) || getSessionId() != session.getSessionId() || !getSessionUuid().equals(session.getSessionUuid()) || getSessionUptime() != session.getSessionUptime() || getSegmentId() != session.getSegmentId() || hasAdStats() != session.hasAdStats()) {
            return false;
        }
        if ((!hasAdStats() || getAdStats().equals(session.getAdStats())) && getMonotonicSessionUptime() == session.getMonotonicSessionUptime() && getActiveSessionUptime() == session.getActiveSessionUptime() && getActiveSessionId() == session.getActiveSessionId() && getAppSessionAverageLength() == session.getAppSessionAverageLength() && getMonotonicAppSessionAverageLength() == session.getMonotonicAppSessionAverageLength() && this.unknownFields.equals(session.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getTest())) * 37) + 2) * 53) + getExt().hashCode()) * 37) + 3) * 53) + getToken().hashCode()) * 37) + 4) * 53) + Internal.hashLong(getSessionId())) * 37) + 5) * 53) + getSessionUuid().hashCode()) * 37) + 6) * 53) + Internal.hashLong(getSessionUptime())) * 37) + 7) * 53) + getSegmentId();
        if (hasAdStats()) {
            hashCode = (((hashCode * 37) + 8) * 53) + getAdStats().hashCode();
        }
        int hashLong = (((((((((((((((((((((hashCode * 37) + 9) * 53) + Internal.hashLong(getMonotonicSessionUptime())) * 37) + 10) * 53) + Internal.hashLong(getActiveSessionUptime())) * 37) + 11) * 53) + getActiveSessionId()) * 37) + 12) * 53) + Internal.hashLong(getAppSessionAverageLength())) * 37) + 13) * 53) + Internal.hashLong(getMonotonicAppSessionAverageLength())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashLong;
        return hashLong;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Session session) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionOrBuilder {
        private int activeSessionId_;
        private long activeSessionUptime_;
        private SingleFieldBuilderV3<AdStats, AdStats.Builder, AdStatsOrBuilder> adStatsBuilder_;
        private AdStats adStats_;
        private long appSessionAverageLength_;
        private Object ext_;
        private long monotonicAppSessionAverageLength_;
        private long monotonicSessionUptime_;
        private int segmentId_;
        private long sessionId_;
        private long sessionUptime_;
        private Object sessionUuid_;
        private boolean test_;
        private Object token_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
        }

        private Builder() {
            this.ext_ = "";
            this.token_ = "";
            this.sessionUuid_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.ext_ = "";
            this.token_ = "";
            this.sessionUuid_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Session.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.test_ = false;
            this.ext_ = "";
            this.token_ = "";
            this.sessionId_ = 0;
            this.sessionUuid_ = "";
            this.sessionUptime_ = 0;
            this.segmentId_ = 0;
            if (this.adStatsBuilder_ == null) {
                this.adStats_ = null;
            } else {
                this.adStats_ = null;
                this.adStatsBuilder_ = null;
            }
            this.monotonicSessionUptime_ = 0;
            this.activeSessionUptime_ = 0;
            this.activeSessionId_ = 0;
            this.appSessionAverageLength_ = 0;
            this.monotonicAppSessionAverageLength_ = 0;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Session_descriptor;
        }

        public Session getDefaultInstanceForType() {
            return Session.getDefaultInstance();
        }

        public Session build() {
            Session buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Session buildPartial() {
            Session session = new Session((GeneratedMessageV3.Builder) this);
            boolean unused = session.test_ = this.test_;
            Object unused2 = session.ext_ = this.ext_;
            Object unused3 = session.token_ = this.token_;
            long unused4 = session.sessionId_ = this.sessionId_;
            Object unused5 = session.sessionUuid_ = this.sessionUuid_;
            long unused6 = session.sessionUptime_ = this.sessionUptime_;
            int unused7 = session.segmentId_ = this.segmentId_;
            SingleFieldBuilderV3<AdStats, AdStats.Builder, AdStatsOrBuilder> singleFieldBuilderV3 = this.adStatsBuilder_;
            if (singleFieldBuilderV3 == null) {
                AdStats unused8 = session.adStats_ = this.adStats_;
            } else {
                AdStats unused9 = session.adStats_ = singleFieldBuilderV3.build();
            }
            long unused10 = session.monotonicSessionUptime_ = this.monotonicSessionUptime_;
            long unused11 = session.activeSessionUptime_ = this.activeSessionUptime_;
            int unused12 = session.activeSessionId_ = this.activeSessionId_;
            long unused13 = session.appSessionAverageLength_ = this.appSessionAverageLength_;
            long unused14 = session.monotonicAppSessionAverageLength_ = this.monotonicAppSessionAverageLength_;
            onBuilt();
            return session;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Session) {
                return mergeFrom((Session) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Session session) {
            if (session == Session.getDefaultInstance()) {
                return this;
            }
            if (session.getTest()) {
                setTest(session.getTest());
            }
            if (!session.getExt().isEmpty()) {
                this.ext_ = session.ext_;
                onChanged();
            }
            if (!session.getToken().isEmpty()) {
                this.token_ = session.token_;
                onChanged();
            }
            if (session.getSessionId() != 0) {
                setSessionId(session.getSessionId());
            }
            if (!session.getSessionUuid().isEmpty()) {
                this.sessionUuid_ = session.sessionUuid_;
                onChanged();
            }
            if (session.getSessionUptime() != 0) {
                setSessionUptime(session.getSessionUptime());
            }
            if (session.getSegmentId() != 0) {
                setSegmentId(session.getSegmentId());
            }
            if (session.hasAdStats()) {
                mergeAdStats(session.getAdStats());
            }
            if (session.getMonotonicSessionUptime() != 0) {
                setMonotonicSessionUptime(session.getMonotonicSessionUptime());
            }
            if (session.getActiveSessionUptime() != 0) {
                setActiveSessionUptime(session.getActiveSessionUptime());
            }
            if (session.getActiveSessionId() != 0) {
                setActiveSessionId(session.getActiveSessionId());
            }
            if (session.getAppSessionAverageLength() != 0) {
                setAppSessionAverageLength(session.getAppSessionAverageLength());
            }
            if (session.getMonotonicAppSessionAverageLength() != 0) {
                setMonotonicAppSessionAverageLength(session.getMonotonicAppSessionAverageLength());
            }
            mergeUnknownFields(session.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Session.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Session.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Session r3 = (com.appodeal.ads.api.Session) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Session) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Session r4 = (com.appodeal.ads.api.Session) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Session) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Session.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Session$Builder");
        }

        public Builder setTest(boolean z) {
            this.test_ = z;
            onChanged();
            return this;
        }

        public Builder setExt(String str) {
            if (str != null) {
                this.ext_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setToken(String str) {
            if (str != null) {
                this.token_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setSessionId(long j) {
            this.sessionId_ = j;
            onChanged();
            return this;
        }

        public Builder setSessionUuid(String str) {
            if (str != null) {
                this.sessionUuid_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setSessionUptime(long j) {
            this.sessionUptime_ = j;
            onChanged();
            return this;
        }

        public Builder setSegmentId(int i) {
            this.segmentId_ = i;
            onChanged();
            return this;
        }

        public Builder setAdStats(AdStats adStats) {
            SingleFieldBuilderV3<AdStats, AdStats.Builder, AdStatsOrBuilder> singleFieldBuilderV3 = this.adStatsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(adStats);
            } else if (adStats != null) {
                this.adStats_ = adStats;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeAdStats(AdStats adStats) {
            SingleFieldBuilderV3<AdStats, AdStats.Builder, AdStatsOrBuilder> singleFieldBuilderV3 = this.adStatsBuilder_;
            if (singleFieldBuilderV3 == null) {
                AdStats adStats2 = this.adStats_;
                if (adStats2 != null) {
                    this.adStats_ = AdStats.newBuilder(adStats2).mergeFrom(adStats).buildPartial();
                } else {
                    this.adStats_ = adStats;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(adStats);
            }
            return this;
        }

        public Builder setMonotonicSessionUptime(long j) {
            this.monotonicSessionUptime_ = j;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setActiveSessionUptime(long j) {
            this.activeSessionUptime_ = j;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setActiveSessionId(int i) {
            this.activeSessionId_ = i;
            onChanged();
            return this;
        }

        public Builder setAppSessionAverageLength(long j) {
            this.appSessionAverageLength_ = j;
            onChanged();
            return this;
        }

        public Builder setMonotonicAppSessionAverageLength(long j) {
            this.monotonicAppSessionAverageLength_ = j;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Session getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Session> parser() {
        return PARSER;
    }

    public Parser<Session> getParserForType() {
        return PARSER;
    }

    public Session getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
