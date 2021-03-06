package com.handge.housingfund.common.service.bank.bean.transfer;

import java.io.Serializable;

/**
 * 批量转入申请文件
 * 文件格式: 序号@|$联系函编号@|$转出公积金中心名称@|$职工姓名@|$职工证件类型@|$职工证件号码@|$原工作单位名称@|$原住房公积金个人账号@|$转入公积金中心资金账号@|$转入公积金中心资金账户户名@|$转入公积金资金账户所属银行名称@|$公积金中心委托业务办理银行@|$转入公积金中心联系方式@|$联系单生成日期@|$反馈信息代码@|$反馈信息@|$备注@|$备用字段@|$备用字段@|$
 * Created by gxy on 17-12-10.
 */
public class BatchTransInFile implements Serializable {
    private static final long serialVersionUID = 5875259892861735748L;

    /**
     * 序号(required)
     */
    private String no = "";
    /**
     * 联系函编号(required), 公积金中心全局唯一联系函编号规则为“机构代码(前6位)+YYMMDD+4位顺序号”, 当交易类型为1时, 该编号必须是已存在的编号
     */
    private String ConNum = "";
    /**
     * 转出公积金中心名称(required)
     */
    private String TranCenName = "";
    /**
     * 职工姓名(required)
     */
    private String EmpName = "";
    /**
     * 职工证件类型(required), 依据贯标标准代码值: 01-身份证 02-军官证 03-护照 04-外国人永久居留证 99-其他
     */
    private String DocType = "";
    /**
     * 职工证件号码(required)
     */
    private String IdNum = "";
    /**
     * 原工作单位名称(required)
     */
    private String SocUnitName = "";
    /**
     * 原住房公积金账号(required)
     */
    private String SocRefAcctNo = "";
    /**
     * 转入公积金中心资金账号(required), 转入公积金中心资金接收账户的账号
     */
    private String TranRefAcctNo = "";
    /**
     * 转入公积金中心资金账号户名(required), 转入公积金中心资金接收账户户名
     */
    private String TranRefAcctName = "";
    /**
     * 转入公积金中心资金账户所属银行名称(required), 转入公积金资金接收账户所属银行名称
     */
    private String TranBank = "";
    /**
     * 公积金中心委托业务办理银行, 公积金中心委托银行办理异地转移接续业务时填写, 参见银行代码表
     */
    private String EntBank = "";
    /**
     * 转入公积金中心联系方式(required)
     */
    private String TrenCenInfo = "";
    /**
     * 联系单生成日期(required), 格式: YYYYMMDD
     */
    private String GenDate = "";
    /**
     * 反馈信息代码, 0-已完成, 当交易类型为1-反馈结果时, 该项必填, 其他可为空
     */
    private String TranRstCode = "";
    /**
     * 反馈信息
     */
    private String TranRstMsg = "";
    /**
     * 备注
     */
    private String Remark = "";
    /**
     * 备用字段
     */
    private String Bak1 = "";
    /**
     * 备用字段
     */
    private String Bak2 = "";

    public BatchTransInFile() {
    }

    public BatchTransInFile(String no, String conNum, String tranCenName, String empName, String docType, String idNum, String socUnitName, String socRefAcctNo, String tranRefAcctNo, String tranRefAcctName, String tranBank, String trenCenInfo, String genDate) {
        this.no = no;
        ConNum = conNum;
        TranCenName = tranCenName;
        EmpName = empName;
        DocType = docType;
        IdNum = idNum;
        SocUnitName = socUnitName;
        SocRefAcctNo = socRefAcctNo;
        TranRefAcctNo = tranRefAcctNo;
        TranRefAcctName = tranRefAcctName;
        TranBank = tranBank;
        TrenCenInfo = trenCenInfo;
        GenDate = genDate;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getConNum() {
        return ConNum;
    }

    public void setConNum(String conNum) {
        ConNum = conNum;
    }

    public String getTranCenName() {
        return TranCenName;
    }

    public void setTranCenName(String tranCenName) {
        TranCenName = tranCenName;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getDocType() {
        return DocType;
    }

    public void setDocType(String docType) {
        DocType = docType;
    }

    public String getIdNum() {
        return IdNum;
    }

    public void setIdNum(String idNum) {
        IdNum = idNum;
    }

    public String getSocUnitName() {
        return SocUnitName;
    }

    public void setSocUnitName(String socUnitName) {
        SocUnitName = socUnitName;
    }

    public String getSocRefAcctNo() {
        return SocRefAcctNo;
    }

    public void setSocRefAcctNo(String socRefAcctNo) {
        SocRefAcctNo = socRefAcctNo;
    }

    public String getTranRefAcctNo() {
        return TranRefAcctNo;
    }

    public void setTranRefAcctNo(String tranRefAcctNo) {
        TranRefAcctNo = tranRefAcctNo;
    }

    public String getTranRefAcctName() {
        return TranRefAcctName;
    }

    public void setTranRefAcctName(String tranRefAcctName) {
        TranRefAcctName = tranRefAcctName;
    }

    public String getTranBank() {
        return TranBank;
    }

    public void setTranBank(String tranBank) {
        TranBank = tranBank;
    }

    public String getEntBank() {
        return EntBank;
    }

    public void setEntBank(String entBank) {
        EntBank = entBank;
    }

    public String getTrenCenInfo() {
        return TrenCenInfo;
    }

    public void setTrenCenInfo(String trenCenInfo) {
        TrenCenInfo = trenCenInfo;
    }

    public String getGenDate() {
        return GenDate;
    }

    public void setGenDate(String genDate) {
        GenDate = genDate;
    }

    public String getTranRstCode() {
        return TranRstCode;
    }

    public void setTranRstCode(String tranRstCode) {
        TranRstCode = tranRstCode;
    }

    public String getTranRstMsg() {
        return TranRstMsg;
    }

    public void setTranRstMsg(String tranRstMsg) {
        TranRstMsg = tranRstMsg;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getBak1() {
        return Bak1;
    }

    public void setBak1(String bak1) {
        Bak1 = bak1;
    }

    public String getBak2() {
        return Bak2;
    }

    public void setBak2(String bak2) {
        Bak2 = bak2;
    }

    @Override
    public String toString() {
        return no + "@|$" +
                ConNum + "@|$" +
                TranCenName + "@|$" +
                EmpName + "@|$" +
                DocType + "@|$" +
                IdNum + "@|$" +
                SocUnitName + "@|$" +
                SocRefAcctNo + "@|$" +
                TranRefAcctNo + "@|$" +
                TranRefAcctName + "@|$" +
                TranBank + "@|$" +
                EntBank + "@|$" +
                TrenCenInfo + "@|$" +
                GenDate + "@|$" +
                TranRstCode + "@|$" +
                TranRstMsg + "@|$" +
                Remark + "@|$" +
                Bak1 + "@|$" +
                Bak2 + "@|$";
    }
}
