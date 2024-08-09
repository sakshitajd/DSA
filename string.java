
public class string {

    public String removeStars(String s){
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c=='*'){
        //         sb.deleteCharAt(sb.length()-1);
        //     }else{
        //         sb.append(c);
        //     }
        // }
        // return sb;

//------->


        char[] arr = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='*'){
                j--;
            }
            else{
                arr[j] = c;
                j++;

            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<j;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        string st = new string();
        String input = "leet**cod*e";
        String output = st.removeStars(input);
        System.out.println(output);
    }

}
//0(n)  - time complexity and space complexity
