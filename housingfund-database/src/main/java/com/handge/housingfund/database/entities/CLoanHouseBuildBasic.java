package com.handge.housingfund.database.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

// default package
// Generated 2017-8-8 15:42:03 by Hibernate Tools 5.2.3.Final

/**
 * HHouseBuildBasic generated by hbm2java
 */
@Entity
@Table(name = "c_loan_house_build_basic")
@org.hibernate.annotations.Table(appliesTo = "c_loan_house_build_basic", comment = "基础-房屋自建、翻修信息表")
public class CLoanHouseBuildBasic extends Common implements java.io.Serializable {

	private static final long serialVersionUID = -7415017911933950105L;
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "cLoanHousingPersonInformationBasic", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '贷款个人信息基础表'")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "build")
	private CLoanHousingPersonInformationBasic cLoanHousingPersonInformationBasic;
	@Column(name = "PZJGWH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '批准机关文号'")
	private String pzjgwh;
	@Column(name = "JHJZFY", columnDefinition = "NUMERIC(18,2) DEFAULT NULL COMMENT '计划建造费用'")
	private BigDecimal jhjzfy = BigDecimal.ZERO;
	@Column(name = "JZCS", columnDefinition = "NUMERIC(3,0) DEFAULT NULL COMMENT '建造层数'")
	private BigDecimal jzcs = BigDecimal.ZERO;
	@Column(name = "JHKGRQ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '计划开工日期'")
	private Date jhkgrq;
	@Column(name = "JHJGRQ", columnDefinition = "DATETIME DEFAULT NULL COMMENT '计划竣工日期'")
	private Date jhjgrq;
	@Column(name = "TDSYZH", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '土地使用证号'")
	private String tdsyzh;
	@Column(name = "JZGCGHXKZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '建造工程规划许可证号'")
	private String jzgcghxkzh;
	@Column(name = "JZYDGHXKZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '建造用地规划许可证号'")
	private String jzydghxkzh;
	@Column(name = "JSGCSGXKZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '建设工程施工许可证号'")
	private String jsgcsgxkzh;
	@Column(name = "GRSYZJ", columnDefinition = "NUMERIC(18,2) DEFAULT NULL COMMENT '个人使用资金'")
	private BigDecimal grsyzj = BigDecimal.ZERO;
	@Column(name = "FWZL", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '房屋坐落'")
	private String fwzl;
	@Column(name = "JCHJZMJ", columnDefinition = "NUMERIC(18,2) DEFAULT NULL COMMENT '建成后建造面积'")
	private BigDecimal jchjzmj = BigDecimal.ZERO;
	@Column(name = "FWJG", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '房屋结构（0：框架 1：砖混 2：其他）'")
	private String fwjg;
	@Column(name = "FWXZ", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '房屋性质（0：商品房 1：障碍性住房 2：自建房 3：两限房 4：集资房 5：危改房 6：经济适用房 7：房改房 8：其他）'")
	private String fwxz;
	@Column(name = "GRSKYHZH", columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '个人收款银行账号'")
	private String grskyhzh;
	@Column(name = "KHHYHMC", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '开户行银行名称'")
	private String khhyhmc;
	@Column(name = "YHKHM", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '银行开户名'")
	private String yhkhm;
	@Column(name = "BLZL", columnDefinition = "TEXT DEFAULT NULL COMMENT '办理资料'")
	private String blzl;

	public CLoanHouseBuildBasic() {
		super();
	}

	public CLoanHouseBuildBasic(String id, Date created_at, Date updated_at, Date deleted_at, boolean deleted,
			CLoanHousingPersonInformationBasic HHousingPersonInformationBasic, String pzjgwh, BigDecimal jhjzfy,
			BigDecimal jzcs, Date jhkgrq, Date jhjgrq, String tdsyzh, String jzgcghxkzh, String jzydghxkzh,
			String jsgcsgxkzh, BigDecimal grsyzj, String fwzl, BigDecimal jchjzmj, String fwjg, String fwxz,
			String grskyhzh, String khhyhmc, String yhkhm, String blzl) {
		this.id = id;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.deleted = deleted;
		this.cLoanHousingPersonInformationBasic = HHousingPersonInformationBasic;
		this.pzjgwh = pzjgwh;
		this.jhjzfy = jhjzfy;
		this.jzcs = jzcs;
		this.jhkgrq = jhkgrq;
		this.jhjgrq = jhjgrq;
		this.tdsyzh = tdsyzh;
		this.jzgcghxkzh = jzgcghxkzh;
		this.jzydghxkzh = jzydghxkzh;
		this.jsgcsgxkzh = jsgcsgxkzh;
		this.grsyzj = grsyzj;
		this.fwzl = fwzl;
		this.jchjzmj = jchjzmj;
		this.fwjg = fwjg;
		this.fwxz = fwxz;
		this.grskyhzh = grskyhzh;
		this.khhyhmc = khhyhmc;
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

	public String getPzjgwh() {
		return pzjgwh;
	}

	public void setPzjgwh(String pzjgwh) {
		this.updated_at = new Date();
		this.pzjgwh = pzjgwh;
	}

	public BigDecimal getJhjzfy() {
		return jhjzfy;
	}

	public void setJhjzfy(BigDecimal jhjzfy) {
		this.updated_at = new Date();
		this.jhjzfy = jhjzfy;
	}

	public BigDecimal getJzcs() {
		return jzcs;
	}

	public void setJzcs(BigDecimal jzcs) {
		this.updated_at = new Date();
		this.jzcs = jzcs;
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

	public String getTdsyzh() {
		return tdsyzh;
	}

	public void setTdsyzh(String tdsyzh) {
		this.updated_at = new Date();
		this.tdsyzh = tdsyzh;
	}

	public String getJzgcghxkzh() {
		return jzgcghxkzh;
	}

	public void setJzgcghxkzh(String jzgcghxkzh) {
		this.updated_at = new Date();
		this.jzgcghxkzh = jzgcghxkzh;
	}

	public String getJzydghxkzh() {
		return jzydghxkzh;
	}

	public void setJzydghxkzh(String jzydghxkzh) {
		this.updated_at = new Date();
		this.jzydghxkzh = jzydghxkzh;
	}

	public String getJsgcsgxkzh() {
		return jsgcsgxkzh;
	}

	public void setJsgcsgxkzh(String jsgcsgxkzh) {
		this.updated_at = new Date();
		this.jsgcsgxkzh = jsgcsgxkzh;
	}

	public BigDecimal getGrsyzj() {
		return grsyzj;
	}

	public void setGrsyzj(BigDecimal grsyzj) {
		this.updated_at = new Date();
		this.grsyzj = grsyzj;
	}

	public String getFwzl() {
		return fwzl;
	}

	public void setFwzl(String fwzl) {
		this.updated_at = new Date();
		this.fwzl = fwzl;
	}

	public BigDecimal getJchjzmj() {
		return jchjzmj;
	}

	public void setJchjzmj(BigDecimal jchjzmj) {
		this.updated_at = new Date();
		this.jchjzmj = jchjzmj;
	}

	public String getFwjg() {
		return fwjg;
	}

	public void setFwjg(String fwjg) {
		this.updated_at = new Date();
		this.fwjg = fwjg;
	}

	public String getFwxz() {
		return fwxz;
	}

	public void setFwxz(String fwxz) {
		this.updated_at = new Date();
		this.fwxz = fwxz;
	}

	public String getGrskyhzh() {
		return grskyhzh;
	}

	public void setGrskyhzh(String grskyhzh) {
		this.updated_at = new Date();
		this.grskyhzh = grskyhzh;
	}

	public String getKhhyhmc() {
		return khhyhmc;
	}

	public void setKhhyhmc(String khhyhmc) {
		this.updated_at = new Date();
		this.khhyhmc = khhyhmc;
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
