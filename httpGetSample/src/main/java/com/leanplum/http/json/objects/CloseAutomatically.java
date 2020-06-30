
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CloseAutomatically {

    @SerializedName("Close automatically")
    @Expose
    private Boolean closeAutomatically;
    @SerializedName("Delay")
    @Expose
    private Double delay;

    public Boolean getCloseAutomatically() {
        return closeAutomatically;
    }

    public void setCloseAutomatically(Boolean closeAutomatically) {
        this.closeAutomatically = closeAutomatically;
    }

    public Double getDelay() {
        return delay;
    }

    public void setDelay(Double delay) {
        this.delay = delay;
    }

}
