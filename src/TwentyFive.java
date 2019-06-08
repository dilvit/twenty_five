public class TwentyFive {
    public static void main(String[] args) {
        int count = 0;
        String text = "Мама         мыла   раму     mila   ramu  mama";
        String newText = "";

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                count++;
            }
            else count = 0;
            if(count <=1){
                newText=newText+text.charAt(i);
            }
        }
        System.out.println(newText);
    }
}
