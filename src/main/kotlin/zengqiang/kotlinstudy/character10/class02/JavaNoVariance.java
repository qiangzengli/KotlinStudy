package zengqiang.kotlinstudy.character10.class02;

import android.util.Log;

import java.util.HashSet;
import java.util.Set;

/**
 * Time: 2020-03-25 下午5:16
 * Author:alan
 * Desc:
 */
public class JavaNoVariance {
    private static final String TAG = "JavaNoVariance";

    public static void main(String[] args) {
//        List<String> strs = new ArrayList<>();
//        List<Object> objs = strs;
//上面这行如果能够编译成功，那么下面这行就会引发异常，因为objs引用的集合元素必须是string类型
//        objs.add(10);


        Set<Number> numberSet = new HashSet<>();
        Set<Integer> integerSet = new HashSet<>();
        Set<Double> doubleSet = new HashSet<>();
        integerSet.add(2);
        integerSet.add(3);

        numberSet.addAll(integerSet);

        doubleSet.add(2.0);
        doubleSet.add(10.0);


        //addAll 为了解决java不支持型变的问题，使用了通配符上限进行处理
        numberSet.addAll(doubleSet);

        for (int i = 0; i < numberSet.size(); i++) {
            Log.d(TAG, i + "");

        }


    }
}
