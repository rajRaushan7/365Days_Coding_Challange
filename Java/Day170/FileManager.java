import java.util.*;

class FileData {
    String name;
    int size; // in KB
    String type;

    public FileData(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + "." + type + " - " + size + "KB";
    }
}

public class FileManager {

    public static void main(String[] args) {
        FileData[] files = {
            new FileData("resume", 120, "pdf"),
            new FileData("photo", 300, "jpg"),
            new FileData("song", 300, "mp3"),
            new FileData("project", 200, "doc"),
            new FileData("notes", 120, "txt")
        };

        Arrays.sort(files, new Comparator<FileData>() {
            @Override
            public int compare(FileData f1, FileData f2) {
                if (f2.size != f1.size) {
                    return f2.size - f1.size; // Descending by size
                } else {
                    return f1.type.compareTo(f2.type); // Alphabetical by type
                }
            }
        });

        for (FileData file : files) {
            System.out.println(file);
        }
    }
}