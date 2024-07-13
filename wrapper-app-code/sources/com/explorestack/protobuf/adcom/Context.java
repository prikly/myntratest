package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Context extends GeneratedMessageV3 implements ContextOrBuilder {
    public static final int APP_FIELD_NUMBER = 1;
    private static final Context DEFAULT_INSTANCE = new Context();
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int EXT_PROTO_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final Parser<Context> PARSER = new AbstractParser<Context>() {
        public Context parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Context(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REGS_FIELD_NUMBER = 3;
    public static final int RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int USER_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public App app_;
    /* access modifiers changed from: private */
    public Device device_;
    /* access modifiers changed from: private */
    public List<Any> extProto_;
    /* access modifiers changed from: private */
    public Struct ext_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public Regs regs_;
    /* access modifiers changed from: private */
    public Restrictions restrictions_;
    /* access modifiers changed from: private */
    public User user_;

    public interface AppOrBuilder extends MessageOrBuilder {
        String getBundle();

        ByteString getBundleBytes();

        String getCat(int i);

        ByteString getCatBytes(int i);

        int getCatCount();

        List<String> getCatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

        App.Content getContent();

        App.ContentOrBuilder getContentOrBuilder();

        String getDomain();

        ByteString getDomainBytes();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        String getName();

        ByteString getNameBytes();

        String getPagecat(int i);

        ByteString getPagecatBytes(int i);

        int getPagecatCount();

        List<String> getPagecatList();

        boolean getPaid();

        boolean getPrivpolicy();

        App.Publisher getPub();

        App.PublisherOrBuilder getPubOrBuilder();

        String getSectcat(int i);

        ByteString getSectcatBytes(int i);

        int getSectcatCount();

        List<String> getSectcatList();

        String getStoreid();

        ByteString getStoreidBytes();

        String getStoreurl();

        ByteString getStoreurlBytes();

        String getVer();

        ByteString getVerBytes();

        boolean hasContent();

        boolean hasExt();

        boolean hasPub();
    }

    public interface DataOrBuilder extends MessageOrBuilder {
        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        Data.Segment getSegment(int i);

        int getSegmentCount();

        List<Data.Segment> getSegmentList();

        Data.SegmentOrBuilder getSegmentOrBuilder(int i);

        List<? extends Data.SegmentOrBuilder> getSegmentOrBuilderList();

        boolean hasExt();
    }

    public interface DeviceOrBuilder extends MessageOrBuilder {
        String getCarrier();

        ByteString getCarrierBytes();

        ConnectionType getContype();

        int getContypeValue();

        boolean getDnt();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        boolean getGeofetch();

        int getH();

        String getHwv();

        ByteString getHwvBytes();

        String getIfa();

        ByteString getIfaBytes();

        String getIp();

        ByteString getIpBytes();

        boolean getIptr();

        String getIpv6();

        ByteString getIpv6Bytes();

        boolean getJs();

        String getLang();

        ByteString getLangBytes();

        boolean getLmt();

        String getMake();

        ByteString getMakeBytes();

        String getMccmnc();

        ByteString getMccmncBytes();

        String getMccmncsim();

        ByteString getMccmncsimBytes();

        String getModel();

        ByteString getModelBytes();

        OS getOs();

        int getOsValue();

        String getOsv();

        ByteString getOsvBytes();

        int getPpi();

        float getPxratio();

        DeviceType getType();

        int getTypeValue();

        String getUa();

        ByteString getUaBytes();

        int getW();

        String getXff();

        ByteString getXffBytes();

        boolean hasExt();

        boolean hasGeo();
    }

    public interface GeoOrBuilder extends MessageOrBuilder {
        int getAccur();

        String getCity();

        ByteString getCityBytes();

        String getCountry();

        ByteString getCountryBytes();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        IpLocationService getIpserv();

        int getIpservValue();

        long getLastfix();

        float getLat();

        float getLon();

        String getMetro();

        ByteString getMetroBytes();

        String getRegion();

        ByteString getRegionBytes();

        LocationType getType();

        int getTypeValue();

        int getUtcoffset();

        String getZip();

        ByteString getZipBytes();

        boolean hasExt();
    }

    public interface RegsOrBuilder extends MessageOrBuilder {
        boolean getCoppa();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        boolean getGdpr();

        boolean hasExt();
    }

    public interface RestrictionsOrBuilder extends MessageOrBuilder {
        String getBadv(int i);

        ByteString getBadvBytes(int i);

        int getBadvCount();

        List<String> getBadvList();

        String getBapp(int i);

        ByteString getBappBytes(int i);

        int getBappCount();

        List<String> getBappList();

        CreativeAttribute getBattr(int i);

        int getBattrCount();

        List<CreativeAttribute> getBattrList();

        int getBattrValue(int i);

        List<Integer> getBattrValueList();

        String getBcat(int i);

        ByteString getBcatBytes(int i);

        int getBcatCount();

        List<String> getBcatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        boolean hasExt();
    }

    public interface UserOrBuilder extends MessageOrBuilder {
        String getBuyeruid();

        ByteString getBuyeruidBytes();

        String getConsent();

        ByteString getConsentBytes();

        Data getData(int i);

        int getDataCount();

        List<Data> getDataList();

        DataOrBuilder getDataOrBuilder(int i);

        List<? extends DataOrBuilder> getDataOrBuilderList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getGender();

        ByteString getGenderBytes();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        int getYob();

        boolean hasExt();

        boolean hasGeo();
    }

    private Context(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Context() {
        this.memoizedIsInitialized = -1;
        this.extProto_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Context();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Context(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            App.Builder builder = this.app_ != null ? this.app_.toBuilder() : null;
                            App app = (App) codedInputStream.readMessage(App.parser(), extensionRegistryLite);
                            this.app_ = app;
                            if (builder != null) {
                                builder.mergeFrom(app);
                                this.app_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            Device.Builder builder2 = this.device_ != null ? this.device_.toBuilder() : null;
                            Device device = (Device) codedInputStream.readMessage(Device.parser(), extensionRegistryLite);
                            this.device_ = device;
                            if (builder2 != null) {
                                builder2.mergeFrom(device);
                                this.device_ = builder2.buildPartial();
                            }
                        } else if (readTag == 26) {
                            Regs.Builder builder3 = this.regs_ != null ? this.regs_.toBuilder() : null;
                            Regs regs = (Regs) codedInputStream.readMessage(Regs.parser(), extensionRegistryLite);
                            this.regs_ = regs;
                            if (builder3 != null) {
                                builder3.mergeFrom(regs);
                                this.regs_ = builder3.buildPartial();
                            }
                        } else if (readTag == 34) {
                            Restrictions.Builder builder4 = this.restrictions_ != null ? this.restrictions_.toBuilder() : null;
                            Restrictions restrictions = (Restrictions) codedInputStream.readMessage(Restrictions.parser(), extensionRegistryLite);
                            this.restrictions_ = restrictions;
                            if (builder4 != null) {
                                builder4.mergeFrom(restrictions);
                                this.restrictions_ = builder4.buildPartial();
                            }
                        } else if (readTag == 42) {
                            User.Builder builder5 = this.user_ != null ? this.user_.toBuilder() : null;
                            User user = (User) codedInputStream.readMessage(User.parser(), extensionRegistryLite);
                            this.user_ = user;
                            if (builder5 != null) {
                                builder5.mergeFrom(user);
                                this.user_ = builder5.buildPartial();
                            }
                        } else if (readTag == 50) {
                            if (!z2 || !true) {
                                this.extProto_ = new ArrayList();
                                z2 |= true;
                            }
                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                        } else if (readTag == 58) {
                            Struct.Builder builder6 = this.ext_ != null ? this.ext_.toBuilder() : null;
                            Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct);
                                this.ext_ = builder6.buildPartial();
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
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
    }

    public static final class App extends GeneratedMessageV3 implements AppOrBuilder {
        public static final int BUNDLE_FIELD_NUMBER = 12;
        public static final int CATTAX_FIELD_NUMBER = 9;
        public static final int CAT_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 4;
        private static final App DEFAULT_INSTANCE = new App();
        public static final int DOMAIN_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 18;
        public static final int EXT_PROTO_FIELD_NUMBER = 17;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PAGECAT_FIELD_NUMBER = 8;
        public static final int PAID_FIELD_NUMBER = 16;
        /* access modifiers changed from: private */
        public static final Parser<App> PARSER = new AbstractParser<App>() {
            public App parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new App(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PRIVPOLICY_FIELD_NUMBER = 10;
        public static final int PUB_FIELD_NUMBER = 3;
        public static final int SECTCAT_FIELD_NUMBER = 7;
        public static final int STOREID_FIELD_NUMBER = 13;
        public static final int STOREURL_FIELD_NUMBER = 14;
        public static final int VER_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object bundle_;
        /* access modifiers changed from: private */
        public LazyStringList cat_;
        /* access modifiers changed from: private */
        public int cattax_;
        /* access modifiers changed from: private */
        public Content content_;
        /* access modifiers changed from: private */
        public volatile Object domain_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public volatile Object id_;
        /* access modifiers changed from: private */
        public volatile Object keywords_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object name_;
        /* access modifiers changed from: private */
        public LazyStringList pagecat_;
        /* access modifiers changed from: private */
        public boolean paid_;
        /* access modifiers changed from: private */
        public boolean privpolicy_;
        /* access modifiers changed from: private */
        public Publisher pub_;
        /* access modifiers changed from: private */
        public LazyStringList sectcat_;
        /* access modifiers changed from: private */
        public volatile Object storeid_;
        /* access modifiers changed from: private */
        public volatile Object storeurl_;
        /* access modifiers changed from: private */
        public volatile Object ver_;

        public interface ContentOrBuilder extends MessageOrBuilder {
            String getAlbum();

            ByteString getAlbumBytes();

            String getArtist();

            ByteString getArtistBytes();

            String getCat(int i);

            ByteString getCatBytes(int i);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            ContentContext getContext();

            int getContextValue();

            Data getData(int i);

            int getDataCount();

            List<Data> getDataList();

            DataOrBuilder getDataOrBuilder(int i);

            List<? extends DataOrBuilder> getDataOrBuilderList();

            boolean getEmbed();

            int getEpisode();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getGenre();

            ByteString getGenreBytes();

            String getId();

            ByteString getIdBytes();

            String getIsrc();

            ByteString getIsrcBytes();

            String getKeywords();

            ByteString getKeywordsBytes();

            String getLang();

            ByteString getLangBytes();

            int getLen();

            boolean getLive();

            MediaRating getMrating();

            int getMratingValue();

            ProductionQuality getProdq();

            int getProdqValue();

            Content.Producer getProducer();

            Content.ProducerOrBuilder getProducerOrBuilder();

            String getRating();

            ByteString getRatingBytes();

            String getSeason();

            ByteString getSeasonBytes();

            String getSeries();

            ByteString getSeriesBytes();

            int getSrcrel();

            String getTitle();

            ByteString getTitleBytes();

            String getUrating();

            ByteString getUratingBytes();

            String getUrl();

            ByteString getUrlBytes();

            boolean hasExt();

            boolean hasProducer();
        }

        public interface PublisherOrBuilder extends MessageOrBuilder {
            String getCat(int i);

            ByteString getCatBytes(int i);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            String getDomain();

            ByteString getDomainBytes();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasExt();
        }

        private App(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private App() {
            this.memoizedIsInitialized = -1;
            this.id_ = "";
            this.name_ = "";
            this.domain_ = "";
            this.cat_ = LazyStringArrayList.EMPTY;
            this.sectcat_ = LazyStringArrayList.EMPTY;
            this.pagecat_ = LazyStringArrayList.EMPTY;
            this.cattax_ = 0;
            this.keywords_ = "";
            this.bundle_ = "";
            this.storeid_ = "";
            this.storeurl_ = "";
            this.ver_ = "";
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new App();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private App(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.id_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                Publisher.Builder builder = this.pub_ != null ? this.pub_.toBuilder() : null;
                                Publisher publisher = (Publisher) codedInputStream.readMessage(Publisher.parser(), extensionRegistryLite);
                                this.pub_ = publisher;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(publisher);
                                    this.pub_ = builder.buildPartial();
                                    break;
                                }
                            case 34:
                                Content.Builder builder2 = this.content_ != null ? this.content_.toBuilder() : null;
                                Content content = (Content) codedInputStream.readMessage(Content.parser(), extensionRegistryLite);
                                this.content_ = content;
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(content);
                                    this.content_ = builder2.buildPartial();
                                    break;
                                }
                            case 42:
                                this.domain_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.cat_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.cat_.add(readStringRequireUtf8);
                                break;
                            case 58:
                                String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.sectcat_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.sectcat_.add(readStringRequireUtf82);
                                break;
                            case 66:
                                String readStringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.pagecat_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.pagecat_.add(readStringRequireUtf83);
                                break;
                            case 72:
                                this.cattax_ = codedInputStream.readEnum();
                                break;
                            case 80:
                                this.privpolicy_ = codedInputStream.readBool();
                                break;
                            case 90:
                                this.keywords_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.bundle_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 106:
                                this.storeid_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 114:
                                this.storeurl_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 122:
                                this.ver_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 128:
                                this.paid_ = codedInputStream.readBool();
                                break;
                            case 138:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 146:
                                Struct.Builder builder3 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(struct);
                                    this.ext_ = builder3.buildPartial();
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
                        if (z2 && true) {
                            this.cat_ = this.cat_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.sectcat_ = this.sectcat_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.pagecat_ = this.pagecat_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.sectcat_ = this.sectcat_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.pagecat_ = this.pagecat_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
        }

        public static final class Publisher extends GeneratedMessageV3 implements PublisherOrBuilder {
            public static final int CATTAX_FIELD_NUMBER = 5;
            public static final int CAT_FIELD_NUMBER = 4;
            private static final Publisher DEFAULT_INSTANCE = new Publisher();
            public static final int DOMAIN_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<Publisher> PARSER = new AbstractParser<Publisher>() {
                public Publisher parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Publisher(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public LazyStringList cat_;
            /* access modifiers changed from: private */
            public int cattax_;
            /* access modifiers changed from: private */
            public volatile Object domain_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public volatile Object id_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public volatile Object name_;

            private Publisher(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Publisher() {
                this.memoizedIsInitialized = -1;
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                this.cat_ = LazyStringArrayList.EMPTY;
                this.cattax_ = 0;
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Publisher();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Publisher(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.domain_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!z2 || !true) {
                                        this.cat_ = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.cat_.add(readStringRequireUtf8);
                                } else if (readTag == 40) {
                                    this.cattax_ = codedInputStream.readEnum();
                                } else if (readTag == 50) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 58) {
                                    Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder != null) {
                                        builder.mergeFrom(struct);
                                        this.ext_ = builder.buildPartial();
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
                            if (z2 && true) {
                                this.cat_ = this.cat_.getUnmodifiableView();
                            }
                            if (z2 && true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_fieldAccessorTable.ensureFieldAccessorsInitialized(Publisher.class, Builder.class);
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public ProtocolStringList getCatList() {
                return this.cat_;
            }

            public int getCatCount() {
                return this.cat_.size();
            }

            public String getCat(int i) {
                return (String) this.cat_.get(i);
            }

            public ByteString getCatBytes(int i) {
                return this.cat_.getByteString(i);
            }

            public int getCattaxValue() {
                return this.cattax_;
            }

            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
            }

            public boolean hasExt() {
                return this.ext_ != null;
            }

            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
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
                if (!getIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.domain_);
                }
                for (int i = 0; i < this.cat_.size(); i++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.cat_.getRaw(i));
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    codedOutputStream.writeEnum(5, this.cattax_);
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    codedOutputStream.writeMessage(6, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(7, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                if (!getNameBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(3, this.domain_);
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.cat_.size(); i3++) {
                    i2 += computeStringSizeNoTag(this.cat_.getRaw(i3));
                }
                int size = computeStringSize + i2 + (getCatList().size() * 1);
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(5, this.cattax_);
                }
                for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                    size += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i4));
                }
                if (this.ext_ != null) {
                    size += CodedOutputStream.computeMessageSize(7, getExt());
                }
                int serializedSize = size + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Publisher)) {
                    return super.equals(obj);
                }
                Publisher publisher = (Publisher) obj;
                if (!getId().equals(publisher.getId()) || !getName().equals(publisher.getName()) || !getDomain().equals(publisher.getDomain()) || !getCatList().equals(publisher.getCatList()) || this.cattax_ != publisher.cattax_ || hasExt() != publisher.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(publisher.getExt())) && getExtProtoList().equals(publisher.getExtProtoList()) && this.unknownFields.equals(publisher.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getDomain().hashCode();
                if (getCatCount() > 0) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getCatList().hashCode();
                }
                int i = (((hashCode * 37) + 5) * 53) + this.cattax_;
                if (hasExt()) {
                    i = (((i * 37) + 7) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    i = (((i * 37) + 6) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (i * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Publisher parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Publisher parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Publisher parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Publisher parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Publisher parseFrom(InputStream inputStream) throws IOException {
                return (Publisher) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Publisher) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Publisher) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Publisher) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Publisher parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Publisher) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Publisher parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Publisher) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Publisher publisher) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(publisher);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PublisherOrBuilder {
                private int bitField0_;
                private LazyStringList cat_;
                private int cattax_;
                private Object domain_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_fieldAccessorTable.ensureFieldAccessorsInitialized(Publisher.class, Builder.class);
                }

                private Builder() {
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Publisher.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -2;
                    this.cattax_ = 0;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Publisher_descriptor;
                }

                public Publisher getDefaultInstanceForType() {
                    return Publisher.getDefaultInstance();
                }

                public Publisher build() {
                    Publisher buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Publisher buildPartial() {
                    Publisher publisher = new Publisher((GeneratedMessageV3.Builder) this);
                    Object unused = publisher.id_ = this.id_;
                    Object unused2 = publisher.name_ = this.name_;
                    Object unused3 = publisher.domain_ = this.domain_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    LazyStringList unused4 = publisher.cat_ = this.cat_;
                    int unused5 = publisher.cattax_ = this.cattax_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused6 = publisher.ext_ = this.ext_;
                    } else {
                        Struct unused7 = publisher.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        List unused8 = publisher.extProto_ = this.extProto_;
                    } else {
                        List unused9 = publisher.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return publisher;
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
                    if (message instanceof Publisher) {
                        return mergeFrom((Publisher) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Publisher publisher) {
                    if (publisher == Publisher.getDefaultInstance()) {
                        return this;
                    }
                    if (!publisher.getId().isEmpty()) {
                        this.id_ = publisher.id_;
                        onChanged();
                    }
                    if (!publisher.getName().isEmpty()) {
                        this.name_ = publisher.name_;
                        onChanged();
                    }
                    if (!publisher.getDomain().isEmpty()) {
                        this.domain_ = publisher.domain_;
                        onChanged();
                    }
                    if (!publisher.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = publisher.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(publisher.cat_);
                        }
                        onChanged();
                    }
                    if (publisher.cattax_ != 0) {
                        setCattaxValue(publisher.getCattaxValue());
                    }
                    if (publisher.hasExt()) {
                        mergeExt(publisher.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!publisher.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = publisher.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(publisher.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!publisher.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = publisher.extProto_;
                            this.bitField0_ &= -3;
                            if (Publisher.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(publisher.extProto_);
                        }
                    }
                    mergeUnknownFields(publisher.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Context.App.Publisher.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.App.Publisher.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Context$App$Publisher r3 = (com.explorestack.protobuf.adcom.Context.App.Publisher) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App.Publisher) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Context$App$Publisher r4 = (com.explorestack.protobuf.adcom.Context.App.Publisher) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App.Publisher) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Publisher.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$App$Publisher$Builder");
                }

                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setId(String str) {
                    if (str != null) {
                        this.id_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearId() {
                    this.id_ = Publisher.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    if (byteString != null) {
                        Publisher.checkByteStringIsUtf8(byteString);
                        this.id_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setName(String str) {
                    if (str != null) {
                        this.name_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearName() {
                    this.name_ = Publisher.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    if (byteString != null) {
                        Publisher.checkByteStringIsUtf8(byteString);
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setDomain(String str) {
                    if (str != null) {
                        this.domain_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearDomain() {
                    this.domain_ = Publisher.getDefaultInstance().getDomain();
                    onChanged();
                    return this;
                }

                public Builder setDomainBytes(ByteString byteString) {
                    if (byteString != null) {
                        Publisher.checkByteStringIsUtf8(byteString);
                        this.domain_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new LazyStringArrayList(this.cat_);
                        this.bitField0_ |= 1;
                    }
                }

                public ProtocolStringList getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                public int getCatCount() {
                    return this.cat_.size();
                }

                public String getCat(int i) {
                    return (String) this.cat_.get(i);
                }

                public ByteString getCatBytes(int i) {
                    return this.cat_.getByteString(i);
                }

                public Builder setCat(int i, String str) {
                    if (str != null) {
                        ensureCatIsMutable();
                        this.cat_.set(i, str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addCat(String str) {
                    if (str != null) {
                        ensureCatIsMutable();
                        this.cat_.add(str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllCat(Iterable<String> iterable) {
                    ensureCatIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.cat_);
                    onChanged();
                    return this;
                }

                public Builder clearCat() {
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder addCatBytes(ByteString byteString) {
                    if (byteString != null) {
                        Publisher.checkByteStringIsUtf8(byteString);
                        ensureCatIsMutable();
                        this.cat_.add(byteString);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getCattaxValue() {
                    return this.cattax_;
                }

                public Builder setCattaxValue(int i) {
                    this.cattax_ = i;
                    onChanged();
                    return this;
                }

                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
                }

                public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                    if (categoryTaxonomy != null) {
                        this.cattax_ = categoryTaxonomy.getNumber();
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                public Struct getExt() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Builder setExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(struct);
                    } else if (struct != null) {
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(struct);
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return getExtFieldBuilder().getBuilder();
                }

                public StructOrBuilder getExtOrBuilder() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static Publisher getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Publisher> parser() {
                return PARSER;
            }

            public Parser<Publisher> getParserForType() {
                return PARSER;
            }

            public Publisher getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class Content extends GeneratedMessageV3 implements ContentOrBuilder {
            public static final int ALBUM_FIELD_NUMBER = 8;
            public static final int ARTIST_FIELD_NUMBER = 6;
            public static final int CATTAX_FIELD_NUMBER = 12;
            public static final int CAT_FIELD_NUMBER = 11;
            public static final int CONTEXT_FIELD_NUMBER = 14;
            public static final int DATA_FIELD_NUMBER = 25;
            private static final Content DEFAULT_INSTANCE = new Content();
            public static final int EMBED_FIELD_NUMBER = 23;
            public static final int EPISODE_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 27;
            public static final int EXT_PROTO_FIELD_NUMBER = 26;
            public static final int GENRE_FIELD_NUMBER = 7;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ISRC_FIELD_NUMBER = 9;
            public static final int KEYWORDS_FIELD_NUMBER = 18;
            public static final int LANG_FIELD_NUMBER = 22;
            public static final int LEN_FIELD_NUMBER = 21;
            public static final int LIVE_FIELD_NUMBER = 19;
            public static final int MRATING_FIELD_NUMBER = 17;
            /* access modifiers changed from: private */
            public static final Parser<Content> PARSER = new AbstractParser<Content>() {
                public Content parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Content(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int PRODQ_FIELD_NUMBER = 13;
            public static final int PRODUCER_FIELD_NUMBER = 24;
            public static final int RATING_FIELD_NUMBER = 15;
            public static final int SEASON_FIELD_NUMBER = 5;
            public static final int SERIES_FIELD_NUMBER = 4;
            public static final int SRCREL_FIELD_NUMBER = 20;
            public static final int TITLE_FIELD_NUMBER = 3;
            public static final int URATING_FIELD_NUMBER = 16;
            public static final int URL_FIELD_NUMBER = 10;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public volatile Object album_;
            /* access modifiers changed from: private */
            public volatile Object artist_;
            /* access modifiers changed from: private */
            public LazyStringList cat_;
            /* access modifiers changed from: private */
            public int cattax_;
            /* access modifiers changed from: private */
            public int context_;
            /* access modifiers changed from: private */
            public List<Data> data_;
            /* access modifiers changed from: private */
            public boolean embed_;
            /* access modifiers changed from: private */
            public int episode_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public volatile Object genre_;
            /* access modifiers changed from: private */
            public volatile Object id_;
            /* access modifiers changed from: private */
            public volatile Object isrc_;
            /* access modifiers changed from: private */
            public volatile Object keywords_;
            /* access modifiers changed from: private */
            public volatile Object lang_;
            /* access modifiers changed from: private */
            public int len_;
            /* access modifiers changed from: private */
            public boolean live_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public int mrating_;
            /* access modifiers changed from: private */
            public int prodq_;
            /* access modifiers changed from: private */
            public Producer producer_;
            /* access modifiers changed from: private */
            public volatile Object rating_;
            /* access modifiers changed from: private */
            public volatile Object season_;
            /* access modifiers changed from: private */
            public volatile Object series_;
            /* access modifiers changed from: private */
            public int srcrel_;
            /* access modifiers changed from: private */
            public volatile Object title_;
            /* access modifiers changed from: private */
            public volatile Object urating_;
            /* access modifiers changed from: private */
            public volatile Object url_;

            public interface ProducerOrBuilder extends MessageOrBuilder {
                String getCat(int i);

                ByteString getCatBytes(int i);

                int getCatCount();

                List<String> getCatList();

                CategoryTaxonomy getCattax();

                int getCattaxValue();

                String getDomain();

                ByteString getDomainBytes();

                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                String getId();

                ByteString getIdBytes();

                String getName();

                ByteString getNameBytes();

                boolean hasExt();
            }

            private Content(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Content() {
                this.memoizedIsInitialized = -1;
                this.id_ = "";
                this.title_ = "";
                this.series_ = "";
                this.season_ = "";
                this.artist_ = "";
                this.genre_ = "";
                this.album_ = "";
                this.isrc_ = "";
                this.url_ = "";
                this.cat_ = LazyStringArrayList.EMPTY;
                this.cattax_ = 0;
                this.prodq_ = 0;
                this.context_ = 0;
                this.rating_ = "";
                this.urating_ = "";
                this.mrating_ = 0;
                this.keywords_ = "";
                this.lang_ = "";
                this.data_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Content();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Content(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 16:
                                    this.episode_ = codedInputStream.readUInt32();
                                    break;
                                case 26:
                                    this.title_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 34:
                                    this.series_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 42:
                                    this.season_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 50:
                                    this.artist_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 58:
                                    this.genre_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 66:
                                    this.album_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 74:
                                    this.isrc_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 82:
                                    this.url_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 90:
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!z2 || !true) {
                                        this.cat_ = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.cat_.add(readStringRequireUtf8);
                                    break;
                                case 96:
                                    this.cattax_ = codedInputStream.readEnum();
                                    break;
                                case 104:
                                    this.prodq_ = codedInputStream.readEnum();
                                    break;
                                case 112:
                                    this.context_ = codedInputStream.readEnum();
                                    break;
                                case 122:
                                    this.rating_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 130:
                                    this.urating_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 136:
                                    this.mrating_ = codedInputStream.readEnum();
                                    break;
                                case 146:
                                    this.keywords_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 152:
                                    this.live_ = codedInputStream.readBool();
                                    break;
                                case 160:
                                    this.srcrel_ = codedInputStream.readUInt32();
                                    break;
                                case 168:
                                    this.len_ = codedInputStream.readUInt32();
                                    break;
                                case 178:
                                    this.lang_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 184:
                                    this.embed_ = codedInputStream.readBool();
                                    break;
                                case 194:
                                    Producer.Builder builder = this.producer_ != null ? this.producer_.toBuilder() : null;
                                    Producer producer = (Producer) codedInputStream.readMessage(Producer.parser(), extensionRegistryLite);
                                    this.producer_ = producer;
                                    if (builder == null) {
                                        break;
                                    } else {
                                        builder.mergeFrom(producer);
                                        this.producer_ = builder.buildPartial();
                                        break;
                                    }
                                case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                                    if (!z2 || !true) {
                                        this.data_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.data_.add(codedInputStream.readMessage(Data.parser(), extensionRegistryLite));
                                    break;
                                case LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE:
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    break;
                                case 218:
                                    Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder2 == null) {
                                        break;
                                    } else {
                                        builder2.mergeFrom(struct);
                                        this.ext_ = builder2.buildPartial();
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
                            if (z2 && true) {
                                this.cat_ = this.cat_.getUnmodifiableView();
                            }
                            if (z2 && true) {
                                this.data_ = Collections.unmodifiableList(this.data_);
                            }
                            if (z2 && true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_fieldAccessorTable.ensureFieldAccessorsInitialized(Content.class, Builder.class);
            }

            public static final class Producer extends GeneratedMessageV3 implements ProducerOrBuilder {
                public static final int CATTAX_FIELD_NUMBER = 5;
                public static final int CAT_FIELD_NUMBER = 4;
                private static final Producer DEFAULT_INSTANCE = new Producer();
                public static final int DOMAIN_FIELD_NUMBER = 3;
                public static final int EXT_FIELD_NUMBER = 7;
                public static final int EXT_PROTO_FIELD_NUMBER = 6;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int NAME_FIELD_NUMBER = 2;
                /* access modifiers changed from: private */
                public static final Parser<Producer> PARSER = new AbstractParser<Producer>() {
                    public Producer parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Producer(codedInputStream, extensionRegistryLite);
                    }
                };
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public LazyStringList cat_;
                /* access modifiers changed from: private */
                public int cattax_;
                /* access modifiers changed from: private */
                public volatile Object domain_;
                /* access modifiers changed from: private */
                public List<Any> extProto_;
                /* access modifiers changed from: private */
                public Struct ext_;
                /* access modifiers changed from: private */
                public volatile Object id_;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public volatile Object name_;

                private Producer(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private Producer() {
                    this.memoizedIsInitialized = -1;
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.emptyList();
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Producer();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private Producer(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this();
                    if (extensionRegistryLite != null) {
                        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                        boolean z = false;
                        boolean z2 = false;
                        while (!z) {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.id_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 18) {
                                        this.name_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        this.domain_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 34) {
                                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                        if (!z2 || !true) {
                                            this.cat_ = new LazyStringArrayList();
                                            z2 |= true;
                                        }
                                        this.cat_.add(readStringRequireUtf8);
                                    } else if (readTag == 40) {
                                        this.cattax_ = codedInputStream.readEnum();
                                    } else if (readTag == 50) {
                                        if (!z2 || !true) {
                                            this.extProto_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    } else if (readTag == 58) {
                                        Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                        Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                        this.ext_ = struct;
                                        if (builder != null) {
                                            builder.mergeFrom(struct);
                                            this.ext_ = builder.buildPartial();
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
                                if (z2 && true) {
                                    this.cat_ = this.cat_.getUnmodifiableView();
                                }
                                if (z2 && true) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if (z2 && true) {
                            this.cat_ = this.cat_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        return;
                    }
                    throw null;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_fieldAccessorTable.ensureFieldAccessorsInitialized(Producer.class, Builder.class);
                }

                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public ProtocolStringList getCatList() {
                    return this.cat_;
                }

                public int getCatCount() {
                    return this.cat_.size();
                }

                public String getCat(int i) {
                    return (String) this.cat_.get(i);
                }

                public ByteString getCatBytes(int i) {
                    return this.cat_.getByteString(i);
                }

                public int getCattaxValue() {
                    return this.cattax_;
                }

                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
                }

                public boolean hasExt() {
                    return this.ext_ != null;
                }

                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public StructOrBuilder getExtOrBuilder() {
                    return getExt();
                }

                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                public Any getExtProto(int i) {
                    return this.extProto_.get(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    return this.extProto_.get(i);
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
                    if (!getIdBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
                    }
                    if (!getNameBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.domain_);
                    }
                    for (int i = 0; i < this.cat_.size(); i++) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.cat_.getRaw(i));
                    }
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        codedOutputStream.writeEnum(5, this.cattax_);
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        codedOutputStream.writeMessage(6, this.extProto_.get(i2));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.writeMessage(7, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                    if (!getNameBytes().isEmpty()) {
                        computeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        computeStringSize += GeneratedMessageV3.computeStringSize(3, this.domain_);
                    }
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.cat_.size(); i3++) {
                        i2 += computeStringSizeNoTag(this.cat_.getRaw(i3));
                    }
                    int size = computeStringSize + i2 + (getCatList().size() * 1);
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        size += CodedOutputStream.computeEnumSize(5, this.cattax_);
                    }
                    for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                        size += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i4));
                    }
                    if (this.ext_ != null) {
                        size += CodedOutputStream.computeMessageSize(7, getExt());
                    }
                    int serializedSize = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Producer)) {
                        return super.equals(obj);
                    }
                    Producer producer = (Producer) obj;
                    if (!getId().equals(producer.getId()) || !getName().equals(producer.getName()) || !getDomain().equals(producer.getDomain()) || !getCatList().equals(producer.getCatList()) || this.cattax_ != producer.cattax_ || hasExt() != producer.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(producer.getExt())) && getExtProtoList().equals(producer.getExtProtoList()) && this.unknownFields.equals(producer.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getDomain().hashCode();
                    if (getCatCount() > 0) {
                        hashCode = (((hashCode * 37) + 4) * 53) + getCatList().hashCode();
                    }
                    int i = (((hashCode * 37) + 5) * 53) + this.cattax_;
                    if (hasExt()) {
                        i = (((i * 37) + 7) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        i = (((i * 37) + 6) * 53) + getExtProtoList().hashCode();
                    }
                    int hashCode2 = (i * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode2;
                    return hashCode2;
                }

                public static Producer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static Producer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static Producer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static Producer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static Producer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Producer parseFrom(InputStream inputStream) throws IOException {
                    return (Producer) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Producer) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Producer parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Producer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Producer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Producer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Producer parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Producer) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Producer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Producer) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(Producer producer) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(producer);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ProducerOrBuilder {
                    private int bitField0_;
                    private LazyStringList cat_;
                    private int cattax_;
                    private Object domain_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object id_;
                    private Object name_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_fieldAccessorTable.ensureFieldAccessorsInitialized(Producer.class, Builder.class);
                    }

                    private Builder() {
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = LazyStringArrayList.EMPTY;
                        this.cattax_ = 0;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = LazyStringArrayList.EMPTY;
                        this.cattax_ = 0;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (Producer.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder clear() {
                        super.clear();
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -2;
                        this.cattax_ = 0;
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -3;
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Descriptors.Descriptor getDescriptorForType() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_Producer_descriptor;
                    }

                    public Producer getDefaultInstanceForType() {
                        return Producer.getDefaultInstance();
                    }

                    public Producer build() {
                        Producer buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public Producer buildPartial() {
                        Producer producer = new Producer((GeneratedMessageV3.Builder) this);
                        Object unused = producer.id_ = this.id_;
                        Object unused2 = producer.name_ = this.name_;
                        Object unused3 = producer.domain_ = this.domain_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.cat_ = this.cat_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        LazyStringList unused4 = producer.cat_ = this.cat_;
                        int unused5 = producer.cattax_ = this.cattax_;
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            Struct unused6 = producer.ext_ = this.ext_;
                        } else {
                            Struct unused7 = producer.ext_ = singleFieldBuilderV3.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            List unused8 = producer.extProto_ = this.extProto_;
                        } else {
                            List unused9 = producer.extProto_ = repeatedFieldBuilderV3.build();
                        }
                        onBuilt();
                        return producer;
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
                        if (message instanceof Producer) {
                            return mergeFrom((Producer) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Producer producer) {
                        if (producer == Producer.getDefaultInstance()) {
                            return this;
                        }
                        if (!producer.getId().isEmpty()) {
                            this.id_ = producer.id_;
                            onChanged();
                        }
                        if (!producer.getName().isEmpty()) {
                            this.name_ = producer.name_;
                            onChanged();
                        }
                        if (!producer.getDomain().isEmpty()) {
                            this.domain_ = producer.domain_;
                            onChanged();
                        }
                        if (!producer.cat_.isEmpty()) {
                            if (this.cat_.isEmpty()) {
                                this.cat_ = producer.cat_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureCatIsMutable();
                                this.cat_.addAll(producer.cat_);
                            }
                            onChanged();
                        }
                        if (producer.cattax_ != 0) {
                            setCattaxValue(producer.getCattaxValue());
                        }
                        if (producer.hasExt()) {
                            mergeExt(producer.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!producer.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = producer.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(producer.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!producer.extProto_.isEmpty()) {
                            if (this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.dispose();
                                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = producer.extProto_;
                                this.bitField0_ &= -3;
                                if (Producer.alwaysUseFieldBuilders) {
                                    repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = repeatedFieldBuilderV3;
                            } else {
                                this.extProtoBuilder_.addAllMessages(producer.extProto_);
                            }
                        }
                        mergeUnknownFields(producer.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.explorestack.protobuf.adcom.Context.App.Content.Producer.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.App.Content.Producer.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            com.explorestack.protobuf.adcom.Context$App$Content$Producer r3 = (com.explorestack.protobuf.adcom.Context.App.Content.Producer) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App.Content.Producer) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            com.explorestack.protobuf.adcom.Context$App$Content$Producer r4 = (com.explorestack.protobuf.adcom.Context.App.Content.Producer) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App.Content.Producer) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Content.Producer.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$App$Content$Producer$Builder");
                    }

                    public String getId() {
                        Object obj = this.id_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.id_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getIdBytes() {
                        Object obj = this.id_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.id_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setId(String str) {
                        if (str != null) {
                            this.id_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearId() {
                        this.id_ = Producer.getDefaultInstance().getId();
                        onChanged();
                        return this;
                    }

                    public Builder setIdBytes(ByteString byteString) {
                        if (byteString != null) {
                            Producer.checkByteStringIsUtf8(byteString);
                            this.id_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setName(String str) {
                        if (str != null) {
                            this.name_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearName() {
                        this.name_ = Producer.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) {
                        if (byteString != null) {
                            Producer.checkByteStringIsUtf8(byteString);
                            this.name_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public String getDomain() {
                        Object obj = this.domain_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.domain_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getDomainBytes() {
                        Object obj = this.domain_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.domain_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setDomain(String str) {
                        if (str != null) {
                            this.domain_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearDomain() {
                        this.domain_ = Producer.getDefaultInstance().getDomain();
                        onChanged();
                        return this;
                    }

                    public Builder setDomainBytes(ByteString byteString) {
                        if (byteString != null) {
                            Producer.checkByteStringIsUtf8(byteString);
                            this.domain_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    private void ensureCatIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.cat_ = new LazyStringArrayList(this.cat_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public ProtocolStringList getCatList() {
                        return this.cat_.getUnmodifiableView();
                    }

                    public int getCatCount() {
                        return this.cat_.size();
                    }

                    public String getCat(int i) {
                        return (String) this.cat_.get(i);
                    }

                    public ByteString getCatBytes(int i) {
                        return this.cat_.getByteString(i);
                    }

                    public Builder setCat(int i, String str) {
                        if (str != null) {
                            ensureCatIsMutable();
                            this.cat_.set(i, str);
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder addCat(String str) {
                        if (str != null) {
                            ensureCatIsMutable();
                            this.cat_.add(str);
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder addAllCat(Iterable<String> iterable) {
                        ensureCatIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.cat_);
                        onChanged();
                        return this;
                    }

                    public Builder clearCat() {
                        this.cat_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder addCatBytes(ByteString byteString) {
                        if (byteString != null) {
                            Producer.checkByteStringIsUtf8(byteString);
                            ensureCatIsMutable();
                            this.cat_.add(byteString);
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public int getCattaxValue() {
                        return this.cattax_;
                    }

                    public Builder setCattaxValue(int i) {
                        this.cattax_ = i;
                        onChanged();
                        return this;
                    }

                    public CategoryTaxonomy getCattax() {
                        CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                        return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
                    }

                    public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                        if (categoryTaxonomy != null) {
                            this.cattax_ = categoryTaxonomy.getNumber();
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearCattax() {
                        this.cattax_ = 0;
                        onChanged();
                        return this;
                    }

                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    public Struct getExt() {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    public Builder setExt(Struct struct) {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(struct);
                        } else if (struct != null) {
                            this.ext_ = struct;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setExt(Struct.Builder builder) {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.ext_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeExt(Struct struct) {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            Struct struct2 = this.ext_;
                            if (struct2 != null) {
                                this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                            } else {
                                this.ext_ = struct;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(struct);
                        }
                        return this;
                    }

                    public Builder clearExt() {
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                            onChanged();
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        return this;
                    }

                    public Struct.Builder getExtBuilder() {
                        onChanged();
                        return getExtFieldBuilder().getBuilder();
                    }

                    public StructOrBuilder getExtOrBuilder() {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
                        }
                    }

                    public List<Any> getExtProtoList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return Collections.unmodifiableList(this.extProto_);
                        }
                        return repeatedFieldBuilderV3.getMessageList();
                    }

                    public int getExtProtoCount() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.size();
                        }
                        return repeatedFieldBuilderV3.getCount();
                    }

                    public Any getExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessage(i);
                    }

                    public Builder setExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.setMessage(i, any);
                        } else if (any != null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, any);
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.setMessage(i, builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(any);
                        } else if (any != null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(i, any);
                        } else if (any != null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, any);
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(i, builder.build());
                        }
                        return this;
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                        }
                        return this;
                    }

                    public Builder clearExtProto() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -3;
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Builder removeExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.remove(i);
                        }
                        return this;
                    }

                    public Any.Builder getExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().getBuilder(i);
                    }

                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                    }

                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            return repeatedFieldBuilderV3.getMessageOrBuilderList();
                        }
                        return Collections.unmodifiableList(this.extProto_);
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                    }

                    public Any.Builder addExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().getBuilderList();
                    }

                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.setUnknownFields(unknownFieldSet);
                    }

                    public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.mergeUnknownFields(unknownFieldSet);
                    }
                }

                public static Producer getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Producer> parser() {
                    return PARSER;
                }

                public Parser<Producer> getParserForType() {
                    return PARSER;
                }

                public Producer getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public int getEpisode() {
                return this.episode_;
            }

            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getSeries() {
                Object obj = this.series_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.series_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSeriesBytes() {
                Object obj = this.series_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.series_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getSeason() {
                Object obj = this.season_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.season_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSeasonBytes() {
                Object obj = this.season_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.season_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getArtist() {
                Object obj = this.artist_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.artist_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getArtistBytes() {
                Object obj = this.artist_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.artist_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getGenre() {
                Object obj = this.genre_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.genre_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getGenreBytes() {
                Object obj = this.genre_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.genre_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getAlbum() {
                Object obj = this.album_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.album_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAlbumBytes() {
                Object obj = this.album_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.album_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getIsrc() {
                Object obj = this.isrc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.isrc_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIsrcBytes() {
                Object obj = this.isrc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.isrc_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public ProtocolStringList getCatList() {
                return this.cat_;
            }

            public int getCatCount() {
                return this.cat_.size();
            }

            public String getCat(int i) {
                return (String) this.cat_.get(i);
            }

            public ByteString getCatBytes(int i) {
                return this.cat_.getByteString(i);
            }

            public int getCattaxValue() {
                return this.cattax_;
            }

            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
            }

            public int getProdqValue() {
                return this.prodq_;
            }

            public ProductionQuality getProdq() {
                ProductionQuality valueOf = ProductionQuality.valueOf(this.prodq_);
                return valueOf == null ? ProductionQuality.UNRECOGNIZED : valueOf;
            }

            public int getContextValue() {
                return this.context_;
            }

            public ContentContext getContext() {
                ContentContext valueOf = ContentContext.valueOf(this.context_);
                return valueOf == null ? ContentContext.UNRECOGNIZED : valueOf;
            }

            public String getRating() {
                Object obj = this.rating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.rating_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRatingBytes() {
                Object obj = this.rating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.rating_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getUrating() {
                Object obj = this.urating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.urating_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUratingBytes() {
                Object obj = this.urating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.urating_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public int getMratingValue() {
                return this.mrating_;
            }

            public MediaRating getMrating() {
                MediaRating valueOf = MediaRating.valueOf(this.mrating_);
                return valueOf == null ? MediaRating.UNRECOGNIZED : valueOf;
            }

            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean getLive() {
                return this.live_;
            }

            public int getSrcrel() {
                return this.srcrel_;
            }

            public int getLen() {
                return this.len_;
            }

            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean getEmbed() {
                return this.embed_;
            }

            public boolean hasProducer() {
                return this.producer_ != null;
            }

            public Producer getProducer() {
                Producer producer = this.producer_;
                return producer == null ? Producer.getDefaultInstance() : producer;
            }

            public ProducerOrBuilder getProducerOrBuilder() {
                return getProducer();
            }

            public List<Data> getDataList() {
                return this.data_;
            }

            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                return this.data_;
            }

            public int getDataCount() {
                return this.data_.size();
            }

            public Data getData(int i) {
                return this.data_.get(i);
            }

            public DataOrBuilder getDataOrBuilder(int i) {
                return this.data_.get(i);
            }

            public boolean hasExt() {
                return this.ext_ != null;
            }

            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
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
                if (!getIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
                }
                int i = this.episode_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(2, i);
                }
                if (!getTitleBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.url_);
                }
                for (int i2 = 0; i2 < this.cat_.size(); i2++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 11, this.cat_.getRaw(i2));
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    codedOutputStream.writeEnum(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    codedOutputStream.writeEnum(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    codedOutputStream.writeEnum(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    codedOutputStream.writeEnum(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 18, this.keywords_);
                }
                boolean z = this.live_;
                if (z) {
                    codedOutputStream.writeBool(19, z);
                }
                int i3 = this.srcrel_;
                if (i3 != 0) {
                    codedOutputStream.writeUInt32(20, i3);
                }
                int i4 = this.len_;
                if (i4 != 0) {
                    codedOutputStream.writeUInt32(21, i4);
                }
                if (!getLangBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 22, this.lang_);
                }
                boolean z2 = this.embed_;
                if (z2) {
                    codedOutputStream.writeBool(23, z2);
                }
                if (this.producer_ != null) {
                    codedOutputStream.writeMessage(24, getProducer());
                }
                for (int i5 = 0; i5 < this.data_.size(); i5++) {
                    codedOutputStream.writeMessage(25, this.data_.get(i5));
                }
                for (int i6 = 0; i6 < this.extProto_.size(); i6++) {
                    codedOutputStream.writeMessage(26, this.extProto_.get(i6));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(27, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                int i2 = this.episode_;
                if (i2 != 0) {
                    computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
                }
                if (!getTitleBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(10, this.url_);
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.cat_.size(); i4++) {
                    i3 += computeStringSizeNoTag(this.cat_.getRaw(i4));
                }
                int size = computeStringSize + i3 + (getCatList().size() * 1);
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    size += CodedOutputStream.computeEnumSize(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(18, this.keywords_);
                }
                boolean z = this.live_;
                if (z) {
                    size += CodedOutputStream.computeBoolSize(19, z);
                }
                int i5 = this.srcrel_;
                if (i5 != 0) {
                    size += CodedOutputStream.computeUInt32Size(20, i5);
                }
                int i6 = this.len_;
                if (i6 != 0) {
                    size += CodedOutputStream.computeUInt32Size(21, i6);
                }
                if (!getLangBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(22, this.lang_);
                }
                boolean z2 = this.embed_;
                if (z2) {
                    size += CodedOutputStream.computeBoolSize(23, z2);
                }
                if (this.producer_ != null) {
                    size += CodedOutputStream.computeMessageSize(24, getProducer());
                }
                for (int i7 = 0; i7 < this.data_.size(); i7++) {
                    size += CodedOutputStream.computeMessageSize(25, this.data_.get(i7));
                }
                for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
                    size += CodedOutputStream.computeMessageSize(26, this.extProto_.get(i8));
                }
                if (this.ext_ != null) {
                    size += CodedOutputStream.computeMessageSize(27, getExt());
                }
                int serializedSize = size + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return super.equals(obj);
                }
                Content content = (Content) obj;
                if (!getId().equals(content.getId()) || getEpisode() != content.getEpisode() || !getTitle().equals(content.getTitle()) || !getSeries().equals(content.getSeries()) || !getSeason().equals(content.getSeason()) || !getArtist().equals(content.getArtist()) || !getGenre().equals(content.getGenre()) || !getAlbum().equals(content.getAlbum()) || !getIsrc().equals(content.getIsrc()) || !getUrl().equals(content.getUrl()) || !getCatList().equals(content.getCatList()) || this.cattax_ != content.cattax_ || this.prodq_ != content.prodq_ || this.context_ != content.context_ || !getRating().equals(content.getRating()) || !getUrating().equals(content.getUrating()) || this.mrating_ != content.mrating_ || !getKeywords().equals(content.getKeywords()) || getLive() != content.getLive() || getSrcrel() != content.getSrcrel() || getLen() != content.getLen() || !getLang().equals(content.getLang()) || getEmbed() != content.getEmbed() || hasProducer() != content.hasProducer()) {
                    return false;
                }
                if ((hasProducer() && !getProducer().equals(content.getProducer())) || !getDataList().equals(content.getDataList()) || hasExt() != content.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(content.getExt())) && getExtProtoList().equals(content.getExtProtoList()) && this.unknownFields.equals(content.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getEpisode()) * 37) + 3) * 53) + getTitle().hashCode()) * 37) + 4) * 53) + getSeries().hashCode()) * 37) + 5) * 53) + getSeason().hashCode()) * 37) + 6) * 53) + getArtist().hashCode()) * 37) + 7) * 53) + getGenre().hashCode()) * 37) + 8) * 53) + getAlbum().hashCode()) * 37) + 9) * 53) + getIsrc().hashCode()) * 37) + 10) * 53) + getUrl().hashCode();
                if (getCatCount() > 0) {
                    hashCode = (((hashCode * 37) + 11) * 53) + getCatList().hashCode();
                }
                int hashCode2 = (((((((((((((((((((((((((((((((((((((((((((((((hashCode * 37) + 12) * 53) + this.cattax_) * 37) + 13) * 53) + this.prodq_) * 37) + 14) * 53) + this.context_) * 37) + 15) * 53) + getRating().hashCode()) * 37) + 16) * 53) + getUrating().hashCode()) * 37) + 17) * 53) + this.mrating_) * 37) + 18) * 53) + getKeywords().hashCode()) * 37) + 19) * 53) + Internal.hashBoolean(getLive())) * 37) + 20) * 53) + getSrcrel()) * 37) + 21) * 53) + getLen()) * 37) + 22) * 53) + getLang().hashCode()) * 37) + 23) * 53) + Internal.hashBoolean(getEmbed());
                if (hasProducer()) {
                    hashCode2 = (((hashCode2 * 37) + 24) * 53) + getProducer().hashCode();
                }
                if (getDataCount() > 0) {
                    hashCode2 = (((hashCode2 * 37) + 25) * 53) + getDataList().hashCode();
                }
                if (hasExt()) {
                    hashCode2 = (((hashCode2 * 37) + 27) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode2 = (((hashCode2 * 37) + 26) * 53) + getExtProtoList().hashCode();
                }
                int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode3;
                return hashCode3;
            }

            public static Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Content parseFrom(InputStream inputStream) throws IOException {
                return (Content) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Content) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Content) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Content) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Content parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Content) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Content) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Content content) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(content);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContentOrBuilder {
                private Object album_;
                private Object artist_;
                private int bitField0_;
                private LazyStringList cat_;
                private int cattax_;
                private int context_;
                private RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> dataBuilder_;
                private List<Data> data_;
                private boolean embed_;
                private int episode_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object genre_;
                private Object id_;
                private Object isrc_;
                private Object keywords_;
                private Object lang_;
                private int len_;
                private boolean live_;
                private int mrating_;
                private int prodq_;
                private SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> producerBuilder_;
                private Producer producer_;
                private Object rating_;
                private Object season_;
                private Object series_;
                private int srcrel_;
                private Object title_;
                private Object urating_;
                private Object url_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_fieldAccessorTable.ensureFieldAccessorsInitialized(Content.class, Builder.class);
                }

                private Builder() {
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    this.data_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    this.data_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Content.alwaysUseFieldBuilders) {
                        getDataFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.episode_ = 0;
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -2;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.live_ = false;
                    this.srcrel_ = 0;
                    this.len_ = 0;
                    this.lang_ = "";
                    this.embed_ = false;
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                    } else {
                        this.producer_ = null;
                        this.producerBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.data_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -5;
                    } else {
                        repeatedFieldBuilderV32.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_Content_descriptor;
                }

                public Content getDefaultInstanceForType() {
                    return Content.getDefaultInstance();
                }

                public Content build() {
                    Content buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Content buildPartial() {
                    Content content = new Content((GeneratedMessageV3.Builder) this);
                    Object unused = content.id_ = this.id_;
                    int unused2 = content.episode_ = this.episode_;
                    Object unused3 = content.title_ = this.title_;
                    Object unused4 = content.series_ = this.series_;
                    Object unused5 = content.season_ = this.season_;
                    Object unused6 = content.artist_ = this.artist_;
                    Object unused7 = content.genre_ = this.genre_;
                    Object unused8 = content.album_ = this.album_;
                    Object unused9 = content.isrc_ = this.isrc_;
                    Object unused10 = content.url_ = this.url_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    LazyStringList unused11 = content.cat_ = this.cat_;
                    int unused12 = content.cattax_ = this.cattax_;
                    int unused13 = content.prodq_ = this.prodq_;
                    int unused14 = content.context_ = this.context_;
                    Object unused15 = content.rating_ = this.rating_;
                    Object unused16 = content.urating_ = this.urating_;
                    int unused17 = content.mrating_ = this.mrating_;
                    Object unused18 = content.keywords_ = this.keywords_;
                    boolean unused19 = content.live_ = this.live_;
                    int unused20 = content.srcrel_ = this.srcrel_;
                    int unused21 = content.len_ = this.len_;
                    Object unused22 = content.lang_ = this.lang_;
                    boolean unused23 = content.embed_ = this.embed_;
                    SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> singleFieldBuilderV3 = this.producerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Producer unused24 = content.producer_ = this.producer_;
                    } else {
                        Producer unused25 = content.producer_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.data_ = Collections.unmodifiableList(this.data_);
                            this.bitField0_ &= -3;
                        }
                        List unused26 = content.data_ = this.data_;
                    } else {
                        List unused27 = content.data_ = repeatedFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        Struct unused28 = content.ext_ = this.ext_;
                    } else {
                        Struct unused29 = content.ext_ = singleFieldBuilderV32.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        List unused30 = content.extProto_ = this.extProto_;
                    } else {
                        List unused31 = content.extProto_ = repeatedFieldBuilderV32.build();
                    }
                    onBuilt();
                    return content;
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
                    if (message instanceof Content) {
                        return mergeFrom((Content) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Content content) {
                    if (content == Content.getDefaultInstance()) {
                        return this;
                    }
                    if (!content.getId().isEmpty()) {
                        this.id_ = content.id_;
                        onChanged();
                    }
                    if (content.getEpisode() != 0) {
                        setEpisode(content.getEpisode());
                    }
                    if (!content.getTitle().isEmpty()) {
                        this.title_ = content.title_;
                        onChanged();
                    }
                    if (!content.getSeries().isEmpty()) {
                        this.series_ = content.series_;
                        onChanged();
                    }
                    if (!content.getSeason().isEmpty()) {
                        this.season_ = content.season_;
                        onChanged();
                    }
                    if (!content.getArtist().isEmpty()) {
                        this.artist_ = content.artist_;
                        onChanged();
                    }
                    if (!content.getGenre().isEmpty()) {
                        this.genre_ = content.genre_;
                        onChanged();
                    }
                    if (!content.getAlbum().isEmpty()) {
                        this.album_ = content.album_;
                        onChanged();
                    }
                    if (!content.getIsrc().isEmpty()) {
                        this.isrc_ = content.isrc_;
                        onChanged();
                    }
                    if (!content.getUrl().isEmpty()) {
                        this.url_ = content.url_;
                        onChanged();
                    }
                    if (!content.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = content.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(content.cat_);
                        }
                        onChanged();
                    }
                    if (content.cattax_ != 0) {
                        setCattaxValue(content.getCattaxValue());
                    }
                    if (content.prodq_ != 0) {
                        setProdqValue(content.getProdqValue());
                    }
                    if (content.context_ != 0) {
                        setContextValue(content.getContextValue());
                    }
                    if (!content.getRating().isEmpty()) {
                        this.rating_ = content.rating_;
                        onChanged();
                    }
                    if (!content.getUrating().isEmpty()) {
                        this.urating_ = content.urating_;
                        onChanged();
                    }
                    if (content.mrating_ != 0) {
                        setMratingValue(content.getMratingValue());
                    }
                    if (!content.getKeywords().isEmpty()) {
                        this.keywords_ = content.keywords_;
                        onChanged();
                    }
                    if (content.getLive()) {
                        setLive(content.getLive());
                    }
                    if (content.getSrcrel() != 0) {
                        setSrcrel(content.getSrcrel());
                    }
                    if (content.getLen() != 0) {
                        setLen(content.getLen());
                    }
                    if (!content.getLang().isEmpty()) {
                        this.lang_ = content.lang_;
                        onChanged();
                    }
                    if (content.getEmbed()) {
                        setEmbed(content.getEmbed());
                    }
                    if (content.hasProducer()) {
                        mergeProducer(content.getProducer());
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    if (this.dataBuilder_ == null) {
                        if (!content.data_.isEmpty()) {
                            if (this.data_.isEmpty()) {
                                this.data_ = content.data_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureDataIsMutable();
                                this.data_.addAll(content.data_);
                            }
                            onChanged();
                        }
                    } else if (!content.data_.isEmpty()) {
                        if (this.dataBuilder_.isEmpty()) {
                            this.dataBuilder_.dispose();
                            this.dataBuilder_ = null;
                            this.data_ = content.data_;
                            this.bitField0_ &= -3;
                            this.dataBuilder_ = Content.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                        } else {
                            this.dataBuilder_.addAllMessages(content.data_);
                        }
                    }
                    if (content.hasExt()) {
                        mergeExt(content.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!content.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = content.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(content.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!content.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = content.extProto_;
                            this.bitField0_ &= -5;
                            if (Content.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(content.extProto_);
                        }
                    }
                    mergeUnknownFields(content.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Context.App.Content.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.App.Content.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Context$App$Content r3 = (com.explorestack.protobuf.adcom.Context.App.Content) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App.Content) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Context$App$Content r4 = (com.explorestack.protobuf.adcom.Context.App.Content) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App.Content) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Content.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$App$Content$Builder");
                }

                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setId(String str) {
                    if (str != null) {
                        this.id_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearId() {
                    this.id_ = Content.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.id_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getEpisode() {
                    return this.episode_;
                }

                public Builder setEpisode(int i) {
                    this.episode_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearEpisode() {
                    this.episode_ = 0;
                    onChanged();
                    return this;
                }

                public String getTitle() {
                    Object obj = this.title_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getTitleBytes() {
                    Object obj = this.title_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.title_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setTitle(String str) {
                    if (str != null) {
                        this.title_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearTitle() {
                    this.title_ = Content.getDefaultInstance().getTitle();
                    onChanged();
                    return this;
                }

                public Builder setTitleBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.title_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getSeries() {
                    Object obj = this.series_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.series_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getSeriesBytes() {
                    Object obj = this.series_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.series_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setSeries(String str) {
                    if (str != null) {
                        this.series_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearSeries() {
                    this.series_ = Content.getDefaultInstance().getSeries();
                    onChanged();
                    return this;
                }

                public Builder setSeriesBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.series_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getSeason() {
                    Object obj = this.season_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.season_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getSeasonBytes() {
                    Object obj = this.season_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.season_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setSeason(String str) {
                    if (str != null) {
                        this.season_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearSeason() {
                    this.season_ = Content.getDefaultInstance().getSeason();
                    onChanged();
                    return this;
                }

                public Builder setSeasonBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.season_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getArtist() {
                    Object obj = this.artist_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.artist_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getArtistBytes() {
                    Object obj = this.artist_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.artist_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setArtist(String str) {
                    if (str != null) {
                        this.artist_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearArtist() {
                    this.artist_ = Content.getDefaultInstance().getArtist();
                    onChanged();
                    return this;
                }

                public Builder setArtistBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.artist_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getGenre() {
                    Object obj = this.genre_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.genre_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getGenreBytes() {
                    Object obj = this.genre_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.genre_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setGenre(String str) {
                    if (str != null) {
                        this.genre_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearGenre() {
                    this.genre_ = Content.getDefaultInstance().getGenre();
                    onChanged();
                    return this;
                }

                public Builder setGenreBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.genre_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getAlbum() {
                    Object obj = this.album_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.album_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getAlbumBytes() {
                    Object obj = this.album_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.album_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setAlbum(String str) {
                    if (str != null) {
                        this.album_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearAlbum() {
                    this.album_ = Content.getDefaultInstance().getAlbum();
                    onChanged();
                    return this;
                }

                public Builder setAlbumBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.album_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getIsrc() {
                    Object obj = this.isrc_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.isrc_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getIsrcBytes() {
                    Object obj = this.isrc_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.isrc_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setIsrc(String str) {
                    if (str != null) {
                        this.isrc_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearIsrc() {
                    this.isrc_ = Content.getDefaultInstance().getIsrc();
                    onChanged();
                    return this;
                }

                public Builder setIsrcBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.isrc_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setUrl(String str) {
                    if (str != null) {
                        this.url_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearUrl() {
                    this.url_ = Content.getDefaultInstance().getUrl();
                    onChanged();
                    return this;
                }

                public Builder setUrlBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.url_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new LazyStringArrayList(this.cat_);
                        this.bitField0_ |= 1;
                    }
                }

                public ProtocolStringList getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                public int getCatCount() {
                    return this.cat_.size();
                }

                public String getCat(int i) {
                    return (String) this.cat_.get(i);
                }

                public ByteString getCatBytes(int i) {
                    return this.cat_.getByteString(i);
                }

                public Builder setCat(int i, String str) {
                    if (str != null) {
                        ensureCatIsMutable();
                        this.cat_.set(i, str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addCat(String str) {
                    if (str != null) {
                        ensureCatIsMutable();
                        this.cat_.add(str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllCat(Iterable<String> iterable) {
                    ensureCatIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.cat_);
                    onChanged();
                    return this;
                }

                public Builder clearCat() {
                    this.cat_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder addCatBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        ensureCatIsMutable();
                        this.cat_.add(byteString);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getCattaxValue() {
                    return this.cattax_;
                }

                public Builder setCattaxValue(int i) {
                    this.cattax_ = i;
                    onChanged();
                    return this;
                }

                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
                }

                public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                    if (categoryTaxonomy != null) {
                        this.cattax_ = categoryTaxonomy.getNumber();
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public int getProdqValue() {
                    return this.prodq_;
                }

                public Builder setProdqValue(int i) {
                    this.prodq_ = i;
                    onChanged();
                    return this;
                }

                public ProductionQuality getProdq() {
                    ProductionQuality valueOf = ProductionQuality.valueOf(this.prodq_);
                    return valueOf == null ? ProductionQuality.UNRECOGNIZED : valueOf;
                }

                public Builder setProdq(ProductionQuality productionQuality) {
                    if (productionQuality != null) {
                        this.prodq_ = productionQuality.getNumber();
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearProdq() {
                    this.prodq_ = 0;
                    onChanged();
                    return this;
                }

                public int getContextValue() {
                    return this.context_;
                }

                public Builder setContextValue(int i) {
                    this.context_ = i;
                    onChanged();
                    return this;
                }

                public ContentContext getContext() {
                    ContentContext valueOf = ContentContext.valueOf(this.context_);
                    return valueOf == null ? ContentContext.UNRECOGNIZED : valueOf;
                }

                public Builder setContext(ContentContext contentContext) {
                    if (contentContext != null) {
                        this.context_ = contentContext.getNumber();
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearContext() {
                    this.context_ = 0;
                    onChanged();
                    return this;
                }

                public String getRating() {
                    Object obj = this.rating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.rating_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getRatingBytes() {
                    Object obj = this.rating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.rating_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setRating(String str) {
                    if (str != null) {
                        this.rating_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearRating() {
                    this.rating_ = Content.getDefaultInstance().getRating();
                    onChanged();
                    return this;
                }

                public Builder setRatingBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.rating_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getUrating() {
                    Object obj = this.urating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urating_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getUratingBytes() {
                    Object obj = this.urating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urating_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setUrating(String str) {
                    if (str != null) {
                        this.urating_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearUrating() {
                    this.urating_ = Content.getDefaultInstance().getUrating();
                    onChanged();
                    return this;
                }

                public Builder setUratingBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.urating_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getMratingValue() {
                    return this.mrating_;
                }

                public Builder setMratingValue(int i) {
                    this.mrating_ = i;
                    onChanged();
                    return this;
                }

                public MediaRating getMrating() {
                    MediaRating valueOf = MediaRating.valueOf(this.mrating_);
                    return valueOf == null ? MediaRating.UNRECOGNIZED : valueOf;
                }

                public Builder setMrating(MediaRating mediaRating) {
                    if (mediaRating != null) {
                        this.mrating_ = mediaRating.getNumber();
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearMrating() {
                    this.mrating_ = 0;
                    onChanged();
                    return this;
                }

                public String getKeywords() {
                    Object obj = this.keywords_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.keywords_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getKeywordsBytes() {
                    Object obj = this.keywords_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.keywords_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setKeywords(String str) {
                    if (str != null) {
                        this.keywords_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearKeywords() {
                    this.keywords_ = Content.getDefaultInstance().getKeywords();
                    onChanged();
                    return this;
                }

                public Builder setKeywordsBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.keywords_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean getLive() {
                    return this.live_;
                }

                public Builder setLive(boolean z) {
                    this.live_ = z;
                    onChanged();
                    return this;
                }

                public Builder clearLive() {
                    this.live_ = false;
                    onChanged();
                    return this;
                }

                public int getSrcrel() {
                    return this.srcrel_;
                }

                public Builder setSrcrel(int i) {
                    this.srcrel_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearSrcrel() {
                    this.srcrel_ = 0;
                    onChanged();
                    return this;
                }

                public int getLen() {
                    return this.len_;
                }

                public Builder setLen(int i) {
                    this.len_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearLen() {
                    this.len_ = 0;
                    onChanged();
                    return this;
                }

                public String getLang() {
                    Object obj = this.lang_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lang_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getLangBytes() {
                    Object obj = this.lang_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lang_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setLang(String str) {
                    if (str != null) {
                        this.lang_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearLang() {
                    this.lang_ = Content.getDefaultInstance().getLang();
                    onChanged();
                    return this;
                }

                public Builder setLangBytes(ByteString byteString) {
                    if (byteString != null) {
                        Content.checkByteStringIsUtf8(byteString);
                        this.lang_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean getEmbed() {
                    return this.embed_;
                }

                public Builder setEmbed(boolean z) {
                    this.embed_ = z;
                    onChanged();
                    return this;
                }

                public Builder clearEmbed() {
                    this.embed_ = false;
                    onChanged();
                    return this;
                }

                public boolean hasProducer() {
                    return (this.producerBuilder_ == null && this.producer_ == null) ? false : true;
                }

                public Producer getProducer() {
                    SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> singleFieldBuilderV3 = this.producerBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                public Builder setProducer(Producer producer) {
                    SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> singleFieldBuilderV3 = this.producerBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(producer);
                    } else if (producer != null) {
                        this.producer_ = producer;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setProducer(Producer.Builder builder) {
                    SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> singleFieldBuilderV3 = this.producerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.producer_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeProducer(Producer producer) {
                    SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> singleFieldBuilderV3 = this.producerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Producer producer2 = this.producer_;
                        if (producer2 != null) {
                            this.producer_ = Producer.newBuilder(producer2).mergeFrom(producer).buildPartial();
                        } else {
                            this.producer_ = producer;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(producer);
                    }
                    return this;
                }

                public Builder clearProducer() {
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                        onChanged();
                    } else {
                        this.producer_ = null;
                        this.producerBuilder_ = null;
                    }
                    return this;
                }

                public Producer.Builder getProducerBuilder() {
                    onChanged();
                    return getProducerFieldBuilder().getBuilder();
                }

                public ProducerOrBuilder getProducerOrBuilder() {
                    SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> singleFieldBuilderV3 = this.producerBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                private SingleFieldBuilderV3<Producer, Producer.Builder, ProducerOrBuilder> getProducerFieldBuilder() {
                    if (this.producerBuilder_ == null) {
                        this.producerBuilder_ = new SingleFieldBuilderV3<>(getProducer(), getParentForChildren(), isClean());
                        this.producer_ = null;
                    }
                    return this.producerBuilder_;
                }

                private void ensureDataIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.data_ = new ArrayList(this.data_);
                        this.bitField0_ |= 2;
                    }
                }

                public List<Data> getDataList() {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.data_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getDataCount() {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.data_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Data getData(int i) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.data_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setData(int i, Data data) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, data);
                    } else if (data != null) {
                        ensureDataIsMutable();
                        this.data_.set(i, data);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setData(int i, Data.Builder builder) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDataIsMutable();
                        this.data_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addData(Data data) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(data);
                    } else if (data != null) {
                        ensureDataIsMutable();
                        this.data_.add(data);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addData(int i, Data data) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, data);
                    } else if (data != null) {
                        ensureDataIsMutable();
                        this.data_.add(i, data);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addData(Data.Builder builder) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDataIsMutable();
                        this.data_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addData(int i, Data.Builder builder) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDataIsMutable();
                        this.data_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllData(Iterable<? extends Data> iterable) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDataIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.data_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearData() {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.data_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeData(int i) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDataIsMutable();
                        this.data_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Data.Builder getDataBuilder(int i) {
                    return getDataFieldBuilder().getBuilder(i);
                }

                public DataOrBuilder getDataOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.data_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends DataOrBuilder> getDataOrBuilderList() {
                    RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.data_);
                }

                public Data.Builder addDataBuilder() {
                    return getDataFieldBuilder().addBuilder(Data.getDefaultInstance());
                }

                public Data.Builder addDataBuilder(int i) {
                    return getDataFieldBuilder().addBuilder(i, Data.getDefaultInstance());
                }

                public List<Data.Builder> getDataBuilderList() {
                    return getDataFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> getDataFieldBuilder() {
                    if (this.dataBuilder_ == null) {
                        this.dataBuilder_ = new RepeatedFieldBuilderV3<>(this.data_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    return this.dataBuilder_;
                }

                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                public Struct getExt() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Builder setExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(struct);
                    } else if (struct != null) {
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(struct);
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return getExtFieldBuilder().getBuilder();
                }

                public StructOrBuilder getExtOrBuilder() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -5;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static Content getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Content> parser() {
                return PARSER;
            }

            public Parser<Content> getParserForType() {
                return PARSER;
            }

            public Content getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasPub() {
            return this.pub_ != null;
        }

        public Publisher getPub() {
            Publisher publisher = this.pub_;
            return publisher == null ? Publisher.getDefaultInstance() : publisher;
        }

        public PublisherOrBuilder getPubOrBuilder() {
            return getPub();
        }

        public boolean hasContent() {
            return this.content_ != null;
        }

        public Content getContent() {
            Content content = this.content_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public ContentOrBuilder getContentOrBuilder() {
            return getContent();
        }

        public String getDomain() {
            Object obj = this.domain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domain_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainBytes() {
            Object obj = this.domain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domain_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getCatList() {
            return this.cat_;
        }

        public int getCatCount() {
            return this.cat_.size();
        }

        public String getCat(int i) {
            return (String) this.cat_.get(i);
        }

        public ByteString getCatBytes(int i) {
            return this.cat_.getByteString(i);
        }

        public ProtocolStringList getSectcatList() {
            return this.sectcat_;
        }

        public int getSectcatCount() {
            return this.sectcat_.size();
        }

        public String getSectcat(int i) {
            return (String) this.sectcat_.get(i);
        }

        public ByteString getSectcatBytes(int i) {
            return this.sectcat_.getByteString(i);
        }

        public ProtocolStringList getPagecatList() {
            return this.pagecat_;
        }

        public int getPagecatCount() {
            return this.pagecat_.size();
        }

        public String getPagecat(int i) {
            return (String) this.pagecat_.get(i);
        }

        public ByteString getPagecatBytes(int i) {
            return this.pagecat_.getByteString(i);
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
        }

        public boolean getPrivpolicy() {
            return this.privpolicy_;
        }

        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getStoreid() {
            Object obj = this.storeid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getStoreidBytes() {
            Object obj = this.storeid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getStoreurl() {
            Object obj = this.storeurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeurl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getStoreurlBytes() {
            Object obj = this.storeurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeurl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getPaid() {
            return this.paid_;
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if (this.pub_ != null) {
                codedOutputStream.writeMessage(3, getPub());
            }
            if (this.content_ != null) {
                codedOutputStream.writeMessage(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.domain_);
            }
            for (int i = 0; i < this.cat_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.cat_.getRaw(i));
            }
            for (int i2 = 0; i2 < this.sectcat_.size(); i2++) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.sectcat_.getRaw(i2));
            }
            for (int i3 = 0; i3 < this.pagecat_.size(); i3++) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.pagecat_.getRaw(i3));
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                codedOutputStream.writeEnum(9, this.cattax_);
            }
            boolean z = this.privpolicy_;
            if (z) {
                codedOutputStream.writeBool(10, z);
            }
            if (!getKeywordsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 15, this.ver_);
            }
            boolean z2 = this.paid_;
            if (z2) {
                codedOutputStream.writeBool(16, z2);
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                codedOutputStream.writeMessage(17, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(18, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
            if (!getNameBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if (this.pub_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, getPub());
            }
            if (this.content_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(5, this.domain_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.cat_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.cat_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getCatList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.sectcat_.size(); i5++) {
                i4 += computeStringSizeNoTag(this.sectcat_.getRaw(i5));
            }
            int size2 = size + i4 + (getSectcatList().size() * 1);
            int i6 = 0;
            for (int i7 = 0; i7 < this.pagecat_.size(); i7++) {
                i6 += computeStringSizeNoTag(this.pagecat_.getRaw(i7));
            }
            int size3 = size2 + i6 + (getPagecatList().size() * 1);
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size3 += CodedOutputStream.computeEnumSize(9, this.cattax_);
            }
            boolean z = this.privpolicy_;
            if (z) {
                size3 += CodedOutputStream.computeBoolSize(10, z);
            }
            if (!getKeywordsBytes().isEmpty()) {
                size3 += GeneratedMessageV3.computeStringSize(11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                size3 += GeneratedMessageV3.computeStringSize(12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                size3 += GeneratedMessageV3.computeStringSize(13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                size3 += GeneratedMessageV3.computeStringSize(14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                size3 += GeneratedMessageV3.computeStringSize(15, this.ver_);
            }
            boolean z2 = this.paid_;
            if (z2) {
                size3 += CodedOutputStream.computeBoolSize(16, z2);
            }
            for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
                size3 += CodedOutputStream.computeMessageSize(17, this.extProto_.get(i8));
            }
            if (this.ext_ != null) {
                size3 += CodedOutputStream.computeMessageSize(18, getExt());
            }
            int serializedSize = size3 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof App)) {
                return super.equals(obj);
            }
            App app = (App) obj;
            if (!getId().equals(app.getId()) || !getName().equals(app.getName()) || hasPub() != app.hasPub()) {
                return false;
            }
            if ((hasPub() && !getPub().equals(app.getPub())) || hasContent() != app.hasContent()) {
                return false;
            }
            if ((hasContent() && !getContent().equals(app.getContent())) || !getDomain().equals(app.getDomain()) || !getCatList().equals(app.getCatList()) || !getSectcatList().equals(app.getSectcatList()) || !getPagecatList().equals(app.getPagecatList()) || this.cattax_ != app.cattax_ || getPrivpolicy() != app.getPrivpolicy() || !getKeywords().equals(app.getKeywords()) || !getBundle().equals(app.getBundle()) || !getStoreid().equals(app.getStoreid()) || !getStoreurl().equals(app.getStoreurl()) || !getVer().equals(app.getVer()) || getPaid() != app.getPaid() || hasExt() != app.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(app.getExt())) && getExtProtoList().equals(app.getExtProtoList()) && this.unknownFields.equals(app.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode();
            if (hasPub()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPub().hashCode();
            }
            if (hasContent()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getContent().hashCode();
            }
            int hashCode2 = (((hashCode * 37) + 5) * 53) + getDomain().hashCode();
            if (getCatCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getCatList().hashCode();
            }
            if (getSectcatCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getSectcatList().hashCode();
            }
            if (getPagecatCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 8) * 53) + getPagecatList().hashCode();
            }
            int hashBoolean = (((((((((((((((((((((((((((((((hashCode2 * 37) + 9) * 53) + this.cattax_) * 37) + 10) * 53) + Internal.hashBoolean(getPrivpolicy())) * 37) + 11) * 53) + getKeywords().hashCode()) * 37) + 12) * 53) + getBundle().hashCode()) * 37) + 13) * 53) + getStoreid().hashCode()) * 37) + 14) * 53) + getStoreurl().hashCode()) * 37) + 15) * 53) + getVer().hashCode()) * 37) + 16) * 53) + Internal.hashBoolean(getPaid());
            if (hasExt()) {
                hashBoolean = (((hashBoolean * 37) + 18) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashBoolean = (((hashBoolean * 37) + 17) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashBoolean * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static App parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static App parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static App parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static App parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (App) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static App parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(App app) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppOrBuilder {
            private int bitField0_;
            private Object bundle_;
            private LazyStringList cat_;
            private int cattax_;
            private SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> contentBuilder_;
            private Content content_;
            private Object domain_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object keywords_;
            private Object name_;
            private LazyStringList pagecat_;
            private boolean paid_;
            private boolean privpolicy_;
            private SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> pubBuilder_;
            private Publisher pub_;
            private LazyStringList sectcat_;
            private Object storeid_;
            private Object storeurl_;
            private Object ver_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                this.cat_ = LazyStringArrayList.EMPTY;
                this.sectcat_ = LazyStringArrayList.EMPTY;
                this.pagecat_ = LazyStringArrayList.EMPTY;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                this.cat_ = LazyStringArrayList.EMPTY;
                this.sectcat_ = LazyStringArrayList.EMPTY;
                this.pagecat_ = LazyStringArrayList.EMPTY;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (App.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.name_ = "";
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                } else {
                    this.pub_ = null;
                    this.pubBuilder_ = null;
                }
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                } else {
                    this.content_ = null;
                    this.contentBuilder_ = null;
                }
                this.domain_ = "";
                this.cat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.sectcat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                this.pagecat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                this.cattax_ = 0;
                this.privpolicy_ = false;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.paid_ = false;
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_App_descriptor;
            }

            public App getDefaultInstanceForType() {
                return App.getDefaultInstance();
            }

            public App build() {
                App buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public App buildPartial() {
                App app = new App((GeneratedMessageV3.Builder) this);
                Object unused = app.id_ = this.id_;
                Object unused2 = app.name_ = this.name_;
                SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> singleFieldBuilderV3 = this.pubBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Publisher unused3 = app.pub_ = this.pub_;
                } else {
                    Publisher unused4 = app.pub_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> singleFieldBuilderV32 = this.contentBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Content unused5 = app.content_ = this.content_;
                } else {
                    Content unused6 = app.content_ = singleFieldBuilderV32.build();
                }
                Object unused7 = app.domain_ = this.domain_;
                if ((this.bitField0_ & 1) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused8 = app.cat_ = this.cat_;
                if ((this.bitField0_ & 2) != 0) {
                    this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused9 = app.sectcat_ = this.sectcat_;
                if ((this.bitField0_ & 4) != 0) {
                    this.pagecat_ = this.pagecat_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                LazyStringList unused10 = app.pagecat_ = this.pagecat_;
                int unused11 = app.cattax_ = this.cattax_;
                boolean unused12 = app.privpolicy_ = this.privpolicy_;
                Object unused13 = app.keywords_ = this.keywords_;
                Object unused14 = app.bundle_ = this.bundle_;
                Object unused15 = app.storeid_ = this.storeid_;
                Object unused16 = app.storeurl_ = this.storeurl_;
                Object unused17 = app.ver_ = this.ver_;
                boolean unused18 = app.paid_ = this.paid_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV33 = this.extBuilder_;
                if (singleFieldBuilderV33 == null) {
                    Struct unused19 = app.ext_ = this.ext_;
                } else {
                    Struct unused20 = app.ext_ = singleFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    List unused21 = app.extProto_ = this.extProto_;
                } else {
                    List unused22 = app.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return app;
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
                if (message instanceof App) {
                    return mergeFrom((App) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(App app) {
                if (app == App.getDefaultInstance()) {
                    return this;
                }
                if (!app.getId().isEmpty()) {
                    this.id_ = app.id_;
                    onChanged();
                }
                if (!app.getName().isEmpty()) {
                    this.name_ = app.name_;
                    onChanged();
                }
                if (app.hasPub()) {
                    mergePub(app.getPub());
                }
                if (app.hasContent()) {
                    mergeContent(app.getContent());
                }
                if (!app.getDomain().isEmpty()) {
                    this.domain_ = app.domain_;
                    onChanged();
                }
                if (!app.cat_.isEmpty()) {
                    if (this.cat_.isEmpty()) {
                        this.cat_ = app.cat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureCatIsMutable();
                        this.cat_.addAll(app.cat_);
                    }
                    onChanged();
                }
                if (!app.sectcat_.isEmpty()) {
                    if (this.sectcat_.isEmpty()) {
                        this.sectcat_ = app.sectcat_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureSectcatIsMutable();
                        this.sectcat_.addAll(app.sectcat_);
                    }
                    onChanged();
                }
                if (!app.pagecat_.isEmpty()) {
                    if (this.pagecat_.isEmpty()) {
                        this.pagecat_ = app.pagecat_;
                        this.bitField0_ &= -5;
                    } else {
                        ensurePagecatIsMutable();
                        this.pagecat_.addAll(app.pagecat_);
                    }
                    onChanged();
                }
                if (app.cattax_ != 0) {
                    setCattaxValue(app.getCattaxValue());
                }
                if (app.getPrivpolicy()) {
                    setPrivpolicy(app.getPrivpolicy());
                }
                if (!app.getKeywords().isEmpty()) {
                    this.keywords_ = app.keywords_;
                    onChanged();
                }
                if (!app.getBundle().isEmpty()) {
                    this.bundle_ = app.bundle_;
                    onChanged();
                }
                if (!app.getStoreid().isEmpty()) {
                    this.storeid_ = app.storeid_;
                    onChanged();
                }
                if (!app.getStoreurl().isEmpty()) {
                    this.storeurl_ = app.storeurl_;
                    onChanged();
                }
                if (!app.getVer().isEmpty()) {
                    this.ver_ = app.ver_;
                    onChanged();
                }
                if (app.getPaid()) {
                    setPaid(app.getPaid());
                }
                if (app.hasExt()) {
                    mergeExt(app.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!app.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = app.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(app.extProto_);
                        }
                        onChanged();
                    }
                } else if (!app.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = app.extProto_;
                        this.bitField0_ &= -9;
                        if (App.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(app.extProto_);
                    }
                }
                mergeUnknownFields(app.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.App.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.App.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$App r3 = (com.explorestack.protobuf.adcom.Context.App) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$App r4 = (com.explorestack.protobuf.adcom.Context.App) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.App) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$App$Builder");
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setId(String str) {
                if (str != null) {
                    this.id_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearId() {
                this.id_ = App.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setName(String str) {
                if (str != null) {
                    this.name_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearName() {
                this.name_ = App.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasPub() {
                return (this.pubBuilder_ == null && this.pub_ == null) ? false : true;
            }

            public Publisher getPub() {
                SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> singleFieldBuilderV3 = this.pubBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            public Builder setPub(Publisher publisher) {
                SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> singleFieldBuilderV3 = this.pubBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(publisher);
                } else if (publisher != null) {
                    this.pub_ = publisher;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setPub(Publisher.Builder builder) {
                SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> singleFieldBuilderV3 = this.pubBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pub_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergePub(Publisher publisher) {
                SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> singleFieldBuilderV3 = this.pubBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Publisher publisher2 = this.pub_;
                    if (publisher2 != null) {
                        this.pub_ = Publisher.newBuilder(publisher2).mergeFrom(publisher).buildPartial();
                    } else {
                        this.pub_ = publisher;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(publisher);
                }
                return this;
            }

            public Builder clearPub() {
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                    onChanged();
                } else {
                    this.pub_ = null;
                    this.pubBuilder_ = null;
                }
                return this;
            }

            public Publisher.Builder getPubBuilder() {
                onChanged();
                return getPubFieldBuilder().getBuilder();
            }

            public PublisherOrBuilder getPubOrBuilder() {
                SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> singleFieldBuilderV3 = this.pubBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            private SingleFieldBuilderV3<Publisher, Publisher.Builder, PublisherOrBuilder> getPubFieldBuilder() {
                if (this.pubBuilder_ == null) {
                    this.pubBuilder_ = new SingleFieldBuilderV3<>(getPub(), getParentForChildren(), isClean());
                    this.pub_ = null;
                }
                return this.pubBuilder_;
            }

            public boolean hasContent() {
                return (this.contentBuilder_ == null && this.content_ == null) ? false : true;
            }

            public Content getContent() {
                SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> singleFieldBuilderV3 = this.contentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            public Builder setContent(Content content) {
                SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> singleFieldBuilderV3 = this.contentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(content);
                } else if (content != null) {
                    this.content_ = content;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setContent(Content.Builder builder) {
                SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> singleFieldBuilderV3 = this.contentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.content_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeContent(Content content) {
                SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> singleFieldBuilderV3 = this.contentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Content content2 = this.content_;
                    if (content2 != null) {
                        this.content_ = Content.newBuilder(content2).mergeFrom(content).buildPartial();
                    } else {
                        this.content_ = content;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(content);
                }
                return this;
            }

            public Builder clearContent() {
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                    onChanged();
                } else {
                    this.content_ = null;
                    this.contentBuilder_ = null;
                }
                return this;
            }

            public Content.Builder getContentBuilder() {
                onChanged();
                return getContentFieldBuilder().getBuilder();
            }

            public ContentOrBuilder getContentOrBuilder() {
                SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> singleFieldBuilderV3 = this.contentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            private SingleFieldBuilderV3<Content, Content.Builder, ContentOrBuilder> getContentFieldBuilder() {
                if (this.contentBuilder_ == null) {
                    this.contentBuilder_ = new SingleFieldBuilderV3<>(getContent(), getParentForChildren(), isClean());
                    this.content_ = null;
                }
                return this.contentBuilder_;
            }

            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDomain(String str) {
                if (str != null) {
                    this.domain_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDomain() {
                this.domain_ = App.getDefaultInstance().getDomain();
                onChanged();
                return this;
            }

            public Builder setDomainBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureCatIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cat_ = new LazyStringArrayList(this.cat_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getCatList() {
                return this.cat_.getUnmodifiableView();
            }

            public int getCatCount() {
                return this.cat_.size();
            }

            public String getCat(int i) {
                return (String) this.cat_.get(i);
            }

            public ByteString getCatBytes(int i) {
                return this.cat_.getByteString(i);
            }

            public Builder setCat(int i, String str) {
                if (str != null) {
                    ensureCatIsMutable();
                    this.cat_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addCat(String str) {
                if (str != null) {
                    ensureCatIsMutable();
                    this.cat_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllCat(Iterable<String> iterable) {
                ensureCatIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.cat_);
                onChanged();
                return this;
            }

            public Builder clearCat() {
                this.cat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addCatBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    ensureCatIsMutable();
                    this.cat_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureSectcatIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.sectcat_ = new LazyStringArrayList(this.sectcat_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getSectcatList() {
                return this.sectcat_.getUnmodifiableView();
            }

            public int getSectcatCount() {
                return this.sectcat_.size();
            }

            public String getSectcat(int i) {
                return (String) this.sectcat_.get(i);
            }

            public ByteString getSectcatBytes(int i) {
                return this.sectcat_.getByteString(i);
            }

            public Builder setSectcat(int i, String str) {
                if (str != null) {
                    ensureSectcatIsMutable();
                    this.sectcat_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addSectcat(String str) {
                if (str != null) {
                    ensureSectcatIsMutable();
                    this.sectcat_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllSectcat(Iterable<String> iterable) {
                ensureSectcatIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.sectcat_);
                onChanged();
                return this;
            }

            public Builder clearSectcat() {
                this.sectcat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addSectcatBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    ensureSectcatIsMutable();
                    this.sectcat_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensurePagecatIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.pagecat_ = new LazyStringArrayList(this.pagecat_);
                    this.bitField0_ |= 4;
                }
            }

            public ProtocolStringList getPagecatList() {
                return this.pagecat_.getUnmodifiableView();
            }

            public int getPagecatCount() {
                return this.pagecat_.size();
            }

            public String getPagecat(int i) {
                return (String) this.pagecat_.get(i);
            }

            public ByteString getPagecatBytes(int i) {
                return this.pagecat_.getByteString(i);
            }

            public Builder setPagecat(int i, String str) {
                if (str != null) {
                    ensurePagecatIsMutable();
                    this.pagecat_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addPagecat(String str) {
                if (str != null) {
                    ensurePagecatIsMutable();
                    this.pagecat_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllPagecat(Iterable<String> iterable) {
                ensurePagecatIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.pagecat_);
                onChanged();
                return this;
            }

            public Builder clearPagecat() {
                this.pagecat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder addPagecatBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    ensurePagecatIsMutable();
                    this.pagecat_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getCattaxValue() {
                return this.cattax_;
            }

            public Builder setCattaxValue(int i) {
                this.cattax_ = i;
                onChanged();
                return this;
            }

            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
            }

            public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                if (categoryTaxonomy != null) {
                    this.cattax_ = categoryTaxonomy.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
                onChanged();
                return this;
            }

            public boolean getPrivpolicy() {
                return this.privpolicy_;
            }

            public Builder setPrivpolicy(boolean z) {
                this.privpolicy_ = z;
                onChanged();
                return this;
            }

            public Builder clearPrivpolicy() {
                this.privpolicy_ = false;
                onChanged();
                return this;
            }

            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setKeywords(String str) {
                if (str != null) {
                    this.keywords_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearKeywords() {
                this.keywords_ = App.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.keywords_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBundle() {
                Object obj = this.bundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBundleBytes() {
                Object obj = this.bundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBundle(String str) {
                if (str != null) {
                    this.bundle_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBundle() {
                this.bundle_ = App.getDefaultInstance().getBundle();
                onChanged();
                return this;
            }

            public Builder setBundleBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.bundle_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getStoreid() {
                Object obj = this.storeid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeid_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getStoreidBytes() {
                Object obj = this.storeid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeid_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setStoreid(String str) {
                if (str != null) {
                    this.storeid_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearStoreid() {
                this.storeid_ = App.getDefaultInstance().getStoreid();
                onChanged();
                return this;
            }

            public Builder setStoreidBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.storeid_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getStoreurl() {
                Object obj = this.storeurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeurl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getStoreurlBytes() {
                Object obj = this.storeurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeurl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setStoreurl(String str) {
                if (str != null) {
                    this.storeurl_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearStoreurl() {
                this.storeurl_ = App.getDefaultInstance().getStoreurl();
                onChanged();
                return this;
            }

            public Builder setStoreurlBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.storeurl_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getVer() {
                Object obj = this.ver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ver_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getVerBytes() {
                Object obj = this.ver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ver_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setVer(String str) {
                if (str != null) {
                    this.ver_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearVer() {
                this.ver_ = App.getDefaultInstance().getVer();
                onChanged();
                return this;
            }

            public Builder setVerBytes(ByteString byteString) {
                if (byteString != null) {
                    App.checkByteStringIsUtf8(byteString);
                    this.ver_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean getPaid() {
                return this.paid_;
            }

            public Builder setPaid(boolean z) {
                this.paid_ = z;
                onChanged();
                return this;
            }

            public Builder clearPaid() {
                this.paid_ = false;
                onChanged();
                return this;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<App> parser() {
            return PARSER;
        }

        public Parser<App> getParserForType() {
            return PARSER;
        }

        public App getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Data extends GeneratedMessageV3 implements DataOrBuilder {
        private static final Data DEFAULT_INSTANCE = new Data();
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<Data> PARSER = new AbstractParser<Data>() {
            public Data parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Data(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SEGMENT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public volatile Object id_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object name_;
        /* access modifiers changed from: private */
        public List<Segment> segment_;

        public interface SegmentOrBuilder extends MessageOrBuilder {
            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            String getValue();

            ByteString getValueBytes();

            boolean hasExt();
        }

        private Data(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Data() {
            this.memoizedIsInitialized = -1;
            this.id_ = "";
            this.name_ = "";
            this.segment_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Data();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Data(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.id_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.name_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!z2 || !true) {
                                    this.segment_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.segment_.add(codedInputStream.readMessage(Segment.parser(), extensionRegistryLite));
                            } else if (readTag == 34) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 42) {
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder != null) {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
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
                        if (z2 && true) {
                            this.segment_ = Collections.unmodifiableList(this.segment_);
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.segment_ = Collections.unmodifiableList(this.segment_);
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
        }

        public static final class Segment extends GeneratedMessageV3 implements SegmentOrBuilder {
            private static final Segment DEFAULT_INSTANCE = new Segment();
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<Segment> PARSER = new AbstractParser<Segment>() {
                public Segment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Segment(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int VALUE_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public volatile Object id_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public volatile Object name_;
            /* access modifiers changed from: private */
            public volatile Object value_;

            private Segment(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Segment() {
                this.memoizedIsInitialized = -1;
                this.id_ = "";
                this.name_ = "";
                this.value_ = "";
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Segment();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Segment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 42) {
                                    Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder != null) {
                                        builder.mergeFrom(struct);
                                        this.ext_ = builder.buildPartial();
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
                            if (z2 && true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_fieldAccessorTable.ensureFieldAccessorsInitialized(Segment.class, Builder.class);
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasExt() {
                return this.ext_ != null;
            }

            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
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
                if (!getIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.value_);
                }
                for (int i = 0; i < this.extProto_.size(); i++) {
                    codedOutputStream.writeMessage(4, this.extProto_.get(i));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(5, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                if (!getNameBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(3, this.value_);
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(5, getExt());
                }
                int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Segment)) {
                    return super.equals(obj);
                }
                Segment segment = (Segment) obj;
                if (!getId().equals(segment.getId()) || !getName().equals(segment.getName()) || !getValue().equals(segment.getValue()) || hasExt() != segment.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(segment.getExt())) && getExtProtoList().equals(segment.getExtProtoList()) && this.unknownFields.equals(segment.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getValue().hashCode();
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 5) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Segment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Segment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Segment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Segment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Segment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Segment parseFrom(InputStream inputStream) throws IOException {
                return (Segment) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Segment) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Segment parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Segment) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Segment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Segment) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Segment parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Segment) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Segment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Segment) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Segment segment) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(segment);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SegmentOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;
                private Object value_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_fieldAccessorTable.ensureFieldAccessorsInitialized(Segment.class, Builder.class);
                }

                private Builder() {
                    this.id_ = "";
                    this.name_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    this.name_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Segment.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.name_ = "";
                    this.value_ = "";
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_Segment_descriptor;
                }

                public Segment getDefaultInstanceForType() {
                    return Segment.getDefaultInstance();
                }

                public Segment build() {
                    Segment buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Segment buildPartial() {
                    Segment segment = new Segment((GeneratedMessageV3.Builder) this);
                    Object unused = segment.id_ = this.id_;
                    Object unused2 = segment.name_ = this.name_;
                    Object unused3 = segment.value_ = this.value_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused4 = segment.ext_ = this.ext_;
                    } else {
                        Struct unused5 = segment.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        List unused6 = segment.extProto_ = this.extProto_;
                    } else {
                        List unused7 = segment.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return segment;
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
                    if (message instanceof Segment) {
                        return mergeFrom((Segment) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Segment segment) {
                    if (segment == Segment.getDefaultInstance()) {
                        return this;
                    }
                    if (!segment.getId().isEmpty()) {
                        this.id_ = segment.id_;
                        onChanged();
                    }
                    if (!segment.getName().isEmpty()) {
                        this.name_ = segment.name_;
                        onChanged();
                    }
                    if (!segment.getValue().isEmpty()) {
                        this.value_ = segment.value_;
                        onChanged();
                    }
                    if (segment.hasExt()) {
                        mergeExt(segment.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!segment.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = segment.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(segment.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!segment.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = segment.extProto_;
                            this.bitField0_ &= -2;
                            if (Segment.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(segment.extProto_);
                        }
                    }
                    mergeUnknownFields(segment.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Context.Data.Segment.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.Data.Segment.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Context$Data$Segment r3 = (com.explorestack.protobuf.adcom.Context.Data.Segment) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Data.Segment) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Context$Data$Segment r4 = (com.explorestack.protobuf.adcom.Context.Data.Segment) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Data.Segment) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Data.Segment.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Data$Segment$Builder");
                }

                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setId(String str) {
                    if (str != null) {
                        this.id_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearId() {
                    this.id_ = Segment.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    if (byteString != null) {
                        Segment.checkByteStringIsUtf8(byteString);
                        this.id_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setName(String str) {
                    if (str != null) {
                        this.name_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearName() {
                    this.name_ = Segment.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    if (byteString != null) {
                        Segment.checkByteStringIsUtf8(byteString);
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setValue(String str) {
                    if (str != null) {
                        this.value_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearValue() {
                    this.value_ = Segment.getDefaultInstance().getValue();
                    onChanged();
                    return this;
                }

                public Builder setValueBytes(ByteString byteString) {
                    if (byteString != null) {
                        Segment.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                public Struct getExt() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Builder setExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(struct);
                    } else if (struct != null) {
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(struct);
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return getExtFieldBuilder().getBuilder();
                }

                public StructOrBuilder getExtOrBuilder() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        List<Any> list = this.extProto_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static Segment getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Segment> parser() {
                return PARSER;
            }

            public Parser<Segment> getParserForType() {
                return PARSER;
            }

            public Segment getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public List<Segment> getSegmentList() {
            return this.segment_;
        }

        public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
            return this.segment_;
        }

        public int getSegmentCount() {
            return this.segment_.size();
        }

        public Segment getSegment(int i) {
            return this.segment_.get(i);
        }

        public SegmentOrBuilder getSegmentOrBuilder(int i) {
            return this.segment_.get(i);
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            for (int i = 0; i < this.segment_.size(); i++) {
                codedOutputStream.writeMessage(3, this.segment_.get(i));
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(5, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
            if (!getNameBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            for (int i2 = 0; i2 < this.segment_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, this.segment_.get(i2));
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(5, getExt());
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            if (!getId().equals(data.getId()) || !getName().equals(data.getName()) || !getSegmentList().equals(data.getSegmentList()) || hasExt() != data.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(data.getExt())) && getExtProtoList().equals(data.getExtProtoList()) && this.unknownFields.equals(data.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getName().hashCode();
            if (getSegmentCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getSegmentList().hashCode();
            }
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Data) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Data) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Data parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Data) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Data) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object name_;
            private RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> segmentBuilder_;
            private List<Segment> segment_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                this.segment_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.name_ = "";
                this.segment_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Data.alwaysUseFieldBuilders) {
                    getSegmentFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.name_ = "";
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.segment_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Data_descriptor;
            }

            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
            }

            public Data build() {
                Data buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Data buildPartial() {
                Data data = new Data((GeneratedMessageV3.Builder) this);
                Object unused = data.id_ = this.id_;
                Object unused2 = data.name_ = this.name_;
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.segment_ = Collections.unmodifiableList(this.segment_);
                        this.bitField0_ &= -2;
                    }
                    List unused3 = data.segment_ = this.segment_;
                } else {
                    List unused4 = data.segment_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused5 = data.ext_ = this.ext_;
                } else {
                    Struct unused6 = data.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    List unused7 = data.extProto_ = this.extProto_;
                } else {
                    List unused8 = data.extProto_ = repeatedFieldBuilderV32.build();
                }
                onBuilt();
                return data;
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
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (!data.getId().isEmpty()) {
                    this.id_ = data.id_;
                    onChanged();
                }
                if (!data.getName().isEmpty()) {
                    this.name_ = data.name_;
                    onChanged();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.segmentBuilder_ == null) {
                    if (!data.segment_.isEmpty()) {
                        if (this.segment_.isEmpty()) {
                            this.segment_ = data.segment_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSegmentIsMutable();
                            this.segment_.addAll(data.segment_);
                        }
                        onChanged();
                    }
                } else if (!data.segment_.isEmpty()) {
                    if (this.segmentBuilder_.isEmpty()) {
                        this.segmentBuilder_.dispose();
                        this.segmentBuilder_ = null;
                        this.segment_ = data.segment_;
                        this.bitField0_ &= -2;
                        this.segmentBuilder_ = Data.alwaysUseFieldBuilders ? getSegmentFieldBuilder() : null;
                    } else {
                        this.segmentBuilder_.addAllMessages(data.segment_);
                    }
                }
                if (data.hasExt()) {
                    mergeExt(data.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!data.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = data.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(data.extProto_);
                        }
                        onChanged();
                    }
                } else if (!data.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = data.extProto_;
                        this.bitField0_ &= -3;
                        if (Data.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(data.extProto_);
                    }
                }
                mergeUnknownFields(data.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.Data.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.Data.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$Data r3 = (com.explorestack.protobuf.adcom.Context.Data) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Data) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$Data r4 = (com.explorestack.protobuf.adcom.Context.Data) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Data) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Data.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Data$Builder");
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setId(String str) {
                if (str != null) {
                    this.id_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearId() {
                this.id_ = Data.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                if (byteString != null) {
                    Data.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setName(String str) {
                if (str != null) {
                    this.name_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearName() {
                this.name_ = Data.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                if (byteString != null) {
                    Data.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureSegmentIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.segment_ = new ArrayList(this.segment_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Segment> getSegmentList() {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.segment_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getSegmentCount() {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.segment_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Segment getSegment(int i) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.segment_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setSegment(int i, Segment segment) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, segment);
                } else if (segment != null) {
                    ensureSegmentIsMutable();
                    this.segment_.set(i, segment);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setSegment(int i, Segment.Builder builder) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSegmentIsMutable();
                    this.segment_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addSegment(Segment segment) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(segment);
                } else if (segment != null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(segment);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addSegment(int i, Segment segment) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, segment);
                } else if (segment != null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(i, segment);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addSegment(Segment.Builder builder) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addSegment(int i, Segment.Builder builder) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllSegment(Iterable<? extends Segment> iterable) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSegmentIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.segment_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearSegment() {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.segment_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeSegment(int i) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSegmentIsMutable();
                    this.segment_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Segment.Builder getSegmentBuilder(int i) {
                return getSegmentFieldBuilder().getBuilder(i);
            }

            public SegmentOrBuilder getSegmentOrBuilder(int i) {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.segment_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
                RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> repeatedFieldBuilderV3 = this.segmentBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.segment_);
            }

            public Segment.Builder addSegmentBuilder() {
                return getSegmentFieldBuilder().addBuilder(Segment.getDefaultInstance());
            }

            public Segment.Builder addSegmentBuilder(int i) {
                return getSegmentFieldBuilder().addBuilder(i, Segment.getDefaultInstance());
            }

            public List<Segment.Builder> getSegmentBuilderList() {
                return getSegmentFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Segment, Segment.Builder, SegmentOrBuilder> getSegmentFieldBuilder() {
                if (this.segmentBuilder_ == null) {
                    List<Segment> list = this.segment_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.segmentBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.segment_ = null;
                }
                return this.segmentBuilder_;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Data> parser() {
            return PARSER;
        }

        public Parser<Data> getParserForType() {
            return PARSER;
        }

        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Geo extends GeneratedMessageV3 implements GeoOrBuilder {
        public static final int ACCUR_FIELD_NUMBER = 4;
        public static final int CITY_FIELD_NUMBER = 10;
        public static final int COUNTRY_FIELD_NUMBER = 7;
        private static final Geo DEFAULT_INSTANCE = new Geo();
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int IPSERV_FIELD_NUMBER = 6;
        public static final int LASTFIX_FIELD_NUMBER = 5;
        public static final int LAT_FIELD_NUMBER = 2;
        public static final int LON_FIELD_NUMBER = 3;
        public static final int METRO_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final Parser<Geo> PARSER = new AbstractParser<Geo>() {
            public Geo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Geo(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int REGION_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UTCOFFSET_FIELD_NUMBER = 12;
        public static final int ZIP_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int accur_;
        /* access modifiers changed from: private */
        public volatile Object city_;
        /* access modifiers changed from: private */
        public volatile Object country_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public int ipserv_;
        /* access modifiers changed from: private */
        public long lastfix_;
        /* access modifiers changed from: private */
        public float lat_;
        /* access modifiers changed from: private */
        public float lon_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object metro_;
        /* access modifiers changed from: private */
        public volatile Object region_;
        /* access modifiers changed from: private */
        public int type_;
        /* access modifiers changed from: private */
        public int utcoffset_;
        /* access modifiers changed from: private */
        public volatile Object zip_;

        private Geo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Geo() {
            this.memoizedIsInitialized = -1;
            this.type_ = 0;
            this.ipserv_ = 0;
            this.country_ = "";
            this.region_ = "";
            this.metro_ = "";
            this.city_ = "";
            this.zip_ = "";
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Geo();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Geo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.type_ = codedInputStream.readEnum();
                                break;
                            case 21:
                                this.lat_ = codedInputStream.readFloat();
                                break;
                            case 29:
                                this.lon_ = codedInputStream.readFloat();
                                break;
                            case 32:
                                this.accur_ = codedInputStream.readUInt32();
                                break;
                            case 40:
                                this.lastfix_ = codedInputStream.readUInt64();
                                break;
                            case 48:
                                this.ipserv_ = codedInputStream.readEnum();
                                break;
                            case 58:
                                this.country_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.region_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.metro_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.city_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.zip_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 96:
                                this.utcoffset_ = codedInputStream.readInt32();
                                break;
                            case 106:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 114:
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
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
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Geo_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Geo_fieldAccessorTable.ensureFieldAccessorsInitialized(Geo.class, Builder.class);
        }

        public int getTypeValue() {
            return this.type_;
        }

        public LocationType getType() {
            LocationType valueOf = LocationType.valueOf(this.type_);
            return valueOf == null ? LocationType.UNRECOGNIZED : valueOf;
        }

        public float getLat() {
            return this.lat_;
        }

        public float getLon() {
            return this.lon_;
        }

        public int getAccur() {
            return this.accur_;
        }

        public long getLastfix() {
            return this.lastfix_;
        }

        public int getIpservValue() {
            return this.ipserv_;
        }

        public IpLocationService getIpserv() {
            IpLocationService valueOf = IpLocationService.valueOf(this.ipserv_);
            return valueOf == null ? IpLocationService.UNRECOGNIZED : valueOf;
        }

        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getMetro() {
            Object obj = this.metro_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.metro_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMetroBytes() {
            Object obj = this.metro_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.metro_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getZip() {
            Object obj = this.zip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.zip_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getZipBytes() {
            Object obj = this.zip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.zip_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getUtcoffset() {
            return this.utcoffset_;
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            if (this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            float f2 = this.lat_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(2, f2);
            }
            float f3 = this.lon_;
            if (f3 != 0.0f) {
                codedOutputStream.writeFloat(3, f3);
            }
            int i = this.accur_;
            if (i != 0) {
                codedOutputStream.writeUInt32(4, i);
            }
            long j = this.lastfix_;
            if (j != 0) {
                codedOutputStream.writeUInt64(5, j);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.zip_);
            }
            int i2 = this.utcoffset_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(12, i2);
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                codedOutputStream.writeMessage(13, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(14, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) + 0 : 0;
            float f2 = this.lat_;
            if (f2 != 0.0f) {
                computeEnumSize += CodedOutputStream.computeFloatSize(2, f2);
            }
            float f3 = this.lon_;
            if (f3 != 0.0f) {
                computeEnumSize += CodedOutputStream.computeFloatSize(3, f3);
            }
            int i2 = this.accur_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(4, i2);
            }
            long j = this.lastfix_;
            if (j != 0) {
                computeEnumSize += CodedOutputStream.computeUInt64Size(5, j);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(11, this.zip_);
            }
            int i3 = this.utcoffset_;
            if (i3 != 0) {
                computeEnumSize += CodedOutputStream.computeInt32Size(12, i3);
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(13, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(14, getExt());
            }
            int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Geo)) {
                return super.equals(obj);
            }
            Geo geo = (Geo) obj;
            if (this.type_ != geo.type_ || Float.floatToIntBits(getLat()) != Float.floatToIntBits(geo.getLat()) || Float.floatToIntBits(getLon()) != Float.floatToIntBits(geo.getLon()) || getAccur() != geo.getAccur() || getLastfix() != geo.getLastfix() || this.ipserv_ != geo.ipserv_ || !getCountry().equals(geo.getCountry()) || !getRegion().equals(geo.getRegion()) || !getMetro().equals(geo.getMetro()) || !getCity().equals(geo.getCity()) || !getZip().equals(geo.getZip()) || getUtcoffset() != geo.getUtcoffset() || hasExt() != geo.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(geo.getExt())) && getExtProtoList().equals(geo.getExtProtoList()) && this.unknownFields.equals(geo.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + Float.floatToIntBits(getLat())) * 37) + 3) * 53) + Float.floatToIntBits(getLon())) * 37) + 4) * 53) + getAccur()) * 37) + 5) * 53) + Internal.hashLong(getLastfix())) * 37) + 6) * 53) + this.ipserv_) * 37) + 7) * 53) + getCountry().hashCode()) * 37) + 8) * 53) + getRegion().hashCode()) * 37) + 9) * 53) + getMetro().hashCode()) * 37) + 10) * 53) + getCity().hashCode()) * 37) + 11) * 53) + getZip().hashCode()) * 37) + 12) * 53) + getUtcoffset();
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 14) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 13) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Geo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Geo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Geo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(geo);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GeoOrBuilder {
            private int accur_;
            private int bitField0_;
            private Object city_;
            private Object country_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int ipserv_;
            private long lastfix_;
            private float lat_;
            private float lon_;
            private Object metro_;
            private Object region_;
            private int type_;
            private int utcoffset_;
            private Object zip_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Geo_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Geo_fieldAccessorTable.ensureFieldAccessorsInitialized(Geo.class, Builder.class);
            }

            private Builder() {
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Geo.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.lat_ = 0.0f;
                this.lon_ = 0.0f;
                this.accur_ = 0;
                this.lastfix_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.utcoffset_ = 0;
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Geo_descriptor;
            }

            public Geo getDefaultInstanceForType() {
                return Geo.getDefaultInstance();
            }

            public Geo build() {
                Geo buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Geo buildPartial() {
                Geo geo = new Geo((GeneratedMessageV3.Builder) this);
                int unused = geo.type_ = this.type_;
                float unused2 = geo.lat_ = this.lat_;
                float unused3 = geo.lon_ = this.lon_;
                int unused4 = geo.accur_ = this.accur_;
                long unused5 = geo.lastfix_ = this.lastfix_;
                int unused6 = geo.ipserv_ = this.ipserv_;
                Object unused7 = geo.country_ = this.country_;
                Object unused8 = geo.region_ = this.region_;
                Object unused9 = geo.metro_ = this.metro_;
                Object unused10 = geo.city_ = this.city_;
                Object unused11 = geo.zip_ = this.zip_;
                int unused12 = geo.utcoffset_ = this.utcoffset_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused13 = geo.ext_ = this.ext_;
                } else {
                    Struct unused14 = geo.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    List unused15 = geo.extProto_ = this.extProto_;
                } else {
                    List unused16 = geo.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return geo;
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
                if (message instanceof Geo) {
                    return mergeFrom((Geo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Geo geo) {
                if (geo == Geo.getDefaultInstance()) {
                    return this;
                }
                if (geo.type_ != 0) {
                    setTypeValue(geo.getTypeValue());
                }
                if (geo.getLat() != 0.0f) {
                    setLat(geo.getLat());
                }
                if (geo.getLon() != 0.0f) {
                    setLon(geo.getLon());
                }
                if (geo.getAccur() != 0) {
                    setAccur(geo.getAccur());
                }
                if (geo.getLastfix() != 0) {
                    setLastfix(geo.getLastfix());
                }
                if (geo.ipserv_ != 0) {
                    setIpservValue(geo.getIpservValue());
                }
                if (!geo.getCountry().isEmpty()) {
                    this.country_ = geo.country_;
                    onChanged();
                }
                if (!geo.getRegion().isEmpty()) {
                    this.region_ = geo.region_;
                    onChanged();
                }
                if (!geo.getMetro().isEmpty()) {
                    this.metro_ = geo.metro_;
                    onChanged();
                }
                if (!geo.getCity().isEmpty()) {
                    this.city_ = geo.city_;
                    onChanged();
                }
                if (!geo.getZip().isEmpty()) {
                    this.zip_ = geo.zip_;
                    onChanged();
                }
                if (geo.getUtcoffset() != 0) {
                    setUtcoffset(geo.getUtcoffset());
                }
                if (geo.hasExt()) {
                    mergeExt(geo.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!geo.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = geo.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(geo.extProto_);
                        }
                        onChanged();
                    }
                } else if (!geo.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = geo.extProto_;
                        this.bitField0_ &= -2;
                        if (Geo.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(geo.extProto_);
                    }
                }
                mergeUnknownFields(geo.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.Geo.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.Geo.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$Geo r3 = (com.explorestack.protobuf.adcom.Context.Geo) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Geo) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$Geo r4 = (com.explorestack.protobuf.adcom.Context.Geo) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Geo) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Geo.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Geo$Builder");
            }

            public int getTypeValue() {
                return this.type_;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
                return this;
            }

            public LocationType getType() {
                LocationType valueOf = LocationType.valueOf(this.type_);
                return valueOf == null ? LocationType.UNRECOGNIZED : valueOf;
            }

            public Builder setType(LocationType locationType) {
                if (locationType != null) {
                    this.type_ = locationType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public float getLat() {
                return this.lat_;
            }

            public Builder setLat(float f2) {
                this.lat_ = f2;
                onChanged();
                return this;
            }

            public Builder clearLat() {
                this.lat_ = 0.0f;
                onChanged();
                return this;
            }

            public float getLon() {
                return this.lon_;
            }

            public Builder setLon(float f2) {
                this.lon_ = f2;
                onChanged();
                return this;
            }

            public Builder clearLon() {
                this.lon_ = 0.0f;
                onChanged();
                return this;
            }

            public int getAccur() {
                return this.accur_;
            }

            public Builder setAccur(int i) {
                this.accur_ = i;
                onChanged();
                return this;
            }

            public Builder clearAccur() {
                this.accur_ = 0;
                onChanged();
                return this;
            }

            public long getLastfix() {
                return this.lastfix_;
            }

            public Builder setLastfix(long j) {
                this.lastfix_ = j;
                onChanged();
                return this;
            }

            public Builder clearLastfix() {
                this.lastfix_ = 0;
                onChanged();
                return this;
            }

            public int getIpservValue() {
                return this.ipserv_;
            }

            public Builder setIpservValue(int i) {
                this.ipserv_ = i;
                onChanged();
                return this;
            }

            public IpLocationService getIpserv() {
                IpLocationService valueOf = IpLocationService.valueOf(this.ipserv_);
                return valueOf == null ? IpLocationService.UNRECOGNIZED : valueOf;
            }

            public Builder setIpserv(IpLocationService ipLocationService) {
                if (ipLocationService != null) {
                    this.ipserv_ = ipLocationService.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearIpserv() {
                this.ipserv_ = 0;
                onChanged();
                return this;
            }

            public String getCountry() {
                Object obj = this.country_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.country_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCountryBytes() {
                Object obj = this.country_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.country_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCountry(String str) {
                if (str != null) {
                    this.country_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCountry() {
                this.country_ = Geo.getDefaultInstance().getCountry();
                onChanged();
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) {
                if (byteString != null) {
                    Geo.checkByteStringIsUtf8(byteString);
                    this.country_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getRegion() {
                Object obj = this.region_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.region_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getRegionBytes() {
                Object obj = this.region_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.region_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setRegion(String str) {
                if (str != null) {
                    this.region_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearRegion() {
                this.region_ = Geo.getDefaultInstance().getRegion();
                onChanged();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) {
                if (byteString != null) {
                    Geo.checkByteStringIsUtf8(byteString);
                    this.region_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMetro() {
                Object obj = this.metro_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.metro_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMetroBytes() {
                Object obj = this.metro_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.metro_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMetro(String str) {
                if (str != null) {
                    this.metro_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMetro() {
                this.metro_ = Geo.getDefaultInstance().getMetro();
                onChanged();
                return this;
            }

            public Builder setMetroBytes(ByteString byteString) {
                if (byteString != null) {
                    Geo.checkByteStringIsUtf8(byteString);
                    this.metro_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCity(String str) {
                if (str != null) {
                    this.city_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCity() {
                this.city_ = Geo.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) {
                if (byteString != null) {
                    Geo.checkByteStringIsUtf8(byteString);
                    this.city_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getZip() {
                Object obj = this.zip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.zip_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getZipBytes() {
                Object obj = this.zip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.zip_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setZip(String str) {
                if (str != null) {
                    this.zip_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearZip() {
                this.zip_ = Geo.getDefaultInstance().getZip();
                onChanged();
                return this;
            }

            public Builder setZipBytes(ByteString byteString) {
                if (byteString != null) {
                    Geo.checkByteStringIsUtf8(byteString);
                    this.zip_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getUtcoffset() {
                return this.utcoffset_;
            }

            public Builder setUtcoffset(int i) {
                this.utcoffset_ = i;
                onChanged();
                return this;
            }

            public Builder clearUtcoffset() {
                this.utcoffset_ = 0;
                onChanged();
                return this;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Geo> parser() {
            return PARSER;
        }

        public Parser<Geo> getParserForType() {
            return PARSER;
        }

        public Geo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Device extends GeneratedMessageV3 implements DeviceOrBuilder {
        public static final int CARRIER_FIELD_NUMBER = 21;
        public static final int CONTYPE_FIELD_NUMBER = 24;
        private static final Device DEFAULT_INSTANCE = new Device();
        public static final int DNT_FIELD_NUMBER = 4;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int GEOFETCH_FIELD_NUMBER = 25;
        public static final int GEO_FIELD_NUMBER = 26;
        public static final int HWV_FIELD_NUMBER = 10;
        public static final int H_FIELD_NUMBER = 11;
        public static final int IFA_FIELD_NUMBER = 3;
        public static final int IPTR_FIELD_NUMBER = 20;
        public static final int IPV6_FIELD_NUMBER = 18;
        public static final int IP_FIELD_NUMBER = 17;
        public static final int JS_FIELD_NUMBER = 15;
        public static final int LANG_FIELD_NUMBER = 16;
        public static final int LMT_FIELD_NUMBER = 5;
        public static final int MAKE_FIELD_NUMBER = 6;
        public static final int MCCMNCSIM_FIELD_NUMBER = 23;
        public static final int MCCMNC_FIELD_NUMBER = 22;
        public static final int MODEL_FIELD_NUMBER = 7;
        public static final int OSV_FIELD_NUMBER = 9;
        public static final int OS_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final Parser<Device> PARSER = new AbstractParser<Device>() {
            public Device parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Device(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PPI_FIELD_NUMBER = 13;
        public static final int PXRATIO_FIELD_NUMBER = 14;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UA_FIELD_NUMBER = 2;
        public static final int W_FIELD_NUMBER = 12;
        public static final int XFF_FIELD_NUMBER = 19;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object carrier_;
        /* access modifiers changed from: private */
        public int contype_;
        /* access modifiers changed from: private */
        public boolean dnt_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public Geo geo_;
        /* access modifiers changed from: private */
        public boolean geofetch_;
        /* access modifiers changed from: private */
        public int h_;
        /* access modifiers changed from: private */
        public volatile Object hwv_;
        /* access modifiers changed from: private */
        public volatile Object ifa_;
        /* access modifiers changed from: private */
        public volatile Object ip_;
        /* access modifiers changed from: private */
        public boolean iptr_;
        /* access modifiers changed from: private */
        public volatile Object ipv6_;
        /* access modifiers changed from: private */
        public boolean js_;
        /* access modifiers changed from: private */
        public volatile Object lang_;
        /* access modifiers changed from: private */
        public boolean lmt_;
        /* access modifiers changed from: private */
        public volatile Object make_;
        /* access modifiers changed from: private */
        public volatile Object mccmnc_;
        /* access modifiers changed from: private */
        public volatile Object mccmncsim_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object model_;
        /* access modifiers changed from: private */
        public int os_;
        /* access modifiers changed from: private */
        public volatile Object osv_;
        /* access modifiers changed from: private */
        public int ppi_;
        /* access modifiers changed from: private */
        public float pxratio_;
        /* access modifiers changed from: private */
        public int type_;
        /* access modifiers changed from: private */
        public volatile Object ua_;
        /* access modifiers changed from: private */
        public int w_;
        /* access modifiers changed from: private */
        public volatile Object xff_;

        private Device(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Device() {
            this.memoizedIsInitialized = -1;
            this.type_ = 0;
            this.ua_ = "";
            this.ifa_ = "";
            this.make_ = "";
            this.model_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.hwv_ = "";
            this.lang_ = "";
            this.ip_ = "";
            this.ipv6_ = "";
            this.xff_ = "";
            this.carrier_ = "";
            this.mccmnc_ = "";
            this.mccmncsim_ = "";
            this.contype_ = 0;
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Device();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Device(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.type_ = codedInputStream.readEnum();
                                break;
                            case 18:
                                this.ua_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                this.ifa_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 32:
                                this.dnt_ = codedInputStream.readBool();
                                break;
                            case 40:
                                this.lmt_ = codedInputStream.readBool();
                                break;
                            case 50:
                                this.make_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.model_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 64:
                                this.os_ = codedInputStream.readEnum();
                                break;
                            case 74:
                                this.osv_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.hwv_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 88:
                                this.h_ = codedInputStream.readUInt32();
                                break;
                            case 96:
                                this.w_ = codedInputStream.readUInt32();
                                break;
                            case 104:
                                this.ppi_ = codedInputStream.readUInt32();
                                break;
                            case 117:
                                this.pxratio_ = codedInputStream.readFloat();
                                break;
                            case 120:
                                this.js_ = codedInputStream.readBool();
                                break;
                            case 130:
                                this.lang_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 138:
                                this.ip_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 146:
                                this.ipv6_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 154:
                                this.xff_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 160:
                                this.iptr_ = codedInputStream.readBool();
                                break;
                            case 170:
                                this.carrier_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 178:
                                this.mccmnc_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 186:
                                this.mccmncsim_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 192:
                                this.contype_ = codedInputStream.readEnum();
                                break;
                            case 200:
                                this.geofetch_ = codedInputStream.readBool();
                                break;
                            case LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE:
                                Geo.Builder builder = this.geo_ != null ? this.geo_.toBuilder() : null;
                                Geo geo = (Geo) codedInputStream.readMessage(Geo.parser(), extensionRegistryLite);
                                this.geo_ = geo;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(geo);
                                    this.geo_ = builder.buildPartial();
                                    break;
                                }
                            case 218:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 226:
                                Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(struct);
                                    this.ext_ = builder2.buildPartial();
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
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Device_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
        }

        public int getTypeValue() {
            return this.type_;
        }

        public DeviceType getType() {
            DeviceType valueOf = DeviceType.valueOf(this.type_);
            return valueOf == null ? DeviceType.UNRECOGNIZED : valueOf;
        }

        public String getUa() {
            Object obj = this.ua_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ua_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUaBytes() {
            Object obj = this.ua_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ua_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getDnt() {
            return this.dnt_;
        }

        public boolean getLmt() {
            return this.lmt_;
        }

        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getOsValue() {
            return this.os_;
        }

        public OS getOs() {
            OS valueOf = OS.valueOf(this.os_);
            return valueOf == null ? OS.UNRECOGNIZED : valueOf;
        }

        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getH() {
            return this.h_;
        }

        public int getW() {
            return this.w_;
        }

        public int getPpi() {
            return this.ppi_;
        }

        public float getPxratio() {
            return this.pxratio_;
        }

        public boolean getJs() {
            return this.js_;
        }

        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getIp() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ip_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIpBytes() {
            Object obj = this.ip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ip_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getIpv6() {
            Object obj = this.ipv6_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ipv6_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIpv6Bytes() {
            Object obj = this.ipv6_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ipv6_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getXff() {
            Object obj = this.xff_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.xff_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getXffBytes() {
            Object obj = this.xff_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.xff_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getIptr() {
            return this.iptr_;
        }

        public String getCarrier() {
            Object obj = this.carrier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.carrier_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCarrierBytes() {
            Object obj = this.carrier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.carrier_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getMccmnc() {
            Object obj = this.mccmnc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmnc_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMccmncBytes() {
            Object obj = this.mccmnc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmnc_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getMccmncsim() {
            Object obj = this.mccmncsim_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmncsim_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMccmncsimBytes() {
            Object obj = this.mccmncsim_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmncsim_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getContypeValue() {
            return this.contype_;
        }

        public ConnectionType getContype() {
            ConnectionType valueOf = ConnectionType.valueOf(this.contype_);
            return valueOf == null ? ConnectionType.UNRECOGNIZED : valueOf;
        }

        public boolean getGeofetch() {
            return this.geofetch_;
        }

        public boolean hasGeo() {
            return this.geo_ != null;
        }

        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            if (this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (!getUaBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.ifa_);
            }
            boolean z = this.dnt_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            boolean z2 = this.lmt_;
            if (z2) {
                codedOutputStream.writeBool(5, z2);
            }
            if (!getMakeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                codedOutputStream.writeEnum(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.hwv_);
            }
            int i = this.h_;
            if (i != 0) {
                codedOutputStream.writeUInt32(11, i);
            }
            int i2 = this.w_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(12, i2);
            }
            int i3 = this.ppi_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(13, i3);
            }
            float f2 = this.pxratio_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(14, f2);
            }
            boolean z3 = this.js_;
            if (z3) {
                codedOutputStream.writeBool(15, z3);
            }
            if (!getLangBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 19, this.xff_);
            }
            boolean z4 = this.iptr_;
            if (z4) {
                codedOutputStream.writeBool(20, z4);
            }
            if (!getCarrierBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(24, this.contype_);
            }
            boolean z5 = this.geofetch_;
            if (z5) {
                codedOutputStream.writeBool(25, z5);
            }
            if (this.geo_ != null) {
                codedOutputStream.writeMessage(26, getGeo());
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                codedOutputStream.writeMessage(27, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(28, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) + 0 : 0;
            if (!getUaBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(3, this.ifa_);
            }
            boolean z = this.dnt_;
            if (z) {
                computeEnumSize += CodedOutputStream.computeBoolSize(4, z);
            }
            boolean z2 = this.lmt_;
            if (z2) {
                computeEnumSize += CodedOutputStream.computeBoolSize(5, z2);
            }
            if (!getMakeBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(10, this.hwv_);
            }
            int i2 = this.h_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(11, i2);
            }
            int i3 = this.w_;
            if (i3 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(12, i3);
            }
            int i4 = this.ppi_;
            if (i4 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(13, i4);
            }
            float f2 = this.pxratio_;
            if (f2 != 0.0f) {
                computeEnumSize += CodedOutputStream.computeFloatSize(14, f2);
            }
            boolean z3 = this.js_;
            if (z3) {
                computeEnumSize += CodedOutputStream.computeBoolSize(15, z3);
            }
            if (!getLangBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(19, this.xff_);
            }
            boolean z4 = this.iptr_;
            if (z4) {
                computeEnumSize += CodedOutputStream.computeBoolSize(20, z4);
            }
            if (!getCarrierBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                computeEnumSize += GeneratedMessageV3.computeStringSize(23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(24, this.contype_);
            }
            boolean z5 = this.geofetch_;
            if (z5) {
                computeEnumSize += CodedOutputStream.computeBoolSize(25, z5);
            }
            if (this.geo_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(26, getGeo());
            }
            for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                computeEnumSize += CodedOutputStream.computeMessageSize(27, this.extProto_.get(i5));
            }
            if (this.ext_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(28, getExt());
            }
            int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (this.type_ != device.type_ || !getUa().equals(device.getUa()) || !getIfa().equals(device.getIfa()) || getDnt() != device.getDnt() || getLmt() != device.getLmt() || !getMake().equals(device.getMake()) || !getModel().equals(device.getModel()) || this.os_ != device.os_ || !getOsv().equals(device.getOsv()) || !getHwv().equals(device.getHwv()) || getH() != device.getH() || getW() != device.getW() || getPpi() != device.getPpi() || Float.floatToIntBits(getPxratio()) != Float.floatToIntBits(device.getPxratio()) || getJs() != device.getJs() || !getLang().equals(device.getLang()) || !getIp().equals(device.getIp()) || !getIpv6().equals(device.getIpv6()) || !getXff().equals(device.getXff()) || getIptr() != device.getIptr() || !getCarrier().equals(device.getCarrier()) || !getMccmnc().equals(device.getMccmnc()) || !getMccmncsim().equals(device.getMccmncsim()) || this.contype_ != device.contype_ || getGeofetch() != device.getGeofetch() || hasGeo() != device.hasGeo()) {
                return false;
            }
            if ((hasGeo() && !getGeo().equals(device.getGeo())) || hasExt() != device.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(device.getExt())) && getExtProtoList().equals(device.getExtProtoList()) && this.unknownFields.equals(device.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + getUa().hashCode()) * 37) + 3) * 53) + getIfa().hashCode()) * 37) + 4) * 53) + Internal.hashBoolean(getDnt())) * 37) + 5) * 53) + Internal.hashBoolean(getLmt())) * 37) + 6) * 53) + getMake().hashCode()) * 37) + 7) * 53) + getModel().hashCode()) * 37) + 8) * 53) + this.os_) * 37) + 9) * 53) + getOsv().hashCode()) * 37) + 10) * 53) + getHwv().hashCode()) * 37) + 11) * 53) + getH()) * 37) + 12) * 53) + getW()) * 37) + 13) * 53) + getPpi()) * 37) + 14) * 53) + Float.floatToIntBits(getPxratio())) * 37) + 15) * 53) + Internal.hashBoolean(getJs())) * 37) + 16) * 53) + getLang().hashCode()) * 37) + 17) * 53) + getIp().hashCode()) * 37) + 18) * 53) + getIpv6().hashCode()) * 37) + 19) * 53) + getXff().hashCode()) * 37) + 20) * 53) + Internal.hashBoolean(getIptr())) * 37) + 21) * 53) + getCarrier().hashCode()) * 37) + 22) * 53) + getMccmnc().hashCode()) * 37) + 23) * 53) + getMccmncsim().hashCode()) * 37) + 24) * 53) + this.contype_) * 37) + 25) * 53) + Internal.hashBoolean(getGeofetch());
            if (hasGeo()) {
                hashCode = (((hashCode * 37) + 26) * 53) + getGeo().hashCode();
            }
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 28) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 27) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceOrBuilder {
            private int bitField0_;
            private Object carrier_;
            private int contype_;
            private boolean dnt_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> geoBuilder_;
            private Geo geo_;
            private boolean geofetch_;
            private int h_;
            private Object hwv_;
            private Object ifa_;
            private Object ip_;
            private boolean iptr_;
            private Object ipv6_;
            private boolean js_;
            private Object lang_;
            private boolean lmt_;
            private Object make_;
            private Object mccmnc_;
            private Object mccmncsim_;
            private Object model_;
            private int os_;
            private Object osv_;
            private int ppi_;
            private float pxratio_;
            private int type_;
            private Object ua_;
            private int w_;
            private Object xff_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Device_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
            }

            private Builder() {
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Device.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.dnt_ = false;
                this.lmt_ = false;
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.h_ = 0;
                this.w_ = 0;
                this.ppi_ = 0;
                this.pxratio_ = 0.0f;
                this.js_ = false;
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.iptr_ = false;
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.geofetch_ = false;
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
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Device_descriptor;
            }

            public Device getDefaultInstanceForType() {
                return Device.getDefaultInstance();
            }

            public Device build() {
                Device buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Device buildPartial() {
                Device device = new Device((GeneratedMessageV3.Builder) this);
                int unused = device.type_ = this.type_;
                Object unused2 = device.ua_ = this.ua_;
                Object unused3 = device.ifa_ = this.ifa_;
                boolean unused4 = device.dnt_ = this.dnt_;
                boolean unused5 = device.lmt_ = this.lmt_;
                Object unused6 = device.make_ = this.make_;
                Object unused7 = device.model_ = this.model_;
                int unused8 = device.os_ = this.os_;
                Object unused9 = device.osv_ = this.osv_;
                Object unused10 = device.hwv_ = this.hwv_;
                int unused11 = device.h_ = this.h_;
                int unused12 = device.w_ = this.w_;
                int unused13 = device.ppi_ = this.ppi_;
                float unused14 = device.pxratio_ = this.pxratio_;
                boolean unused15 = device.js_ = this.js_;
                Object unused16 = device.lang_ = this.lang_;
                Object unused17 = device.ip_ = this.ip_;
                Object unused18 = device.ipv6_ = this.ipv6_;
                Object unused19 = device.xff_ = this.xff_;
                boolean unused20 = device.iptr_ = this.iptr_;
                Object unused21 = device.carrier_ = this.carrier_;
                Object unused22 = device.mccmnc_ = this.mccmnc_;
                Object unused23 = device.mccmncsim_ = this.mccmncsim_;
                int unused24 = device.contype_ = this.contype_;
                boolean unused25 = device.geofetch_ = this.geofetch_;
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Geo unused26 = device.geo_ = this.geo_;
                } else {
                    Geo unused27 = device.geo_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Struct unused28 = device.ext_ = this.ext_;
                } else {
                    Struct unused29 = device.ext_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    List unused30 = device.extProto_ = this.extProto_;
                } else {
                    List unused31 = device.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return device;
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
                if (message instanceof Device) {
                    return mergeFrom((Device) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (device.type_ != 0) {
                    setTypeValue(device.getTypeValue());
                }
                if (!device.getUa().isEmpty()) {
                    this.ua_ = device.ua_;
                    onChanged();
                }
                if (!device.getIfa().isEmpty()) {
                    this.ifa_ = device.ifa_;
                    onChanged();
                }
                if (device.getDnt()) {
                    setDnt(device.getDnt());
                }
                if (device.getLmt()) {
                    setLmt(device.getLmt());
                }
                if (!device.getMake().isEmpty()) {
                    this.make_ = device.make_;
                    onChanged();
                }
                if (!device.getModel().isEmpty()) {
                    this.model_ = device.model_;
                    onChanged();
                }
                if (device.os_ != 0) {
                    setOsValue(device.getOsValue());
                }
                if (!device.getOsv().isEmpty()) {
                    this.osv_ = device.osv_;
                    onChanged();
                }
                if (!device.getHwv().isEmpty()) {
                    this.hwv_ = device.hwv_;
                    onChanged();
                }
                if (device.getH() != 0) {
                    setH(device.getH());
                }
                if (device.getW() != 0) {
                    setW(device.getW());
                }
                if (device.getPpi() != 0) {
                    setPpi(device.getPpi());
                }
                if (device.getPxratio() != 0.0f) {
                    setPxratio(device.getPxratio());
                }
                if (device.getJs()) {
                    setJs(device.getJs());
                }
                if (!device.getLang().isEmpty()) {
                    this.lang_ = device.lang_;
                    onChanged();
                }
                if (!device.getIp().isEmpty()) {
                    this.ip_ = device.ip_;
                    onChanged();
                }
                if (!device.getIpv6().isEmpty()) {
                    this.ipv6_ = device.ipv6_;
                    onChanged();
                }
                if (!device.getXff().isEmpty()) {
                    this.xff_ = device.xff_;
                    onChanged();
                }
                if (device.getIptr()) {
                    setIptr(device.getIptr());
                }
                if (!device.getCarrier().isEmpty()) {
                    this.carrier_ = device.carrier_;
                    onChanged();
                }
                if (!device.getMccmnc().isEmpty()) {
                    this.mccmnc_ = device.mccmnc_;
                    onChanged();
                }
                if (!device.getMccmncsim().isEmpty()) {
                    this.mccmncsim_ = device.mccmncsim_;
                    onChanged();
                }
                if (device.contype_ != 0) {
                    setContypeValue(device.getContypeValue());
                }
                if (device.getGeofetch()) {
                    setGeofetch(device.getGeofetch());
                }
                if (device.hasGeo()) {
                    mergeGeo(device.getGeo());
                }
                if (device.hasExt()) {
                    mergeExt(device.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!device.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = device.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(device.extProto_);
                        }
                        onChanged();
                    }
                } else if (!device.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = device.extProto_;
                        this.bitField0_ &= -2;
                        if (Device.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(device.extProto_);
                    }
                }
                mergeUnknownFields(device.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.Device.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.Device.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$Device r3 = (com.explorestack.protobuf.adcom.Context.Device) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Device) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$Device r4 = (com.explorestack.protobuf.adcom.Context.Device) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Device) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Device$Builder");
            }

            public int getTypeValue() {
                return this.type_;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
                return this;
            }

            public DeviceType getType() {
                DeviceType valueOf = DeviceType.valueOf(this.type_);
                return valueOf == null ? DeviceType.UNRECOGNIZED : valueOf;
            }

            public Builder setType(DeviceType deviceType) {
                if (deviceType != null) {
                    this.type_ = deviceType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public String getUa() {
                Object obj = this.ua_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ua_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getUaBytes() {
                Object obj = this.ua_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ua_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setUa(String str) {
                if (str != null) {
                    this.ua_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUa() {
                this.ua_ = Device.getDefaultInstance().getUa();
                onChanged();
                return this;
            }

            public Builder setUaBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.ua_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getIfa() {
                Object obj = this.ifa_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifa_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIfaBytes() {
                Object obj = this.ifa_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifa_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setIfa(String str) {
                if (str != null) {
                    this.ifa_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearIfa() {
                this.ifa_ = Device.getDefaultInstance().getIfa();
                onChanged();
                return this;
            }

            public Builder setIfaBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.ifa_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean getDnt() {
                return this.dnt_;
            }

            public Builder setDnt(boolean z) {
                this.dnt_ = z;
                onChanged();
                return this;
            }

            public Builder clearDnt() {
                this.dnt_ = false;
                onChanged();
                return this;
            }

            public boolean getLmt() {
                return this.lmt_;
            }

            public Builder setLmt(boolean z) {
                this.lmt_ = z;
                onChanged();
                return this;
            }

            public Builder clearLmt() {
                this.lmt_ = false;
                onChanged();
                return this;
            }

            public String getMake() {
                Object obj = this.make_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.make_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMakeBytes() {
                Object obj = this.make_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.make_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMake(String str) {
                if (str != null) {
                    this.make_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMake() {
                this.make_ = Device.getDefaultInstance().getMake();
                onChanged();
                return this;
            }

            public Builder setMakeBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.make_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getModel() {
                Object obj = this.model_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.model_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getModelBytes() {
                Object obj = this.model_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setModel(String str) {
                if (str != null) {
                    this.model_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearModel() {
                this.model_ = Device.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.model_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getOsValue() {
                return this.os_;
            }

            public Builder setOsValue(int i) {
                this.os_ = i;
                onChanged();
                return this;
            }

            public OS getOs() {
                OS valueOf = OS.valueOf(this.os_);
                return valueOf == null ? OS.UNRECOGNIZED : valueOf;
            }

            public Builder setOs(OS os) {
                if (os != null) {
                    this.os_ = os.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearOs() {
                this.os_ = 0;
                onChanged();
                return this;
            }

            public String getOsv() {
                Object obj = this.osv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.osv_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getOsvBytes() {
                Object obj = this.osv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.osv_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setOsv(String str) {
                if (str != null) {
                    this.osv_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearOsv() {
                this.osv_ = Device.getDefaultInstance().getOsv();
                onChanged();
                return this;
            }

            public Builder setOsvBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.osv_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getHwv() {
                Object obj = this.hwv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.hwv_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getHwvBytes() {
                Object obj = this.hwv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.hwv_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setHwv(String str) {
                if (str != null) {
                    this.hwv_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearHwv() {
                this.hwv_ = Device.getDefaultInstance().getHwv();
                onChanged();
                return this;
            }

            public Builder setHwvBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.hwv_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getH() {
                return this.h_;
            }

            public Builder setH(int i) {
                this.h_ = i;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public int getW() {
                return this.w_;
            }

            public Builder setW(int i) {
                this.w_ = i;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            public int getPpi() {
                return this.ppi_;
            }

            public Builder setPpi(int i) {
                this.ppi_ = i;
                onChanged();
                return this;
            }

            public Builder clearPpi() {
                this.ppi_ = 0;
                onChanged();
                return this;
            }

            public float getPxratio() {
                return this.pxratio_;
            }

            public Builder setPxratio(float f2) {
                this.pxratio_ = f2;
                onChanged();
                return this;
            }

            public Builder clearPxratio() {
                this.pxratio_ = 0.0f;
                onChanged();
                return this;
            }

            public boolean getJs() {
                return this.js_;
            }

            public Builder setJs(boolean z) {
                this.js_ = z;
                onChanged();
                return this;
            }

            public Builder clearJs() {
                this.js_ = false;
                onChanged();
                return this;
            }

            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLang(String str) {
                if (str != null) {
                    this.lang_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLang() {
                this.lang_ = Device.getDefaultInstance().getLang();
                onChanged();
                return this;
            }

            public Builder setLangBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.lang_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getIp() {
                Object obj = this.ip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ip_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIpBytes() {
                Object obj = this.ip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ip_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setIp(String str) {
                if (str != null) {
                    this.ip_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearIp() {
                this.ip_ = Device.getDefaultInstance().getIp();
                onChanged();
                return this;
            }

            public Builder setIpBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.ip_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getIpv6() {
                Object obj = this.ipv6_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ipv6_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIpv6Bytes() {
                Object obj = this.ipv6_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ipv6_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setIpv6(String str) {
                if (str != null) {
                    this.ipv6_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearIpv6() {
                this.ipv6_ = Device.getDefaultInstance().getIpv6();
                onChanged();
                return this;
            }

            public Builder setIpv6Bytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.ipv6_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getXff() {
                Object obj = this.xff_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.xff_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getXffBytes() {
                Object obj = this.xff_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.xff_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setXff(String str) {
                if (str != null) {
                    this.xff_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearXff() {
                this.xff_ = Device.getDefaultInstance().getXff();
                onChanged();
                return this;
            }

            public Builder setXffBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.xff_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean getIptr() {
                return this.iptr_;
            }

            public Builder setIptr(boolean z) {
                this.iptr_ = z;
                onChanged();
                return this;
            }

            public Builder clearIptr() {
                this.iptr_ = false;
                onChanged();
                return this;
            }

            public String getCarrier() {
                Object obj = this.carrier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.carrier_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCarrierBytes() {
                Object obj = this.carrier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.carrier_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCarrier(String str) {
                if (str != null) {
                    this.carrier_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCarrier() {
                this.carrier_ = Device.getDefaultInstance().getCarrier();
                onChanged();
                return this;
            }

            public Builder setCarrierBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.carrier_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMccmnc() {
                Object obj = this.mccmnc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmnc_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMccmncBytes() {
                Object obj = this.mccmnc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmnc_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMccmnc(String str) {
                if (str != null) {
                    this.mccmnc_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMccmnc() {
                this.mccmnc_ = Device.getDefaultInstance().getMccmnc();
                onChanged();
                return this;
            }

            public Builder setMccmncBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.mccmnc_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getMccmncsim() {
                Object obj = this.mccmncsim_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmncsim_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMccmncsimBytes() {
                Object obj = this.mccmncsim_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmncsim_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMccmncsim(String str) {
                if (str != null) {
                    this.mccmncsim_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMccmncsim() {
                this.mccmncsim_ = Device.getDefaultInstance().getMccmncsim();
                onChanged();
                return this;
            }

            public Builder setMccmncsimBytes(ByteString byteString) {
                if (byteString != null) {
                    Device.checkByteStringIsUtf8(byteString);
                    this.mccmncsim_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getContypeValue() {
                return this.contype_;
            }

            public Builder setContypeValue(int i) {
                this.contype_ = i;
                onChanged();
                return this;
            }

            public ConnectionType getContype() {
                ConnectionType valueOf = ConnectionType.valueOf(this.contype_);
                return valueOf == null ? ConnectionType.UNRECOGNIZED : valueOf;
            }

            public Builder setContype(ConnectionType connectionType) {
                if (connectionType != null) {
                    this.contype_ = connectionType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearContype() {
                this.contype_ = 0;
                onChanged();
                return this;
            }

            public boolean getGeofetch() {
                return this.geofetch_;
            }

            public Builder setGeofetch(boolean z) {
                this.geofetch_ = z;
                onChanged();
                return this;
            }

            public Builder clearGeofetch() {
                this.geofetch_ = false;
                onChanged();
                return this;
            }

            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            public Geo getGeo() {
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
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

            public Builder setGeo(Geo.Builder builder) {
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.geo_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
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

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                return this;
            }

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return getGeoFieldBuilder().getBuilder();
            }

            public GeoOrBuilder getGeoOrBuilder() {
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            private SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new SingleFieldBuilderV3<>(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Device> parser() {
            return PARSER;
        }

        public Parser<Device> getParserForType() {
            return PARSER;
        }

        public Device getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Regs extends GeneratedMessageV3 implements RegsOrBuilder {
        public static final int COPPA_FIELD_NUMBER = 1;
        private static final Regs DEFAULT_INSTANCE = new Regs();
        public static final int EXT_FIELD_NUMBER = 4;
        public static final int EXT_PROTO_FIELD_NUMBER = 3;
        public static final int GDPR_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<Regs> PARSER = new AbstractParser<Regs>() {
            public Regs parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Regs(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public boolean coppa_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public boolean gdpr_;
        private byte memoizedIsInitialized;

        private Regs(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Regs() {
            this.memoizedIsInitialized = -1;
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Regs();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Regs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.coppa_ = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.gdpr_ = codedInputStream.readBool();
                            } else if (readTag == 26) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 34) {
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder != null) {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
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
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Regs_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Regs_fieldAccessorTable.ensureFieldAccessorsInitialized(Regs.class, Builder.class);
        }

        public boolean getCoppa() {
            return this.coppa_;
        }

        public boolean getGdpr() {
            return this.gdpr_;
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            boolean z = this.coppa_;
            if (z) {
                codedOutputStream.writeBool(1, z);
            }
            boolean z2 = this.gdpr_;
            if (z2) {
                codedOutputStream.writeBool(2, z2);
            }
            for (int i = 0; i < this.extProto_.size(); i++) {
                codedOutputStream.writeMessage(3, this.extProto_.get(i));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(4, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            boolean z = this.coppa_;
            int computeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) + 0 : 0;
            boolean z2 = this.gdpr_;
            if (z2) {
                computeBoolSize += CodedOutputStream.computeBoolSize(2, z2);
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                computeBoolSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                computeBoolSize += CodedOutputStream.computeMessageSize(4, getExt());
            }
            int serializedSize = computeBoolSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Regs)) {
                return super.equals(obj);
            }
            Regs regs = (Regs) obj;
            if (getCoppa() != regs.getCoppa() || getGdpr() != regs.getGdpr() || hasExt() != regs.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(regs.getExt())) && getExtProtoList().equals(regs.getExtProtoList()) && this.unknownFields.equals(regs.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getCoppa())) * 37) + 2) * 53) + Internal.hashBoolean(getGdpr());
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Regs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Regs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Regs parseFrom(InputStream inputStream) throws IOException {
            return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Regs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Regs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Regs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Regs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Regs regs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(regs);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RegsOrBuilder {
            private int bitField0_;
            private boolean coppa_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean gdpr_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Regs_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Regs_fieldAccessorTable.ensureFieldAccessorsInitialized(Regs.class, Builder.class);
            }

            private Builder() {
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Regs.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.coppa_ = false;
                this.gdpr_ = false;
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Regs_descriptor;
            }

            public Regs getDefaultInstanceForType() {
                return Regs.getDefaultInstance();
            }

            public Regs build() {
                Regs buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Regs buildPartial() {
                Regs regs = new Regs((GeneratedMessageV3.Builder) this);
                boolean unused = regs.coppa_ = this.coppa_;
                boolean unused2 = regs.gdpr_ = this.gdpr_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused3 = regs.ext_ = this.ext_;
                } else {
                    Struct unused4 = regs.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    List unused5 = regs.extProto_ = this.extProto_;
                } else {
                    List unused6 = regs.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return regs;
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
                if (message instanceof Regs) {
                    return mergeFrom((Regs) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Regs regs) {
                if (regs == Regs.getDefaultInstance()) {
                    return this;
                }
                if (regs.getCoppa()) {
                    setCoppa(regs.getCoppa());
                }
                if (regs.getGdpr()) {
                    setGdpr(regs.getGdpr());
                }
                if (regs.hasExt()) {
                    mergeExt(regs.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!regs.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = regs.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(regs.extProto_);
                        }
                        onChanged();
                    }
                } else if (!regs.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = regs.extProto_;
                        this.bitField0_ &= -2;
                        if (Regs.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(regs.extProto_);
                    }
                }
                mergeUnknownFields(regs.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.Regs.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.Regs.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$Regs r3 = (com.explorestack.protobuf.adcom.Context.Regs) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Regs) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$Regs r4 = (com.explorestack.protobuf.adcom.Context.Regs) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Regs) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Regs.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Regs$Builder");
            }

            public boolean getCoppa() {
                return this.coppa_;
            }

            public Builder setCoppa(boolean z) {
                this.coppa_ = z;
                onChanged();
                return this;
            }

            public Builder clearCoppa() {
                this.coppa_ = false;
                onChanged();
                return this;
            }

            public boolean getGdpr() {
                return this.gdpr_;
            }

            public Builder setGdpr(boolean z) {
                this.gdpr_ = z;
                onChanged();
                return this;
            }

            public Builder clearGdpr() {
                this.gdpr_ = false;
                onChanged();
                return this;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Regs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Regs> parser() {
            return PARSER;
        }

        public Parser<Regs> getParserForType() {
            return PARSER;
        }

        public Regs getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Restrictions extends GeneratedMessageV3 implements RestrictionsOrBuilder {
        public static final int BADV_FIELD_NUMBER = 3;
        public static final int BAPP_FIELD_NUMBER = 4;
        public static final int BATTR_FIELD_NUMBER = 5;
        public static final int BCAT_FIELD_NUMBER = 1;
        public static final int CATTAX_FIELD_NUMBER = 2;
        private static final Restrictions DEFAULT_INSTANCE = new Restrictions();
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final Parser<Restrictions> PARSER = new AbstractParser<Restrictions>() {
            public Restrictions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Restrictions(codedInputStream, extensionRegistryLite);
            }
        };
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, CreativeAttribute> battr_converter_ = new Internal.ListAdapter.Converter<Integer, CreativeAttribute>() {
            public CreativeAttribute convert(Integer num) {
                CreativeAttribute valueOf = CreativeAttribute.valueOf(num.intValue());
                return valueOf == null ? CreativeAttribute.UNRECOGNIZED : valueOf;
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public LazyStringList badv_;
        /* access modifiers changed from: private */
        public LazyStringList bapp_;
        private int battrMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> battr_;
        /* access modifiers changed from: private */
        public LazyStringList bcat_;
        /* access modifiers changed from: private */
        public int cattax_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        private byte memoizedIsInitialized;

        private Restrictions(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Restrictions() {
            this.memoizedIsInitialized = -1;
            this.bcat_ = LazyStringArrayList.EMPTY;
            this.cattax_ = 0;
            this.badv_ = LazyStringArrayList.EMPTY;
            this.bapp_ = LazyStringArrayList.EMPTY;
            this.battr_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Restrictions();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Restrictions(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.bcat_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.bcat_.add(readStringRequireUtf8);
                            } else if (readTag == 16) {
                                this.cattax_ = codedInputStream.readEnum();
                            } else if (readTag == 26) {
                                String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.badv_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.badv_.add(readStringRequireUtf82);
                            } else if (readTag == 34) {
                                String readStringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.bapp_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.bapp_.add(readStringRequireUtf83);
                            } else if (readTag == 40) {
                                int readEnum = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.battr_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.battr_.add(Integer.valueOf(readEnum));
                            } else if (readTag == 42) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.battr_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.battr_.add(Integer.valueOf(readEnum2));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 50) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 58) {
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder != null) {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
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
                        if (z2 && true) {
                            this.bcat_ = this.bcat_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.badv_ = this.badv_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.bapp_ = this.bapp_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.battr_ = Collections.unmodifiableList(this.battr_);
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Restrictions_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Restrictions_fieldAccessorTable.ensureFieldAccessorsInitialized(Restrictions.class, Builder.class);
        }

        public ProtocolStringList getBcatList() {
            return this.bcat_;
        }

        public int getBcatCount() {
            return this.bcat_.size();
        }

        public String getBcat(int i) {
            return (String) this.bcat_.get(i);
        }

        public ByteString getBcatBytes(int i) {
            return this.bcat_.getByteString(i);
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
        }

        public ProtocolStringList getBadvList() {
            return this.badv_;
        }

        public int getBadvCount() {
            return this.badv_.size();
        }

        public String getBadv(int i) {
            return (String) this.badv_.get(i);
        }

        public ByteString getBadvBytes(int i) {
            return this.badv_.getByteString(i);
        }

        public ProtocolStringList getBappList() {
            return this.bapp_;
        }

        public int getBappCount() {
            return this.bapp_.size();
        }

        public String getBapp(int i) {
            return (String) this.bapp_.get(i);
        }

        public ByteString getBappBytes(int i) {
            return this.bapp_.getByteString(i);
        }

        public List<CreativeAttribute> getBattrList() {
            return new Internal.ListAdapter(this.battr_, battr_converter_);
        }

        public int getBattrCount() {
            return this.battr_.size();
        }

        public CreativeAttribute getBattr(int i) {
            return battr_converter_.convert(this.battr_.get(i));
        }

        public List<Integer> getBattrValueList() {
            return this.battr_;
        }

        public int getBattrValue(int i) {
            return this.battr_.get(i).intValue();
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            getSerializedSize();
            for (int i = 0; i < this.bcat_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.bcat_.getRaw(i));
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                codedOutputStream.writeEnum(2, this.cattax_);
            }
            for (int i2 = 0; i2 < this.badv_.size(); i2++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.badv_.getRaw(i2));
            }
            for (int i3 = 0; i3 < this.bapp_.size(); i3++) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.bapp_.getRaw(i3));
            }
            if (getBattrList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(42);
                codedOutputStream.writeUInt32NoTag(this.battrMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.battr_.size(); i4++) {
                codedOutputStream.writeEnumNoTag(this.battr_.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i5));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.bcat_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.bcat_.getRaw(i3));
            }
            int size = i2 + 0 + (getBcatList().size() * 1);
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.cattax_);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.badv_.size(); i5++) {
                i4 += computeStringSizeNoTag(this.badv_.getRaw(i5));
            }
            int size2 = size + i4 + (getBadvList().size() * 1);
            int i6 = 0;
            for (int i7 = 0; i7 < this.bapp_.size(); i7++) {
                i6 += computeStringSizeNoTag(this.bapp_.getRaw(i7));
            }
            int size3 = size2 + i6 + (getBappList().size() * 1);
            int i8 = 0;
            for (int i9 = 0; i9 < this.battr_.size(); i9++) {
                i8 += CodedOutputStream.computeEnumSizeNoTag(this.battr_.get(i9).intValue());
            }
            int i10 = size3 + i8;
            if (!getBattrList().isEmpty()) {
                i10 = i10 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i8);
            }
            this.battrMemoizedSerializedSize = i8;
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                i10 += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                i10 += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = i10 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Restrictions)) {
                return super.equals(obj);
            }
            Restrictions restrictions = (Restrictions) obj;
            if (!getBcatList().equals(restrictions.getBcatList()) || this.cattax_ != restrictions.cattax_ || !getBadvList().equals(restrictions.getBadvList()) || !getBappList().equals(restrictions.getBappList()) || !this.battr_.equals(restrictions.battr_) || hasExt() != restrictions.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(restrictions.getExt())) && getExtProtoList().equals(restrictions.getExtProtoList()) && this.unknownFields.equals(restrictions.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getBcatCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getBcatList().hashCode();
            }
            int i = (((hashCode * 37) + 2) * 53) + this.cattax_;
            if (getBadvCount() > 0) {
                i = (((i * 37) + 3) * 53) + getBadvList().hashCode();
            }
            if (getBappCount() > 0) {
                i = (((i * 37) + 4) * 53) + getBappList().hashCode();
            }
            if (getBattrCount() > 0) {
                i = (((i * 37) + 5) * 53) + this.battr_.hashCode();
            }
            if (hasExt()) {
                i = (((i * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                i = (((i * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (i * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Restrictions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Restrictions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Restrictions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Restrictions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Restrictions parseFrom(InputStream inputStream) throws IOException {
            return (Restrictions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Restrictions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Restrictions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Restrictions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Restrictions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Restrictions) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Restrictions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Restrictions) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Restrictions restrictions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restrictions);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RestrictionsOrBuilder {
            private LazyStringList badv_;
            private LazyStringList bapp_;
            private List<Integer> battr_;
            private LazyStringList bcat_;
            private int bitField0_;
            private int cattax_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Restrictions_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Restrictions_fieldAccessorTable.ensureFieldAccessorsInitialized(Restrictions.class, Builder.class);
            }

            private Builder() {
                this.bcat_ = LazyStringArrayList.EMPTY;
                this.cattax_ = 0;
                this.badv_ = LazyStringArrayList.EMPTY;
                this.bapp_ = LazyStringArrayList.EMPTY;
                this.battr_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.bcat_ = LazyStringArrayList.EMPTY;
                this.cattax_ = 0;
                this.badv_ = LazyStringArrayList.EMPTY;
                this.bapp_ = LazyStringArrayList.EMPTY;
                this.battr_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Restrictions.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.bcat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.cattax_ = 0;
                this.badv_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                this.bapp_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                this.battr_ = Collections.emptyList();
                this.bitField0_ &= -9;
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_Restrictions_descriptor;
            }

            public Restrictions getDefaultInstanceForType() {
                return Restrictions.getDefaultInstance();
            }

            public Restrictions build() {
                Restrictions buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Restrictions buildPartial() {
                Restrictions restrictions = new Restrictions((GeneratedMessageV3.Builder) this);
                if ((this.bitField0_ & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused = restrictions.bcat_ = this.bcat_;
                int unused2 = restrictions.cattax_ = this.cattax_;
                if ((this.bitField0_ & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused3 = restrictions.badv_ = this.badv_;
                if ((this.bitField0_ & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                LazyStringList unused4 = restrictions.bapp_ = this.bapp_;
                if ((this.bitField0_ & 8) != 0) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                    this.bitField0_ &= -9;
                }
                List unused5 = restrictions.battr_ = this.battr_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused6 = restrictions.ext_ = this.ext_;
                } else {
                    Struct unused7 = restrictions.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    List unused8 = restrictions.extProto_ = this.extProto_;
                } else {
                    List unused9 = restrictions.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return restrictions;
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
                if (message instanceof Restrictions) {
                    return mergeFrom((Restrictions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Restrictions restrictions) {
                if (restrictions == Restrictions.getDefaultInstance()) {
                    return this;
                }
                if (!restrictions.bcat_.isEmpty()) {
                    if (this.bcat_.isEmpty()) {
                        this.bcat_ = restrictions.bcat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureBcatIsMutable();
                        this.bcat_.addAll(restrictions.bcat_);
                    }
                    onChanged();
                }
                if (restrictions.cattax_ != 0) {
                    setCattaxValue(restrictions.getCattaxValue());
                }
                if (!restrictions.badv_.isEmpty()) {
                    if (this.badv_.isEmpty()) {
                        this.badv_ = restrictions.badv_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureBadvIsMutable();
                        this.badv_.addAll(restrictions.badv_);
                    }
                    onChanged();
                }
                if (!restrictions.bapp_.isEmpty()) {
                    if (this.bapp_.isEmpty()) {
                        this.bapp_ = restrictions.bapp_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureBappIsMutable();
                        this.bapp_.addAll(restrictions.bapp_);
                    }
                    onChanged();
                }
                if (!restrictions.battr_.isEmpty()) {
                    if (this.battr_.isEmpty()) {
                        this.battr_ = restrictions.battr_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureBattrIsMutable();
                        this.battr_.addAll(restrictions.battr_);
                    }
                    onChanged();
                }
                if (restrictions.hasExt()) {
                    mergeExt(restrictions.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!restrictions.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = restrictions.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(restrictions.extProto_);
                        }
                        onChanged();
                    }
                } else if (!restrictions.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = restrictions.extProto_;
                        this.bitField0_ &= -17;
                        if (Restrictions.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(restrictions.extProto_);
                    }
                }
                mergeUnknownFields(restrictions.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.Restrictions.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.Restrictions.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$Restrictions r3 = (com.explorestack.protobuf.adcom.Context.Restrictions) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Restrictions) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$Restrictions r4 = (com.explorestack.protobuf.adcom.Context.Restrictions) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.Restrictions) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Restrictions.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Restrictions$Builder");
            }

            private void ensureBcatIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.bcat_ = new LazyStringArrayList(this.bcat_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getBcatList() {
                return this.bcat_.getUnmodifiableView();
            }

            public int getBcatCount() {
                return this.bcat_.size();
            }

            public String getBcat(int i) {
                return (String) this.bcat_.get(i);
            }

            public ByteString getBcatBytes(int i) {
                return this.bcat_.getByteString(i);
            }

            public Builder setBcat(int i, String str) {
                if (str != null) {
                    ensureBcatIsMutable();
                    this.bcat_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addBcat(String str) {
                if (str != null) {
                    ensureBcatIsMutable();
                    this.bcat_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllBcat(Iterable<String> iterable) {
                ensureBcatIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.bcat_);
                onChanged();
                return this;
            }

            public Builder clearBcat() {
                this.bcat_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addBcatBytes(ByteString byteString) {
                if (byteString != null) {
                    Restrictions.checkByteStringIsUtf8(byteString);
                    ensureBcatIsMutable();
                    this.bcat_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getCattaxValue() {
                return this.cattax_;
            }

            public Builder setCattaxValue(int i) {
                this.cattax_ = i;
                onChanged();
                return this;
            }

            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
            }

            public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
                if (categoryTaxonomy != null) {
                    this.cattax_ = categoryTaxonomy.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
                onChanged();
                return this;
            }

            private void ensureBadvIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.badv_ = new LazyStringArrayList(this.badv_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getBadvList() {
                return this.badv_.getUnmodifiableView();
            }

            public int getBadvCount() {
                return this.badv_.size();
            }

            public String getBadv(int i) {
                return (String) this.badv_.get(i);
            }

            public ByteString getBadvBytes(int i) {
                return this.badv_.getByteString(i);
            }

            public Builder setBadv(int i, String str) {
                if (str != null) {
                    ensureBadvIsMutable();
                    this.badv_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addBadv(String str) {
                if (str != null) {
                    ensureBadvIsMutable();
                    this.badv_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllBadv(Iterable<String> iterable) {
                ensureBadvIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.badv_);
                onChanged();
                return this;
            }

            public Builder clearBadv() {
                this.badv_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addBadvBytes(ByteString byteString) {
                if (byteString != null) {
                    Restrictions.checkByteStringIsUtf8(byteString);
                    ensureBadvIsMutable();
                    this.badv_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureBappIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.bapp_ = new LazyStringArrayList(this.bapp_);
                    this.bitField0_ |= 4;
                }
            }

            public ProtocolStringList getBappList() {
                return this.bapp_.getUnmodifiableView();
            }

            public int getBappCount() {
                return this.bapp_.size();
            }

            public String getBapp(int i) {
                return (String) this.bapp_.get(i);
            }

            public ByteString getBappBytes(int i) {
                return this.bapp_.getByteString(i);
            }

            public Builder setBapp(int i, String str) {
                if (str != null) {
                    ensureBappIsMutable();
                    this.bapp_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addBapp(String str) {
                if (str != null) {
                    ensureBappIsMutable();
                    this.bapp_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllBapp(Iterable<String> iterable) {
                ensureBappIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.bapp_);
                onChanged();
                return this;
            }

            public Builder clearBapp() {
                this.bapp_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder addBappBytes(ByteString byteString) {
                if (byteString != null) {
                    Restrictions.checkByteStringIsUtf8(byteString);
                    ensureBappIsMutable();
                    this.bapp_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureBattrIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.battr_ = new ArrayList(this.battr_);
                    this.bitField0_ |= 8;
                }
            }

            public List<CreativeAttribute> getBattrList() {
                return new Internal.ListAdapter(this.battr_, Restrictions.battr_converter_);
            }

            public int getBattrCount() {
                return this.battr_.size();
            }

            public CreativeAttribute getBattr(int i) {
                return (CreativeAttribute) Restrictions.battr_converter_.convert(this.battr_.get(i));
            }

            public Builder setBattr(int i, CreativeAttribute creativeAttribute) {
                if (creativeAttribute != null) {
                    ensureBattrIsMutable();
                    this.battr_.set(i, Integer.valueOf(creativeAttribute.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addBattr(CreativeAttribute creativeAttribute) {
                if (creativeAttribute != null) {
                    ensureBattrIsMutable();
                    this.battr_.add(Integer.valueOf(creativeAttribute.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllBattr(Iterable<? extends CreativeAttribute> iterable) {
                ensureBattrIsMutable();
                for (CreativeAttribute number : iterable) {
                    this.battr_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearBattr() {
                this.battr_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public List<Integer> getBattrValueList() {
                return Collections.unmodifiableList(this.battr_);
            }

            public int getBattrValue(int i) {
                return this.battr_.get(i).intValue();
            }

            public Builder setBattrValue(int i, int i2) {
                ensureBattrIsMutable();
                this.battr_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addBattrValue(int i) {
                ensureBattrIsMutable();
                this.battr_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllBattrValue(Iterable<Integer> iterable) {
                ensureBattrIsMutable();
                for (Integer intValue : iterable) {
                    this.battr_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Restrictions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Restrictions> parser() {
            return PARSER;
        }

        public Parser<Restrictions> getParserForType() {
            return PARSER;
        }

        public Restrictions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class User extends GeneratedMessageV3 implements UserOrBuilder {
        public static final int BUYERUID_FIELD_NUMBER = 2;
        public static final int CONSENT_FIELD_NUMBER = 6;
        public static final int DATA_FIELD_NUMBER = 8;
        private static final User DEFAULT_INSTANCE = new User();
        public static final int EXT_FIELD_NUMBER = 10;
        public static final int EXT_PROTO_FIELD_NUMBER = 9;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int GEO_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final Parser<User> PARSER = new AbstractParser<User>() {
            public User parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new User(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int YOB_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object buyeruid_;
        /* access modifiers changed from: private */
        public volatile Object consent_;
        /* access modifiers changed from: private */
        public List<Data> data_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public volatile Object gender_;
        /* access modifiers changed from: private */
        public Geo geo_;
        /* access modifiers changed from: private */
        public volatile Object id_;
        /* access modifiers changed from: private */
        public volatile Object keywords_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int yob_;

        private User(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private User() {
            this.memoizedIsInitialized = -1;
            this.id_ = "";
            this.buyeruid_ = "";
            this.gender_ = "";
            this.keywords_ = "";
            this.consent_ = "";
            this.data_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new User();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private User(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.id_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.buyeruid_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 24:
                                this.yob_ = codedInputStream.readUInt32();
                                break;
                            case 34:
                                this.gender_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 42:
                                this.keywords_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 50:
                                this.consent_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                Geo.Builder builder = this.geo_ != null ? this.geo_.toBuilder() : null;
                                Geo geo = (Geo) codedInputStream.readMessage(Geo.parser(), extensionRegistryLite);
                                this.geo_ = geo;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(geo);
                                    this.geo_ = builder.buildPartial();
                                    break;
                                }
                            case 66:
                                if (!z2 || !true) {
                                    this.data_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.data_.add(codedInputStream.readMessage(Data.parser(), extensionRegistryLite));
                                break;
                            case 74:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 82:
                                Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(struct);
                                    this.ext_ = builder2.buildPartial();
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
                        if (z2 && true) {
                            this.data_ = Collections.unmodifiableList(this.data_);
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.data_ = Collections.unmodifiableList(this.data_);
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_User_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getBuyeruid() {
            Object obj = this.buyeruid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.buyeruid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBuyeruidBytes() {
            Object obj = this.buyeruid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.buyeruid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getYob() {
            return this.yob_;
        }

        public String getGender() {
            Object obj = this.gender_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gender_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getGenderBytes() {
            Object obj = this.gender_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gender_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasGeo() {
            return this.geo_ != null;
        }

        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        public List<Data> getDataList() {
            return this.data_;
        }

        public List<? extends DataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        public int getDataCount() {
            return this.data_.size();
        }

        public Data getData(int i) {
            return this.data_.get(i);
        }

        public DataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if (!getBuyeruidBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.buyeruid_);
            }
            int i = this.yob_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            if (!getGenderBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.consent_);
            }
            if (this.geo_ != null) {
                codedOutputStream.writeMessage(7, getGeo());
            }
            for (int i2 = 0; i2 < this.data_.size(); i2++) {
                codedOutputStream.writeMessage(8, this.data_.get(i2));
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                codedOutputStream.writeMessage(9, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(10, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
            if (!getBuyeruidBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.buyeruid_);
            }
            int i2 = this.yob_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(3, i2);
            }
            if (!getGenderBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(6, this.consent_);
            }
            if (this.geo_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(7, getGeo());
            }
            for (int i3 = 0; i3 < this.data_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(8, this.data_.get(i3));
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                computeStringSize += CodedOutputStream.computeMessageSize(9, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(10, getExt());
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return super.equals(obj);
            }
            User user = (User) obj;
            if (!getId().equals(user.getId()) || !getBuyeruid().equals(user.getBuyeruid()) || getYob() != user.getYob() || !getGender().equals(user.getGender()) || !getKeywords().equals(user.getKeywords()) || !getConsent().equals(user.getConsent()) || hasGeo() != user.hasGeo()) {
                return false;
            }
            if ((hasGeo() && !getGeo().equals(user.getGeo())) || !getDataList().equals(user.getDataList()) || hasExt() != user.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(user.getExt())) && getExtProtoList().equals(user.getExtProtoList()) && this.unknownFields.equals(user.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getBuyeruid().hashCode()) * 37) + 3) * 53) + getYob()) * 37) + 4) * 53) + getGender().hashCode()) * 37) + 5) * 53) + getKeywords().hashCode()) * 37) + 6) * 53) + getConsent().hashCode();
            if (hasGeo()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getGeo().hashCode();
            }
            if (getDataCount() > 0) {
                hashCode = (((hashCode * 37) + 8) * 53) + getDataList().hashCode();
            }
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 10) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 9) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (User) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserOrBuilder {
            private int bitField0_;
            private Object buyeruid_;
            private Object consent_;
            private RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> dataBuilder_;
            private List<Data> data_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object gender_;
            private SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> geoBuilder_;
            private Geo geo_;
            private Object id_;
            private Object keywords_;
            private int yob_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_User_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                this.data_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                this.data_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (User.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.buyeruid_ = "";
                this.yob_ = 0;
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_User_descriptor;
            }

            public User getDefaultInstanceForType() {
                return User.getDefaultInstance();
            }

            public User build() {
                User buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public User buildPartial() {
                User user = new User((GeneratedMessageV3.Builder) this);
                Object unused = user.id_ = this.id_;
                Object unused2 = user.buyeruid_ = this.buyeruid_;
                int unused3 = user.yob_ = this.yob_;
                Object unused4 = user.gender_ = this.gender_;
                Object unused5 = user.keywords_ = this.keywords_;
                Object unused6 = user.consent_ = this.consent_;
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Geo unused7 = user.geo_ = this.geo_;
                } else {
                    Geo unused8 = user.geo_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    List unused9 = user.data_ = this.data_;
                } else {
                    List unused10 = user.data_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Struct unused11 = user.ext_ = this.ext_;
                } else {
                    Struct unused12 = user.ext_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    List unused13 = user.extProto_ = this.extProto_;
                } else {
                    List unused14 = user.extProto_ = repeatedFieldBuilderV32.build();
                }
                onBuilt();
                return user;
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
                if (message instanceof User) {
                    return mergeFrom((User) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(User user) {
                if (user == User.getDefaultInstance()) {
                    return this;
                }
                if (!user.getId().isEmpty()) {
                    this.id_ = user.id_;
                    onChanged();
                }
                if (!user.getBuyeruid().isEmpty()) {
                    this.buyeruid_ = user.buyeruid_;
                    onChanged();
                }
                if (user.getYob() != 0) {
                    setYob(user.getYob());
                }
                if (!user.getGender().isEmpty()) {
                    this.gender_ = user.gender_;
                    onChanged();
                }
                if (!user.getKeywords().isEmpty()) {
                    this.keywords_ = user.keywords_;
                    onChanged();
                }
                if (!user.getConsent().isEmpty()) {
                    this.consent_ = user.consent_;
                    onChanged();
                }
                if (user.hasGeo()) {
                    mergeGeo(user.getGeo());
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.dataBuilder_ == null) {
                    if (!user.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = user.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(user.data_);
                        }
                        onChanged();
                    }
                } else if (!user.data_.isEmpty()) {
                    if (this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = user.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = User.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    } else {
                        this.dataBuilder_.addAllMessages(user.data_);
                    }
                }
                if (user.hasExt()) {
                    mergeExt(user.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!user.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = user.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(user.extProto_);
                        }
                        onChanged();
                    }
                } else if (!user.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = user.extProto_;
                        this.bitField0_ &= -3;
                        if (User.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(user.extProto_);
                    }
                }
                mergeUnknownFields(user.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Context.User.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.User.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Context$User r3 = (com.explorestack.protobuf.adcom.Context.User) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.User) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Context$User r4 = (com.explorestack.protobuf.adcom.Context.User) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Context.User) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.User.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$User$Builder");
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setId(String str) {
                if (str != null) {
                    this.id_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearId() {
                this.id_ = User.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                if (byteString != null) {
                    User.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBuyeruid() {
                Object obj = this.buyeruid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.buyeruid_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBuyeruidBytes() {
                Object obj = this.buyeruid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.buyeruid_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBuyeruid(String str) {
                if (str != null) {
                    this.buyeruid_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBuyeruid() {
                this.buyeruid_ = User.getDefaultInstance().getBuyeruid();
                onChanged();
                return this;
            }

            public Builder setBuyeruidBytes(ByteString byteString) {
                if (byteString != null) {
                    User.checkByteStringIsUtf8(byteString);
                    this.buyeruid_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getYob() {
                return this.yob_;
            }

            public Builder setYob(int i) {
                this.yob_ = i;
                onChanged();
                return this;
            }

            public Builder clearYob() {
                this.yob_ = 0;
                onChanged();
                return this;
            }

            public String getGender() {
                Object obj = this.gender_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gender_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getGenderBytes() {
                Object obj = this.gender_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gender_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setGender(String str) {
                if (str != null) {
                    this.gender_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearGender() {
                this.gender_ = User.getDefaultInstance().getGender();
                onChanged();
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) {
                if (byteString != null) {
                    User.checkByteStringIsUtf8(byteString);
                    this.gender_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setKeywords(String str) {
                if (str != null) {
                    this.keywords_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearKeywords() {
                this.keywords_ = User.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) {
                if (byteString != null) {
                    User.checkByteStringIsUtf8(byteString);
                    this.keywords_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getConsent() {
                Object obj = this.consent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.consent_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getConsentBytes() {
                Object obj = this.consent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consent_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setConsent(String str) {
                if (str != null) {
                    this.consent_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearConsent() {
                this.consent_ = User.getDefaultInstance().getConsent();
                onChanged();
                return this;
            }

            public Builder setConsentBytes(ByteString byteString) {
                if (byteString != null) {
                    User.checkByteStringIsUtf8(byteString);
                    this.consent_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            public Geo getGeo() {
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
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

            public Builder setGeo(Geo.Builder builder) {
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.geo_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
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

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                return this;
            }

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return getGeoFieldBuilder().getBuilder();
            }

            public GeoOrBuilder getGeoOrBuilder() {
                SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> singleFieldBuilderV3 = this.geoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            private SingleFieldBuilderV3<Geo, Geo.Builder, GeoOrBuilder> getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new SingleFieldBuilderV3<>(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Data> getDataList() {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.data_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getDataCount() {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Data getData(int i) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setData(int i, Data data) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, data);
                } else if (data != null) {
                    ensureDataIsMutable();
                    this.data_.set(i, data);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setData(int i, Data.Builder builder) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addData(Data data) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(data);
                } else if (data != null) {
                    ensureDataIsMutable();
                    this.data_.add(data);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addData(int i, Data data) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, data);
                } else if (data != null) {
                    ensureDataIsMutable();
                    this.data_.add(i, data);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addData(Data.Builder builder) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addData(int i, Data.Builder builder) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllData(Iterable<? extends Data> iterable) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.data_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearData() {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeData(int i) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Data.Builder getDataBuilder(int i) {
                return getDataFieldBuilder().getBuilder(i);
            }

            public DataOrBuilder getDataOrBuilder(int i) {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.data_);
            }

            public Data.Builder addDataBuilder() {
                return getDataFieldBuilder().addBuilder(Data.getDefaultInstance());
            }

            public Data.Builder addDataBuilder(int i) {
                return getDataFieldBuilder().addBuilder(i, Data.getDefaultInstance());
            }

            public List<Data.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Data, Data.Builder, DataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    List<Data> list = this.data_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.dataBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<User> parser() {
            return PARSER;
        }

        public Parser<User> getParserForType() {
            return PARSER;
        }

        public User getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public boolean hasApp() {
        return this.app_ != null;
    }

    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    public boolean hasDevice() {
        return this.device_ != null;
    }

    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
    }

    public boolean hasRegs() {
        return this.regs_ != null;
    }

    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    public RegsOrBuilder getRegsOrBuilder() {
        return getRegs();
    }

    public boolean hasRestrictions() {
        return this.restrictions_ != null;
    }

    public Restrictions getRestrictions() {
        Restrictions restrictions = this.restrictions_;
        return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
    }

    public RestrictionsOrBuilder getRestrictionsOrBuilder() {
        return getRestrictions();
    }

    public boolean hasUser() {
        return this.user_ != null;
    }

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public UserOrBuilder getUserOrBuilder() {
        return getUser();
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public StructOrBuilder getExtOrBuilder() {
        return getExt();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public Any getExtProto(int i) {
        return this.extProto_.get(i);
    }

    public AnyOrBuilder getExtProtoOrBuilder(int i) {
        return this.extProto_.get(i);
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
        if (this.device_ != null) {
            codedOutputStream.writeMessage(2, getDevice());
        }
        if (this.regs_ != null) {
            codedOutputStream.writeMessage(3, getRegs());
        }
        if (this.restrictions_ != null) {
            codedOutputStream.writeMessage(4, getRestrictions());
        }
        if (this.user_ != null) {
            codedOutputStream.writeMessage(5, getUser());
        }
        for (int i = 0; i < this.extProto_.size(); i++) {
            codedOutputStream.writeMessage(6, this.extProto_.get(i));
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(7, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.app_ != null ? CodedOutputStream.computeMessageSize(1, getApp()) + 0 : 0;
        if (this.device_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getDevice());
        }
        if (this.regs_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, getRegs());
        }
        if (this.restrictions_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(4, getRestrictions());
        }
        if (this.user_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(5, getUser());
        }
        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
            computeMessageSize += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i2));
        }
        if (this.ext_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(7, getExt());
        }
        int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Context)) {
            return super.equals(obj);
        }
        Context context = (Context) obj;
        if (hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !getDevice().equals(context.getDevice())) || hasRegs() != context.hasRegs()) {
            return false;
        }
        if ((hasRegs() && !getRegs().equals(context.getRegs())) || hasRestrictions() != context.hasRestrictions()) {
            return false;
        }
        if ((hasRestrictions() && !getRestrictions().equals(context.getRestrictions())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((hasUser() && !getUser().equals(context.getUser())) || hasExt() != context.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(context.getExt())) && getExtProtoList().equals(context.getExtProtoList()) && this.unknownFields.equals(context.unknownFields)) {
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
        if (hasDevice()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getDevice().hashCode();
        }
        if (hasRegs()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getRegs().hashCode();
        }
        if (hasRestrictions()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getRestrictions().hashCode();
        }
        if (hasUser()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getUser().hashCode();
        }
        if (hasExt()) {
            hashCode = (((hashCode * 37) + 7) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getExtProtoList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Context parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Context context) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContextOrBuilder {
        private SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> appBuilder_;
        private App app_;
        private int bitField0_;
        private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
        private Device device_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> regsBuilder_;
        private Regs regs_;
        private SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> restrictionsBuilder_;
        private Restrictions restrictions_;
        private SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> userBuilder_;
        private User user_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
        }

        private Builder() {
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Context.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
            } else {
                this.restrictions_ = null;
                this.restrictionsBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Context_descriptor;
        }

        public Context getDefaultInstanceForType() {
            return Context.getDefaultInstance();
        }

        public Context build() {
            Context buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Context buildPartial() {
            Context context = new Context((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                App unused = context.app_ = this.app_;
            } else {
                App unused2 = context.app_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV32 = this.deviceBuilder_;
            if (singleFieldBuilderV32 == null) {
                Device unused3 = context.device_ = this.device_;
            } else {
                Device unused4 = context.device_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV33 = this.regsBuilder_;
            if (singleFieldBuilderV33 == null) {
                Regs unused5 = context.regs_ = this.regs_;
            } else {
                Regs unused6 = context.regs_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> singleFieldBuilderV34 = this.restrictionsBuilder_;
            if (singleFieldBuilderV34 == null) {
                Restrictions unused7 = context.restrictions_ = this.restrictions_;
            } else {
                Restrictions unused8 = context.restrictions_ = singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV35 = this.userBuilder_;
            if (singleFieldBuilderV35 == null) {
                User unused9 = context.user_ = this.user_;
            } else {
                User unused10 = context.user_ = singleFieldBuilderV35.build();
            }
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV36 = this.extBuilder_;
            if (singleFieldBuilderV36 == null) {
                Struct unused11 = context.ext_ = this.ext_;
            } else {
                Struct unused12 = context.ext_ = singleFieldBuilderV36.build();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -2;
                }
                List unused13 = context.extProto_ = this.extProto_;
            } else {
                List unused14 = context.extProto_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return context;
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
            if (message instanceof Context) {
                return mergeFrom((Context) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasRegs()) {
                mergeRegs(context.getRegs());
            }
            if (context.hasRestrictions()) {
                mergeRestrictions(context.getRestrictions());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasExt()) {
                mergeExt(context.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!context.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = context.extProto_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(context.extProto_);
                    }
                    onChanged();
                }
            } else if (!context.extProto_.isEmpty()) {
                if (this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.dispose();
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    this.extProtoBuilder_ = null;
                    this.extProto_ = context.extProto_;
                    this.bitField0_ &= -2;
                    if (Context.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.extProtoBuilder_.addAllMessages(context.extProto_);
                }
            }
            mergeUnknownFields(context.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.explorestack.protobuf.adcom.Context.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Context.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.explorestack.protobuf.adcom.Context r3 = (com.explorestack.protobuf.adcom.Context) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.explorestack.protobuf.adcom.Context) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.explorestack.protobuf.adcom.Context r4 = (com.explorestack.protobuf.adcom.Context) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.explorestack.protobuf.adcom.Context) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Context$Builder");
        }

        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        public App getApp() {
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
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

        public Builder setApp(App.Builder builder) {
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.app_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
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

        public Builder clearApp() {
            if (this.appBuilder_ == null) {
                this.app_ = null;
                onChanged();
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            return this;
        }

        public App.Builder getAppBuilder() {
            onChanged();
            return getAppFieldBuilder().getBuilder();
        }

        public AppOrBuilder getAppOrBuilder() {
            SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> singleFieldBuilderV3 = this.appBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        private SingleFieldBuilderV3<App, App.Builder, AppOrBuilder> getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new SingleFieldBuilderV3<>(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        public Device getDevice() {
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
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

        public Builder setDevice(Device.Builder builder) {
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.device_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
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

        public Builder clearDevice() {
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
                onChanged();
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            return this;
        }

        public Device.Builder getDeviceBuilder() {
            onChanged();
            return getDeviceFieldBuilder().getBuilder();
        }

        public DeviceOrBuilder getDeviceOrBuilder() {
            SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new SingleFieldBuilderV3<>(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
        }

        public boolean hasRegs() {
            return (this.regsBuilder_ == null && this.regs_ == null) ? false : true;
        }

        public Regs getRegs() {
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
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

        public Builder setRegs(Regs.Builder builder) {
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.regs_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
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

        public Builder clearRegs() {
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
                onChanged();
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            return this;
        }

        public Regs.Builder getRegsBuilder() {
            onChanged();
            return getRegsFieldBuilder().getBuilder();
        }

        public RegsOrBuilder getRegsOrBuilder() {
            SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> singleFieldBuilderV3 = this.regsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        private SingleFieldBuilderV3<Regs, Regs.Builder, RegsOrBuilder> getRegsFieldBuilder() {
            if (this.regsBuilder_ == null) {
                this.regsBuilder_ = new SingleFieldBuilderV3<>(getRegs(), getParentForChildren(), isClean());
                this.regs_ = null;
            }
            return this.regsBuilder_;
        }

        public boolean hasRestrictions() {
            return (this.restrictionsBuilder_ == null && this.restrictions_ == null) ? false : true;
        }

        public Restrictions getRestrictions() {
            SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> singleFieldBuilderV3 = this.restrictionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        public Builder setRestrictions(Restrictions restrictions) {
            SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> singleFieldBuilderV3 = this.restrictionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(restrictions);
            } else if (restrictions != null) {
                this.restrictions_ = restrictions;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setRestrictions(Restrictions.Builder builder) {
            SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> singleFieldBuilderV3 = this.restrictionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.restrictions_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeRestrictions(Restrictions restrictions) {
            SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> singleFieldBuilderV3 = this.restrictionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Restrictions restrictions2 = this.restrictions_;
                if (restrictions2 != null) {
                    this.restrictions_ = Restrictions.newBuilder(restrictions2).mergeFrom(restrictions).buildPartial();
                } else {
                    this.restrictions_ = restrictions;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(restrictions);
            }
            return this;
        }

        public Builder clearRestrictions() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
                onChanged();
            } else {
                this.restrictions_ = null;
                this.restrictionsBuilder_ = null;
            }
            return this;
        }

        public Restrictions.Builder getRestrictionsBuilder() {
            onChanged();
            return getRestrictionsFieldBuilder().getBuilder();
        }

        public RestrictionsOrBuilder getRestrictionsOrBuilder() {
            SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> singleFieldBuilderV3 = this.restrictionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        private SingleFieldBuilderV3<Restrictions, Restrictions.Builder, RestrictionsOrBuilder> getRestrictionsFieldBuilder() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictionsBuilder_ = new SingleFieldBuilderV3<>(getRestrictions(), getParentForChildren(), isClean());
                this.restrictions_ = null;
            }
            return this.restrictionsBuilder_;
        }

        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        public User getUser() {
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
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

        public Builder setUser(User.Builder builder) {
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.user_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
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

        public Builder clearUser() {
            if (this.userBuilder_ == null) {
                this.user_ = null;
                onChanged();
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            return this;
        }

        public User.Builder getUserBuilder() {
            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        public UserOrBuilder getUserOrBuilder() {
            SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> singleFieldBuilderV3 = this.userBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        private SingleFieldBuilderV3<User, User.Builder, UserOrBuilder> getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new SingleFieldBuilderV3<>(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public Struct getExt() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Builder setExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(struct);
            } else if (struct != null) {
                this.ext_ = struct;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return getExtFieldBuilder().getBuilder();
        }

        public StructOrBuilder getExtOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 1;
            }
        }

        public List<Any> getExtProtoList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.extProto_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getExtProtoCount() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Any getExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addExtProto(Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addExtProto(Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearExtProto() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Any.Builder getExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().getBuilder(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.extProto_);
        }

        public Any.Builder addExtProtoBuilder() {
            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
        }

        public Any.Builder addExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                List<Any> list = this.extProto_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Context> parser() {
        return PARSER;
    }

    public Parser<Context> getParserForType() {
        return PARSER;
    }

    public Context getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
