package com.handge.housingfund.database.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

// default package
// Generated 2017-8-8 15:42:03 by Hibernate Tools 5.2.3.Final

/**
 * HHouseOverhaulBasic generated by hbm2java
 */
@Entity
@Table(name = "c_loan_house_overhaul_basic")
@org.hibernate.annotations.Table(appliesTo = "c_loan_house_overhaul_basic", comment = "基础-房屋大修信息表")
public class CLoanHouseOverhaulBasic extends Common implements java.io.Serializable {

	private static final long serialVersionUID = -2497202576936592820L;
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "cLoanHousingPersonInformationBasic", columnDefinition = "varchar(32) DEFAULT NULL COMMENT '贷款个人信息基础表'")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "overhaul")
	private CLoanHousingPersonInformationBasic cLoanHousingPersonInformationBasic;
	@Column(name = "YBDCZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '原不动产证号'")
	private String ybdczh;
	@Column(name = "DXGCYS", columnDefinition = "NUMERIC(18,2) DEFAULT NULL COMMENT '大修工程预算'")
	private BigDecimal dxgcys = BigDecimal.ZERO;
	@Column(name = "YJZMJ", columnDefinition = "NUMERIC(18,2) DEFAULT NULL COMMENT '原建筑面积'")
	private BigDecimal yjzmj = BigDecimal.ZERO;
	@Column(name = "TDSYZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '土地使用证号'")
	private String tdsyzh;
	@Column(name = "JHKGRQ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '计划开工日期'")
	private Date jhkgrq;
	@Column(name = "JHJGRQ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '计划竣工日期'")
	private Date jhjgrq;
	@Column(name = "FWZJBGJGMCJBH", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '房屋质检报告机关名称及编号'")
	private String fwzjbgjgmcjbh;
	@Column(name = "FWZL", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '房屋坐落'")
	private String fwzl;
	@Column(name = "GRSKYHZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '个人收款银行账号'")
	private String grskyhzh;
	@Column(name = "KHYHMC", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '开户银行名称'")
	private String khyhmc;
	@Column(name = "YHKHM", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '银行开户名'")
	private String yhkhm;
	@Column(name = "BLZL", columnDefinition = "TEXT DEFAULT NULL COMMENT '办理资料'")
	private String blzl;

	public CLoanHouseOverhaulBasic() {
		super();
	}

	public CLoanHouseOverhaulBasic(String id, Date created_at, Date updated_at, Date deleted_at, boolean deleted,
			CLoanHousingPersonInformationBasic HHousingPersonInformationBasic, String ybdczh, BigDecimal dxgcys,
			BigDecimal yjzmj, String tdsyzh, Date jhkgrq, Date jhjgrq, String fwzjbgjgmcjbh, String fwzl,
			String grskyhzh, String khyhmc, String yhkhm, String blzl) {
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = updated_at;
		this.deleted = deleted;
		this.cLoanHousingPersonInformationBasic = HHousingPersonInformationBasic;
		this.ybdczh = ybdczh;
		this.dxgcys = dxgcys;
		this.yjzmj = yjzmj;
		this.tdsyzh = tdsyzh;
		this.jhkgrq = jhkgrq;
		this.jhjgrq = jhjgrq;
		this.fwzjbgjgmcjbh = fwzjbgjgmcjbh;
		this.fwzl = fwzl;
		this.grskyhzh = grskyhzh;
		this.khyhmc = khyhmc;
		this.yhkhm = yhkhm;
		this.blzl = blzl;
	}

	public CLoanHousingPersonInformationBasic getcLoanHousingPersonInformationBasic() {
		return cLoanHousingPersonInformationBasic;
	}

	public void setcLoanHousingPersonInformationBasic(
			CLoanHousingPersonInformationBasic cLoanHousingPersonInformationBasic) {
		this.updated_at = new Date();
		this.cLoanHousingPersonInformationBasic = cLoanHousingPersonInformationBasic;
	}

	public String getYbdczh() {
		return ybdczh;
	}

	public void setYbdczh(String ybdczh) {
		this.updated_at = new Date();
		this.ybdczh = ybdczh;
	}

	public BigDecimal getDxgcys() {
		return dxgcys;
	}

	public void setDxgcys(BigDecimal dxgcys) {
		this.updated_at = new Date();
		this.dxgcys = dxgcys;
	}

	public BigDecimal getYjzmj() {
		return yjzmj;
	}

	public void setYjzmj(BigDecimal yjzmj) {
		this.updated_at = new Date();
		this.yjzmj = yjzmj;
	}

	public String getTdsyzh() {
		return tdsyzh;
	}

	public void setTdsyzh(String tdsyzh) {
		this.updated_at = new Date();
		this.tdsyzh = tdsyzh;
	}

	public Date getJhkgrq() {
		return jhkgrq;
	}

	public void setJhkgrq(Date jhkgrq) {
		this.updated_at = new Date();
		this.jhkgrq = jhkgrq;
	}

	public Date getJhjgrq() {
		return jhjgrq;
	}

	public void setJhjgrq(Date jhjgrq) {
		this.updated_at = new Date();
		this.jhjgrq = jhjgrq;
	}

	public String getFwzjbgjgmcjbh() {
		return fwzjbgjgmcjbh;
	}

	public void setFwzjbgjgmcjbh(String fwzjbgjgmcjbh) {
		this.updated_at = new Date();
		this.fwzjbgjgmcjbh = fwzjbgjgmcjbh;
	}

	public String getFwzl() {
		return fwzl;
	}

	public void setFwzl(String fwzl) {
		this.updated_at = new Date();
		this.fwzl = fwzl;
	}

	public String getGrskyhzh() {
		return grskyhzh;
	}

	public void setGrskyhzh(String grskyhzh) {
		this.updated_at = new Date();
		this.grskyhzh = grskyhzh;
	}

	public String getKhyhmc() {
		return khyhmc;
	}

	public void setKhyhmc(String khyhmc) {
		this.updated_at = new Date();
		this.khyhmc = khyhmc;
	}

	public String getYhkhm() {
		return yhkhm;
	}

	public void setYhkhm(String yhkhm) {
		this.updated_at = new Date();
		this.yhkhm = yhkhm;
	}

	public String getBlzl() {
		return blzl;
	}

	public void setBlzl(String blzl) {
		this.updated_at = new Date();
		this.blzl = blzl;
	}
}