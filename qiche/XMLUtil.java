package qiche;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;

            doc = builder.parse(new File("D:/作业1/src/qiche/config.xml"));
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();

            String cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
