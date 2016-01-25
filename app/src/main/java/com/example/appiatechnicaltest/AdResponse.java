package com.example.appiatechnicaltest;

import com.example.appiatechnicaltest.Ad;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chad Schultz on 1/24/2016.
 */
@Root(name="ads")
public class AdResponse {
    @ElementList(inline=true)
    List<Ad> ads;

    @Element(name = "responseTime")
    private String responseTime;

    @Element(name = "serverId")
    private String serverId;

    @Element(name = "totalCampaignsRequested")
    private int totalCampaignsRequested;

    @Element(name = "version")
    private String version;

    // public constructor is necessary for collections
    public AdResponse() {
        ads = new ArrayList<Ad>();
    }

    public List getProperties() {
        return ads;
    }
}
