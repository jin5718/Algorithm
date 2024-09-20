import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        String regex = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
        new_id = new_id.toLowerCase();
        
        // 2단계
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < new_id.length(); i++){
            arr.add(new_id.charAt(i));
        }
        
        for(int i = 0; i < arr.size(); i++){
            if(!regex.contains(String.valueOf(arr.get(i)))){
                arr.set(i, Character.valueOf(' '));
            }
        }
        
        // String 값으로 변환할 것
        String newarr = "";
        
        for(int i = 0; i < arr.size(); i++){
            newarr += String.valueOf(arr.get(i));
        }
        
        newarr = newarr.replace(" ", "");
        
        
        String tmp = "";
        
        for(int i = 0; i < newarr.length(); i++){
            if(newarr.charAt(i) != '.'){
                tmp += newarr.charAt(i);
            }else if(newarr.charAt(i) == '.'){
                // tmp에 뭔가 담겨있고 그 값이 .이 아닐 때 
                if (tmp.length() != 0 && tmp.charAt(tmp.length() - 1) != '.') {
                    // .을 담는다.
                    tmp += ".";                    
                }else if(tmp.length() == 0){
                    tmp += ".";
                }
            }
        }
        newarr = tmp;
        
        // 4단계
        if(newarr.charAt(0) == '.'){
            newarr = newarr.substring(1);
        }
        
        if(newarr.length() != 0 && newarr.charAt(newarr.length()-1) == '.'){
            newarr = newarr.substring(0, newarr.length()-1);
        }
        
        if(newarr.equals("")){
            newarr += "a";
        }
        
        if(newarr.length() >= 16){
            newarr = newarr.substring(0, 15);
        }
        
        if(newarr.length() != 0 && newarr.charAt(newarr.length()-1) == '.'){
            newarr = newarr.substring(0, newarr.length()-1);
        }
        
        if(newarr.length() <= 2){
            while(newarr.length() < 3){
                newarr += newarr.charAt(newarr.length()-1);
            }
        }
        
        System.out.println(newarr);
                
        return newarr;
    }
}