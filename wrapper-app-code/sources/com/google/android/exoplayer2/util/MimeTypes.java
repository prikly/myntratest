package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MimeTypes {
    private static final Pattern MP4A_RFC_6381_CODEC_PATTERN = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    private static final ArrayList<CustomMimeType> customMimeTypes = new ArrayList<>();

    private static final class CustomMimeType {
        public final String codecPrefix;
        public final String mimeType;
        public final int trackType;
    }

    public static String getMimeTypeFromMp4ObjectType(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return com.unity3d.services.core.device.MimeTypes.VIDEO_H264;
        }
        if (i == 35) {
            return com.unity3d.services.core.device.MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean isAudio(String str) {
        return com.unity3d.services.core.device.MimeTypes.BASE_TYPE_AUDIO.equals(getTopLevelType(str));
    }

    public static boolean isVideo(String str) {
        return "video".equals(getTopLevelType(str));
    }

    public static boolean isText(String str) {
        return "text".equals(getTopLevelType(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean isImage(String str) {
        return "image".equals(getTopLevelType(str));
    }

    public static String getVideoMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String mediaMimeType : Util.splitCodecs(str)) {
            String mediaMimeType2 = getMediaMimeType(mediaMimeType);
            if (mediaMimeType2 != null && isVideo(mediaMimeType2)) {
                return mediaMimeType2;
            }
        }
        return null;
    }

    public static String getAudioMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String mediaMimeType : Util.splitCodecs(str)) {
            String mediaMimeType2 = getMediaMimeType(mediaMimeType);
            if (mediaMimeType2 != null && isAudio(mediaMimeType2)) {
                return mediaMimeType2;
            }
        }
        return null;
    }

    public static String getMediaMimeType(String str) {
        Mp4aObjectType objectTypeFromMp4aRFC6381CodecString;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return com.unity3d.services.core.device.MimeTypes.VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return com.unity3d.services.core.device.MimeTypes.VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(lowerCase)) != null) {
                str2 = getMimeTypeFromMp4ObjectType(objectTypeFromMp4aRFC6381CodecString.objectTypeIndication);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (lowerCase.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (lowerCase.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (lowerCase.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (lowerCase.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (lowerCase.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (lowerCase.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (lowerCase.startsWith("opus")) {
                return "audio/opus";
            }
            if (lowerCase.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (lowerCase.startsWith("flac")) {
                return "audio/flac";
            }
            if (lowerCase.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (lowerCase.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (lowerCase.contains("cea708")) {
                return "application/cea-708";
            }
            return (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : getCustomMimeTypeForCodec(lowerCase);
        }
    }

    public static int getTrackType(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (isText(str)) {
            return 3;
        }
        if (isImage(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return getTrackTypeForCustomMimeType(str);
    }

    public static boolean isMatroska(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(com.unity3d.services.core.device.MimeTypes.VIDEO_WEBM) || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    private static String getTopLevelType(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private static String getCustomMimeTypeForCodec(String str) {
        int size = customMimeTypes.size();
        for (int i = 0; i < size; i++) {
            CustomMimeType customMimeType = customMimeTypes.get(i);
            if (str.startsWith(customMimeType.codecPrefix)) {
                return customMimeType.mimeType;
            }
        }
        return null;
    }

    private static int getTrackTypeForCustomMimeType(String str) {
        int size = customMimeTypes.size();
        for (int i = 0; i < size; i++) {
            CustomMimeType customMimeType = customMimeTypes.get(i);
            if (str.equals(customMimeType.mimeType)) {
                return customMimeType.trackType;
            }
        }
        return -1;
    }

    static Mp4aObjectType getObjectTypeFromMp4aRFC6381CodecString(String str) {
        Matcher matcher = MP4A_RFC_6381_CODEC_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new Mp4aObjectType(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static final class Mp4aObjectType {
        public final int audioObjectTypeIndication;
        public final int objectTypeIndication;

        public Mp4aObjectType(int i, int i2) {
            this.objectTypeIndication = i;
            this.audioObjectTypeIndication = i2;
        }
    }
}
