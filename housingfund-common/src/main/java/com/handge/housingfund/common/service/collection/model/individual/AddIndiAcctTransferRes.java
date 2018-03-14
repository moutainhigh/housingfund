package com.handge.housingfund.common.service.collection.model.individual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;



@XmlRootElement(name = "AddIndiAcctTransferRes")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddIndiAcctTransferRes  implements Serializable{

   private  String    Status;  //状态(success\fail) 

   private  String    YWLSH;  //业务流水号 

   public  String getStatus(){ 

       return this.Status;   

   }


   public  void setStatus(String  Status){ 

       this.Status = Status;   

   }


   public  String getYWLSH(){ 

       return this.YWLSH;   

   }


   public  void setYWLSH(String  YWLSH){ 

       this.YWLSH = YWLSH;   

   }


   public String toString(){ 

       return "AddIndiAcctTransferRes{" +  
 
              "Status='" + this.Status + '\'' + "," +
              "YWLSH='" + this.YWLSH + '\'' + 

      "}";

  } 
}