
package com.leanplum.http.json.objects;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("objects")
    @Expose
    private List<Object> objects = null;
    @SerializedName("verb")
    @Expose
    private String verb;
    @SerializedName("noun")
    @Expose
    private String noun;
    @SerializedName("secondaryVerb")
    @Expose
    private String secondaryVerb;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getSecondaryVerb() {
        return secondaryVerb;
    }

    public void setSecondaryVerb(String secondaryVerb) {
        this.secondaryVerb = secondaryVerb;
    }

}
