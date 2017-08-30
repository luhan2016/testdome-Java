// 3 out of for tests

public class UserInput {
    
    public static class TextInput {
        
        public String str ="";
        
        public void add(char c){
            //System.out.println(c);
            if (!Character.isDigit(c)) {
                System.out.println(c);
                this.str = this.str + String.valueOf(c);
            }
        }
        
        public String getValue(){
            return this.str;
        }
    }

    public static class NumericInput extends TextInput {
        
        
        public void add(char c){
            if (str == null)
               str = "";
            //System.out.println(Character.isDigit(c));
            if (Character.isDigit(c)) {
                
                    this.str = this.str +c;
            }   
        }
    }

    public static void main(String[] args) {
        TextInput input = new TextInput();
        input.add('0');
        input.add('!');
        input.add('s');
        input.add('.');
        input.add('d');
       
        System.out.println(input.getValue());
    }
}
