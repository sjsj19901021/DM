package com.sun.gem;

import com.sun.gem.file.FileBatchReader;
import com.sun.gem.file.FileCodeBlock;
import com.sun.gem.parse.TaskPeerManager;

import java.io.File;
import java.util.List;

/**
 * Created by sun on 2019/12/31.
 **/
public class DevTest {

    public static void main(String[] args) {
        FileBatchReader reader = new FileBatchReader();
        List<FileCodeBlock> rend = reader.rend(new File("D:\\DM\\src\\main\\resources\\script\\测试.txt"));
        TaskPeerManager.INSTANCE.parseFileCodeBlocks(rend);
        System.out.println("------------");
    }
}
