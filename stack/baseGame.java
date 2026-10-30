import java.util.ArrayList;

class baseGame {
    public static int baseGameProblem(String[] ops) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0;i < ops.length;i++) {
            if(ops[i].equals("C")) {
                al.remove(al.size()-1);
            }
            else if(ops[i].equals("D")) {
                al.add(2 * al.get(al.size()-1));
            }
            else if(ops[i].equals("+")) {
                al.add((al.get(al.size()-1)) + (al.get(al.size()-2)));
            }
            else {
                al.add(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        for(int num : al) {
            sum += num;
        }
        return sum;

    }

    public static void main(String[] args) {

        baseGame bg = new baseGame();
        System.out.println(
        bg.baseGameProblem(new String[]{"5", "2", "C", "D", "+"})                  //"5","-2","4","C","D","9","+","+"
);    }
}