package com.handge.housingfund.database.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

// default package
// Generated 2017-8-8 15:42:03 by Hibernate Tools 5.2.3.Final

/**
 * HHousingBusinessProcess generated by hbm2java
 */
@Entity
@Table(name = "c_loan_housing_business_process", indexes = {
        @Index(name = "INDEX_DKYWLSH", columnList = "YWLSH", unique = true)})
@org.hibernate.annotations.Table(appliesTo = "c_loan_housing_business_process", comment = "个人贷款-业务流程表")
public class CLoanHousingBusinessProcess extends Common implements java.io.Serializable {

    private static final long serialVersionUID = -3823814550437302814L;
    @Column(name = "DKZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '贷款账号'")
    private String dkzh;
    @Column(name = "CZY", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '操作员'")
    private String czy;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "YWWD", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '业务网点对象'")
    private CAccountNetwork ywwd;
    @Column(name = "CZNR", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '操作内容'")
    private String cznr;
    @Column(name = "CZQD", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '操作渠道'")
    private String czqd;
    @Column(name = "BLSJ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '办理时间'")
    private Date blsj;
    @Column(name = "STEP", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '状态机状态'")
    private String step;
    @Column(name = "YWLSH", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '业务流水号'")
    private String ywlsh;
    @Column(name = "DKDBLX", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '贷款担保类型'")
    private String dkdblx;
    @Column(name = "DKYT", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '贷款用途'")
    private String dkyt;
    @Column(name = "BLZL", columnDefinition = "TEXT DEFAULT NULL COMMENT '办理资料'")
    private String blzl;
    @Column(name = "SHYBH", columnDefinition = "TEXT DEFAULT NULL COMMENT '审核员编号'")
    private String shybh;
    @Column(name = "SHSJ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '审核时间（审核通过/不通过时的时间'")
    private Date shsj;
    @Column(name = "DDSJ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '到达时间'")
    private Date ddsj;
    @Column(name = "BJSJ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '办结时间'")
    private Date bjsj;
    @Column(name = "JZPZH", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '记账凭证号'")
    private String jzpzh;
    @Column(name = "SBYY", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '失败原因'")
    private String sbyy;

    // 还款申请
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanApplyRepaymentVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '还款申请表'")
    private CLoanApplyRepaymentVice loanApplyRepaymentVice;

    // 房开公司
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHousingCompanyVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '房开公司副表'")
    private CLoanHousingCompanyVice loanHousingCompanyVice;

    // 房屋信息-大修
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHouseOverhaulVice", columnDefinition = "varchar(32) DEFAULT NULL COMMENT '房屋大修信息表'")
    private CLoanHouseOverhaulVice loanHouseOverhaulVice;

    // 申请人信息
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHousingPersonInformationVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '个人信息副表'")
    private CLoanHousingPersonInformationVice loanHousingPersonInformationVice;

    // 资金信息
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanFundsVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '个人贷款资金信息表'")
    private CLoanFundsVice loanFundsVice;

    // 房屋信息-购买
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHousePurchasingVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '房屋购买信息副表'")
    private CLoanHousePurchasingVice loanHousePurchasingVice;

    // 房屋信息-自建、翻修
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHouseBuildVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '房屋自建、翻修信息表'")
    private CLoanHouseBuildVice loanHouseBuildVice;

    // 楼盘信息
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanEatateProjectVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '楼盘项目'")
    private CLoanEatateProjectVice loanEatateProjectVice;

    // 共同借款人
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHousingCoborrowerVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '贷款发放-共同借款人信息表'")
    private CLoanHousingCoborrowerVice loanHousingCoborrowerVice;

    // 借款合同信息
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "loanContract", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '个人住房贷款借款合同信息'")
    private StHousingPersonalLoan loanContract;

    // 担保信息
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "loanHousingGuaranteeContractVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '担保合同信息副表'")
    private CLoanHousingGuaranteeContractVice loanHousingGuaranteeContractVice;

    // 还款业务明细
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grywmx")
    private List<StHousingBusinessDetails> stHousingBusinessDetails;

    public CLoanHousingBusinessProcess() {
        super();

    }

    public CLoanHousingBusinessProcess(String id, Boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    public CLoanHousingBusinessProcess(String id, Date created_at, Date updated_at, Date deleted_at, Boolean deleted,
                                       String czy, CAccountNetwork ywwd, String cznr, String czqd, Date blsj, String step, String ywlsh, String dkdblx,
                                       String dkyt, String blzl, String shybh, Date shsj, String dkzh, Date ddsj, Date bjsj, String jzpzh,
                                       CLoanApplyRepaymentVice loanApplyRepaymentVice, CLoanHousingCompanyVice loanHousingCompanyVice,
                                       CLoanHouseOverhaulVice loanHouseOverhaulVice,
                                       CLoanHousingPersonInformationVice loanHousingPersonInformationVice, CLoanFundsVice loanFundsVice,
                                       CLoanHousePurchasingVice loanHousePurchasingVice, CLoanHouseBuildVice loanHouseBuildVice,
                                       CLoanEatateProjectVice loanEatateProjectVice, CLoanHousingCoborrowerVice loanHousingCoborrowerVice,
                                       StHousingPersonalLoan loanContract, CLoanHousingGuaranteeContractVice loanHousingGuaranteeContractVice,String sbyy) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.deleted = deleted;
        this.czy = czy;
        this.ywwd = ywwd;
        this.cznr = cznr;
        this.czqd = czqd;
        this.blsj = blsj;
        this.step = step;
        this.ywlsh = ywlsh;
        this.dkdblx = dkdblx;
        this.dkyt = dkyt;
        this.blzl = blzl;
        this.shybh = shybh;
        this.shsj = shsj;
        this.dkzh = dkzh;
        this.ddsj = ddsj;
        this.bjsj = bjsj;
        this.jzpzh = jzpzh;
        this.loanApplyRepaymentVice = loanApplyRepaymentVice;
        this.loanHousingCompanyVice = loanHousingCompanyVice;
        this.loanHouseOverhaulVice = loanHouseOverhaulVice;
        this.loanHousingPersonInformationVice = loanHousingPersonInformationVice;
        this.loanFundsVice = loanFundsVice;
        this.loanHousePurchasingVice = loanHousePurchasingVice;
        this.loanHouseBuildVice = loanHouseBuildVice;
        this.loanEatateProjectVice = loanEatateProjectVice;
        this.loanHousingCoborrowerVice = loanHousingCoborrowerVice;
        this.loanContract = loanContract;
        this.loanHousingGuaranteeContractVice = loanHousingGuaranteeContractVice;
        this.sbyy=sbyy;
    }

    public String getJzpzh() {
        return jzpzh;
    }

    public void setJzpzh(String jzpzh) {
        this.jzpzh = jzpzh;
    }

    public Date getDdsj() {
        return ddsj;
    }

    public void setDdsj(Date ddsj) {
        this.ddsj = ddsj;
    }

    public Date getBjsj() {
        return bjsj;
    }

    public void setBjsj(Date bjsj) {
        this.bjsj = bjsj;
    }

    public String getDkzh() {
        return dkzh;
    }

    public void setDkzh(String dkzh) {
        this.updated_at = new Date();
        this.dkzh = dkzh;
    }

    public String getShybh() {
        return shybh;
    }

    public void setShybh(String shybh) {
        this.updated_at = new Date();
        this.shybh = shybh;
    }

    public String getCzy() {
        return this.czy;
    }

    public void setCzy(String czy) {
        this.updated_at = new Date();
        this.czy = czy;
    }

    public CAccountNetwork getYwwd() {
        return this.ywwd;
    }

    public void setYwwd(CAccountNetwork ywwd) {
        this.updated_at = new Date();
        this.ywwd = ywwd;
    }

    public String getCznr() {
        return this.cznr;
    }

    public void setCznr(String cznr) {
        this.updated_at = new Date();
        this.cznr = cznr;
    }

    public String getCzqd() {
        return this.czqd;
    }

    public void setCzqd(String czqd) {
        this.updated_at = new Date();
        this.czqd = czqd;
    }

    public Date getBlsj() {
        return this.blsj;
    }

    public void setBlsj(Date blsj) {
        this.updated_at = new Date();
        this.blsj = blsj;
    }

    public String getYwlsh() {
        return this.ywlsh;
    }

    public void setYwlsh(String ywlsh) {
        this.updated_at = new Date();
        this.ywlsh = ywlsh;
    }

    public String getDkdblx() {
        return dkdblx;
    }

    public void setDkdblx(String dkdblx) {
        this.updated_at = new Date();
        this.dkdblx = dkdblx;
    }

    public String getDkyt() {
        return dkyt;
    }

    public void setDkyt(String dkyt) {
        this.updated_at = new Date();
        this.dkyt = dkyt;
    }

    public String getBlzl() {
        return blzl;
    }

    public void setBlzl(String blzl) {
        this.updated_at = new Date();
        this.blzl = blzl;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.updated_at = new Date();
        this.step = step;
    }

    public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.updated_at = new Date();
        this.shsj = shsj;
    }

    public CLoanApplyRepaymentVice getLoanApplyRepaymentVice() {
        return loanApplyRepaymentVice;
    }

    public void setLoanApplyRepaymentVice(CLoanApplyRepaymentVice loanApplyRepaymentVice) {
        this.updated_at = new Date();
        this.loanApplyRepaymentVice = loanApplyRepaymentVice;
    }

    public CLoanHousingCompanyVice getLoanHousingCompanyVice() {
        return loanHousingCompanyVice;
    }

    public void setLoanHousingCompanyVice(CLoanHousingCompanyVice loanHousingCompanyVice) {
        this.updated_at = new Date();
        this.loanHousingCompanyVice = loanHousingCompanyVice;
    }

    public CLoanHouseOverhaulVice getLoanHouseOverhaulVice() {
        return loanHouseOverhaulVice;
    }

    public void setLoanHouseOverhaulVice(CLoanHouseOverhaulVice loanHouseOverhaulVice) {
        this.updated_at = new Date();
        this.loanHouseOverhaulVice = loanHouseOverhaulVice;
    }

    public CLoanHousingPersonInformationVice getLoanHousingPersonInformationVice() {
        return loanHousingPersonInformationVice;
    }

    public void setLoanHousingPersonInformationVice(
            CLoanHousingPersonInformationVice loanHousingPersonInformationVice) {
        this.updated_at = new Date();
        this.loanHousingPersonInformationVice = loanHousingPersonInformationVice;
    }

    public CLoanFundsVice getLoanFundsVice() {
        return loanFundsVice;
    }

    public void setLoanFundsVice(CLoanFundsVice loanFundsVice) {
        this.updated_at = new Date();
        this.loanFundsVice = loanFundsVice;
    }

    public CLoanHousePurchasingVice getLoanHousePurchasingVice() {
        return loanHousePurchasingVice;
    }

    public void setLoanHousePurchasingVice(CLoanHousePurchasingVice loanHousePurchasingVice) {
        this.updated_at = new Date();
        this.loanHousePurchasingVice = loanHousePurchasingVice;
    }

    public CLoanHouseBuildVice getLoanHouseBuildVice() {
        return loanHouseBuildVice;
    }

    public void setLoanHouseBuildVice(CLoanHouseBuildVice loanHouseBuildVice) {
        this.updated_at = new Date();
        this.loanHouseBuildVice = loanHouseBuildVice;
    }

    public CLoanEatateProjectVice getLoanEatateProjectVice() {
        return loanEatateProjectVice;
    }

    public void setLoanEatateProjectVice(CLoanEatateProjectVice loanEatateProjectVice) {
        this.updated_at = new Date();
        this.loanEatateProjectVice = loanEatateProjectVice;
    }

    public CLoanHousingCoborrowerVice getLoanHousingCoborrowerVice() {
        return loanHousingCoborrowerVice;
    }

    public void setLoanHousingCoborrowerVice(CLoanHousingCoborrowerVice loanHousingCoborrowerVice) {
        this.updated_at = new Date();
        this.loanHousingCoborrowerVice = loanHousingCoborrowerVice;
    }

    public StHousingPersonalLoan getLoanContract() {
        return loanContract;
    }

    public void setLoanContract(StHousingPersonalLoan loanContract) {
        this.updated_at = new Date();
        this.loanContract = loanContract;
    }

    public CLoanHousingGuaranteeContractVice getLoanHousingGuaranteeContractVice() {
        return loanHousingGuaranteeContractVice;
    }

    public void setLoanHousingGuaranteeContractVice(
            CLoanHousingGuaranteeContractVice loanHousingGuaranteeContractVice) {
        this.updated_at = new Date();
        this.loanHousingGuaranteeContractVice = loanHousingGuaranteeContractVice;
    }

    public List<StHousingBusinessDetails> getStHousingBusinessDetails() {
        return stHousingBusinessDetails;
    }

    public void setStHousingBusinessDetails(List<StHousingBusinessDetails> stHousingBusinessDetails) {
        this.updated_at = new Date();
        this.stHousingBusinessDetails = stHousingBusinessDetails;
    }

    public String getSbyy() {
        return sbyy;
    }

    public void setSbyy(String sbyy) {
        this.sbyy = sbyy;
    }
}
