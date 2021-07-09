package com.intern.Nudm.udm;

import java.util.ArrayList;

public class UDM {


    private String supportedFeatures;
    private String servingNetworkName; //Required
    private ResynchronizationInfo resynchronizationInfo;
    private String ausfInstanceId; //Required
    private ArrayList<String> cellCagInfo;
    private Boolean n5gcInd;

    //Constructors


    public UDM() {
    }

    public UDM(String servingNetworkName, String ausfInstanceId) {
        this.servingNetworkName = servingNetworkName;
        this.ausfInstanceId = ausfInstanceId;
    }

    public UDM(String supportedFeatures, String servingNetworkName, String ausfInstanceId) {
        this.supportedFeatures = supportedFeatures;
        this.servingNetworkName = servingNetworkName;
        this.ausfInstanceId = ausfInstanceId;
    }

    public UDM(String supportedFeatures, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String ausfInstanceId) {
        this.supportedFeatures = supportedFeatures;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.ausfInstanceId = ausfInstanceId;
    }

    public UDM(String supportedFeatures, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String ausfInstanceId, ArrayList<String> cellCagInfo) {
        this.supportedFeatures = supportedFeatures;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.ausfInstanceId = ausfInstanceId;
        this.cellCagInfo = cellCagInfo;
    }

    public UDM(String supportedFeatures, String servingNetworkName, ResynchronizationInfo resynchronizationInfo, String ausfInstanceId, ArrayList<String> cellCagInfo, Boolean n5gcInd) {
        this.supportedFeatures = supportedFeatures;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.ausfInstanceId = ausfInstanceId;
        this.cellCagInfo = cellCagInfo;
        this.n5gcInd = n5gcInd;
    }

    //Getter Setter

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public String getServingNetworkName() {
        return servingNetworkName;
    }

    public void setServingNetworkName(String servingNetworkName) {
        this.servingNetworkName = servingNetworkName;
    }

    public ResynchronizationInfo getResynchronizationInfo() {
        return resynchronizationInfo;
    }

    public void setResynchronizationInfo(ResynchronizationInfo resynchronizationInfo) {
        this.resynchronizationInfo = resynchronizationInfo;
    }

    public String getAusfInstanceId() {
        return ausfInstanceId;
    }

    public void setAusfInstanceId(String ausfInstanceId) {
        this.ausfInstanceId = ausfInstanceId;
    }

    public ArrayList<String> getCellCagInfo() {
        return cellCagInfo;
    }

    public void setCellCagInfo(ArrayList<String> cellCagInfo) {
        this.cellCagInfo = cellCagInfo;
    }

    public Boolean getN5gcInd() {
        return n5gcInd;
    }

    public void setN5gcInd(Boolean n5gcInd) {
        this.n5gcInd = n5gcInd;
    }

    @Override
    public String toString() {
        return "UDM{" +
                "supportedFeatures='" + supportedFeatures + '\'' +
                ", servingNetworkName='" + servingNetworkName + '\'' +
                ", resynchronizationInfo=" + resynchronizationInfo +
                ", ausfInstanceId='" + ausfInstanceId + '\'' +
                ", cellCagInfo=" + cellCagInfo +
                ", n5gcInd=" + n5gcInd +
                '}';
    }
}
