import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Javaproject {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the folder name : ");
        String folderName=sc.nextLine();

        String path=System.getProperty("user.home")+"\\OneDrive" +"\\Desktop" + "\\"+folderName;
        File file=new File(path);
        System.out.println(file);
        file.mkdir();

        File html=new File(path+"\\"+"index.html");
        File css=new File(path+"\\"+"style.css");
        File script=new File(path+"\\"+"script.js");
            html.createNewFile();
            //createNewFile()
            css.createNewFile();
            script.createNewFile();
            FileWriter fw = new FileWriter(html);
            String data = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n    <link rel=\"stylesheet\" href=\"style.css\">\n    <title>Document</title>\n</head>\n<body>\n <h1> hello  bhai kya haal j </h1>   \n    <script src=\"script.js\"></script>\n</body>\n</html>";
            fw.write(data);
            fw.close();
            fw = new FileWriter(css);
            data =  "*{\n    margin: 0;\n    padding: 0;\n    box-sizing: border-box;\n}\nhtml,body{\n    width: 100%;\n    height: 100%;\n} \n #h1{color:red;}";
            fw.write(data);
            fw.close();

    }
}
