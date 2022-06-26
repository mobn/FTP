package com.mobong.controller;

import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

public class FTPupload {


    public void uploadFile(String fileName, String filePath) throws IOException {
        // TODO - implement FTPupload.uploadFile
        FTPClient ftp = new FTPClient();
        ftp.connect("localhost");
        ftp.login("user", "pass");
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
        //ftp.storeFile(fileName, filePath);
        ftp.disconnect();

    }



    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
