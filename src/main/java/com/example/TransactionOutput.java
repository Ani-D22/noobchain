package com.example;

import java.security.PublicKey;

public class TransactionOutput {
    private String id;
    private PublicKey recipient;    //also known as the new owner of these coins.
    private float value;    //the amount of coins they own
    private String parentTransactionId;    //the id of the transaction this output was created in

    //Constructor
    public TransactionOutput(String id, PublicKey recipient, float value, String parentTransactionId) {
        this.recipient = recipient;
        this.value = value;
        this.parentTransactionId = parentTransactionId;
        this.id = StringUtil.applySha256(StringUtil.getStringFromKey(recipient));
    }

    //Check if coin belongs to you
    public boolean isMine(PublicKey publicKey) {
        return (publicKey.equals(this.recipient));
    }
}
