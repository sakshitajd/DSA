import java.util.*;
public class RecentCalls {
    List<Integer> list;
    int i;
    int j;

 public void calls(){
    i=0;
    j=-1;
    list = new ArrayList<>();
    j++;
 }
 public int recent(int t){
    list.add(t);
    j++;
    while(i<j && list.get(j)-3000 > list.get(i) ){
        i++;
    }
    return j-i+1;


 }
}
