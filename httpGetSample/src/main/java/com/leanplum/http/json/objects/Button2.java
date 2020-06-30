
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Button2 {

    @SerializedName("__file__Active background image")
    @Expose
    private String fileActiveBackgroundImage;
    @SerializedName("Background color")
    @Expose
    private Integer backgroundColor;
    @SerializedName("Show button")
    @Expose
    private Boolean showButton;
    @SerializedName("Text")
    @Expose
    private Text text;
    @SerializedName("Active background color")
    @Expose
    private Integer activeBackgroundColor;
    @SerializedName("__file__Background image")
    @Expose
    private String fileBackgroundImage;

    public String getFileActiveBackgroundImage() {
        return fileActiveBackgroundImage;
    }

    public void setFileActiveBackgroundImage(String fileActiveBackgroundImage) {
        this.fileActiveBackgroundImage = fileActiveBackgroundImage;
    }

    public Integer getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Boolean getShowButton() {
        return showButton;
    }

    public void setShowButton(Boolean showButton) {
        this.showButton = showButton;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Integer getActiveBackgroundColor() {
        return activeBackgroundColor;
    }

    public void setActiveBackgroundColor(Integer activeBackgroundColor) {
        this.activeBackgroundColor = activeBackgroundColor;
    }

    public String getFileBackgroundImage() {
        return fileBackgroundImage;
    }

    public void setFileBackgroundImage(String fileBackgroundImage) {
        this.fileBackgroundImage = fileBackgroundImage;
    }

}
