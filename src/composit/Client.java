package composit;

/**
 * 组合模式主要用于处理树形结构，该模式自带递归，且对不同的叶子进行相同的操作
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f1, f2;
        Folder folder = new Folder("我的图片");
        f1 = new ImageFile("图片一");
        f2 = new ImageFile("音频一");
        folder.add(f1);
        folder.add(f2);
        Folder folder1 = new Folder("图片收藏");
        folder1.add(f1);
        folder.add(folder1);

        folder.killVirus();
    }
}
