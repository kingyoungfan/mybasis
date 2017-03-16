import java.lang.instrument.Instrumentation;

/**
 * MySizeOf
 *
 * @author yangyang
 * @create 16/7/6 16:43
 * @function
 */
public class MySizeOf {
    private static Instrumentation inst;
    public static void premain(String agentArgs, Instrumentation instP){
        inst = instP;
    }

    public static long sizeOf(Object o){
        if (inst == null){
            throw new IllegalStateException("Can not access instrumentation environment");
        }
        return inst.getObjectSize(o);
    }
}
