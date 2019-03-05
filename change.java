public String changeString(String str){
    int length = str.length();
    String end = "";
    
    if(length < 2){
        return str;
        }
    if(str == null){
        return str;
        }

    for(int i =0; i<length-1; i++){
        if(i==0 && str.substring(i,i+2).equals("is") && Character.isLetter(str.charAt(i+2) == false){
            end += "is not";
            i += 2;
            
            }
         else if(str.substring(i,i+2).equals("is") && Character.isLetter(str.charAt(i-1) == false && Character.isLetter(str.charAt(i+2) == false){
             end += "is not";
             i += 2;
             
             }
         else if(i==length-2 && str.substring(i,i+2).equals("is") && Character.isLetter(str.charAt(i-1) == false){
             end += "is not";
             i += 2;
             }
         else{
             end += str.charAt(i);
             }
        
        }

        return end;
    
    }
