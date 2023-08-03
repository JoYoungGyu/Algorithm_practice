class LV0_문자열더하기 {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replace('"',' ');
        String[] array = my_string.split(" ");
        answer += Integer.parseInt(array[0]);

        for(int i=1; i<array.length-1; i+=2){
            if(array[i].equals("+")){
                answer += Integer.parseInt(array[i+1]);
                System.out.println(array[i]);
            }
            else if(array[i].equals("-")){
                answer -= Integer.parseInt(array[i+1]);
                System.out.println(array[i]);
            }
        }
        return answer;
    }
}