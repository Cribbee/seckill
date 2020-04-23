package org.seckill.web;

import org.apache.skywalking.apm.toolkit.trace.ActiveSpan;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;

/**
 * ClassName: test1
 * Description: TODO
 * Author: Cribbee
 * Date: 2019/9/30、10:46 AM
 * Version: 1.0
 **/
public class test1 {
    @Trace
    public static void trans(){
        long startTime = System.currentTimeMillis();
        System.out.println("hahah");
        ActiveSpan.debug("debug1");
        test2.testh();
        ActiveSpan.tag("method1_consuming", String.valueOf(System.currentTimeMillis()-startTime));
    }
}
