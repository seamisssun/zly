package Day23.HM23;



import java.io.File;


/**使用file类delete方法和递归算法删除一个文件夹
 * Created by Administrator on 2017/6/22.
 */
public class HM1 {
    public static void main(String[] args) {
        File file=new File("G:\\file");

        del(file);

    }
    public static void del(File file){
        if(file==null||file.isFile()){
            return;
        }
        File []files=file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
            del(f);
              //  f.delete();
        }else{
            if(f.getName().endsWith(".txt")){
                System.out.println(f.delete());
            }
            }
        }
        file.delete();

    }
}
