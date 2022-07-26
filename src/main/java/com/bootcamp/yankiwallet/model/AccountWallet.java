package com.bootcamp.yankiwallet.model;

//import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountWallet {

  private String idYankiAccount;
  private String documentType;
  private String documentNumber;
  private String phoneNumber;
  private String imei;
  private String email;
  private String debitCard;
  private String associatedAccount;
  private Double balance;
  //private LocalDate date;

}
