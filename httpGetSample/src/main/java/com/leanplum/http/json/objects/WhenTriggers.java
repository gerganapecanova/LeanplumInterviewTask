
package com.leanplum.http.json.objects;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WhenTriggers {

    @SerializedName("children")
    @Expose
    private List<Child> children = null;
    @SerializedName("verb")
    @Expose
    private String verb;

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

}
