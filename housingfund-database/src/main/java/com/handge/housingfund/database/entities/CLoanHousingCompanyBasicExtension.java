package com.handge.housingfund.database.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 向超 on 2017/8/14.
 */
@Entity
@Table(name = "c_loan_housing_company_basic_extension")
@org.hibernate.annotations.Table(appliesTo = "c_loan_housing_company_basic_extension", comment = "房开公司拓展主表")
public class CLoanHousingCompanyBasicExtension extends Common implements java.io.Serializable {
	private static final long serialVersionUID = -4710927192101162781L;

	@Column(name = "SFRKHYHMC", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '售房人开户银行名称'")
	private String SFRKHYHMC;

	@Column(name = "SFRKHYHKHM", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '售房人开户银行开户名'")
	private String SFRKHYHKHM;

	@Column(name = "SFRZHHM", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '售房人账户号码'")
	private String SFRZHHM;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fkgszb", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '房开公司主表'")
	private CLoanHousingCompanyBasic fkgszb;

	public String getSFRKHYHMC() {
		return SFRKHYHMC;
	}

	public void setSFRKHYHMC(String SFRKHYHMC) {

		this.SFRKHYHMC = SFRKHYHMC;
	}

	public String getSFRKHYHKHM() {
		return SFRKHYHKHM;
	}

	public void setSFRKHYHKHM(String SFRKHYHKHM) {

		this.SFRKHYHKHM = SFRKHYHKHM;
	}

	public String getSFRZHHM() {
		return SFRZHHM;
	}

	public void setSFRZHHM(String SFRZHHM) {

		this.SFRZHHM = SFRZHHM;
	}

	public CLoanHousingCompanyBasic getFkgszb() {
		return fkgszb;
	}

	public void setFkgszb(CLoanHousingCompanyBasic fkgszb) {

		this.fkgszb = fkgszb;
	}

	public CLoanHousingCompanyBasicExtension() {
	}

	public CLoanHousingCompanyBasicExtension(String id, Date created_at, Date updated_at, Date deleted_at, boolean deleted,
											 String SFRKHYHMC, String SFRKHYHKHM, String SFRZHHM, CLoanHousingCompanyBasic fkgszb) {
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.deleted = deleted;
		this.SFRKHYHMC = SFRKHYHMC;
		this.SFRKHYHKHM = SFRKHYHKHM;
		this.SFRZHHM = SFRZHHM;
		this.fkgszb = fkgszb;
	}
}
