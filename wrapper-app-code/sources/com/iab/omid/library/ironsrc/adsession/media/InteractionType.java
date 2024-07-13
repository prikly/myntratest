package com.iab.omid.library.ironsrc.adsession.media;

import com.appodeal.ads.modules.common.internal.Constants;

public enum InteractionType {
    CLICK(Constants.CLICK),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    private InteractionType(String str) {
        this.interactionType = str;
    }

    public final String toString() {
        return this.interactionType;
    }
}
