package com.handge.housingfund.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.util.Date;

/**
 * HHousingAudit generated by hbm2java
 */
@Entity
@Table(name = "c_audit_history", indexes = {
		@Index(name = "INDEX_YWLSH", columnList = "YWLSH") })
@org.hibernate.annotations.Table(appliesTo = "c_audit_history", comment = "审核历史记录表")
public class CAuditHistory extends Common implements java.io.Serializable {

	private static final long serialVersionUID = -3996897136876318020L;
	@Column(name = "YWLSH", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '业务流水号'")
	private String ywlsh;
	@Column(name = "CaoZuo", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '操作'")
	private String CaoZuo;
	@Column(name = "SHJG", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '审核结果'")
	private String shjg;
	@Column(name = "YWLX", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '业务类型'")
	private String ywlx;
	@Column(name = "YYYJ", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '(不通过)原因/(通过)意见'")
	private String yyyj;
	@Column(name = "BeiZhu", columnDefinition = "TEXT DEFAULT NULL COMMENT '备注'")
	private String BeiZhu;
	@Column(name = "SHSJ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '审核时间'")
	private Date shsj;
	@Column(name = "DDSJ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '到达时间'")
	private Date ddsj;
	@Column(name = "CZY", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '操作员'")
	private String czy;
	@Column(name = "YWWD", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '业务网点'")
	private String ywwd;
	@Column(name = "ZhiWu", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '职务(操作员角色)'")
	private String zhiwu;
	@Column(name = "CZQD", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '操作渠道'")
	private String czqd;
	@Column(name = "QZSJ", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '签章数据'")
	private String qzsj;
	@Column(name = "CZYBH", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '操作员编号'")
	private String czybh;

	public CAuditHistory() {
		super();

	}

	public String getYwlx() {
		return ywlx;
	}

	public void setYwlx(String ywlx) {
		this.ywlx = ywlx;
	}

	public Date getDdsj() {
		return ddsj;
	}

	public void setDdsj(Date ddsj) {
		this.ddsj = ddsj;
	}

	public String getYyyj() {
		return yyyj;
	}

	public void setYyyj(String yyyj) {
		this.updated_at = new Date();
		this.yyyj = yyyj;
	}

	public String getCaoZuo() {
		return CaoZuo;
	}

	public void setCaoZuo(String caoZuo) {
		this.updated_at = new Date();
		CaoZuo = caoZuo;
	}

	public String getShjg() {
		return shjg;
	}

	public void setShjg(String shjg) {
		this.updated_at = new Date();
		this.shjg = shjg;
	}

	public String getBeiZhu() {
		return BeiZhu;
	}

	public void setBeiZhu(String beiZhu) {
		this.updated_at = new Date();
		BeiZhu = beiZhu;
	}

	public String getCzqd() {
		return czqd;
	}

	public void setCzqd(String czqd) {
		this.updated_at = new Date();
		this.czqd = czqd;
	}

	public Date getShsj() {
		return shsj;
	}

	public void setShsj(Date shsj) {
		this.updated_at = new Date();
		this.shsj = shsj;
	}

	public String getCzy() {
		return czy;
	}

	public void setCzy(String czy) {
		this.updated_at = new Date();
		this.czy = czy;
	}

	public String getYwwd() {
		return ywwd;
	}

	public void setYwwd(String ywwd) {
		this.updated_at = new Date();
		this.ywwd = ywwd;
	}

	public String getZhiwu() {
		return zhiwu;
	}

	public void setZhiwu(String zhiwu) {
		this.updated_at = new Date();
		this.zhiwu = zhiwu;
	}

	public String getYwlsh() {
		return ywlsh;
	}

	public void setYwlsh(String ywlsh) {
		this.updated_at = new Date();
		this.ywlsh = ywlsh;
	}

	public String getQzsj() {
		return qzsj;
	}

	public void setQzsj(String qzsj) {
		this.updated_at = new Date();
		this.qzsj = qzsj;
	}

	public String getCzybh() {
		return czybh;
	}

	public void setCzybh(String czybh) {
		this.czybh = czybh;
	}

	public CAuditHistory(String ywlsh, String ywlx, String caoZuo, String shjg, String yyyj, String beiZhu, Date shsj, String czy,
						 String ywwd, String zhiwu, String czqd, String qzsj, Date ddsj, String czybh) {
		this.ywlsh = ywlsh;
		this.ywlx = ywlx;
		this.CaoZuo = caoZuo;
		this.shjg = shjg;
		this.yyyj = yyyj;
		this.BeiZhu = beiZhu;
		this.shsj = shsj;
		this.czy = czy;
		this.ywwd = ywwd;
		this.zhiwu = zhiwu;
		this.czqd = czqd;
		this.ddsj = ddsj;
		this.czybh = czybh;
	}
}
