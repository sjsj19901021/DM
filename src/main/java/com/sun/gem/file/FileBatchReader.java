package com.sun.gem.file;

import com.sun.utils.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/12/31.
 **/
public class FileBatchReader {

    public List<FileCodeBlock> rend(File file) {
        List<FileCodeBlock> fileCodeBlocks = new ArrayList<>();
        FileInputStream inputStream = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            List<String> lineCodes = new ArrayList<>();
            inputStream = new FileInputStream(file);
            isr = new InputStreamReader(inputStream, "GBK");
            br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.startsWith("标识")) {
                    if (!lineCodes.isEmpty()) {
                        fileCodeBlocks.add(new FileCodeBlock(lineCodes));
                        lineCodes = new ArrayList<>();
                    }
                    lineCodes.add(line);
                } else {
                    if (StringUtils.isEmpty(line) || line.startsWith("--")) {
                        continue;
                    } else {
                        lineCodes.add(line);
                    }
                }
            }
        } catch (Exception e) {

        } finally {
            try {
                br.close();
                isr.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return fileCodeBlocks;
    }


}
