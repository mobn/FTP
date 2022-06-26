package com.mobong.controller;

import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;

public class FTPdownload {

    public void FTPdownload(String fileName, String filePath) throws IOException {
        // TODO - implement FTPdownload.FTPdownload
        FTPClient ftp = new FTPClient();
        ftp.connect("localhost");
        ftp.login("user", "pass");
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
        //ftp.storeFile(fileName, filePath);
        ftp.disconnect();

    }
}
