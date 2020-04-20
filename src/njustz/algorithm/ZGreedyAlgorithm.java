package njustz.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author njustz
 * @date 2020/4/20
 */
public class ZGreedyAlgorithm {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> broadcasts = new HashMap<>();
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("beijing");
        hashSet1.add("shanghai");
        hashSet1.add("tianjin");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("guangzhou");
        hashSet2.add("beijing");
        hashSet2.add("shenzhen");

        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("chengdu");
        hashSet3.add("shanghai");
        hashSet3.add("hangzhou");

        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("shanghai");
        hashSet4.add("tianjin");

        HashSet<String> hashSet5 = new HashSet<>();
        hashSet5.add("hangzhou");
        hashSet5.add("dalian");

        broadcasts.put("K1",hashSet1);
        broadcasts.put("K2",hashSet2);
        broadcasts.put("K3",hashSet3);
        broadcasts.put("K4",hashSet4);
        broadcasts.put("K5",hashSet5);

        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("beijing");
        allAreas.add("shanghai");
        allAreas.add("tianjin");
        allAreas.add("guangzhou");
        allAreas.add("shenzhen");
        allAreas.add("hangzhou");
        allAreas.add("chengdu");
        allAreas.add("dalian");

        ArrayList<String> selects = new ArrayList<>();

        HashSet<String> tempSet = new HashSet<>();

        String maxKey = null;

        while (allAreas.size() != 0){
            maxKey = null;
            for (String key: broadcasts.keySet()){
                tempSet.clear();
                HashSet<String> areas = broadcasts.get(key);
                tempSet.addAll(areas);
                tempSet.retainAll(allAreas);

                //贪心算法的特点，每次都选择最优的
                if(tempSet.size()>0 &&
                        (maxKey==null || tempSet.size() > broadcasts.get(maxKey).size())){
                    maxKey = key;
                }
            }

            if(maxKey != null){
                selects.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));
            }
        }

        System.out.println("the result is :" + selects);

    }
}
