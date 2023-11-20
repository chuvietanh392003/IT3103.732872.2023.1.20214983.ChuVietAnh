package OtherPRJ;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        int fileSizeKB = 100;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Tạo nội dung với kích thước xấp xỉ 10 KB
            StringBuilder content = new StringBuilder();
            while (content.length() < fileSizeKB * 1024) {
                content.append("Lorem ipsum dolor sit amet, consectetur adipiscing elit. ");
            }

            // Ghi nội dung vào tệp tin
            writer.write(content.toString());

            System.out.println("Tạo file thành công: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

