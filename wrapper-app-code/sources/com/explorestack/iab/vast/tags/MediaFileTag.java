package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import org.xmlpull.v1.XmlPullParser;

public class MediaFileTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3295c = {"delivery", "type", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT, "codec", OSOutcomeConstants.OUTCOME_ID, "bitrate", "minBitrate", "maxBitrate", "scalable", "maintainAspectRatio", "apiFramework"};

    public MediaFileTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public int getHeight() {
        return b(IabUtils.KEY_HEIGHT);
    }

    public String[] getSupportedAttributes() {
        return f3295c;
    }

    public String getType() {
        return a("type");
    }

    public int getWidth() {
        return b(IabUtils.KEY_WIDTH);
    }

    public boolean isTextSupported() {
        return true;
    }

    public boolean isValidTag() {
        return !TextUtils.isEmpty(a("type")) && !TextUtils.isEmpty(a(IabUtils.KEY_WIDTH)) && !TextUtils.isEmpty(a(IabUtils.KEY_HEIGHT)) && !TextUtils.isEmpty(getText());
    }
}
