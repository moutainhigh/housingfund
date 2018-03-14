package com.handge.housingfund.common.service.collection.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by 凡 on 2017/10/7.
 */
@XmlRootElement(name = "InventoryBatchMessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryBatchMessage implements Serializable {

    private String DWZH; //单位账号

    private String DWMC;    //单位名称

    private String JZNY;    //缴至年月

    private String QCNYQ; //清册年月起

    private String QCNYZ; //清册年月止

    private String QCZFSE; //清册总发生额

    private String WFTYE;   //未分摊余额

    private String JBRXM;

    private String JBRZJLX;

    private String JBRZJHM;

    private String CZY;

    private String YWWD;

    private ArrayList<InventoryMessage> QCLB;

    public String getDWZH() {
        return DWZH;
    }

    public void setDWZH(String DWZH) {
        this.DWZH = DWZH;
    }

    public String getDWMC() {
        return DWMC;
    }

    public void setDWMC(String DWMC) {
        this.DWMC = DWMC;
    }

    public String getJZNY() {
        return JZNY;
    }

    public void setJZNY(String JZNY) {
        this.JZNY = JZNY;
    }

    public String getQCNYQ() {
        return QCNYQ;
    }

    public void setQCNYQ(String QCNYQ) {
        this.QCNYQ = QCNYQ;
    }

    public String getQCNYZ() {
        return QCNYZ;
    }

    public void setQCNYZ(String QCNYZ) {
        this.QCNYZ = QCNYZ;
    }

    public String getQCZFSE() {
        return QCZFSE;
    }

    public void setQCZFSE(String QCZFSE) {
        this.QCZFSE = QCZFSE;
    }

    public String getWFTYE() {
        return WFTYE;
    }

    public void setWFTYE(String WFTYE) {
        this.WFTYE = WFTYE;
    }

    public ArrayList<InventoryMessage> getQCLB() {
        return QCLB;
    }

    public void setQCLB(ArrayList<InventoryMessage> QCLB) {
        this.QCLB = QCLB;
    }

    public String getJBRXM() {
        return JBRXM;
    }

    public void setJBRXM(String JBRXM) {
        this.JBRXM = JBRXM;
    }

    public String getJBRZJLX() {
        return JBRZJLX;
    }

    public void setJBRZJLX(String JBRZJLX) {
        this.JBRZJLX = JBRZJLX;
    }

    public String getJBRZJHM() {
        return JBRZJHM;
    }

    public void setJBRZJHM(String JBRZJHM) {
        this.JBRZJHM = JBRZJHM;
    }

    public String getCZY() {
        return CZY;
    }

    public void setCZY(String CZY) {
        this.CZY = CZY;
    }

    public String getYWWD() {
        return YWWD;
    }

    public void setYWWD(String YWWD) {
        this.YWWD = YWWD;
    }

    @Override
    public String toString() {
        return "InventoryBatchMessage{" +
                "DWZH='" + DWZH + '\'' +
                ", DWMC='" + DWMC + '\'' +
                ", JZNY='" + JZNY + '\'' +
                ", QCNYQ='" + QCNYQ + '\'' +
                ", QCNYZ='" + QCNYZ + '\'' +
                ", QCZFSE=" + QCZFSE +
                ", WFTYE=" + WFTYE +
                ", JBRXM='" + JBRXM + '\'' +
                ", JBRZJLX='" + JBRZJLX + '\'' +
                ", JBRZJHM='" + JBRZJHM + '\'' +
                ", CZY='" + CZY + '\'' +
                ", YWWD='" + YWWD + '\'' +
                ", QCLB=" + QCLB +
                '}';
    }
}
