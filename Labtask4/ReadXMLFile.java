import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;  

public class ReadXMLFile {  
    public static void main(String[] argv) {  
        try {  
            // Specify the path to your XML file
            File file = new File("Book.xml");  
            
            // Get an instance of DocumentBuilderFactory
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
            
            // Get an instance of DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();  
            
            // Parse the XML file into a Document
            Document doc = db.parse(file);  
            doc.getDocumentElement().normalize();  
            
            // Print the root element of the XML
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  
            
            // Get all the <book> elements in the document
            NodeList nodeList = doc.getElementsByTagName("book");  
            
            // Iterate over each <book> element
            for (int itr = 0; itr < nodeList.getLength(); itr++) {  
                Node node = nodeList.item(itr);  
                System.out.println("\nNode Name: " + node.getNodeName());  
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {  
                    Element eElement = (Element) node;  
                    
                    // Extract and print the book information
                    System.out.println("Title: " + eElement.getElementsByTagName("title").item(0).getTextContent());  
                    System.out.println("Author: " + eElement.getElementsByTagName("author").item(0).getTextContent());  
                    System.out.println("Genre: " + eElement.getElementsByTagName("genre").item(0).getTextContent());  
                    System.out.println("Pages: " + eElement.getElementsByTagName("pages").item(0).getTextContent());  
                    System.out.println("Date Read: " + eElement.getElementsByTagName("date_read").item(0).getTextContent());  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
 