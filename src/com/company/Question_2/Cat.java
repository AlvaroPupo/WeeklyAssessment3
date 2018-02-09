package com.company.Question_2;

public class Cat extends Ferret{

    private boolean likesCatnip;
    private boolean usesLitterbox;
    private String furType;

    public Cat(boolean likesToPlay, boolean likesCatnip, boolean usesLitterbox, String furType) {
        super(likesToPlay);
        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }

    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }
}
