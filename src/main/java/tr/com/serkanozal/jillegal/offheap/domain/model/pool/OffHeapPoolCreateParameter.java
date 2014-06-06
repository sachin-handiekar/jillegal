/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.domain.model.pool;

public interface OffHeapPoolCreateParameter<T> {

	OffHeapPoolType getOffHeapPoolType();
	Class<T> getElementType();
	boolean isMakeOffHeapableAsAuto();
	
}
