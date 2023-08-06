import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        Map<String, String> memberTable = new HashMap<>();

        for(int i=0; i<db.length; i++){
            memberTable.put(db[i][0], db[i][1]);
        }
        try{
            if(memberTable.get(id_pw[0]).equals(id_pw[1])){
                answer = "login";
            }else if(!memberTable.get(id_pw[0]).equals(id_pw[1])){
                answer = "wrong pw";
            }
        }catch(Exception e){
            return answer = "fail";
        }
        return answer;
    }
}