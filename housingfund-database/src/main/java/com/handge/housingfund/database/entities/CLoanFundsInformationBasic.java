package com.handge.housingfund.database.entities;

// Generated 2017-8-8 15:42:03 by Hibernate Tools 5.2.3.Final

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

// default package

/**
 * HFundsInformationBasic generated by hbm2java
 */
@Entity
@Table(name = "c_loan_funds_information_basic")
@org.hibernate.annotations.Table(appliesTo = "c_loan_funds_information_basic", comment = "基础-个人贷款资金信息表")
public class CLoanFundsInformationBasic extends Common implements java.io.Serializable {

	private static final long serialVersionUID = -1203496848438377462L;

//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "cLoanHousingPersonInformationBasic", columnDefinition = "varchar(32) DEFAULT NULL COMMENT '贷款个人信息基础表'")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "funds")
	private CLoanHousingPersonInformationBasic cLoanHousingPersonInformationBasic;

	@Column(name = "DKLX", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '贷款类型（0：公积金贷款 1：组合贷款 2：贴息贷款 3：其他）'")
	private String dklx;
	@Column(name = "DKDBLX", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '贷款担保类型  （0：抵押 1：质押 2：保证 3：其他）'")
	private String dkdblx;
	@Column(name = "HKFS", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '还款方式（0：等额本息 1：等额本金 2：一次还款付息 3：自由还款方式 4：其他）'")
	private String hkfs;
	@Column(name = "HTDKJE", columnDefinition = "NUMERIC(18,2) DEFAULT NULL COMMENT '合同贷款金额'")
	private BigDecimal htdkje = BigDecimal.ZERO;
	@Column(name = "HTDKJEDX", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '合同贷款金额大写'")
	private String htdkjedx;
	@Column(name = "DKQS", columnDefinition = "NUMERIC(4,0) DEFAULT NULL COMMENT '贷款期数'")
	private BigDecimal dkqs = BigDecimal.ZERO;
	@Column(name = "FWTS", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '房屋套数（0：一套 1：二套 2：三套 3：四套  5：五套及以上）'")
	private String fwts;
	@Column(name = "JKHTLL", columnDefinition = "NUMERIC(8,7) DEFAULT NULL COMMENT '借款合同利率'")
	private BigDecimal jkhtll = BigDecimal.ZERO;
	@Column(name = "LLFSBL", columnDefinition = "NUMERIC(4,2) DEFAULT NULL COMMENT '利率浮动比例'")
	private BigDecimal llfsbl = BigDecimal.ZERO;
	@Column(name = "ZXLL", columnDefinition = "NUMERIC(8,7) DEFAULT NULL COMMENT '执行利率'")
	private BigDecimal zxll = BigDecimal.ZERO;
	@Column(name = "WTKHYJCE", columnDefinition = "BIT(1) DEFAULT NULL COMMENT '委托扣划月缴存额（0：是 1：否）'")
	private Boolean wtkhyjce;
	@Column(name = "YWLSH", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '业务流水号'")
	private String ywlsh;

	public CLoanFundsInformationBasic() {
		super();
	}

	public CLoanFundsInformationBasic(String id, Date created_at, Date updated_at, Date deleted_at, boolean deleted,
			String dklx, String dkdblx, String hkfs, BigDecimal htdkje, String htdkjedx, BigDecimal dkqs, String fwts,
			BigDecimal jkhtll, BigDecimal llfsbl, BigDecimal zxll, Boolean wtkhyjce, String ywlsh,
			CLoanHousingPersonInformationBasic cLoanHousingPersonInformationBasic) {

		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.deleted = deleted;
		this.dklx = dklx;
		this.dkdblx = dkdblx;
		this.hkfs = hkfs;
		this.htdkje = htdkje;
		this.htdkjedx = htdkjedx;
		this.dkqs = dkqs;
		this.fwts = fwts;
		this.jkhtll = jkhtll;
		this.llfsbl = llfsbl;
		this.zxll = zxll;
		this.wtkhyjce = wtkhyjce;
		this.ywlsh = ywlsh;
		this.cLoanHousingPersonInformationBasic = cLoanHousingPersonInformationBasic;
	}

	public BigDecimal getHtdkje() {
		return this.htdkje;
	}

	public void setHtdkje(BigDecimal htdkje) {
		this.updated_at = new Date();
		this.htdkje = htdkje;
	}

	public String getHtdkjedx() {
		return this.htdkjedx;
	}

	public void setHtdkjedx(String htdkjedx) {
		this.updated_at = new Date();
		this.htdkjedx = htdkjedx;
	}

	public BigDecimal getDkqs() {
		return this.dkqs;
	}

	public void setDkqs(BigDecimal dkqs) {
		this.updated_at = new Date();
		this.dkqs = dkqs;
	}

	public String getDklx() {
		return dklx;
	}

	public void setDklx(String dklx) {
		this.updated_at = new Date();
		this.dklx = dklx;
	}

	public String getDkdblx() {
		return dkdblx;
	}

	public void setDkdblx(String dkdblx) {
		this.updated_at = new Date();
		this.dkdblx = dkdblx;
	}

	public String getHkfs() {
		return hkfs;
	}

	public void setHkfs(String hkfs) {
		this.updated_at = new Date();
		this.hkfs = hkfs;
	}

	public String getFwts() {
		return fwts;
	}

	public void setFwts(String fwts) {
		this.updated_at = new Date();
		this.fwts = fwts;
	}

	public BigDecimal getJkhtll() {
		return this.jkhtll;
	}

	public void setJkhtll(BigDecimal jkhtll) {
		this.updated_at = new Date();
		this.jkhtll = jkhtll;
	}

	public BigDecimal getLlfsbl() {
		return this.llfsbl;
	}

	public void setLlfsbl(BigDecimal llfsbl) {
		this.updated_at = new Date();
		this.llfsbl = llfsbl;
	}

	public BigDecimal getZxll() {
		return this.zxll;
	}

	public void setZxll(BigDecimal zxll) {
		this.updated_at = new Date();
		this.zxll = zxll;
	}

	public Boolean getWtkhyjce() {
		return this.wtkhyjce;
	}

	public void setWtkhyjce(Boolean wtkhyjce) {
		this.updated_at = new Date();
		this.wtkhyjce = wtkhyjce;
	}

	public String getYwlsh() {
		return this.ywlsh;
	}

	public void setYwlsh(String ywlsh) {
		this.updated_at = new Date();
		this.ywlsh = ywlsh;
	}

	public CLoanHousingPersonInformationBasic getcLoanHousingPersonInformationBasic() {
		return cLoanHousingPersonInformationBasic;
	}

	public void setcLoanHousingPersonInformationBasic(
			CLoanHousingPersonInformationBasic cLoanHousingPersonInformationBasic) {
		this.updated_at = new Date();
		this.cLoanHousingPersonInformationBasic = cLoanHousingPersonInformationBasic;
	}
}
