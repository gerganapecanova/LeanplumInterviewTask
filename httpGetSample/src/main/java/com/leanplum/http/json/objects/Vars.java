
package com.leanplum.http.json.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vars {

    @SerializedName("Track URL")
    @Expose
    private String trackURL;
    @SerializedName("Track Action URL")
    @Expose
    private String trackActionURL;
    @SerializedName("Hero image")
    @Expose
    private HeroImage heroImage;
    @SerializedName("Close automatically")
    @Expose
    private CloseAutomatically closeAutomatically;
    @SerializedName("Message")
    @Expose
    private Text message;
    @SerializedName("__file__Template")
    @Expose
    private String fileTemplate;
    @SerializedName("Button border color")
    @Expose
    private Integer buttonBorderColor;
    @SerializedName("Title")
    @Expose
    private Text title;
    @SerializedName("Button 2")
    @Expose
    private Button2 button2;
    @SerializedName("Show close button")
    @Expose
    private Boolean showCloseButton;
    @SerializedName("Button 1")
    @Expose
    private Button1 button1;
    @SerializedName("Select button 1 action")
    @Expose
    private SelectButton1Action selectButton1Action;
    @SerializedName("Select button 2 action")
    @Expose
    private SelectButton2Action selectButton2Action;
    @SerializedName("View")
    @Expose
    private View view;
    @SerializedName("Font")
    @Expose
    private Font font;
    @SerializedName("Enable background close")
    @Expose
    private Boolean enableBackgroundClose;
    @SerializedName("__name__")
    @Expose
    private String name;
    @SerializedName("Rounded border")
    @Expose
    private Boolean roundedBorder;
    @SerializedName("Open URL")
    @Expose
    private String openURL;
    @SerializedName("Height")
    @Expose
    private String height;
    @SerializedName("Width")
    @Expose
    private String width;
    @SerializedName("Action URL")
    @Expose
    private String actionURL;
    @SerializedName("Close URL")
    @Expose
    private String closeURL;

    public String getTrackURL() {
        return trackURL;
    }

    public void setTrackURL(String trackURL) {
        this.trackURL = trackURL;
    }

    public String getTrackActionURL() {
        return trackActionURL;
    }

    public void setTrackActionURL(String trackActionURL) {
        this.trackActionURL = trackActionURL;
    }

    public HeroImage getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(HeroImage heroImage) {
        this.heroImage = heroImage;
    }

    public CloseAutomatically getCloseAutomatically() {
        return closeAutomatically;
    }

    public void setCloseAutomatically(CloseAutomatically closeAutomatically) {
        this.closeAutomatically = closeAutomatically;
    }

    public Text getMessage() {
        return message;
    }

    public void setMessage(Text message) {
        this.message = message;
    }

    public String getFileTemplate() {
        return fileTemplate;
    }

    public void setFileTemplate(String fileTemplate) {
        this.fileTemplate = fileTemplate;
    }

    public Integer getButtonBorderColor() {
        return buttonBorderColor;
    }

    public void setButtonBorderColor(Integer buttonBorderColor) {
        this.buttonBorderColor = buttonBorderColor;
    }

    public Text getTitle() {
        return title;
    }

    public void setTitle(Text title) {
        this.title = title;
    }

    public Button2 getButton2() {
        return button2;
    }

    public void setButton2(Button2 button2) {
        this.button2 = button2;
    }

    public Boolean getShowCloseButton() {
        return showCloseButton;
    }

    public void setShowCloseButton(Boolean showCloseButton) {
        this.showCloseButton = showCloseButton;
    }

    public Button1 getButton1() {
        return button1;
    }

    public void setButton1(Button1 button1) {
        this.button1 = button1;
    }

    public SelectButton1Action getSelectButton1Action() {
        return selectButton1Action;
    }

    public void setSelectButton1Action(SelectButton1Action selectButton1Action) {
        this.selectButton1Action = selectButton1Action;
    }

    public SelectButton2Action getSelectButton2Action() {
        return selectButton2Action;
    }

    public void setSelectButton2Action(SelectButton2Action selectButton2Action) {
        this.selectButton2Action = selectButton2Action;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Boolean getEnableBackgroundClose() {
        return enableBackgroundClose;
    }

    public void setEnableBackgroundClose(Boolean enableBackgroundClose) {
        this.enableBackgroundClose = enableBackgroundClose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRoundedBorder() {
        return roundedBorder;
    }

    public void setRoundedBorder(Boolean roundedBorder) {
        this.roundedBorder = roundedBorder;
    }

    public String getOpenURL() {
        return openURL;
    }

    public void setOpenURL(String openURL) {
        this.openURL = openURL;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getActionURL() {
        return actionURL;
    }

    public void setActionURL(String actionURL) {
        this.actionURL = actionURL;
    }

    public String getCloseURL() {
        return closeURL;
    }

    public void setCloseURL(String closeURL) {
        this.closeURL = closeURL;
    }

}
