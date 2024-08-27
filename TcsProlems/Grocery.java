package TcsProlems;
import java.util.ArrayList;
import java.util.HashMap;

public class Grocery {

    String name;
    float pricePerUnit;
    int qtySold;

    public Grocery(String name, float p, int q) {
        this.name = name;
        this.pricePerUnit = p;
        this.qtySold = q;
    }

    public static void calculation(ArrayList<Grocery> gl) {

        HashMap<String, Float> map = new HashMap<>();

        for (int i = 0; i < gl.size(); i++) {

           
            if (map.containsKey(gl.get(i).name)) {
               
                map.put(gl.get(i).name, map.get(gl.get(i).name) + gl.get(i).pricePerUnit * gl.get(i).qtySold);
            } else {
            
                map.put(gl.get(i).name, gl.get(i).pricePerUnit * gl.get(i).qtySold);
            }
        }

        System.out.println(map);
        
        float max = Integer.MIN_VALUE;

        String name = "";
        float total= 0f;
        for (String key : map.keySet()) {

            if (map.get(key) > max) {
                max = map.get(key);
                name = "";
                name +=key;
                
            }

            total += map.get(key);
        }

        System.out.println(name);
        System.out.println(total);
        System.out.println(total/gl.size());



    }

    public static void main(String[] args) {

        ArrayList<Grocery> gl = new ArrayList<>();

        gl.add(new Grocery("apple", 1.0f, 5));
        gl.add(new Grocery("orange", 10.0f, 5));
        gl.add(new Grocery("apple", 10.0f, 5));

        // apple -> 5 and apple-> 50 -> 55
        // orange -> 50

        // apple
        // total -> 105
        // 105/3 -> 35

        calculation(gl);
    }
}
