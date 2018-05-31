package Java_Collections.level_3.lesson_10.task_2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.StringWriter;

/**
 * @author Ivan Korol on 5/30/2018
 */
//todo complete this task
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws TransformerException, JAXBException, ParserConfigurationException {
        StringWriter writer = new StringWriter();
        String res = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(obj, writer);

            String xml = writer.toString();

            if (xml.contains(tagName))
                res = xml.replace("<" + tagName + ">", "<!--" + comment + "-->\n" + "<" + tagName + ">");
            else
                res = xml;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><first><second>some string</second><second>some string</second><second><![CDATA[need CDATA because of < and >]]></second><second/></first>";

        String comment = "it's a comment";
        String tagName = "second";

        String res = null;
        if (s.contains(tagName))
            res = s.replace("<" + tagName + ">", "\n<!--" + comment + "-->" + "\n<" + tagName + ">");

        System.out.println(res);
    }
}
