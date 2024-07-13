package io.bidmachine.displays;

import com.explorestack.protobuf.adcom.Ad;

final class DisplayAdObjectParams extends IabAdObjectParams {
    DisplayAdObjectParams(Ad ad) {
        super(ad);
        prepareEvents(ad.getDisplay().getEventList());
    }
}
