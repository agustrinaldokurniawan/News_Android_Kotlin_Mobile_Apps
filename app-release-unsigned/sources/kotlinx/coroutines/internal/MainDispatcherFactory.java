package kotlinx.coroutines.internal;

import d.a.r0;
import java.util.List;

public interface MainDispatcherFactory {
    r0 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
