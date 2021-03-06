package sen.khyber.unsafe.buffers;

import org.jetbrains.annotations.NotNull;

/**
 * @author Khyber Sen
 */
@SuppressWarnings("restriction")
public class UnsafeDirectBuffer extends AbstractUnsafeBuffer {
    
    protected final long address;
    
    public UnsafeDirectBuffer(final long address, final long size) {
        super(size);
        assert address > 0;
        this.address = address;
    }
    
    public UnsafeDirectBuffer(final long size) {
        super(size);
        address = unsafe.allocateMemory(size);
    }
    
    @Override
    protected void freeInternal() {
        unsafe.freeMemory(address);
    }
    
    @Override
    public final boolean isDirect() {
        return true;
    }
    
    @Override
    public final long address() {
        return address;
    }
    
    @Override
    public @NotNull UnsafeDirectBuffer duplicate() {
        return (UnsafeDirectBuffer) super.duplicate();
    }
    
    @SuppressWarnings({"MethodDoesntCallSuperMethod", "DesignForExtension", "NonFinalClone"})
    @Override
    public @NotNull UnsafeDirectBuffer clone() {
        //noinspection OverriddenMethodCallDuringObjectConstruction
        return duplicate();
    }
    
    @Override
    public @NotNull UnsafeDirectBuffer slice(final long offset, final long length) {
        return new UnsafeDirectBuffer(address + offset, length);
    }
    
    @Override
    public @NotNull UnsafeDirectBuffer slice() {
        return (UnsafeDirectBuffer) super.slice();
    }
    
}
