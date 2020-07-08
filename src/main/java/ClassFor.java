public class ClassFor {

    public int formethod(int ... a){
        int res = 0;
        if (a.length == 0)
            return 0;
        else
            for (int tmp: a){
                res += tmp;
            }
         return res;

    }
}
