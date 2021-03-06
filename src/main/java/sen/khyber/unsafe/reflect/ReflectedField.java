package sen.khyber.unsafe.reflect;

import sen.khyber.unsafe.UnsafeUtils;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import sun.misc.Unsafe;

/**
 * Created by Khyber Sen on 1/30/2018.
 *
 * @author Khyber Sen
 */
@Accessors(fluent = true)
@Getter
public final class ReflectedField extends ReflectedMember<Field, String, VarHandle>
        implements Cloneable {
    
    private static final @NotNull Unsafe unsafe = UnsafeUtils.getUnsafe();
    
    private final @NotNull Field field;
    private @Nullable Object object;
    private final int offset;
    // although Unsafe uses a long, no field offset should ever exceed Integer.MAX_VALUE
    
    private ReflectedField(final @NotNull ReflectedField copy) {
        super(copy);
        field = copy.field;
        object = copy.object;
        offset = copy.offset;
    }
    
    @SuppressWarnings("MethodDoesntCallSuperMethod")
    @Override
    public ReflectedField clone() {
        return new ReflectedField(this);
    }
    
    public ReflectedField(final @NotNull Field field) {
        super(field);
        this.field = field;
        object = isStatic ? field.getDeclaringClass() : null;
        final long offset = isStatic
                ? unsafe.staticFieldOffset(field)
                : unsafe.objectFieldOffset(field);
        if (offset > Integer.MAX_VALUE) {
            throw new AssertionError("offset too large: " + offset);
        }
        this.offset = (int) offset;
    }
    
    private long offset() {
        return offset;
    }
    
    @Override
    protected final @NotNull String getSignature(final @NotNull Field field) {
        return field.getName();
    }
    
    @Override
    protected final @NotNull VarHandle convertToHandle() throws IllegalAccessException {
        return LOOKUP.unreflectVarHandle(field);
    }
    
    public final @NotNull ReflectedField bindUnsafe(final @Nullable Object newObject) {
        object = newObject;
        return this;
    }
    
    public final @NotNull ReflectedField bind(final @Nullable Object newObject) {
        if (isStatic) {
            return this;
        }
        if (!field.getDeclaringClass().isInstance(newObject)) {
            throw new IllegalArgumentException(
                    newObject + " is not an instance of the declaring class of " + field);
        }
        return bindUnsafe(newObject);
    }
    
    // TODO finish for all types
    
    public final Object getObject(final @Nullable Object object) {
        return unsafe.getObject(object, offset);
    }
    
    public final Object getObject() {
        return getObject(object);
    }
    
    public final void setObject(final @Nullable Object object, final @Nullable Object value) {
        unsafe.putObject(object, offset, value);
    }
    
    public final void setObject(final @Nullable Object value) {
        setObject(object, value);
    }
    
    public final Object setGetObject(final @Nullable Object object, final @Nullable Object value) {
        return unsafe.getAndSetObject(object, offset, value);
    }
    
    public final Object setGetObject(final @Nullable Object value) {
        return setGetObject(object, value);
    }
    
    public final void setToNull(final @Nullable Object object) {
        setObject(object, null);
    }
    
    public final void setToNull() {
        setToNull(object);
    }
    
    public final Object setGetToNull(final @Nullable Object object) {
        return setGetObject(object, null);
    }
    
    public final Object setGetToNull() {
        return setGetToNull(object);
    }
    
    public final byte getByte(final @Nullable Object object) {
        return unsafe.getByte(object, offset);
    }
    
    public final void setByte(final @Nullable Object object, final byte value) {
        unsafe.putByte(object, offset, value);
    }
    
    public final int getInt(final @Nullable Object object) {
        return unsafe.getInt(object, offset);
    }
    
    public final int getInt() {
        return getInt(object);
    }
    
    // TODO add other unbound versions
    
    public final int getIntVolatile() {
        return unsafe.getIntVolatile(object, offset);
    }
    
    public final void setInt(final @Nullable Object object, final int value) {
        unsafe.putInt(object, offset, value);
    }
    
    public final void setInt(final int value) {
        setInt(object, value);
    }
    
    public final int getSetInt(final int value) {
        return unsafe.getAndSetInt(object, offset, value);
    }
    
    public final long getLong(final @Nullable Object object) {
        return unsafe.getLong(object, offset);
    }
    
    public final long getLong() {
        return getLong(object);
    }
    
    public final long getLongVolatile() {
        return unsafe.getLongVolatile(object, offset);
    }
    
    public final void setLong(final @Nullable Object object, final long value) {
        unsafe.putLong(object, offset, value);
    }
    
    public final void setLong(final long value) {
        setLong(object, value);
    }
    
    public final long getSetLong(final long value) {
        return unsafe.getAndSetLong(object, offset, value);
    }
    
    public final boolean getBoolean() {
        return unsafe.getBoolean(object, offset);
    }
    
    public final boolean getBooleanVolatile() {
        return unsafe.getBooleanVolatile(object, offset);
    }
    
    public final void setBoolean(final boolean value) {
        unsafe.putBoolean(object, offset, value);
    }
    
    public final boolean getSetBoolean(final boolean value) {
        final boolean old = getBoolean();
        setBoolean(value);
        return old;
    }
    
}