package com.example.appiatechnicaltest;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Chad Schultz on 1/24/2016.
 */
@Root(name = "ad")
public class Ad {
    @Element(name = "appId")
    private String appId;

    @Element(name = "averageRatingImageURL")
    private String averageRatingImageURL;

    @Element(name = "bidRate")
    private double bidRate;

    @Element(name = "callToAction")
    private String callToAction;

    @Element(name = "campaignDisplayOrder")
    private int campaignDisplayOrder;

    @Element(name = "campaignId")
    private int campaignId;

    @Element(name = "campaignTypeId")
    private int campaignTypeId;

    @Element(name = "categoryName")
    private String categoryName;

    @Element(name = "clickProxyURL")
    private String clickProxyURL;

    @Element(name = "creativeId")
    private int creativeId;

    @Element(name = "homeScreen")
    private boolean homeScreen;

    @Element(name = "impressionTrackingURL")
    private String impressionTrackingURL;

    @Element(name = "isRandomPick")
    private boolean isRandomPick;

    @Element(name = "minOSVersion", required = false)
    private String minOSVersion;

    @Element(name = "numberOfRatings")
    private String numberOfRatings;

    @Element(name = "productDescription")
    private String productDescription;

    @Element(name = "productId")
    private int productId;

    @Element(name = "productName")
    private String productName;

    @Element(name = "productThumbnail")
    private String productThumbnail;

    @Element(name = "rating")
    private double rating;

    public Ad() {
    }

    public String getAppId() {
        return appId;
    }

    public String getAverageRatingImageURL() {
        return averageRatingImageURL;
    }

    public double getBidRate() {
        return bidRate;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public int getCampaignDisplayOrder() {
        return campaignDisplayOrder;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public int getCampaignTypeId() {
        return campaignTypeId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getClickProxyURL() {
        return clickProxyURL;
    }

    public int getCreativeId() {
        return creativeId;
    }

    public boolean isHomeScreen() {
        return homeScreen;
    }

    public String getImpressionTrackingURL() {
        return impressionTrackingURL;
    }

    public boolean isRandomPick() {
        return isRandomPick;
    }

    public String getMinOSVersion() {
        return minOSVersion;
    }

    public String getNumberOfRatings() {
        return numberOfRatings;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public double getRating() {
        return rating;
    }
}
