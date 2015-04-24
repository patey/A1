package Lottery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class properties {
	
	public static void newConfig() {
		try {
			 
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			 
			// root element
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("settings");
			doc.appendChild(rootElement);
			 
			// address element
			Element address = doc.createElement("address");
			address.appendChild(doc.createTextNode("ntcreations.com"));
			rootElement.appendChild(address);
			
			// port element
			Element port = doc.createElement("port");
			port.appendChild(doc.createTextNode("3306"));
			rootElement.appendChild(port);
			
			// user element
			Element user = doc.createElement("user");
			user.appendChild(doc.createTextNode("a1"));
			rootElement.appendChild(user);
			
			// password element
			Element pass = doc.createElement("pass");
			pass.appendChild(doc.createTextNode("45654"));
			rootElement.appendChild(pass);
			
			// database element
			Element datab = doc.createElement("database");
			datab.appendChild(doc.createTextNode("a1"));
			rootElement.appendChild(datab);
			 
			// write the content to XML
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("config.xml"));
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
			 
			} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
			} catch (TransformerException tfe) {
			tfe.printStackTrace();
			}
			 
			}
	public static String[] readConfig() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	    NodeList nodes = docBuilder.parse(new File("config.xml")).getDocumentElement().getChildNodes();
	    String[] settings = new String[5];
	    for (int i = 0, j = 0; i < nodes.getLength(); i++) {
	        Node n = nodes.item(i);
	        if (n instanceof Element) {
	            settings[j++] = n.getTextContent().trim();
	        }
	    }
	    return settings;
	}
	public void saveConfig(List<String> settings){
		String[] xsettings = settings.toArray(new String[5]);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = docBuilder.parse(new File("config.xml"));
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//solution?
		NodeList nodes = doc.getDocumentElement().getChildNodes();
	    for (int i = 0, j = 0; i < nodes.getLength(); i++) {
	        Node n = nodes.item(i);
	        if (n instanceof Element) {
	            n.setTextContent(xsettings[j++]);
	            System.out.println(n.getTextContent());
	        }
	    }
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
		try {
			transformer = tFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");  

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new StringWriter());
        try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        Writer output = null;
		try {
			output = new BufferedWriter(new FileWriter("config.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String xmlOutput = result.getWriter().toString();  
        try {
			output.write(xmlOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}
	
}
