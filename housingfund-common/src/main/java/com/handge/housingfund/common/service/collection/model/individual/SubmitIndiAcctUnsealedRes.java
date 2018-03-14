package com.handge.housingfund.common.service.collection.model.individual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement(name = "SubmitIndiAcctUnsealedRes")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubmitIndiAcctUnsealedRes  implements Serializable{

    private String Status;  //状态(success)

    private String SBYWLSH; //导致失败的业务流水号

    public String getStatus() {

        return this.Status;

    }


    public void setStatus(String Status) {

        this.Status = Status;

    }

    public String getSBYWLSH() {
        return SBYWLSH;
    }

    public void setSBYWLSH(String SBYWLSH) {
        this.SBYWLSH = SBYWLSH;
    }

    @Override
    public String toString() {
        return "SubmitIndiAcctUnsealedRes{" +
                "Status='" + Status + '\'' +
                ", SBYWLSH='" + SBYWLSH + '\'' +
                '}';
    }
}