
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Font {

    @SerializedName("__file__CSS File")
    @Expose
    private String fileCSSFile;
    @SerializedName("Font family")
    @Expose
    private String fontFamily;

    public String getFileCSSFile() {
        return fileCSSFile;
    }

    public void setFileCSSFile(String fileCSSFile) {
        this.fileCSSFile = fileCSSFile;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

}
