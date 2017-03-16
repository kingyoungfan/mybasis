import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by yangyang on 16/3/18.
 */
public class Directory {
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    //overloaded
    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<>();
        public List<File> dirs = new ArrayList<>();

        public Iterator<File> iterator() {
            return files.iterator();
        }

        public void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString(){
            return "dirs="+ dirs.toString()+"\n\nfiles="+files.toString();
        }

        public static TreeInfo walk(String start, String regex) {
            return recurseDirs(new File(start), regex);
        }

        public static TreeInfo walk(File start) {
            return recurseDirs(start, "*");
        }

        public static TreeInfo walk(String start){
            return recurseDirs(new File(start), ".*");
        }

        public static TreeInfo recurseDirs(File startDir, String regex) {
            TreeInfo result = new TreeInfo();
            for (File item : startDir.listFiles()) {
                if (item.isDirectory()) {
                    result.dirs.add(item);
                    result.addAll(recurseDirs(item, regex));
                } else {
                    if (item.getName().matches(regex)){
                        result.files.add(item);
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            if (args.length == 0){
                System.out.println(walk("."));

            }else{
                for(String arg: args){
                    System.out.println(walk(arg));
                }
            }
        }
    }

}
