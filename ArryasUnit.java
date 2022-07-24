package Demo2;
import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr={2,15,3,6,18,4,29,11,15,7};
        ArryasUnit.sortASC(arr);
        System.out.println(Arrays.toString(arr));
        ArryasUnit.sortDESC(arr);
        System.out.println(Arrays.toString(arr));
        int firstindex=ArryasUnit.firstIndexOf(arr,29);
        System.out.println(firstindex);
        int lastidex=ArryasUnit.lastIndexOf(arr,15);
        System.out.println(lastidex);
        boolean idex=ArryasUnit.isContain(arr,15);
        System.out.println(idex);
        int t=ArryasUnit.containTimes(arr,15);
        System.out.println(t);
        boolean i=ArryasUnit.isOne(arr,15);
        System.out.println(i);
    }

package Demo2;

public class ArryasUnit {
    /**
     * 升序排列一个int数组
     * @param arr 要排序的int数组
     *
     */
    public static void sortASC(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    /**
     * 升序排列一个byte数组
     * @param arr 要排序的byte数组
     */
    public static void sortASC(byte[] arr){
        for(int i=0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    byte temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }

    }

    /**
     * 升序排列一个short数组
     * @param arr 要排序的short数组
     */
    public static void sortASC(short[] arr){
        for(int i=0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    short temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

    }

    /**
     * 升序排列一个long数组
     * @param arr 要排序的long数组
     */
    public static void sortASC(long[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 升序排列一个float数组
     * @param arr 要排序的float数组
     */
    public static void sortASC(float[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    float temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 升序排列一个double数组
     * @param arr 要排序的double数组
     */
    public static void sortASC(double[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }



    /**
     * 降序排列一个int数组
     * @param arr 要降序的int数组
     */
    public static void sortDESC(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 降序排列一个byte数组
     * @param arr 要降序的byte数组
     */
    public static void sortDESC(byte[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    byte temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 降序排列一个short数组
     * @param arr 要降序的short数组
     */
    public static void sortDESC(short[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    short temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 降序排列一个long数组
     * @param arr 要降序的long数组
     */
    public static void sortDESC(long[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 降序排列一个float数组
     * @param arr 要降序的float数组
     */
    public static void sortDESC(float[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    float temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

    /**
     * 降序排列一个double数组
     * @param arr 要降序的double数组
     */
    public static void sortDESC(double[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }



    /**
     * 在给定的int数组中查找指定的int元素第一次出现的位置
     * @param arr 给定的int数组
     * @param b   要查找的int元素
     * @return    如果查找到元素，返回元素索引，否则返回-1；
     */
    public static int firstIndexOf(int[] arr,int b){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }

    /**
     * 在给定的byte数组中查找指定的byte元素第一次出现的位置
     * @param arr 给定的byte数组
     * @param b   要查找的byte元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(byte[]arr ,byte b){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }

    /**
     * 在给定的short数组中查找指定的short元素第一次出现的位置
     * @param arr 给定的short数组
     * @param b   要查找的short元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(short[] arr,short b){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }

    /**
     * 在给定的longt数组中查找指定的long元素第一次出现的位置
     * @param arr 给定的long数组
     * @param b   要查找的long元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(long[]arr,long b){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }

    /**
     * 在给定的float数组中查找指定的float元素第一次出现的位置
     * @param arr 给定的float数组
     * @param b   要查找的float元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(float[]arr,float b){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }

    /**
     * 在给定的double数组中查找指定的double元素第一次出现的位置
     * @param arr 给定的double数组
     * @param b   要查找的double元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(double[] arr,double b){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }

    /**
     * 在给定的char数组中查找指定的char元素第一次出现的位置
     * @param arr 给定的char数组
     * @param b   要查找的char元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(char[]arr,char b){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }

    /**
     * 在给定的boolean数组中查找指定的boolean元素第一次出现的位置
     * @param arr 给定的boolean数组
     * @param b   要查找的boolean元素
     * @return    如果。。。。。。。。
     */
    public static int firstIndexOf(boolean[] arr,boolean b){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }



    /**
     * 在给定的int数组中查找指定的int元素最后一次出现的位置
     * @param arr 给定的int数组
     * @param b 要查找的int元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(int[] arr,int b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的byte数组中查找指定的byte元素最后一次出现的位置
     * @param arr 给定的byte数组
     * @param b 要查找的byte元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(byte[] arr,byte b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的short数组中查找指定的short元素最后一次出现的位置
     * @param arr 给定的short数组
     * @param b 要查找的short元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(short[] arr,short b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的long数组中查找指定的long元素最后一次出现的位置
     * @param arr 给定的long数组
     * @param b 要查找的long元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(long[] arr,long b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的float数组中查找指定的float元素最后一次出现的位置
     * @param arr 给定的float数组
     * @param b 要查找的float元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(float[] arr,float b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的double数组中查找指定的double元素最后一次出现的位置
     * @param arr 给定的double数组
     * @param b 要查找的double元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(double[] arr,double b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    /**
     * 在给定的char数组中查找指定的char元素最后一次出现的位置
     * @param arr 给定的char数组
     * @param b 要查找的char元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(char[] arr,char b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }

        }
        return -1;
    }
    /**
     * 在给定的boolean数组中查找指定的boolean元素最后一次出现的位置
     * @param arr 给定的boolean数组
     * @param b 要查找的boolean元素
     * @return 如果找到元素,返回元素的索引;如果未找到元素,返回-1;
     */
    public static int lastIndexOf(boolean[] arr,boolean b){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }

    /**
     * 判断给定的int数组是否包含指定的int元素
     * @param arr 给定的int数组
     * @param b 指定的int元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(int[] arr,int b){
        int idex=firstIndexOf(arr,b);
        return idex>=0?true:false;
    }
    /**
     * 判断给定的byte数组是否包含指定的byte元素
     * @param arr 给定的byte数组
     * @param b 指定的byte元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(byte[] arr,byte b){
        int idex=firstIndexOf(arr, b);
        return idex>=0?true:false;
    }
    /**
     * 判断给定的short数组是否包含指定的short元素
     * @param arr 给定的short数组
     * @param b 指定的short元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(short[] arr,short b){
        int idex=firstIndexOf(arr,b);
        return idex>=0?true:false;
    }
    /**
     * 判断给定的long数组是否包含指定的long元素
     * @param arr 给定的long数组
     * @param b 指定的long元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(long[] arr,long b){
        int idex=firstIndexOf(arr,b);
        return idex>=0?true:false;

    }
    /**
     * 判断给定的float数组是否包含指定的float元素
     * @param arr 给定的float数组
     * @param b 指定的float元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(float[] arr,float b){
        int idex=firstIndexOf(arr,b);
        return idex>=0?true:false;
    }
    /**
     * 判断给定的double数组是否包含指定的double元素
     * @param arr 给定的double数组
     * @param b 指定的double元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(double[] arr,double b){
        int idex=firstIndexOf(arr,b);
        return idex>=0?true:false;
    }
    /**
     * 判断给定的char数组是否包含指定的char元素
     * @param arr 给定的char数组
     * @param b 指定的char元素
     * @return 包含则返回true,不包含则返回false
     */
    public static boolean isContain(char[] arr,char b){
        int idex=firstIndexOf(arr,b);
        return idex>=0?true:false;
    }


    /**
     * 判断给定int数组 包含指定int元素多少次
     * @param arr 给定的int数组
     * @param b 指定的int元素
     * @return 元素在数组中出现的次数
     */
    public static int containTimes(int[] arr,int b){
        int t=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==b){
                t++;
            }
            
        }
        return t;
    }
    /**
     * 判断给定byte数组 包含指定byte元素多少次
     * @param arr 给定的byte数组
     * @param b 指定的byte元素
     * @return 元素在数组中出现的次数
     */
    public static int comtainTimes(byte[] arr,byte b){
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;
    }
    /**
     * 判断给定short数组 包含指定short元素多少次
     * @param arr 给定的short数组
     * @param b 指定的short元素
     * @return 元素在数组中出现的次数
     */
    public static int containTime(short[] arr,short b) {
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;
    }
    /**
     * 判断给定long数组 包含指定long元素多少次
     * @param arr 给定的long数组
     * @param b 指定的long元素
     * @return 元素在数组中出现的次数
     */
    public static int containTime(long[] arr,long b){
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;
    }
    /**
     * 判断给定float数组 包含指定float元素多少次
     * @param arr 给定的float数组
     * @param b 指定的float元素
     * @return 元素在数组中出现的次数
     */
    public static int comtainTime(float[] arr,float b){
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;
    }
    /**
     * 判断给定double数组 包含指定double元素多少次
     * @param arr 给定的double数组
     * @param b 指定的double元素
     * @return 元素在数组中出现的次数
     */
    public static int containTime(double[] arr,double b){
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;

    }
    /**
     * 判断给定char数组 包含指定char元素多少次
     * @param arr 给定的char数组
     * @param b 指定的char元素
     * @return 元素在数组中出现的次数
     */
    public static int containTime(char[] arr,char b){
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;
    }
    /**
     * 判断给定boolean数组 包含指定boolean元素多少次
     * @param arr 给定的boolean数组
     * @param b 指定的boolean元素
     * @return 元素在数组中出现的次数
     */
    public static int containTime(boolean[] arr,boolean b){
        int t=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==b){
                t++;
            }

        }
        return t;
    }



    /**
     * 判断给定int数组 是否包含且仅包含一次给定int的元素
     * @param arr 给定的int数组
     * @param b 要查找的int元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(int[] arr,int b){
        int i=containTimes(arr,b);
        return i==1?true:false;
    }
    /**
     * 判断给定byte数组 是否包含且仅包含一次给定byte的元素
     * @param arr 给定的byte数组
     * @param b 要查找的byte元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(byte[] arr,byte b){
        int i=comtainTimes(arr,b);
        return i==1?true:false;
    }
    /**
     * 判断给定short数组 是否包含且仅包含一次给定short的元素
     * @param arr 给定的short数组
     * @param b 要查找的short元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(short[] arr,short b){
        int i=containTime(arr,b);
        return i==1?true:false;
    }
    /**
     * 判断给定long数组 是否包含且仅包含一次给定long的元素
     * @param arr 给定的long数组
     * @param b 要查找的long元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(long[] arr,long b){
        int i=containTime(arr,b);
        return i==1?true:false;
    }
    /**
     * 判断给定float数组 是否包含且仅包含一次给定float的元素
     * @param arr 给定的float数组
     * @param b 要查找的float元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(float[] arr,float b){
        int i=comtainTime(arr,b);
        return i==1?true:false;
    }
    /**
     * 判断给定double数组 是否包含且仅包含一次给定double的元素
     * @param arr 给定的double数组
     * @param b 要查找的double元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(double[] arr,double b){
        int i=containTime(arr,b);
        return i==1?true:false;
    }
    /**
     * 判断给定char数组 是否包含且仅包含一次给定char的元素
     * @param arr 给定的char数组
     * @param b 要查找的char元素
     * @return 包含且仅包含一次返回true  不包含或者包含多次返回false
     */
    public static boolean isOne(char[] arr,char b){
        int i=containTime(arr,b);
        return i==1?true:false;
    }

















































































































































































































}
