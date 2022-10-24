import java.util.HashMap;
import java.util.Set;
public class TracksHashMap{
    public static void main(String[] args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Hello","Hello, it's me I was wondering if after all these years you'd like to meet To go over everything They say that time's supposed to heal ya, but I ain't done much healing");
        trackList.put("Rolling In The Deep","Hello, it's me I was wondering if after all these years you'd like to meet To go over everything They say that time's supposed to heal ya, but I ain't done much healing");
        trackList.put("Someone Like You","There's a fire starting in my heart Reaching a fever pitch, it's bringing me out the dark Finally I can see you crystal clear");
        trackList.put("Million Years Ago","I only wanted to have fun Learning to fly learning to run I let my heart decide the way When I was young Deep down I must have always known That this would be inevitable To earn my stripes I'd have to pay And bare my soul");
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + " : " + trackList.get(key));
        }

    }
}