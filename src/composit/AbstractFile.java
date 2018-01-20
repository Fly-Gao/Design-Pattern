package composit;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象组件
 */
public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件：" + name);
    }
}

class AudioFile implements AbstractFile {

    private String name;

    AudioFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀音频文件" + name);
    }
}

class Folder implements AbstractFile {
    private String name;
    //定义容器，用来存放子节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile get(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹:" + name + ",开始查杀");
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
