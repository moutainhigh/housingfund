package com.handge.housingfund.common.service.schedule.enums;

public enum TimeTaskType {
    正常还款("1","正常还款"),
    获取全国所有银行网点联行号("2","获取全国所有银行网点的联行号"),
    获取全国所有已上线的中心("3","获取全国所有已上线的中心"),
    启封封存调基调比("4","启封封存调基调比"),
    催缴定时("5","催缴定时"),
    个人年终结息("6","个人年终结息"),
    提取入账失败定时任务("7","提取入账失败定时任务"),
    生成科目余额表("8","生成科目余额表"),
    计算职工公积金利息("9","计算职工公积金利息"),
    结算公积金利息("10","结算公积金利息"),
    新增会计期间("11","新增会计期间"),
    年度结转增值收益("12","年度结转增值收益"),
    期末业务收支结转("13","期末业务收支结转"),
    新增住房公积金银行存款("14","新增住房公积金银行存款"),
    更新定期余额("15","更新定期余额"),
    计提定期利息收入("16","计提定期利息收入"),
    正常还款转逾期定时监控("17","正常还款转逾期定时监控"),
    扣款已发送到账通知查询("18","扣款已发送到账通知查询"),
    剩余期数("19","剩余期数"),
    还款申请定时发送("20","还款申请定时发送"),
    自动逾期记录扣划("21","自动逾期记录扣划"),
    更新状态机配置("21","更新状态机配置"),
    定时修改政策信息("22","定时修改政策信息"),
    还款计划("23","还款计划"),
    全市各区暂收未分摊("24","全市各区暂收未分摊"),
    单位短信催缴("25","单位短信催缴");





    private String code;
    private String name;

    TimeTaskType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
