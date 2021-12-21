class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");

        // 3단계
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // 4단계
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        // 5단계
        if(new_id.equals("")){
            new_id = "a";
        }

        // 6단계
        if(new_id.length() > 15){
            new_id = new_id.substring(0, 15);

            new_id = new_id.replaceAll("[.]$","");
        }

        // 7단계
        StringBuilder answer = new StringBuilder(new_id);
        while (answer.length() < 3){
            answer.append(answer.charAt(answer.length() - 1));
        }
        
        return answer.toString();
    }
}
