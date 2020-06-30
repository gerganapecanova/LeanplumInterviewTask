
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class View {

    @SerializedName("Background color")
    @Expose
    private Integer backgroundColor;
    @SerializedName("Border color")
    @Expose
    private Long borderColor;
    @SerializedName("__file__Background image")
    @Expose
    private String fileBackgroundImage;
    @SerializedName("Border width")
    @Expose
    private String borderWidth;

    public Integer getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Long getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Long borderColor) {
        this.borderColor = borderColor;
    }

    public String getFileBackgroundImage() {
        return fileBackgroundImage;
    }

    public void setFileBackgroundImage(String fileBackgroundImage) {
        this.fileBackgroundImage = fileBackgroundImage;
    }

    public String getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(String borderWidth) {
        this.borderWidth = borderWidth;
    }

}
