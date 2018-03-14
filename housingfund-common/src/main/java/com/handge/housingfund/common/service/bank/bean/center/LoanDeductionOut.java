package com.handge.housingfund.common.service.bank.bean.center;

import com.handge.housingfund.common.service.bank.bean.head.CenterHeadOut;

import java.io.Serializable;

/**
 * 贷款扣款(BDC105)输出格式
 */
public class LoanDeductionOut implements Serializable {
    private static final long serialVersionUID = 8186606993587231880L;
    /**
     * CenterHeadOut(required)
     */
    private CenterHeadOut centerHeadOut;
    /**
     * 批量编号((required))
     */
    private String BatchNo;

    public LoanDeductionOut() {
    }

    public LoanDeductionOut(CenterHeadOut centerHeadOut, String batchNo) {
        this.centerHeadOut = centerHeadOut;
        BatchNo = batchNo;
    }

    public CenterHeadOut getCenterHeadOut() {
        return centerHeadOut;
    }

    public void setCenterHeadOut(CenterHeadOut centerHeadOut) {
        this.centerHeadOut = centerHeadOut;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    @Override
    public String toString() {
        return "LoanDeductionOut{" +
                "centerHeadOut=" + centerHeadOut +
                ", BatchNo='" + BatchNo + '\'' +
                '}';
    }
}
