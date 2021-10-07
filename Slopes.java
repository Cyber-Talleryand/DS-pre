package e2;

public class Slopes {
    public static int downTheSlope(char[][] slopeMap, int right, int down) {
        int count = 0, a = 0, b = 0, i_a;
        boolean check = true;

        if (slopeMap.length != slopeMap[0].length) throw new IllegalArgumentException();
        try {
            if (slopeMap[slopeMap.length-1][slopeMap.length-1]=='$');
            for (a=0;a<slopeMap.length;a++){
                for(b=0;b<slopeMap.length;b++){
                    if (slopeMap[a][b]!='.'&&slopeMap[a][b]!='#') throw new IllegalArgumentException();
                }
            }
            if(down<1 || right<1 || right>slopeMap.length-1 || down>slopeMap.length-1) throw new IllegalArgumentException();
        }
        catch (Throwable e){
            throw new IllegalArgumentException();
        }
        finally {
            a=0;
            b=0;
        }
        if(slopeMap[0][0] == '#') count++;
        while (check) {

            for (i_a = 0; i_a < right; i_a++) {

                b++;

                if (b > slopeMap.length - 1) b = b - slopeMap.length;
                if (a<slopeMap.length && b<slopeMap.length && slopeMap[a][b] == '#') count++;
            }

            for (i_a = 0; i_a < down; i_a++) {
                a++;
                if (a<slopeMap.length && b<slopeMap.length && slopeMap[a][b] == '#') count++;
                if (a > slopeMap.length - 1) {
                    check = false;
                }
            }
        }
        return count;
    }
    public static int jumpTheSlope(char[][] slopeMap, int right, int down){
        int count=0,a=0,b=0,i_a;
        boolean check=true;
        if (slopeMap.length != slopeMap[0].length) throw new IllegalArgumentException();
        try {
            if (slopeMap[slopeMap.length-1][slopeMap.length-1]=='$');
            for (a=0;a<slopeMap.length;a++){
                for(b=0;b<slopeMap.length;b++){
                    if (slopeMap[a][b]!='.'&&slopeMap[a][b]!='#') throw new IllegalArgumentException();
                }
            }
            if(down<1 || right<1 || right>slopeMap.length-1 || down>slopeMap.length-1) throw new IllegalArgumentException();
        }
        catch (Throwable e){
            throw new IllegalArgumentException();
        }
        finally {
            a=0;
            b=0;
        }
        if (slopeMap[0][0]=='#')count++;
        while (check){
            a=a+down;
            b=b+right;
            if (a > slopeMap.length - 1) check = false;
            if (b > slopeMap.length - 1) b = b - slopeMap.length;
            if(check && slopeMap[a][b] == '#') count++;
        }
        return count;
    }
}

