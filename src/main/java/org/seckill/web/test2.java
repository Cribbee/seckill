package org.seckill.web;

import org.apache.skywalking.apm.toolkit.trace.ActiveSpan;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;

/**
 * ClassName: test2
 * Description: TODO
 * Author: Cribbee
 * Date: 2019/9/30、10:48 AM
 * Version: 1.0
 **/
public class test2 {
    @Trace
    public static void testh(){
        long startTime = System.currentTimeMillis();
        System.out.println(123);
        ActiveSpan.debug("debug2");
        ActiveSpan.tag("method2_consuming", String.valueOf(System.currentTimeMillis()-startTime));
    }

    public static void main(String[] args) {
        testh();
    }
}
