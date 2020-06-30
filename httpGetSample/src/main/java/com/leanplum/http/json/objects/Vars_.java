
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vars_ {

    @SerializedName("fileSizeBytes")
    @Expose
    private Double fileSizeBytes;
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("varString")
    @Expose
    private String varString;
    @SerializedName("var_text")
    @Expose
    private String varText;
    @SerializedName("varBool")
    @Expose
    private Boolean varBool;
    @SerializedName("var1")
    @Expose
    private String var1;

    public Double getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(Double fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getVarString() {
        return varString;
    }

    public void setVarString(String varString) {
        this.varString = varString;
    }

    public String getVarText() {
        return varText;
    }

    public void setVarText(String varText) {
        this.varText = varText;
    }

    public Boolean getVarBool() {
        return varBool;
    }

    public void setVarBool(Boolean varBool) {
        this.varBool = varBool;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

}
