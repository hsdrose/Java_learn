
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import com.sun.mirror.type.*;
import com.sun.mirror.util.*;
import java.beans.*;
import java.io.*;
import java.util.*;
public class HibernateAnnotationFactory implements AnnotationProcessorFactory 
{
	//所有支持的主食类型
	public Collection<String> supportedAnnotationTypes() 
	{
		return Arrays.asList("Property" , "IdProperty" , "Persistent");
	}
	//返回所有支持的选项
	public Collection<String> supportedOptions() 
	{
		return Arrays.asList(new String[0]);
	}
	//返回Annotation处理器
	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds,
		AnnotationProcessorEnvironment env) 
	{
		return new HibernateAnnotationProcessor(env);
	}   
}
