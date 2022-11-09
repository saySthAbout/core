package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // type이라고 하면 클래스 레벨에 붙는거겠죠
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
