package com.appodeal.ads.api;

import com.appodeal.ads.api.App;
import com.appodeal.ads.api.Device;
import com.appodeal.ads.api.Event;
import com.appodeal.ads.api.Extra;
import com.appodeal.ads.api.Geo;
import com.appodeal.ads.api.Get;
import com.appodeal.ads.api.Regs;
import com.appodeal.ads.api.Services;
import com.appodeal.ads.api.Session;
import com.appodeal.ads.api.Stats;
import com.appodeal.ads.api.User;
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

public final class Request extends GeneratedMessageV3 implements RequestOrBuilder {
    private static final Request DEFAULT_INSTANCE = new Request();
    /* access modifiers changed from: private */
    public static final Parser<Request> PARSER = new AbstractParser<Request>() {
        public Request parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Request(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public App app_;
    /* access modifiers changed from: private */
    public volatile Object customState_;
    /* access modifiers changed from: private */
    public Device device_;
    /* access modifiers changed from: private */
    public Event event_;
    /* access modifiers changed from: private */
    public Extra ext_;
    /* access modifiers changed from: private */
    public Geo geo_;
    /* access modifiers changed from: private */
    public Get get_;
    /* access modifiers changed from: private */
    public volatile Object impid_;
    /* access modifiers changed from: private */
    public volatile Object mainId_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public Regs regs_;
    /* access modifiers changed from: private */
    public Services servicesData_;
    /* access modifiers changed from: private */
    public Session session_;
    /* access modifiers changed from: private */
    public Stats stats_;
    /* access modifiers changed from: private */
    public long timestamp_;
    /* access modifiers changed from: private */
    public User user_;

    private Request(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Request() {
        this.memoizedIsInitialized = -1;
        this.impid_ = "";
        this.mainId_ = "";
        this.customState_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Request();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Request(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        case 10:
                            App.Builder builder = this.app_ != null ? this.app_.toBuilder() : null;
                            App app = (App) codedInputStream.readMessage(App.parser(), extensionRegistryLite);
                            this.app_ = app;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(app);
                                this.app_ = builder.buildPartial();
                                break;
                            }
                        case 18:
                            Session.Builder builder2 = this.session_ != null ? this.session_.toBuilder() : null;
                            Session session = (Session) codedInputStream.readMessage(Session.parser(), extensionRegistryLite);
                            this.session_ = session;
                            if (builder2 == null) {
                                break;
                            } else {
                                builder2.mergeFrom(session);
                                this.session_ = builder2.buildPartial();
                                break;
                            }
                        case 26:
                            Device.Builder builder3 = this.device_ != null ? this.device_.toBuilder() : null;
                            Device device = (Device) codedInputStream.readMessage(Device.parser(), extensionRegistryLite);
                            this.device_ = device;
                            if (builder3 == null) {
                                break;
                            } else {
                                builder3.mergeFrom(device);
                                this.device_ = builder3.buildPartial();
                                break;
                            }
                        case 34:
                            User.Builder builder4 = this.user_ != null ? this.user_.toBuilder() : null;
                            User user = (User) codedInputStream.readMessage(User.parser(), extensionRegistryLite);
                            this.user_ = user;
                            if (builder4 == null) {
                                break;
                            } else {
                                builder4.mergeFrom(user);
                                this.user_ = builder4.buildPartial();
                                break;
                            }
                        case 42:
                            Regs.Builder builder5 = this.regs_ != null ? this.regs_.toBuilder() : null;
                            Regs regs = (Regs) codedInputStream.readMessage(Regs.parser(), extensionRegistryLite);
                            this.regs_ = regs;
                            if (builder5 == null) {
                                break;
                            } else {
                                builder5.mergeFrom(regs);
                                this.regs_ = builder5.buildPartial();
                                break;
                            }
                        case 50:
                            Geo.Builder builder6 = this.geo_ != null ? this.geo_.toBuilder() : null;
                            Geo geo = (Geo) codedInputStream.readMessage(Geo.parser(), extensionRegistryLite);
                            this.geo_ = geo;
                            if (builder6 == null) {
                                break;
                            } else {
                                builder6.mergeFrom(geo);
                                this.geo_ = builder6.buildPartial();
                                break;
                            }
                        case 58:
                            Extra.Builder builder7 = this.ext_ != null ? this.ext_.toBuilder() : null;
                            Extra extra = (Extra) codedInputStream.readMessage(Extra.parser(), extensionRegistryLite);
                            this.ext_ = extra;
                            if (builder7 == null) {
                                break;
                            } else {
                                builder7.mergeFrom(extra);
                                this.ext_ = builder7.buildPartial();
                                break;
                            }
                        case 66:
                            this.impid_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 74:
                            this.mainId_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 82:
                            Get.Builder builder8 = this.get_ != null ? this.get_.toBuilder() : null;
                            Get get = (Get) codedInputStream.readMessage(Get.parser(), extensionRegistryLite);
                            this.get_ = get;
                            if (builder8 == null) {
                                break;
                            } else {
                                builder8.mergeFrom(get);
                                this.get_ = builder8.buildPartial();
                                break;
                            }
                        case 90:
                            Stats.Builder builder9 = this.stats_ != null ? this.stats_.toBuilder() : null;
                            Stats stats = (Stats) codedInputStream.readMessage(Stats.parser(), extensionRegistryLite);
                            this.stats_ = stats;
                            if (builder9 == null) {
                                break;
                            } else {
                                builder9.mergeFrom(stats);
                                this.stats_ = builder9.buildPartial();
                                break;
                            }
                        case 98:
                            Event.Builder builder10 = this.event_ != null ? this.event_.toBuilder() : null;
                            Event event = (Event) codedInputStream.readMessage(Event.parser(), extensionRegistryLite);
                            this.event_ = event;
                            if (builder10 == null) {
                                break;
                            } else {
                                builder10.mergeFrom(event);
                                this.event_ = builder10.buildPartial();
                                break;
                            }
                        case 104:
                            this.timestamp_ = codedInputStream.readInt64();
                            break;
                        case 114:
                            this.customState_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 122:
                            Services.Builder builder11 = this.servicesData_ != null ? this.servicesData_.toBuilder() : null;
                            Services services = (Services) codedInputStream.readMessage(Services.parser(), extensionRegistryLite);
                            this.servicesData_ = services;
                            if (builder11 == null) {
                                break;
                            } else {
                                builder11.mergeFrom(services);
                                this.servicesData_ = builder11.buildPartial();
                                break;
                            }
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
        return Api.internal_static_com_appodeal_ads_Request_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
    }

    public boolean hasApp() {
        return this.app_ != null;
    }

    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    public boolean hasSession() {
        return this.session_ != null;
    }

    public Session getSession() {
        Session session = this.session_;
        return session == null ? Session.getDefaultInstance() : session;
    }

    public boolean hasDevice() {
        return this.device_ != null;
    }

    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    public boolean hasUser() {
        return this.user_ != null;
    }

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public boolean hasRegs() {
        return this.regs_ != null;
    }

    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    public boolean hasGeo() {
        return this.geo_ != null;
    }

    public Geo getGeo() {
        Geo geo = this.geo_;
        return geo == null ? Geo.getDefaultInstance() : geo;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public Extra getExt() {
        Extra extra = this.ext_;
        return extra == null ? Extra.getDefaultInstance() : extra;
    }

    public String getImpid() {
        Object obj = this.impid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.impid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getImpidBytes() {
        Object obj = this.impid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.impid_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getMainId() {
        Object obj = this.mainId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.mainId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getMainIdBytes() {
        Object obj = this.mainId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.mainId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasGet() {
        return this.get_ != null;
    }

    public Get getGet() {
        Get get = this.get_;
        return get == null ? Get.getDefaultInstance() : get;
    }

    public boolean hasStats() {
        return this.stats_ != null;
    }

    public Stats getStats() {
        Stats stats = this.stats_;
        return stats == null ? Stats.getDefaultInstance() : stats;
    }

    public boolean hasEvent() {
        return this.event_ != null;
    }

    public Event getEvent() {
        Event event = this.event_;
        return event == null ? Event.getDefaultInstance() : event;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public String getCustomState() {
        Object obj = this.customState_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.customState_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCustomStateBytes() {
        Object obj = this.customState_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.customState_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasServicesData() {
        return this.servicesData_ != null;
    }

    public Services getServicesData() {
        Services services = this.servicesData_;
        return services == null ? Services.getDefaultInstance() : services;
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
        if (this.app_ != null) {
            codedOutputStream.writeMessage(1, getApp());
        }
        if (this.session_ != null) {
            codedOutputStream.writeMessage(2, getSession());
        }
        if (this.device_ != null) {
            codedOutputStream.writeMessage(3, getDevice());
        }
        if (this.user_ != null) {
            codedOutputStream.writeMessage(4, getUser());
        }
        if (this.regs_ != null) {
            codedOutputStream.writeMessage(5, getRegs());
        }
        if (this.geo_ != null) {
            codedOutputStream.writeMessage(6, getGeo());
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(7, getExt());
        }
        if (!getImpidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.impid_);
        }
        if (!getMainIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.mainId_);
        }
        if (this.get_ != null) {
            codedOutputStream.writeMessage(10, getGet());
        }
        if (this.stats_ != null) {
            codedOutputStream.writeMessage(11, getStats());
        }
        if (this.event_ != null) {
            codedOutputStream.writeMessage(12, getEvent());
        }
        long j = this.timestamp_;
        if (j != 0) {
            codedOutputStream.writeInt64(13, j);
        }
        if (!getCustomStateBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.customState_);
        }
        if (this.servicesData_ != null) {
            codedOutputStream.writeMessage(15, getServicesData());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.app_ != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getApp());
        }
        if (this.session_ != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getSession());
        }
        if (this.device_ != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getDevice());
        }
        if (this.user_ != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getUser());
        }
        if (this.regs_ != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getRegs());
        }
        if (this.geo_ != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getGeo());
        }
        if (this.ext_ != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getExt());
        }
        if (!getImpidBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(8, this.impid_);
        }
        if (!getMainIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(9, this.mainId_);
        }
        if (this.get_ != null) {
            i2 += CodedOutputStream.computeMessageSize(10, getGet());
        }
        if (this.stats_ != null) {
            i2 += CodedOutputStream.computeMessageSize(11, getStats());
        }
        if (this.event_ != null) {
            i2 += CodedOutputStream.computeMessageSize(12, getEvent());
        }
        long j = this.timestamp_;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(13, j);
        }
        if (!getCustomStateBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(14, this.customState_);
        }
        if (this.servicesData_ != null) {
            i2 += CodedOutputStream.computeMessageSize(15, getServicesData());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return super.equals(obj);
        }
        Request request = (Request) obj;
        if (hasApp() != request.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(request.getApp())) || hasSession() != request.hasSession()) {
            return false;
        }
        if ((hasSession() && !getSession().equals(request.getSession())) || hasDevice() != request.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !getDevice().equals(request.getDevice())) || hasUser() != request.hasUser()) {
            return false;
        }
        if ((hasUser() && !getUser().equals(request.getUser())) || hasRegs() != request.hasRegs()) {
            return false;
        }
        if ((hasRegs() && !getRegs().equals(request.getRegs())) || hasGeo() != request.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !getGeo().equals(request.getGeo())) || hasExt() != request.hasExt()) {
            return false;
        }
        if ((hasExt() && !getExt().equals(request.getExt())) || !getImpid().equals(request.getImpid()) || !getMainId().equals(request.getMainId()) || hasGet() != request.hasGet()) {
            return false;
        }
        if ((hasGet() && !getGet().equals(request.getGet())) || hasStats() != request.hasStats()) {
            return false;
        }
        if ((hasStats() && !getStats().equals(request.getStats())) || hasEvent() != request.hasEvent()) {
            return false;
        }
        if ((hasEvent() && !getEvent().equals(request.getEvent())) || getTimestamp() != request.getTimestamp() || !getCustomState().equals(request.getCustomState()) || hasServicesData() != request.hasServicesData()) {
            return false;
        }
        if ((!hasServicesData() || getServicesData().equals(request.getServicesData())) && this.unknownFields.equals(request.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasApp()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getApp().hashCode();
        }
        if (hasSession()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getSession().hashCode();
        }
        if (hasDevice()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getDevice().hashCode();
        }
        if (hasUser()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getUser().hashCode();
        }
        if (hasRegs()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getRegs().hashCode();
        }
        if (hasGeo()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getGeo().hashCode();
        }
        if (hasExt()) {
            hashCode = (((hashCode * 37) + 7) * 53) + getExt().hashCode();
        }
        int hashCode2 = (((((((hashCode * 37) + 8) * 53) + getImpid().hashCode()) * 37) + 9) * 53) + getMainId().hashCode();
        if (hasGet()) {
            hashCode2 = (((hashCode2 * 37) + 10) * 53) + getGet().hashCode();
        }
        if (hasStats()) {
            hashCode2 = (((hashCode2 * 37) + 11) * 53) + getStats().hashCode();
        }
        if (hasEvent()) {
            hashCode2 = (((hashCode2 * 37) + 12) * 53) + getEvent().hashCode();
        }
        int hashLong = (((((((hashCode2 * 37) + 13) * 53) + Internal.hashLong(getTimestamp())) * 37) + 14) * 53) + getCustomState().hashCode();
        if (hasServicesData()) {
            hashLong = (((hashLong * 37) + 15) * 53) + getServicesData().hashCode();
        }
        int hashCode3 = (hashLong * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestOrBuilder {
        private SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> appBuilder_;
        private App app_;
        private Object customState_;
        private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
        private Device device_;
        private SingleFieldBuilderV3<Event, Event.Builder, EventOrBuilder> eventBuilder_;
        private Event event_;
        private SingleFieldBuilderV3<Extra, Extra.Builder, ExtraOrBuilder> extBuilder_;
        private Extra ext_;
        private SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> geoBuilder_;
        private Geo geo_;
        private SingleFieldBuilderV3<Get, Get.Builder, GetOrBuilder> getBuilder_;
        private Get get_;
        private Object impid_;
        private Object mainId_;
        private SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> regsBuilder_;
        private Regs regs_;
        private SingleFieldBuilderV3<Services, Services.Builder, ServicesOrBuilder> servicesDataBuilder_;
        private Services servicesData_;
        private SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> sessionBuilder_;
        private Session session_;
        private SingleFieldBuilderV3<Stats, Stats.Builder, StatsOrBuilder> statsBuilder_;
        private Stats stats_;
        private long timestamp_;
        private SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> userBuilder_;
        private User user_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
        }

        private Builder() {
            this.impid_ = "";
            this.mainId_ = "";
            this.customState_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.impid_ = "";
            this.mainId_ = "";
            this.customState_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Request.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            this.impid_ = "";
            this.mainId_ = "";
            if (this.getBuilder_ == null) {
                this.get_ = null;
            } else {
                this.get_ = null;
                this.getBuilder_ = null;
            }
            if (this.statsBuilder_ == null) {
                this.stats_ = null;
            } else {
                this.stats_ = null;
                this.statsBuilder_ = null;
            }
            if (this.eventBuilder_ == null) {
                this.event_ = null;
            } else {
                this.event_ = null;
                this.eventBuilder_ = null;
            }
            this.timestamp_ = 0;
            this.customState_ = "";
            if (this.servicesDataBuilder_ == null) {
                this.servicesData_ = null;
            } else {
                this.servicesData_ = null;
                this.servicesDataBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Request_descriptor;
        }

        public Request getDefaultInstanceForType() {
            return Request.getDefaultInstance();
        }

        public Request build() {
            Request buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Request buildPartial() {
            Request request = new Request((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                App unused = request.app_ = this.app_;
            } else {
                App unused2 = request.app_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> singleFieldBuilderV32 = this.sessionBuilder_;
            if (singleFieldBuilderV32 == null) {
                Session unused3 = request.session_ = this.session_;
            } else {
                Session unused4 = request.session_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV33 = this.deviceBuilder_;
            if (singleFieldBuilderV33 == null) {
                Device unused5 = request.device_ = this.device_;
            } else {
                Device unused6 = request.device_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV34 = this.userBuilder_;
            if (singleFieldBuilderV34 == null) {
                User unused7 = request.user_ = this.user_;
            } else {
                User unused8 = request.user_ = singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV35 = this.regsBuilder_;
            if (singleFieldBuilderV35 == null) {
                Regs unused9 = request.regs_ = this.regs_;
            } else {
                Regs unused10 = request.regs_ = singleFieldBuilderV35.build();
            }
            SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV36 = this.geoBuilder_;
            if (singleFieldBuilderV36 == null) {
                Geo unused11 = request.geo_ = this.geo_;
            } else {
                Geo unused12 = request.geo_ = singleFieldBuilderV36.build();
            }
            SingleFieldBuilderV3<Extra, Extra.Builder, ExtraOrBuilder> singleFieldBuilderV37 = this.extBuilder_;
            if (singleFieldBuilderV37 == null) {
                Extra unused13 = request.ext_ = this.ext_;
            } else {
                Extra unused14 = request.ext_ = singleFieldBuilderV37.build();
            }
            Object unused15 = request.impid_ = this.impid_;
            Object unused16 = request.mainId_ = this.mainId_;
            SingleFieldBuilderV3<Get, Get.Builder, GetOrBuilder> singleFieldBuilderV38 = this.getBuilder_;
            if (singleFieldBuilderV38 == null) {
                Get unused17 = request.get_ = this.get_;
            } else {
                Get unused18 = request.get_ = singleFieldBuilderV38.build();
            }
            SingleFieldBuilderV3<Stats, Stats.Builder, StatsOrBuilder> singleFieldBuilderV39 = this.statsBuilder_;
            if (singleFieldBuilderV39 == null) {
                Stats unused19 = request.stats_ = this.stats_;
            } else {
                Stats unused20 = request.stats_ = singleFieldBuilderV39.build();
            }
            SingleFieldBuilderV3<Event, Event.Builder, EventOrBuilder> singleFieldBuilderV310 = this.eventBuilder_;
            if (singleFieldBuilderV310 == null) {
                Event unused21 = request.event_ = this.event_;
            } else {
                Event unused22 = request.event_ = singleFieldBuilderV310.build();
            }
            long unused23 = request.timestamp_ = this.timestamp_;
            Object unused24 = request.customState_ = this.customState_;
            SingleFieldBuilderV3<Services, Services.Builder, ServicesOrBuilder> singleFieldBuilderV311 = this.servicesDataBuilder_;
            if (singleFieldBuilderV311 == null) {
                Services unused25 = request.servicesData_ = this.servicesData_;
            } else {
                Services unused26 = request.servicesData_ = singleFieldBuilderV311.build();
            }
            onBuilt();
            return request;
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
            if (message instanceof Request) {
                return mergeFrom((Request) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Request request) {
            if (request == Request.getDefaultInstance()) {
                return this;
            }
            if (request.hasApp()) {
                mergeApp(request.getApp());
            }
            if (request.hasSession()) {
                mergeSession(request.getSession());
            }
            if (request.hasDevice()) {
                mergeDevice(request.getDevice());
            }
            if (request.hasUser()) {
                mergeUser(request.getUser());
            }
            if (request.hasRegs()) {
                mergeRegs(request.getRegs());
            }
            if (request.hasGeo()) {
                mergeGeo(request.getGeo());
            }
            if (request.hasExt()) {
                mergeExt(request.getExt());
            }
            if (!request.getImpid().isEmpty()) {
                this.impid_ = request.impid_;
                onChanged();
            }
            if (!request.getMainId().isEmpty()) {
                this.mainId_ = request.mainId_;
                onChanged();
            }
            if (request.hasGet()) {
                mergeGet(request.getGet());
            }
            if (request.hasStats()) {
                mergeStats(request.getStats());
            }
            if (request.hasEvent()) {
                mergeEvent(request.getEvent());
            }
            if (request.getTimestamp() != 0) {
                setTimestamp(request.getTimestamp());
            }
            if (!request.getCustomState().isEmpty()) {
                this.customState_ = request.customState_;
                onChanged();
            }
            if (request.hasServicesData()) {
                mergeServicesData(request.getServicesData());
            }
            mergeUnknownFields(request.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Request.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Request.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Request r3 = (com.appodeal.ads.api.Request) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Request) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Request r4 = (com.appodeal.ads.api.Request) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Request) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Request.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Request$Builder");
        }

        public Builder setApp(App app) {
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(app);
            } else if (app != null) {
                this.app_ = app;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeApp(App app) {
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                App app2 = this.app_;
                if (app2 != null) {
                    this.app_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
                } else {
                    this.app_ = app;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(app);
            }
            return this;
        }

        public Builder setSession(Session session) {
            SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(session);
            } else if (session != null) {
                this.session_ = session;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeSession(Session session) {
            SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> singleFieldBuilderV3 = this.sessionBuilder_;
            if (singleFieldBuilderV3 == null) {
                Session session2 = this.session_;
                if (session2 != null) {
                    this.session_ = Session.newBuilder(session2).mergeFrom(session).buildPartial();
                } else {
                    this.session_ = session;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(session);
            }
            return this;
        }

        public Builder setDevice(Device device) {
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(device);
            } else if (device != null) {
                this.device_ = device;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeDevice(Device device) {
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Device device2 = this.device_;
                if (device2 != null) {
                    this.device_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
                } else {
                    this.device_ = device;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(device);
            }
            return this;
        }

        public Builder setUser(User user) {
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(user);
            } else if (user != null) {
                this.user_ = user;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeUser(User user) {
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 == null) {
                User user2 = this.user_;
                if (user2 != null) {
                    this.user_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
                } else {
                    this.user_ = user;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(user);
            }
            return this;
        }

        public Builder setRegs(Regs regs) {
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(regs);
            } else if (regs != null) {
                this.regs_ = regs;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeRegs(Regs regs) {
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Regs regs2 = this.regs_;
                if (regs2 != null) {
                    this.regs_ = Regs.newBuilder(regs2).mergeFrom(regs).buildPartial();
                } else {
                    this.regs_ = regs;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(regs);
            }
            return this;
        }

        public Builder setGeo(Geo geo) {
            SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(geo);
            } else if (geo != null) {
                this.geo_ = geo;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeGeo(Geo geo) {
            SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(geo);
            }
            return this;
        }

        public Builder setExt(Extra extra) {
            SingleFieldBuilderV3<Extra, Extra.Builder, ExtraOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(extra);
            } else if (extra != null) {
                this.ext_ = extra;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeExt(Extra extra) {
            SingleFieldBuilderV3<Extra, Extra.Builder, ExtraOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Extra extra2 = this.ext_;
                if (extra2 != null) {
                    this.ext_ = Extra.newBuilder(extra2).mergeFrom(extra).buildPartial();
                } else {
                    this.ext_ = extra;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(extra);
            }
            return this;
        }

        public Builder setImpid(String str) {
            if (str != null) {
                this.impid_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setMainId(String str) {
            if (str != null) {
                this.mainId_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder mergeGet(Get get) {
            SingleFieldBuilderV3<Get, Get.Builder, GetOrBuilder> singleFieldBuilderV3 = this.getBuilder_;
            if (singleFieldBuilderV3 == null) {
                Get get2 = this.get_;
                if (get2 != null) {
                    this.get_ = Get.newBuilder(get2).mergeFrom(get).buildPartial();
                } else {
                    this.get_ = get;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(get);
            }
            return this;
        }

        public Builder setStats(Stats stats) {
            SingleFieldBuilderV3<Stats, Stats.Builder, StatsOrBuilder> singleFieldBuilderV3 = this.statsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(stats);
            } else if (stats != null) {
                this.stats_ = stats;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeStats(Stats stats) {
            SingleFieldBuilderV3<Stats, Stats.Builder, StatsOrBuilder> singleFieldBuilderV3 = this.statsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Stats stats2 = this.stats_;
                if (stats2 != null) {
                    this.stats_ = Stats.newBuilder(stats2).mergeFrom(stats).buildPartial();
                } else {
                    this.stats_ = stats;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stats);
            }
            return this;
        }

        public Builder mergeEvent(Event event) {
            SingleFieldBuilderV3<Event, Event.Builder, EventOrBuilder> singleFieldBuilderV3 = this.eventBuilder_;
            if (singleFieldBuilderV3 == null) {
                Event event2 = this.event_;
                if (event2 != null) {
                    this.event_ = Event.newBuilder(event2).mergeFrom(event).buildPartial();
                } else {
                    this.event_ = event;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(event);
            }
            return this;
        }

        public Builder setTimestamp(long j) {
            this.timestamp_ = j;
            onChanged();
            return this;
        }

        public Builder setCustomState(String str) {
            if (str != null) {
                this.customState_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setServicesData(Services services) {
            SingleFieldBuilderV3<Services, Services.Builder, ServicesOrBuilder> singleFieldBuilderV3 = this.servicesDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(services);
            } else if (services != null) {
                this.servicesData_ = services;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder mergeServicesData(Services services) {
            SingleFieldBuilderV3<Services, Services.Builder, ServicesOrBuilder> singleFieldBuilderV3 = this.servicesDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                Services services2 = this.servicesData_;
                if (services2 != null) {
                    this.servicesData_ = Services.newBuilder(services2).mergeFrom(services).buildPartial();
                } else {
                    this.servicesData_ = services;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(services);
            }
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Parser<Request> getParserForType() {
        return PARSER;
    }

    public Request getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
