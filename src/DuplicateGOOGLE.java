public class DuplicateGOOGLE {
    public static  void removeDupStr(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;

        }
        char currChar = str.charAt(idx);
      if(map[currChar-'a'] == true){
            removeDupStr(str, idx+1, newstr, map);
        }
         else {
             map[currChar -'a'] = true;
             removeDupStr(str, idx+1, newstr.append(currChar), map);
      }

    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDupStr(str,0,new StringBuilder(""),new boolean[26]);
    }
}
