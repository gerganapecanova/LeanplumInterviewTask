
package com.leanplum.http.json.objects;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WhenLimits {

    @SerializedName("children")
    @Expose
    private List<Object> children = null;
    @SerializedName("subject")
    @Expose
    private Object subject;
    @SerializedName("objects")
    @Expose
    private List<Object> objects = null;

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public Object getSubject() {
        return subject;
    }

    public void setSubject(Object subject) {
        this.subject = subject;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

}
