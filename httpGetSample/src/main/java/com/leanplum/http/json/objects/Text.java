
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Text {

    @SerializedName("Italic")
    @Expose
    private Boolean italic;
    @SerializedName("Font size")
    @Expose
    private String fontSize;
    @SerializedName("Color")
    @Expose
    private Integer color;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("Bold")
    @Expose
    private Boolean bold;
    @SerializedName("Text value")
    @Expose
    private String textValue;
    @SerializedName("text-align")
    @Expose
    private String textAlign;

    public Boolean getItalic() {
        return italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

}
