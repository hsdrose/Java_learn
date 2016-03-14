import java.lang.annotation.*;
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface Property
{
	String column();
	String type();
}
