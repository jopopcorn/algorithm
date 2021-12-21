class Solution {
    public String solution(String phone_number) {
        int restLength = phone_number.length() - 4;
        StringBuilder answer = new StringBuilder();
        
        answer.append("*".repeat(restLength));
        answer.append(phone_number.substring(restLength));
        
        return answer.toString();
    }
}
