
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SelectButton1Action {

    @SerializedName("__name__")
    @Expose
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
