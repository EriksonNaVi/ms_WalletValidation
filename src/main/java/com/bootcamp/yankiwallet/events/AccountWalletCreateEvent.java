package com.bootcamp.yankiwallet.events;

import com.bootcamp.yankiwallet.model.AccountWallet;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AccountWalletCreateEvent  extends Event<AccountWallet>{
 
}
