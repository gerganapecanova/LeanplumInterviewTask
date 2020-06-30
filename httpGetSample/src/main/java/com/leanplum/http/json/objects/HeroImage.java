
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeroImage {

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("Display above headline")
    @Expose
    private Boolean displayAboveHeadline;
    @SerializedName("__file__Image")
    @Expose
    private String fileImage;
    @SerializedName("height")
    @Expose
    private String height;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Boolean getDisplayAboveHeadline() {
        return displayAboveHeadline;
    }

    public void setDisplayAboveHeadline(Boolean displayAboveHeadline) {
        this.displayAboveHeadline = displayAboveHeadline;
    }

    public String getFileImage() {
        return fileImage;
    }

    public void setFileImage(String fileImage) {
        this.fileImage = fileImage;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
