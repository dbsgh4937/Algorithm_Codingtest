class Solution {
    public String solution(String[] id_pw, String[][] db) {
        //id_pw[0] = 아이디, id_pw[1] = 비밀번호
        //db[i][0]은 아이디쪽,db[i][1]은 비밀번호쪽하고
        
        int i;
        for(i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                if(id_pw[1].equals(db[i][1])){
                    return "login";
                }
                else{
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}