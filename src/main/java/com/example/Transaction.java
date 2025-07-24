package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PublicKey;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private String transactionId;  // this is also the hash of the transaction.
    private PublicKey sender;         // senders address/public key.
    private PublicKey recipient;      // Recipients address/public key.
    private float value;
    private byte[] signature;      // this is to prevent anybody else from spending funds in our wallet.

    private ArrayList<TransactionInput> inputs = new ArrayList<TransactionInput>();
    private ArrayList<TransactionOutput> output = new ArrayList<TransactionOutput>();

    private static int sequence;    // a rough count of how many transactions have been generated.

    // Constructor:
    public Transaction(PublicKey from, PublicKey to, float value,  ArrayList<TransactionInput> inputs) {
        this.sender = from;
        this.recipient = to;
        this.value = value;
        this.inputs = inputs;
    }

    public String calculateHash() {
        sequence++;    //increase the sequence to avoid 2 identical transactions having the same hash
        return StringUtil.applySha256(StringUtil.getStringFromKey(sender) +
                StringUtil.getStringFromKey(recipient) +
                Float.toString(value) + sequence
        );
    }
}
