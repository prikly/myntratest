package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.AdOrBuilder;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.protobuf.analytics.AuctionContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BidEvent extends GeneratedMessageV3 implements BidEventOrBuilder {
    public static final int AD_FIELD_NUMBER = 6;
    public static final int AUCTION_CONTEXT_FIELD_NUMBER = 4;
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int BID_FIELD_NUMBER = 5;
    private static final BidEvent DEFAULT_INSTANCE = new BidEvent();
    /* access modifiers changed from: private */
    public static final Parser<BidEvent> PARSER = new AbstractParser<BidEvent>() {
        public BidEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new BidEvent(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SEAT_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public Ad ad_;
    /* access modifiers changed from: private */
    public AuctionContext auctionContext_;
    /* access modifiers changed from: private */
    public Response.Seatbid.Bid bid_;
    /* access modifiers changed from: private */
    public volatile Object bidid_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object seat_;
    /* access modifiers changed from: private */
    public volatile Object timestamp_;

    private BidEvent(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private BidEvent() {
        this.memoizedIsInitialized = -1;
        this.timestamp_ = "";
        this.bidid_ = "";
        this.seat_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new BidEvent();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private BidEvent(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.timestamp_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.bidid_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            this.seat_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 34) {
                            AuctionContext.Builder builder = this.auctionContext_ != null ? this.auctionContext_.toBuilder() : null;
                            AuctionContext auctionContext = (AuctionContext) codedInputStream.readMessage(AuctionContext.parser(), extensionRegistryLite);
                            this.auctionContext_ = auctionContext;
                            if (builder != null) {
                                builder.mergeFrom(auctionContext);
                                this.auctionContext_ = builder.buildPartial();
                            }
                        } else if (readTag == 42) {
                            Response.Seatbid.Bid.Builder builder2 = this.bid_ != null ? this.bid_.toBuilder() : null;
                            Response.Seatbid.Bid bid = (Response.Seatbid.Bid) codedInputStream.readMessage(Response.Seatbid.Bid.parser(), extensionRegistryLite);
                            this.bid_ = bid;
                            if (builder2 != null) {
                                builder2.mergeFrom(bid);
                                this.bid_ = builder2.buildPartial();
                            }
                        } else if (readTag == 50) {
                            Ad.Builder builder3 = this.ad_ != null ? this.ad_.toBuilder() : null;
                            Ad ad = (Ad) codedInputStream.readMessage(Ad.parser(), extensionRegistryLite);
                            this.ad_ = ad;
                            if (builder3 != null) {
                                builder3.mergeFrom(ad);
                                this.ad_ = builder3.buildPartial();
                            }
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
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
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(BidEvent.class, Builder.class);
    }

    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTimestampBytes() {
        Object obj = this.timestamp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timestamp_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getSeat() {
        Object obj = this.seat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.seat_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSeatBytes() {
        Object obj = this.seat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.seat_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasAuctionContext() {
        return this.auctionContext_ != null;
    }

    public AuctionContext getAuctionContext() {
        AuctionContext auctionContext = this.auctionContext_;
        return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
    }

    public AuctionContextOrBuilder getAuctionContextOrBuilder() {
        return getAuctionContext();
    }

    public boolean hasBid() {
        return this.bid_ != null;
    }

    public Response.Seatbid.Bid getBid() {
        Response.Seatbid.Bid bid = this.bid_;
        return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
    }

    public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
        return getBid();
    }

    public boolean hasAd() {
        return this.ad_ != null;
    }

    public Ad getAd() {
        Ad ad = this.ad_;
        return ad == null ? Ad.getDefaultInstance() : ad;
    }

    public AdOrBuilder getAdOrBuilder() {
        return getAd();
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
        if (!getTimestampBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.timestamp_);
        }
        if (!getBididBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            codedOutputStream.writeMessage(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            codedOutputStream.writeMessage(5, getBid());
        }
        if (this.ad_ != null) {
            codedOutputStream.writeMessage(6, getAd());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getTimestampBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.timestamp_);
        }
        if (!getBididBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getBid());
        }
        if (this.ad_ != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getAd());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BidEvent)) {
            return super.equals(obj);
        }
        BidEvent bidEvent = (BidEvent) obj;
        if (!getTimestamp().equals(bidEvent.getTimestamp()) || !getBidid().equals(bidEvent.getBidid()) || !getSeat().equals(bidEvent.getSeat()) || hasAuctionContext() != bidEvent.hasAuctionContext()) {
            return false;
        }
        if ((hasAuctionContext() && !getAuctionContext().equals(bidEvent.getAuctionContext())) || hasBid() != bidEvent.hasBid()) {
            return false;
        }
        if ((hasBid() && !getBid().equals(bidEvent.getBid())) || hasAd() != bidEvent.hasAd()) {
            return false;
        }
        if ((!hasAd() || getAd().equals(bidEvent.getAd())) && this.unknownFields.equals(bidEvent.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getBidid().hashCode()) * 37) + 3) * 53) + getSeat().hashCode();
        if (hasAuctionContext()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getAuctionContext().hashCode();
        }
        if (hasBid()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getBid().hashCode();
        }
        if (hasAd()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getAd().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BidEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static BidEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BidEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static BidEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BidEvent parseFrom(InputStream inputStream) throws IOException {
        return (BidEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BidEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BidEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BidEvent bidEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bidEvent);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BidEventOrBuilder {
        private SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> adBuilder_;
        private Ad ad_;
        private SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> auctionContextBuilder_;
        private AuctionContext auctionContext_;
        private SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> bidBuilder_;
        private Response.Seatbid.Bid bid_;
        private Object bidid_;
        private Object seat_;
        private Object timestamp_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(BidEvent.class, Builder.class);
        }

        private Builder() {
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = BidEvent.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
            } else {
                this.auctionContext_ = null;
                this.auctionContextBuilder_ = null;
            }
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
            } else {
                this.bid_ = null;
                this.bidBuilder_ = null;
            }
            if (this.adBuilder_ == null) {
                this.ad_ = null;
            } else {
                this.ad_ = null;
                this.adBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        public BidEvent getDefaultInstanceForType() {
            return BidEvent.getDefaultInstance();
        }

        public BidEvent build() {
            BidEvent buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public BidEvent buildPartial() {
            BidEvent bidEvent = new BidEvent((GeneratedMessageV3.Builder) this);
            Object unused = bidEvent.timestamp_ = this.timestamp_;
            Object unused2 = bidEvent.bidid_ = this.bidid_;
            Object unused3 = bidEvent.seat_ = this.seat_;
            SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> singleFieldBuilderV3 = this.auctionContextBuilder_;
            if (singleFieldBuilderV3 == null) {
                AuctionContext unused4 = bidEvent.auctionContext_ = this.auctionContext_;
            } else {
                AuctionContext unused5 = bidEvent.auctionContext_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> singleFieldBuilderV32 = this.bidBuilder_;
            if (singleFieldBuilderV32 == null) {
                Response.Seatbid.Bid unused6 = bidEvent.bid_ = this.bid_;
            } else {
                Response.Seatbid.Bid unused7 = bidEvent.bid_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> singleFieldBuilderV33 = this.adBuilder_;
            if (singleFieldBuilderV33 == null) {
                Ad unused8 = bidEvent.ad_ = this.ad_;
            } else {
                Ad unused9 = bidEvent.ad_ = singleFieldBuilderV33.build();
            }
            onBuilt();
            return bidEvent;
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
            if (message instanceof BidEvent) {
                return mergeFrom((BidEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BidEvent bidEvent) {
            if (bidEvent == BidEvent.getDefaultInstance()) {
                return this;
            }
            if (!bidEvent.getTimestamp().isEmpty()) {
                this.timestamp_ = bidEvent.timestamp_;
                onChanged();
            }
            if (!bidEvent.getBidid().isEmpty()) {
                this.bidid_ = bidEvent.bidid_;
                onChanged();
            }
            if (!bidEvent.getSeat().isEmpty()) {
                this.seat_ = bidEvent.seat_;
                onChanged();
            }
            if (bidEvent.hasAuctionContext()) {
                mergeAuctionContext(bidEvent.getAuctionContext());
            }
            if (bidEvent.hasBid()) {
                mergeBid(bidEvent.getBid());
            }
            if (bidEvent.hasAd()) {
                mergeAd(bidEvent.getAd());
            }
            mergeUnknownFields(bidEvent.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.analytics.BidEvent.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.BidEvent.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.analytics.BidEvent r3 = (io.bidmachine.protobuf.analytics.BidEvent) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.analytics.BidEvent) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.analytics.BidEvent r4 = (io.bidmachine.protobuf.analytics.BidEvent) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.analytics.BidEvent) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.BidEvent.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.BidEvent$Builder");
        }

        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setTimestamp(String str) {
            if (str != null) {
                this.timestamp_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = BidEvent.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            if (byteString != null) {
                BidEvent.checkByteStringIsUtf8(byteString);
                this.timestamp_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setBidid(String str) {
            if (str != null) {
                this.bidid_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearBidid() {
            this.bidid_ = BidEvent.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) {
            if (byteString != null) {
                BidEvent.checkByteStringIsUtf8(byteString);
                this.bidid_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSeat(String str) {
            if (str != null) {
                this.seat_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSeat() {
            this.seat_ = BidEvent.getDefaultInstance().getSeat();
            onChanged();
            return this;
        }

        public Builder setSeatBytes(ByteString byteString) {
            if (byteString != null) {
                BidEvent.checkByteStringIsUtf8(byteString);
                this.seat_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasAuctionContext() {
            return (this.auctionContextBuilder_ == null && this.auctionContext_ == null) ? false : true;
        }

        public AuctionContext getAuctionContext() {
            SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> singleFieldBuilderV3 = this.auctionContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        public Builder setAuctionContext(AuctionContext auctionContext) {
            SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> singleFieldBuilderV3 = this.auctionContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(auctionContext);
            } else if (auctionContext != null) {
                this.auctionContext_ = auctionContext;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAuctionContext(AuctionContext.Builder builder) {
            SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> singleFieldBuilderV3 = this.auctionContextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.auctionContext_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAuctionContext(AuctionContext auctionContext) {
            SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> singleFieldBuilderV3 = this.auctionContextBuilder_;
            if (singleFieldBuilderV3 == null) {
                AuctionContext auctionContext2 = this.auctionContext_;
                if (auctionContext2 != null) {
                    this.auctionContext_ = AuctionContext.newBuilder(auctionContext2).mergeFrom(auctionContext).buildPartial();
                } else {
                    this.auctionContext_ = auctionContext;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(auctionContext);
            }
            return this;
        }

        public Builder clearAuctionContext() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
                onChanged();
            } else {
                this.auctionContext_ = null;
                this.auctionContextBuilder_ = null;
            }
            return this;
        }

        public AuctionContext.Builder getAuctionContextBuilder() {
            onChanged();
            return getAuctionContextFieldBuilder().getBuilder();
        }

        public AuctionContextOrBuilder getAuctionContextOrBuilder() {
            SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> singleFieldBuilderV3 = this.auctionContextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        private SingleFieldBuilderV3<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> getAuctionContextFieldBuilder() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContextBuilder_ = new SingleFieldBuilderV3<>(getAuctionContext(), getParentForChildren(), isClean());
                this.auctionContext_ = null;
            }
            return this.auctionContextBuilder_;
        }

        public boolean hasBid() {
            return (this.bidBuilder_ == null && this.bid_ == null) ? false : true;
        }

        public Response.Seatbid.Bid getBid() {
            SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> singleFieldBuilderV3 = this.bidBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        public Builder setBid(Response.Seatbid.Bid bid) {
            SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> singleFieldBuilderV3 = this.bidBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(bid);
            } else if (bid != null) {
                this.bid_ = bid;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid.Builder builder) {
            SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> singleFieldBuilderV3 = this.bidBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.bid_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeBid(Response.Seatbid.Bid bid) {
            SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> singleFieldBuilderV3 = this.bidBuilder_;
            if (singleFieldBuilderV3 == null) {
                Response.Seatbid.Bid bid2 = this.bid_;
                if (bid2 != null) {
                    this.bid_ = Response.Seatbid.Bid.newBuilder(bid2).mergeFrom(bid).buildPartial();
                } else {
                    this.bid_ = bid;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(bid);
            }
            return this;
        }

        public Builder clearBid() {
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
                onChanged();
            } else {
                this.bid_ = null;
                this.bidBuilder_ = null;
            }
            return this;
        }

        public Response.Seatbid.Bid.Builder getBidBuilder() {
            onChanged();
            return getBidFieldBuilder().getBuilder();
        }

        public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
            SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> singleFieldBuilderV3 = this.bidBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        private SingleFieldBuilderV3<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> getBidFieldBuilder() {
            if (this.bidBuilder_ == null) {
                this.bidBuilder_ = new SingleFieldBuilderV3<>(getBid(), getParentForChildren(), isClean());
                this.bid_ = null;
            }
            return this.bidBuilder_;
        }

        public boolean hasAd() {
            return (this.adBuilder_ == null && this.ad_ == null) ? false : true;
        }

        public Ad getAd() {
            SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> singleFieldBuilderV3 = this.adBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Ad ad = this.ad_;
            return ad == null ? Ad.getDefaultInstance() : ad;
        }

        public Builder setAd(Ad ad) {
            SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> singleFieldBuilderV3 = this.adBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(ad);
            } else if (ad != null) {
                this.ad_ = ad;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAd(Ad.Builder builder) {
            SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> singleFieldBuilderV3 = this.adBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ad_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAd(Ad ad) {
            SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> singleFieldBuilderV3 = this.adBuilder_;
            if (singleFieldBuilderV3 == null) {
                Ad ad2 = this.ad_;
                if (ad2 != null) {
                    this.ad_ = Ad.newBuilder(ad2).mergeFrom(ad).buildPartial();
                } else {
                    this.ad_ = ad;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(ad);
            }
            return this;
        }

        public Builder clearAd() {
            if (this.adBuilder_ == null) {
                this.ad_ = null;
                onChanged();
            } else {
                this.ad_ = null;
                this.adBuilder_ = null;
            }
            return this;
        }

        public Ad.Builder getAdBuilder() {
            onChanged();
            return getAdFieldBuilder().getBuilder();
        }

        public AdOrBuilder getAdOrBuilder() {
            SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> singleFieldBuilderV3 = this.adBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Ad ad = this.ad_;
            return ad == null ? Ad.getDefaultInstance() : ad;
        }

        private SingleFieldBuilderV3<Ad, Ad.Builder, AdOrBuilder> getAdFieldBuilder() {
            if (this.adBuilder_ == null) {
                this.adBuilder_ = new SingleFieldBuilderV3<>(getAd(), getParentForChildren(), isClean());
                this.ad_ = null;
            }
            return this.adBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static BidEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BidEvent> parser() {
        return PARSER;
    }

    public Parser<BidEvent> getParserForType() {
        return PARSER;
    }

    public BidEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
