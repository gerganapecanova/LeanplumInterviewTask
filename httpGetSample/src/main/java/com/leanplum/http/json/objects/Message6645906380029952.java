
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message6645906380029952 {

    @SerializedName("countdown")
    @Expose
    private Integer countdown;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("whenTriggers")
    @Expose
    private WhenTriggers whenTriggers;
    @SerializedName("parentCampaignId")
    @Expose
    private Object parentCampaignId;
    @SerializedName("vars")
    @Expose
    private Vars vars;
    @SerializedName("hasImpressionCriteria")
    @Expose
    private Boolean hasImpressionCriteria;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("whenLimits")
    @Expose
    private WhenLimits whenLimits;

    public Integer getCountdown() {
        return countdown;
    }

    public void setCountdown(Integer countdown) {
        this.countdown = countdown;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public WhenTriggers getWhenTriggers() {
        return whenTriggers;
    }

    public void setWhenTriggers(WhenTriggers whenTriggers) {
        this.whenTriggers = whenTriggers;
    }

    public Object getParentCampaignId() {
        return parentCampaignId;
    }

    public void setParentCampaignId(Object parentCampaignId) {
        this.parentCampaignId = parentCampaignId;
    }

    public Vars getVars() {
        return vars;
    }

    public void setVars(Vars vars) {
        this.vars = vars;
    }

    public Boolean getHasImpressionCriteria() {
        return hasImpressionCriteria;
    }

    public void setHasImpressionCriteria(Boolean hasImpressionCriteria) {
        this.hasImpressionCriteria = hasImpressionCriteria;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public WhenLimits getWhenLimits() {
        return whenLimits;
    }

    public void setWhenLimits(WhenLimits whenLimits) {
        this.whenLimits = whenLimits;
    }

}
