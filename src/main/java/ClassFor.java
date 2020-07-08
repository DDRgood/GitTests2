public class ClassFor {

    public int formethod(int ... a){
        int res = 0;
        if (a.length == 0)
            return 0;
        else if (a.length < 10)
            for (int tmp: a){
                res += tmp;
            }

        else {
            return 1023;
        }
         return res + 1;

    }


    public void show(){



    }
}
