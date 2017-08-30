import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	//  throw new UnsupportedOperationException("Waiting to be implemented.");
        
      /*  public String REGEX = "\\bcat\\b";
        public String INPUT = "cat cat cat cattie cat";
        
        Pattern p = Pattern.compile(REGEX);
      Matcher m = p.matcher(INPUT); 
        count=0;
        while(m.find()) 
         count++;
        */

        
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}