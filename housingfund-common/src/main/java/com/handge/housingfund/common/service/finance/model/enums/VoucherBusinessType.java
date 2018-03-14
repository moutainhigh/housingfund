package com.handge.housingfund.common.service.finance.model.enums;

/**
 * Created by tanyi on 2017/8/28.
 * 模板编号
 */
@SuppressWarnings("NonAsciiCharacters")
public enum VoucherBusinessType {

    汇补缴("001"),
    汇补缴_有单位无流水("002"),
    收到暂收("003"),
    错缴("004"),
    外部转入("006"),
    部分提取("007"),
    销户提取("008"),
    转移合户("009"),
    死亡无继承人销户("010"),
    外部转出("011"),
    贷款发放("012"),
    月缴存额还款("013"),
    正常还款("014"),
    提前还清("015"),
    提前还款("016"),
    计提公积金利息("017"),
    结算公积金利息("018"),
    住房公积金利息收入("019"),
    增值收益利息收入("020"),
    国家债券利息收入("021"),
    计提住房公积金归集手续费("023"),
    计提个人贷款手续费("024"),
    计提项目贷款手续费("025"),
    支付住房公积金归集手续费("026"),
    支付个人贷款手续费("027"),
    支付项目贷款手续费("028"),
    期末结转业务收入("029"),
    期末结转业务支出("030"),
    支付其他应付款("031"),
    支付补息贷款利息("032"),
    购买国债("033"),
    到期收回国债本息("034"),
    定期存款存入("035"),
    定期存款支取("036"),
    汇补缴手动分摊("037"),
    未分摊转移("038"),
    年度结转增值收益("039"),
    增值收益分配("040"),
    支付专项应付款("041"),
    暂收分摊("042"),
    计提公积金存款定期利息收入("043"),
    计提定期增值收益利息收入("044"),
    扣除结余("045");

    private String code;

    public String getCode() {
        return code;
    }

    VoucherBusinessType(String code) {
        this.code = code;
    }

}
