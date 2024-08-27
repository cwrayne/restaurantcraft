package net.minecraft.util;

import java.util.concurrent.TimeUnit;
import net.minecraft.util.valueproviders.UniformInt;

public class TimeUtil {
    public static final long NANOSECONDS_PER_SECOND = TimeUnit.SECONDS.toNanos(1L);
    public static final long NANOSECONDS_PER_MILLISECOND = TimeUnit.MILLISECONDS.toNanos(1L);
    public static final long MILLISECONDS_PER_SECOND = TimeUnit.SECONDS.toMillis(1L);
    public static final long SECONDS_PER_HOUR = TimeUnit.HOURS.toSeconds(1L);
    public static final int SECONDS_PER_MINUTE = (int)TimeUnit.MINUTES.toSeconds(1L);

    public static UniformInt rangeOfSeconds(int p_145021_, int p_145022_) {
        return UniformInt.of(p_145021_ * 20, p_145022_ * 20);
    }
}
