
package com.leanplum.http.json.objects;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("regions")
    @Expose
    private Regions regions;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("messages")
    @Expose
    private Messages messages;
    @SerializedName("vars")
    @Expose
    private Vars_ vars;
    @SerializedName("interfaceRules")
    @Expose
    private List<Object> interfaceRules = null;
    @SerializedName("variants")
    @Expose
    private List<Variant> variants = null;
    @SerializedName("interfaceEvents")
    @Expose
    private List<Object> interfaceEvents = null;

    public Regions getRegions() {
        return regions;
    }

    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Messages getMessages() {
        return messages;
    }

    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    public Vars_ getVars() {
        return vars;
    }

    public void setVars(Vars_ vars) {
        this.vars = vars;
    }

    public List<Object> getInterfaceRules() {
        return interfaceRules;
    }

    public void setInterfaceRules(List<Object> interfaceRules) {
        this.interfaceRules = interfaceRules;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public List<Object> getInterfaceEvents() {
        return interfaceEvents;
    }

    public void setInterfaceEvents(List<Object> interfaceEvents) {
        this.interfaceEvents = interfaceEvents;
    }

}
