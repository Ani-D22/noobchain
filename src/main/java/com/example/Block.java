package com.example;

import lombok.Data;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Data
public class Block {
    private String hash;
    private String previousHash;
    private String data;                // Our data will be a simple message
    private Long timeStamp;
    private int nonce;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        try {
            this.hash = calculateHash();  //Making sure we do this after we set the other values.
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String calculateHash() throws NoSuchAlgorithmException {
        return StringUtil.applySha256(previousHash +
                Long.toString(timeStamp) +
                Integer.toString(nonce) +
                data);
    }

    public void mineBlock(int difficulty) throws NoSuchAlgorithmException {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
}
