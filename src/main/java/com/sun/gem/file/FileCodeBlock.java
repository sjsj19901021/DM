package com.sun.gem.file;

import java.util.List;

/**
 * Created by sun on 2019/12/31.
 **/
public class FileCodeBlock {

    private List<String> codeblock;

    public FileCodeBlock(List<String> codeblock) {
        this.codeblock = codeblock;
    }

    public List<String> getCodeblock() {
        return codeblock;
    }

    public void setCodeblock(List<String> codeblock) {
        this.codeblock = codeblock;
    }
}
